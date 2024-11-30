package Controller;

import DTO.AlmacenDTO;
import DTO.CategoriaDTO;
import Model.HeladoModel;
import View.NuevoHeladoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class HeladoController {
    private NuevoHeladoView nuevoIngredienteView;
    private Collection<CategoriaDTO> ListaCategoria;
    private Collection<AlmacenDTO> ListaAlmacen;
    private final HeladoModel heladoModel = new HeladoModel();
    public HeladoController(
        NuevoHeladoView nuevoIngredienteView,
        Collection<CategoriaDTO> ListaCategoria,
        Collection<AlmacenDTO> ListaAlmacen
    ) {
        this.nuevoIngredienteView = nuevoIngredienteView;
        this.ListaCategoria = ListaCategoria;
        this.ListaAlmacen = ListaAlmacen;
        
        this.nuevoIngredienteView.Guardar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarNuevoHelado();
            }
        });
    }
    
    private void guardarNuevoHelado() {
        String NomHelado = this.nuevoIngredienteView.obtenerNombreHelado();
        String DesHelado = this.nuevoIngredienteView.obtenerDesHelado();
        String CategoriaId = null;
        for(CategoriaDTO categoria: ListaCategoria) {
            if(this.nuevoIngredienteView.obtenerCategoriaSeleccionada().equals(categoria.getNomCategoria())) {
                CategoriaId = categoria.getCategoriaId();
            }
        }
        Boolean enviado = this.heladoModel.guardarHelado(NomHelado, DesHelado, CategoriaId);
        if(enviado) {
            int HeladosId = this.heladoModel.obtenerUltimoHeladoId();
            int StockHelado = Integer.parseInt(this.nuevoIngredienteView.obtenerStockHelado());
            Float PrecioHelado = Float.parseFloat(this.nuevoIngredienteView.obtenerPrecioHelado());
            int AlmacenId = 0;
            for(AlmacenDTO almacen: ListaAlmacen) {
                if(this.nuevoIngredienteView.obtenerAlmacenSeleccionado().equals(almacen.getNomAlmacen())) {
                    AlmacenId = almacen.getAlmacen();
                }
            }
            System.out.println(NomHelado + " " + DesHelado + " " + CategoriaId + " " + HeladosId + " " + StockHelado + " " + PrecioHelado);
            enviado = this.heladoModel.guardarStock(StockHelado, PrecioHelado, HeladosId, AlmacenId);
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
