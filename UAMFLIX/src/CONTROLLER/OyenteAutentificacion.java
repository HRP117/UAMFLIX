
package CONTROLLER;

//import GUIS.menuCU;

import VIEW.Registro;
import VIEW.inicioSesion;

import VIEW.menuCU;
import VIEW.sesionPersonal;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class OyenteAutentificacion implements ActionListener{
     inicioSesion is;
     sesionPersonal sp;
     Registro miRegistro;
     menuCU miCU;
     JButton registrarse, datosTarjeta;
     JButton guardarRegistro,regresar;
     JButton sesionPersonal,regresarMenuInicio;
    
     
    //constructor 
   
    //  REGISTRO - GUI REGISTRE.
    public OyenteAutentificacion(JButton regresar,JButton guardarRegistro,Registro guiRegistro){
        miRegistro = guiRegistro;
        this.guardarRegistro = guardarRegistro;
        this.regresarMenuInicio = regresar;
    }
    //  S
    public OyenteAutentificacion(menuCU guimenu,JButton guardarRegistro,JButton datosTarjeta) {
        miCU = guimenu;
        this.datosTarjeta = datosTarjeta;
        this.guardarRegistro = guardarRegistro;
    }
       // REGRESAR - GUI-REGISTRO

    
    
    // REGRESAR - GUI-REGISTRO
    public OyenteAutentificacion( JButton regresar) {
        this.regresar = regresar;
    }
    
  
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
               
        /* if(botonPresionado==guardarRegistro){ //boton cuando le oprime registrarse, gui registro
            new menuCU().setVisible(true);
            //miCU.setLocation(Center);
            miRegistro.setVisible(false);
        }*/
        //gui registro
        if(botonPresionado==regresar){
           new inicioSesion().setVisible(true);
           miRegistro.setVisible(false);
        }
        if (botonPresionado==guardarRegistro) {
            System.out.println("SE DEBE CERRAR LA GUI REGISTRO");
            //miRegistro.setVisible(false);
        }
      
        
    }
}
