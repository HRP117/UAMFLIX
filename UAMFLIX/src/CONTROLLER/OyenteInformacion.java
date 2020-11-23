
package CONTROLLER;


import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OyenteInformacion implements ActionListener{
   //gui consultar pago
    JButton consultaPago,consultarSalarios,consultaInfoCliente;
    JButton consultarPersonal,menuConsultaPago,modificarSalario;
    JButton regresarConsultarPago,regresarConsultarCliente;
    JButton regresarConsultarPersonal,regresarModificarSalario;
    
    Registro registro;
    inicioSesion sesion;
    menuCU mcu;
    Cliente_consultarPago ccp;
    menuGerente mg;
    GERENTE_CONSULTAR_INFO_CLIENTE GUICONSULTARINFOCLIENTE;
    GERENTE_CONS_INFO_PERSONAL GUI_INFO_PER;
    GERENTE_CONSULTAR_PAGO GUIconsultarPago;
    GERENTE_CONS_INFO_PERSONAL GUIPERSONAL;
    
    

    
public OyenteInformacion(menuCU mcu,JButton consultaPago) {
        this.consultaPago = consultaPago;
        this.mcu = mcu;
}    
//consultar pago gerente
public OyenteInformacion(JButton regresarConsultarPago, JButton modificarSalario, GERENTE_CONSULTAR_PAGO GUIconsultarPago) {
        this.regresarConsultarPago = regresarConsultarPago;
        this.modificarSalario = modificarSalario;
        this.GUIconsultarPago = GUIconsultarPago;
 }
  
//GUI CONSULTAR CLIENTE//

public OyenteInformacion(JButton consultaInfoCliente, JButton regresarConsultarCliente, GERENTE_CONSULTAR_INFO_CLIENTE GUICONSULTARINFOCLIENTE) {
        this.consultaInfoCliente = consultaInfoCliente;
        this.regresarConsultarCliente = regresarConsultarCliente;
        this.GUICONSULTARINFOCLIENTE = GUICONSULTARINFOCLIENTE;
    }
        
  //GUI CONSULTAR INFORMACION PERSONAL//

    public OyenteInformacion(JButton regresarConsultarPersonal, GERENTE_CONS_INFO_PERSONAL GUIPERSONAL) {
        this.regresarConsultarPersonal = regresarConsultarPersonal;
        this.GUIPERSONAL = GUIPERSONAL;
    }
    
    
   public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        
        if(botonPresionado==consultaPago){
            new Cliente_consultarPago().setVisible(true);
            registro.setVisible(false);
            sesion.setVisible(false);
            
        
        }
    }
}
