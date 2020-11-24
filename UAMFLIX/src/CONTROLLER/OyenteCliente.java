//abre crear proyecto
//serie//
//pelicula//
//documental//
//consultar pagos//
package CONTROLLER;

import VIEW.*;

import VIEW.inicioSesion;
import VIEW.menuCU;
import VIEW.sesionPersonal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class OyenteCliente implements ActionListener {

    //atributos//
    Cliente_consultarPago ccp;
    Cliente_Cancelar_servicio ccs;
    inicioSesion is;
    menuCU miCU;
//    Documental GUIdoc;
//    Serie GUIserie;
//    Pelicula GUIpelicula;
    JButton serie, pelicula, documental;
    JButton conPago; 
    JButton regresar_menu;
    JButton regresar_cancelarServicio,irConsultaPago; //cliente

    //  CONSTRUCTORES
    // OYENTE SERIE, PELICULA O DOCUMENTAL
    public OyenteCliente(menuCU miCU, JButton serie, JButton pelicula, JButton documental, JButton regresar,JButton conPago) {
        this.miCU = miCU;
        this.serie = serie;
        this.pelicula = pelicula;
        this.documental = documental;
        this.regresar_menu = regresar;
        this.conPago = conPago;
    }
    //GUI CANCELAR SERVICIO

    public OyenteCliente(Cliente_Cancelar_servicio ccs, JButton regresar_cancelarServicio, JButton irConsultaPago) {
        this.ccs = ccs;
        this.regresar_cancelarServicio = regresar_cancelarServicio;
        this.irConsultaPago = irConsultaPago;
    }
    

    public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        //MENU CLIENTE
//        if(botonPresionado==serie){ //boton cuando le oprime registrarse, gui registro
//            new Serie().setVisible(true);
//            miCU.setVisible(false);
//        }
//        if(botonPresionado==documental){
//            new Documental().setVisible(true);
//            miCU.setVisible(false);
//        }
//        if(botonPresionado==pelicula){
//            new Pelicula().setVisible(true);
//            miCU.setVisible(false);
//        }
        if(botonPresionado==regresar_menu){
            new inicioSesion().setVisible(true);
            miCU.setVisible(false);
        }
        
        //MENU CONSULTAR PAGO (FALTA REGRESAR)
        if(botonPresionado==conPago){
          new Cliente_consultarPago().setVisible(true);
          miCU.setVisible(false);
        }
        
        //MENU CANCELAR SERVICIO
         if(botonPresionado==regresar_cancelarServicio){
            new menuCU().setVisible(true);
            ccs.setVisible(false);
        }
        
        //MENU CONSULTAR PAGO (FALTA REGRESAR)
        if(botonPresionado==irConsultaPago){
          new Cliente_consultarPago().setVisible(true);
            ccs.setVisible(false);
        }
        
    }
}
