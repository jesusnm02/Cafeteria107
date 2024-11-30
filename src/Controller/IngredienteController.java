package Controller;

import DTO.AlmacenDTO;
import DTO.CategoriaDTO;
import Model.HeladoModel;
import Model.IngredienteModel;
import View.NuevoHeladoView;
import View.NuevoIngredienteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class IngredienteController {
    private NuevoIngredienteView nuevoIngredienteView;
    private Collection<CategoriaDTO> ListaCategoria;
    private Collection<AlmacenDTO> ListaAlmacen;
    private final IngredienteModel ingredienteModel = new IngredienteModel();
    public IngredienteController(
        NuevoIngredienteView nuevoIngredienteView,
        Collection<CategoriaDTO> ListaCategoria,
        Collection<AlmacenDTO> ListaAlmacen
    ) {
        this.nuevoIngredienteView = nuevoIngredienteView;
        this.ListaCategoria = ListaCategoria;
        this.ListaAlmacen = ListaAlmacen;
        
        this.nuevoIngredienteView.Guardar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarNuevoIngrediente();
            }
        });
    }
    
    private void guardarNuevoIngrediente() {
        String NomIngrediente = this.nuevoIngredienteView.obtenerNombreIngrediente();
        String DesIngrediente = this.nuevoIngredienteView.obtenerDesIngrediente();
        String CategoriaId = null;
        for(CategoriaDTO categoria: ListaCategoria) {
            if(this.nuevoIngredienteView.obtenerCategoriaSeleccionada().equals(categoria.getNomCategoria())) {
                CategoriaId = categoria.getCategoriaId();
            }
        }
        Boolean enviado = this.ingredienteModel.guardarIngrediente(NomIngrediente, DesIngrediente, CategoriaId);
        if(enviado) {
            int IngredienteId = this.ingredienteModel.obtenerUltimoIngredienteId();
            int StockIngrediente = Integer.parseInt(this.nuevoIngredienteView.obtenerStockIngrediente());
            Float PrecioIngrediente = Float.parseFloat(this.nuevoIngredienteView.obtenerPrecioIngrediente());
            int AlmacenId = 0;
            for(AlmacenDTO almacen: ListaAlmacen) {
                if(this.nuevoIngredienteView.obtenerAlmacenSeleccionado().equals(almacen.getNomAlmacen())) {
                    AlmacenId = almacen.getAlmacen();
                }
            }
            System.out.println(NomIngrediente + " " + DesIngrediente + " " + CategoriaId + " " + IngredienteId + " " + StockIngrediente + " " + PrecioIngrediente);
            enviado = this.ingredienteModel.guardarStock(StockIngrediente, PrecioIngrediente, IngredienteId, AlmacenId);
            if(enviado) {
                this.nuevoIngredienteView.mostrarResultado("Se Guardo los Datos Correctamente");
            } else {
                this.nuevoIngredienteView.mostrarResultado("No se guardaron los Datos");
            }
        } else {
            this.nuevoIngredienteView.mostrarResultado("No se guardaron los Datos");
        }
    }
}
