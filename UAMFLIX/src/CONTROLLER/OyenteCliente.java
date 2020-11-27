//abre crear proyecto
//serie//
//pelicula//
//documental//
//consultar pagos//
package CONTROLLER;

import MODEL.GestorContenidoMultimedia.Documental;
import MODEL.GestorContenidoMultimedia.Pelicula;
import MODEL.GestorContenidoMultimedia.Serie;
import VIEW.*;
import VIEW.AUTENTIFICACION.inicioSesionCliente;
import VIEW.CONTENIDO.Cliente_Documentales;
import VIEW.CONTENIDO.Cliente_Pelicuals;
import VIEW.CONTENIDO.Cliente_Series;
import VIEW.INFORMACION.Cliente_consultarPago;
import VIEW.PERSONAL_Y_CLIENTE.Cliente_Cancelar_servicio;
import VIEW.PRINCIPAL.menuCU;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class OyenteCliente implements ActionListener {

    //atributos//
    Cliente_consultarPago ccp;
    Cliente_Cancelar_servicio ccs;
    inicioSesionCliente is;
    //contenido multimedia
    menuCU miCU;
    Cliente_Documentales cd;
    Cliente_Pelicuals cp;
    Cliente_Series cs;
    
    
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
        if(botonPresionado==serie){ //boton cuando le oprime registrarse, gui registro
            new Cliente_Series().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==documental){
            new Cliente_Documentales().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==pelicula){
            new Cliente_Pelicuals().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==regresar_menu){
            new inicioSesionCliente().setVisible(true);
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
