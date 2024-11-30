package Controller;

import DTO.AlmacenDTO;
import Model.AlmacenModel;
import View.InicioView;
import View.NuevoHeladoView;
import View.NuevoIngredienteView;
import java.util.Collection;

public class AlmacenController {
    private NuevoHeladoView nuevoHeladoView;
    private NuevoIngredienteView nuevoIngredienteView;
    private Collection<AlmacenDTO> ListAlmacen;
    private final AlmacenModel almacenModel = new AlmacenModel();
    
    public AlmacenController(
            NuevoHeladoView nuevoHeladoView,
            NuevoIngredienteView nuevoIngredienteView
    ) {
        this.nuevoHeladoView = nuevoHeladoView;
        this.nuevoIngredienteView = nuevoIngredienteView;
        
        obtenerListaAlmacen();
        this.nuevoHeladoView.llenarComboBoxAlmacen(ListAlmacen);
        this.nuevoIngredienteView.llenarComboBoxAlmacen(ListAlmacen);
    }
    
    public void obtenerListaAlmacen() {
        ListAlmacen = almacenModel.obtenerListaAlmacen();
    }

    public Collection<AlmacenDTO> getListAlmacen() {
        return ListAlmacen;
    }
}
