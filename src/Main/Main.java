package Main;

import Controller.AlmacenController;
import Controller.CategoriaController;
import Controller.HeladoAlmacenController;
import Controller.HeladoController;
import Controller.HeladosPorProducirController;
import Controller.IngredienteAlmacenController;
import Controller.IngredienteController;
import View.HeladosPorProducirView;
import View.InicioView;
import View.NuevoHeladoView;
import View.NuevoIngredienteView;

public class Main {
    public static void main(String[] args) {
        //Vista Inicio
        InicioView inicioView = new InicioView();
        inicioView.setLocationRelativeTo(null);
        //Vista Helado
        NuevoHeladoView nuevoHeladoView = new NuevoHeladoView(inicioView, false);
        nuevoHeladoView.setLocationRelativeTo(null);
        //Vista Ingrediente
        NuevoIngredienteView nuevoIngredienteview = new NuevoIngredienteView(inicioView, false);
        nuevoIngredienteview.setLocationRelativeTo(null);
        //Vista HeladosPorProducir
        HeladosPorProducirView heladosPorProducir = new HeladosPorProducirView(inicioView, false);
        heladosPorProducir.setLocationRelativeTo(null);
        
        //CONTROLADORES
        //Controlador Ingrediente-Almacen
        IngredienteAlmacenController ingredienteAlmacenController = 
                new IngredienteAlmacenController(
                        inicioView,
                        nuevoHeladoView,
                        nuevoIngredienteview,
                        heladosPorProducir
                );
        //Controlador Helado-Almacen
        HeladoAlmacenController heladoAlmacenController =
                new HeladoAlmacenController(inicioView);
        //Controlador Categoria
        CategoriaController categoriaController =
                new CategoriaController(
                        nuevoHeladoView,
                        nuevoIngredienteview
                );
        //Controlador Almacen
        AlmacenController almacenController =
                new AlmacenController(
                        nuevoHeladoView,
                        nuevoIngredienteview
                );
        //Controlador Helado
        HeladoController heladoController = 
                new HeladoController(
                        nuevoHeladoView, 
                        categoriaController.getListaCategorias(), 
                        almacenController.getListAlmacen()
                );
        IngredienteController ingredienteController = 
                new IngredienteController(
                        nuevoIngredienteview, 
                        categoriaController.getListaCategorias(), 
                        almacenController.getListAlmacen()
                );
        HeladosPorProducirController heladosPorProducirController = 
                new HeladosPorProducirController(heladosPorProducir);
        
        inicioView.setVisible(true);
    }
}
