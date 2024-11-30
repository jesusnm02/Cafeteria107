package Controller;

import DTO.RecetaDTO;
import DTO.StockIngredienteDTO;
import Model.RecetaModel;
import Model.StockIngredienteModel;
import View.HeladosPorProducirView;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HeladosPorProducirController {
    private final StockIngredienteModel STOCKINGREDIENTEMODEL = new StockIngredienteModel();
    private final RecetaModel RECETAMODEL = new RecetaModel();
    private HeladosPorProducirView heladosPorProducirView;
    private Collection<StockIngredienteDTO> ListaStockIngrediente;
    private Collection<RecetaDTO> ListaRecetas;

    public HeladosPorProducirController(HeladosPorProducirView heladosPorProducirView) {
        this.heladosPorProducirView = heladosPorProducirView;
        obtenerHeladosParaProducir();
    }

    public void obtenerHeladosParaProducir() {
        ListaStockIngrediente = STOCKINGREDIENTEMODEL.obtenerIngredientesInStock();
        ListaRecetas = RECETAMODEL.obtenerRecetas();

        // Calcular la cantidad máxima de helados que se pueden producir
        Map<String, Integer> heladosProducibles = calcularHeladosProducibles();

        // Mostrar los resultados en la vista
        heladosPorProducirView.mostrarHeladosProducibles(heladosProducibles);
    }

    private Map<String, Integer> calcularHeladosProducibles() {
        // Cambiar la clave del mapa a String (nombre del helado)
        Map<String, Integer> heladosProducibles = new HashMap<>();

        for (RecetaDTO receta : ListaRecetas) {
            String nomHelado = receta.getNomHelados(); // Usar el nombre del helado como clave
            int ingredienteId = receta.getIngredienteId();
            int cantidadNecesaria = receta.getCantidad();

            // Buscar el ingrediente en el stock
            StockIngredienteDTO ingredienteStock = ListaStockIngrediente.stream()
                .filter(stock -> stock.getIngredienteId() == ingredienteId)
                .findFirst()
                .orElse(null);

            if (ingredienteStock != null) {
                int stockDisponible = ingredienteStock.getStockIngrediente();
                int maxHeladosConIngrediente = stockDisponible / cantidadNecesaria;

                // Si ya hay un cálculo para este helado, tomar el mínimo
                heladosProducibles.put(nomHelado, 
                    Math.min(heladosProducibles.getOrDefault(nomHelado, Integer.MAX_VALUE), maxHeladosConIngrediente));
            }
        }

        return heladosProducibles;
    }
}

