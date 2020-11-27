
package CONTROLLER;

//import GUIS.menuCU;

import VIEW.PRINCIPAL.Inicio;
import VIEW.AUTENTIFICACION.RegistroCliente;
import VIEW.AUTENTIFICACION.inicioSesionCliente;
import VIEW.PRINCIPAL.menuCU;
import VIEW.AUTENTIFICACION.sesionPersonal;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class OyenteAutentificacion implements ActionListener{
     Inicio inicioPrincipal;
     inicioSesionCliente is;
     sesionPersonal sp;
     RegistroCliente miRegistro;
     menuCU miCU;
     JButton registrarse, datosTarjeta;
     //botones para gui registro
     JButton guardarRegistro,regresar;
     
     JButton sesionPersonal,regresarMenuInicio,regresarMenuInicio1;
     

    
     
    //constructor 
   
    //  REGISTRO - GUI REGISTRO.
    public OyenteAutentificacion(JButton regresar,JButton guardarRegistro,RegistroCliente guiRegistro){
        miRegistro = guiRegistro;
        this.guardarRegistro = guardarRegistro;
        this.regresar = regresar;
    }
    
    //  menu cliente
    public OyenteAutentificacion(menuCU guimenu,JButton guardarRegistro,JButton datosTarjeta) {
        miCU = guimenu;
        this.datosTarjeta = datosTarjeta;
        this.guardarRegistro = guardarRegistro;
    }
 
    // SESION PERSONAL

    public OyenteAutentificacion(sesionPersonal sp, JButton regresarMenuInicio1) {
        this.sp = sp;
        this.regresarMenuInicio1 = regresarMenuInicio1;
    }

    
    
    
  
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
        //gui registro
        if(botonPresionado==regresar){
           new inicioSesionCliente().setVisible(true);
           miRegistro.setVisible(false);
        }
        if (botonPresionado==guardarRegistro) {
            System.out.println("Cliente registrado");
            new menuCU().setVisible(true);
            miRegistro.setVisible(false);
        }
        
        //gui sesion personal
        if(botonPresionado==regresarMenuInicio1){
            new Inicio().setVisible(true);
            sp.setVisible(false);   //error
            //miRegistro.setVisible(false);
            
        }
         
    }
}
