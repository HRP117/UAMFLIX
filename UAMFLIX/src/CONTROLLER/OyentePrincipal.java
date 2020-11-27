package CONTROLLER;

import VIEW.*;
import VIEW.AUTENTIFICACION.*;
import VIEW.INFORMACION.GERENTE_CONSULTAR_INFO_CLIENTE;
import VIEW.INFORMACION.GERENTE_CONSULTAR_PAGO;
import VIEW.INFORMACION.GERENTE_CONS_INFO_PERSONAL;
import VIEW.PAGO.GERENTE_MODIFICAR_SALARIO;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_ALTA_BAJA_1_ALTA;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_GUI_CONTRATAR_PERSONAL;
import VIEW.PRINCIPAL.Inicio;
import VIEW.PRINCIPAL.menuCU;
import VIEW.PRINCIPAL.menuGerente;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class OyentePrincipal implements ActionListener{
     inicioSesionCliente sesion;
     Inicio inicio;
     sesionPersonal sp;
     menuCU menuCliente;
     menuGerente mg;
     RegistroCliente miRegistro;
     JButton registrarse, inicioSesion;
     JButton guardarRegistro,regresar;
     JButton regresar_inicio; // REGRESAR A INICIO PRINCIPAL (INCIO SESION -> INICIO)
     //gerente
     JButton regresarSesion,consultaPago,consultaSalario,consultaCliente;
     JButton altaCliente,contratar,consultaPersonal;
     // SESION PERSONAL
     JButton inicioSesionPersonal;
     //PAGINA PRINCIPAL
     JButton irSeleccionCliente,irSeleccionPersonal;
  //CONSTRUCTOR PARA INICIO SESION CLIENTE.
    public OyentePrincipal(inicioSesionCliente guiInicio, JButton registrarse, JButton isesion, JButton regresar) {
        sesion = guiInicio;
        this.registrarse = registrarse;
        this.inicioSesion= isesion;
        this.regresar_inicio = regresar;
    }
    
   //CONSTRUCTOR PARA INICIO SESION PERSONAL
   
    public OyentePrincipal(Inicio sp, JButton regresar_inicio) {
        this.inicio = sp;
        this.regresar_inicio = regresar_inicio;
    }

    //para la gui registro

    
    //menu gerente//
    public OyentePrincipal(menuGerente mg, JButton regresarSesion, JButton consultaPago, JButton consultaSalario, JButton consultaCliente, JButton altaCliente, JButton contratar, JButton consultaPersonal) {
        this.mg = mg;
        this.regresarSesion = regresarSesion;
        this.consultaPago = consultaPago;
        this.consultaSalario = consultaSalario;
        this.consultaCliente = consultaCliente;
        this.altaCliente = altaCliente;
        this.contratar = contratar;
        this.consultaPersonal = consultaPersonal;
    }

  //gui principal

    public OyentePrincipal(Inicio inicio, JButton irSeleccionCliente, JButton irSeleccionPersonal) {
        this.inicio = inicio;
        this.irSeleccionCliente = irSeleccionCliente;
        this.irSeleccionPersonal = irSeleccionPersonal;
    }
    
    
    
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
        //INICIO PRINCIPAL
        
        if(botonPresionado==irSeleccionCliente){
            new inicioSesionCliente().setVisible(true);
            inicio.setVisible(false);
            
        }
        if(botonPresionado==irSeleccionPersonal){
            new sesionPersonal().setVisible(true);
            inicio.setVisible(false);
        }
        //boton registrarse. si se registra regresar a la gui inicio sesion
        if (botonPresionado==registrarse){
            //new Prueba().setVisible(true);
            new RegistroCliente().setVisible(true);    // GUI RegistroCliente
            sesion.setVisible(false);         //GUI inicio sesion no se abra
            
        }
        //boton iniciar sesion cliente//
        if(botonPresionado==inicioSesion){
            //new menuCU().setVisible(true);
            sesion.setVisible(false);
        }
        
        if(botonPresionado==regresar_inicio){
            new Inicio().setVisible(true);
            sesion.setVisible(false);
            
        }
        
        
        //gerente: consultaPago,consultaSalario,consultaCliente
        //altaCliente,contratar,consultaPersonal
        
        if(botonPresionado==regresarSesion){
           new sesionPersonal().setVisible(true);
           mg.setVisible(false);
        }
         
        if(botonPresionado==consultaPago){
            new GERENTE_CONSULTAR_PAGO().setVisible(true);
            mg.setVisible(false);
        }
        if(botonPresionado==consultaSalario){
            new GERENTE_MODIFICAR_SALARIO().setVisible(true);
            mg.setVisible(false);
        }
        if(botonPresionado==consultaCliente){
            new GERENTE_CONSULTAR_INFO_CLIENTE().setVisible(true);
            mg.setVisible(false);
        }
        if(botonPresionado==altaCliente){
            new GERENTE_ALTA_BAJA_1_ALTA().setVisible(true);
            mg.setVisible(false);
        }
        if(botonPresionado==contratar){
            new GERENTE_GUI_CONTRATAR_PERSONAL().setVisible(true);
            mg.setVisible(false);
        }
        if(botonPresionado==consultaPersonal){
            new GERENTE_CONS_INFO_PERSONAL().setVisible(true);
            mg.setVisible(false);    
        }
    }
   
}
