package CONTROLLER;

import VIEW.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class OyentePrincipal implements ActionListener{
     inicioSesion sesion;
     menuCU menuCliente;
     menuGerente mg;
     Registro miRegistro;
     JButton registrarse, inicioSesion;
     JButton guardarRegistro,regresar;
     //gerente
     JButton regresarSesion,consultaPago,consultaSalario,consultaCliente;
     JButton altaCliente,contratar,consultaPersonal;
     
    //para inicio sesion 
    public OyentePrincipal(inicioSesion guiInicio, JButton registrarse, JButton isesion) {
        sesion = guiInicio;
        this.registrarse = registrarse;
        this.inicioSesion= isesion;
    }
    
    //regresar
    
    //para la gui registro

    //gerente//
    
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

    
    
    
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
        
        //boton registrarse. si se registra regresar a la gui inicio sesion
        if (botonPresionado==registrarse){
            //new Prueba().setVisible(true);
            new Registro().setVisible(true);    // GUI Registro
            sesion.setVisible(false);         //GUI inicio sesion no se abra
            
        }
        //boton iniciar sesion//
        if(botonPresionado==inicioSesion){
            new inicioSesion().setVisible(true);
            miRegistro.setVisible(false);
        }
        
        //gerente: consultaPago,consultaSalario,consultaCliente
        //altaCliente,contratar,consultaPersonal
        if(botonPresionado==consultaPago){
            
        }
        if(botonPresionado==consultaSalario){
            
        }
        if(botonPresionado==consultaCliente){
            
        }
        if(botonPresionado==altaCliente){
            
        }
        if(botonPresionado==contratar){
            
        }
        if(botonPresionado==consultaPago){
            
        }
    }
   
}
