package Controller;

import DTO.HeladoAlmacenDTO;
import Model.HeladoAlmacenModel;
import View.InicioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Vector;

public class HeladoAlmacenController {
    private InicioView inicioView;
    private Collection<HeladoAlmacenDTO> ListaHelados;
    private Collection<HeladoAlmacenDTO> ListaHeladosByNombre;
    private final HeladoAlmacenModel heladoAlmacenModel = new HeladoAlmacenModel();
    
    public HeladoAlmacenController(
            InicioView inicioView
    ) {
        this.inicioView = inicioView;
        
        ListaHelados = heladoAlmacenModel.obtenerHeladosAlmacen();
        inicioView.llenarTablaHelados(ListaHelados);
        
        this.inicioView.resetearTablaHelado(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenerListaheladoByNombre();
            }
        });
        this.inicioView.heladoSinStock(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenerListaHeladosSinStock();
            }
        });
        this.inicioView.reiniciarListaHelados(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarTablaHelados();
            }
        });
    }
    
    private void obtenerListaheladoByNombre() {
        String nombreHelado = this.inicioView.obtenerNombreHelado();
        ListaHeladosByNombre = null;
        Vector<HeladoAlmacenDTO> net = new Vector<HeladoAlmacenDTO>();
        HeladoAlmacenDTO Helado = null;
        for(HeladoAlmacenDTO helado: ListaHelados) {
            if(nombreHelado.equals(helado.getNomHelados())) {
                Helado = new HeladoAlmacenDTO();
                Helado = helado;
                net.add(helado);
            }
        }
        ListaHeladosByNombre = net;
        this.inicioView.llenarTablaHeladosAgain(ListaHeladosByNombre);
    }
    
    private void obtenerListaHeladosSinStock() {
        ListaHeladosByNombre = null;
        Vector<HeladoAlmacenDTO> net = new Vector<HeladoAlmacenDTO>();
        HeladoAlmacenDTO Helado = null;
        for(HeladoAlmacenDTO helado: ListaHelados) {
            if(0 == helado.getStockHelado()) {
                Helado = new HeladoAlmacenDTO();
                Helado = helado;
                net.add(helado);
            }
        }
        ListaHeladosByNombre = net;
        this.inicioView.llenarTablaHeladosAgain(ListaHeladosByNombre);
    }
    
    private void reiniciarTablaHelados() {
        ListaHeladosByNombre = null;
        ListaHelados = heladoAlmacenModel.obtenerHeladosAlmacen();
        ListaHeladosByNombre = ListaHelados;
        this.inicioView.llenarTablaHeladosAgain(ListaHeladosByNombre);
    }
}
