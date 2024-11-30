package Controller;

import DTO.CategoriaDTO;
import Model.CategoriaModel;
import View.NuevoHeladoView;
import View.NuevoIngredienteView;
import java.util.Collection;

public class CategoriaController {
    private NuevoHeladoView nuevoHeladoView;
    private NuevoIngredienteView nuevoIngredienteView;
    private final CategoriaModel categoriaModel = new CategoriaModel();
    private Collection<CategoriaDTO> ListaCategoriasHelados = null;
    private Collection<CategoriaDTO> ListaCategoriaIngrediente = null;

    public CategoriaController(
        NuevoHeladoView nuevoHeladoView,
        NuevoIngredienteView nuevoIngredienteView
    ) {
        this.nuevoHeladoView = nuevoHeladoView;
        this.nuevoIngredienteView = nuevoIngredienteView;
        
        obtenerCategoriasHelados();
        obtenerCategoriasIngrediente();
        this.nuevoHeladoView.llenarComboBoxcategoria(ListaCategoriasHelados);
        this.nuevoIngredienteView.llenarComboBoxcategoria(ListaCategoriaIngrediente);
    }
    
    private void obtenerCategoriasHelados() {
        ListaCategoriasHelados = categoriaModel.obtenerCategoriasHelados();
    }
    
    private void obtenerCategoriasIngrediente() {
        ListaCategoriaIngrediente = categoriaModel.obtenerCategoriasIngredientes();
    }

    public Collection<CategoriaDTO> getListaCategorias() {
        return ListaCategoriasHelados;
    }
}
