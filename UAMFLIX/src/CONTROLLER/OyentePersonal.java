
package CONTROLLER;

import VIEW.*;
import VIEW.INFORMACION.Administrador_ConsultarPago;
import VIEW.INFORMACION.GERENTE_CONSULTAR_PAGO;
import VIEW.PAGO.Administrador_CancelarPago;
import VIEW.PAGO.Administrador_ModificarPago;
import VIEW.PAGO.GERENTE_MODIFICAR_SALARIO;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_ALTA_BAJA_1_ALTA;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_ALTA_BAJA_2_BAJA;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_DESPEDIR_PERSONAL;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_GUI_CONTRATAR_PERSONAL;
import VIEW.PRINCIPAL.Inicio;
import VIEW.PRINCIPAL.menuAdministrador;
import VIEW.PRINCIPAL.menuGerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OyentePersonal implements ActionListener{
    //alta cliente
    JButton bajacliente,regresarMenuGerente;
    GERENTE_ALTA_BAJA_1_ALTA gaba;
    GERENTE_ALTA_BAJA_2_BAJA gabb;
    menuGerente mg;
    
    //baja cliente:
    JButton altaCliente,regresarMenuGerente1;
    
    //gerente: despedir personal
    JButton irContratarPersonal,regresarMenuGerente2;
    GERENTE_DESPEDIR_PERSONAL gdp;
    
    //gerente: contratar personal
    GERENTE_GUI_CONTRATAR_PERSONAL gcp;
    JButton regresarMenuGerente3,irDespedirPersonal;
    
    //GUI: GERENTE_MODIFICAR_SALARIO
    GERENTE_MODIFICAR_SALARIO gms;
    JButton regresarMenuGerente4, consultasalario;
    
     //GUIS ADMINISTRADOR
    menuAdministrador menuAdmin;
    // BOTON ADMINISTRADOR
    JButton menuAdmin_ModificarPago, menuAdmin_ConsultarPago, menuAdmin_CancelarPago, menuAdmin_REGRESAR;
    
    //GUI: GERENTE_MODIFICAR_SALARIO
    public OyentePersonal(GERENTE_MODIFICAR_SALARIO gms, JButton regresarMenuGerente4, JButton consultasalario){
        this.gms = gms;
        this.regresarMenuGerente4 = regresarMenuGerente4;
        this.consultasalario = consultasalario;
    }
    
    //ALTA CLIENTE
    public OyentePersonal(JButton bajacliente, JButton regresarMenuGerente, GERENTE_ALTA_BAJA_1_ALTA gaba) {
        this.bajacliente = bajacliente;
        this.regresarMenuGerente = regresarMenuGerente;
        this.gaba = gaba;
    }
    
    //baja cliente
     public OyentePersonal(GERENTE_ALTA_BAJA_2_BAJA gabb,JButton regresarMenuGerente1, JButton altaCliente) {
        this.gabb = gabb;
        this.regresarMenuGerente1 = regresarMenuGerente1;
        this.altaCliente = altaCliente;
    }
    //despedir personal
    public OyentePersonal(JButton irContratarPersonal, JButton regresarMenuGerente2, GERENTE_DESPEDIR_PERSONAL gdp) {
        this.irContratarPersonal = irContratarPersonal;
        this.regresarMenuGerente2 = regresarMenuGerente2;
        this.gdp = gdp;
    }
     //contratar personal

    public OyentePersonal(GERENTE_GUI_CONTRATAR_PERSONAL gcp, JButton regresarMenuGerente3, JButton irDespedirPersonal) {
        this.gcp = gcp;
        this.regresarMenuGerente3 = regresarMenuGerente3;
        this.irDespedirPersonal = irDespedirPersonal;
    }
     public OyentePersonal(menuAdministrador menuAdmin, JButton menuAdmin_ModificarPago, JButton menuAdmin_ConsultarPago, JButton menuAdmin_CancelarPago, JButton menuAdmin_REGRESAR) {
        this.menuAdmin = menuAdmin;
        this.menuAdmin_ModificarPago = menuAdmin_ModificarPago;
        this.menuAdmin_ConsultarPago = menuAdmin_ConsultarPago;
        this.menuAdmin_CancelarPago = menuAdmin_CancelarPago;
        this.menuAdmin_REGRESAR = menuAdmin_REGRESAR;
    }
     
     
        public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
       //GERENTE ALTA CLIENTE
       if(botonPresionado==bajacliente){
           new GERENTE_ALTA_BAJA_2_BAJA().setVisible(true);
           gaba.setVisible(false);
       }
       if(botonPresionado==regresarMenuGerente){
           new menuGerente().setVisible(true);
           gaba.setVisible(false);
       }
       //GERENTE BAJA CLIENTE
       if(botonPresionado==regresarMenuGerente1){
           new menuGerente().setVisible(true);
           gabb.setVisible(false);
       }
       if(botonPresionado==altaCliente){
           new GERENTE_ALTA_BAJA_1_ALTA().setVisible(true);
           gabb.setVisible(false);
       }
       // GERENTE DESPEDIR PERSONAL
       if(botonPresionado==irContratarPersonal){
           new GERENTE_GUI_CONTRATAR_PERSONAL().setVisible(true);
           gdp.setVisible(false);
       }
       if(botonPresionado==regresarMenuGerente2){
           new menuGerente().setVisible(true);
           gdp.setVisible(false);
       }
       //GERENTE CONTRATAR PERSONAL
       if(botonPresionado==regresarMenuGerente3){
           new menuGerente().setVisible(true);
           gcp.setVisible(false);
       }
       if(botonPresionado==irDespedirPersonal){
           new GERENTE_DESPEDIR_PERSONAL().setVisible(true);
           gcp.setVisible(false);
       }
       if(botonPresionado==menuAdmin_ModificarPago){
            menuAdmin.setVisible(false);
            new Administrador_ModificarPago().setVisible(true);
        }
        if(botonPresionado==menuAdmin_ConsultarPago){
            menuAdmin.setVisible(false);
            new Administrador_ConsultarPago().setVisible(true);
        }
        if(botonPresionado==menuAdmin_CancelarPago){
            menuAdmin.setVisible(false);
            new Administrador_CancelarPago().setVisible(true);
        }
        if(botonPresionado==menuAdmin_REGRESAR){
            menuAdmin.setVisible(false);
            new Inicio().setVisible(true);
        }
        //--OSCAR--
        if(botonPresionado==regresarMenuGerente4){
            new menuGerente().setVisible(true);
            gms.setVisible(false);
        }
        if(botonPresionado==consultasalario){
            new GERENTE_CONSULTAR_PAGO().setVisible(true);
            gms.setVisible(false); 
        } 
      }
    
}
