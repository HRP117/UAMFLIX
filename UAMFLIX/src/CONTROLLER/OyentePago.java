
package CONTROLLER;

import VIEW.*;
import VIEW.INFORMACION.GERENTE_CONSULTAR_PAGO;
import VIEW.PAGO.GERENTE_AGREGAR_PAGOS;
import VIEW.PAGO.GERENTE_MODIFICAR_SALARIO;
import VIEW.PRINCIPAL.menuGerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OyentePago implements ActionListener{
    // gui menu gerente agregar pagos
    JButton regresarMenuGerente,irModificarSalario,irConsultarPagoPersonal;
    GERENTE_AGREGAR_PAGOS gap;
    GERENTE_MODIFICAR_SALARIO gms;
    GERENTE_CONSULTAR_PAGO gcpp;
    menuGerente mg;
    
    
    public OyentePago(){
        
    } 

    public OyentePago(JButton regresarMenuGerente, JButton irModificarSalario, JButton irConsultarPagoPersonal, GERENTE_AGREGAR_PAGOS gap) {
        this.regresarMenuGerente = regresarMenuGerente;
        this.irModificarSalario = irModificarSalario;
        this.irConsultarPagoPersonal = irConsultarPagoPersonal;
        this.gap = gap;
    }
   
     public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
         //botones de gui 
         if(botonPresionado==regresarMenuGerente){
             new menuGerente().setVisible(true);
             gap.setVisible(false);
         }
         if(botonPresionado==irConsultarPagoPersonal){
             new GERENTE_CONSULTAR_PAGO().setVisible(true);
             gap.setVisible(false);
         }
         if(botonPresionado==irModificarSalario){
             new GERENTE_MODIFICAR_SALARIO().setVisible(true);
             gap.setVisible(false);
         }
         
     }
    
}
