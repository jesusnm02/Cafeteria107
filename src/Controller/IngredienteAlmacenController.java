package Controller;

import DTO.IngredientesAlmacenDTO;
import Model.IngredienteAlmacenModel;
import View.HeladosPorProducirView;
import View.InicioView;
import View.NuevoHeladoView;
import View.NuevoIngredienteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Vector;

public class IngredienteAlmacenController {
    private InicioView inicioView;
    private Collection<IngredientesAlmacenDTO> ListaIngrediente;
    private Collection<IngredientesAlmacenDTO> ListaIngredienteBuscado;
    private NuevoHeladoView nuevoHeladoView;
    private NuevoIngredienteView nuevoIngredienteView;
    private HeladosPorProducirView heladosPorProducirView;
    private final IngredienteAlmacenModel ingredienteAlmacenModel = new IngredienteAlmacenModel();

    //CAMBIOS DE PAGINAS
    public IngredienteAlmacenController(
            InicioView inicioView,
            NuevoHeladoView nuevoHeladoView,
            NuevoIngredienteView nuevoIngredienteView,
            HeladosPorProducirView heladosPorProducirView
    ) {        
        this.inicioView = inicioView;
        this.inicioView.mostrarPaginaNuevoHelado(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarToNuevoHelado();
            }
        });
        this.inicioView.mostrarPaginaNuevoIngrediente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarToNuevoingrediente();
            }     
        });
        this.inicioView.mostrarPaginaHeladosPorProducirView(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarToHeladosPorProducir();
            }  
        });
        this.inicioView.resetearTablaIngrediente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenerListaIngredienteByNombre();
            }
        });
        this.inicioView.ingredienteSinStock(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenerListaIngredienteSinStock();
            }
        });
        this.inicioView.reiniciarListaIngrediente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarTablaingredientes();
            }
        });
        
        ListaIngrediente = ingredienteAlmacenModel.obtenerIngredienteAlmacen();
        this.inicioView.llenarTablaIngredientes(ListaIngrediente);
        
        this.nuevoHeladoView = nuevoHeladoView;
        this.nuevoIngredienteView = nuevoIngredienteView;
        this.heladosPorProducirView = heladosPorProducirView;
    }
    
    //PAGINAS DISPONNIBLES
    private void cambiarToNuevoHelado() {
        nuevoHeladoView.setVisible(true);
    }
    
    private void cambiarToNuevoingrediente() {
        nuevoIngredienteView.setVisible(true);
    }
    
    private void cambiarToHeladosPorProducir() {
        heladosPorProducirView.setVisible(true);
    }
    private void obtenerListaIngredienteByNombre() {
        String nombreIngrediente = this.inicioView.obtenerNombreIngrediente();
        ListaIngredienteBuscado = null;
        Vector<IngredientesAlmacenDTO> net = new Vector<IngredientesAlmacenDTO>();
        IngredientesAlmacenDTO Ingrediente = null;
        for(IngredientesAlmacenDTO ingrediente: ListaIngrediente) {
            if(nombreIngrediente.equals(ingrediente.getNomIngrediente())) {
                Ingrediente = new IngredientesAlmacenDTO();
                Ingrediente = ingrediente;
                net.add(ingrediente);
            }
        }
        ListaIngredienteBuscado = net;
        this.inicioView.llenarTablaIngredientesAgain(ListaIngredienteBuscado);
    }
    
    private void obtenerListaIngredienteSinStock() {
        ListaIngredienteBuscado = null;
        Vector<IngredientesAlmacenDTO> net = new Vector<IngredientesAlmacenDTO>();
        IngredientesAlmacenDTO Ingrediente = null;
        for(IngredientesAlmacenDTO ingrediente: ListaIngrediente) {
            if(0 == ingrediente.getStockIngrediente()) {
                Ingrediente = new IngredientesAlmacenDTO();
                Ingrediente = ingrediente;
                net.add(ingrediente);
            }
        }
        ListaIngredienteBuscado = net;
        this.inicioView.llenarTablaIngredientesAgain(ListaIngredienteBuscado);
    }
    
    private void reiniciarTablaingredientes() {
        ListaIngredienteBuscado = null;
        ListaIngrediente = this.ingredienteAlmacenModel.obtenerIngredienteAlmacen();
        ListaIngredienteBuscado = ListaIngrediente;
        this.inicioView.llenarTablaIngredientes(ListaIngredienteBuscado);
    }
}
