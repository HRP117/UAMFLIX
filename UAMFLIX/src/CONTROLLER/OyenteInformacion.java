
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
    JButton regresar_cliente_consultaPago,cancelarServicio;
    Registro registro;
    inicioSesion sesion;
    menuCU mcu;
    Cliente_consultarPago ccp;
    Cliente_Cancelar_servicio ccs;
    menuGerente mg;
    GERENTE_CONSULTAR_INFO_CLIENTE GUICONSULTARINFOCLIENTE;
    GERENTE_CONS_INFO_PERSONAL GUI_INFO_PER;
    GERENTE_CONSULTAR_PAGO GUIconsultarPago;
    GERENTE_CONS_INFO_PERSONAL GUIPERSONAL;
    
    

    
public OyenteInformacion(menuCU mcu,JButton consultaPago) {
        this.consultaPago = consultaPago;
        this.mcu = mcu;
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
    
   //GUI CLIENTE CONSULTAR PAGO
       public OyenteInformacion(JButton regresar_cliente_consultaPago, JButton cancelarServicio, Cliente_consultarPago ccp) {
        this.regresar_cliente_consultaPago = regresar_cliente_consultaPago;
        this.cancelarServicio = cancelarServicio;
        this.ccp = ccp;
    }
    
    
   public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        
        if(botonPresionado==consultaPago){
            new Cliente_consultarPago().setVisible(true);
            registro.setVisible(false);
            sesion.setVisible(false);
        }
        //gui consultar pago
        if(botonPresionado==regresar_cliente_consultaPago){
            new menuCU().setVisible(true);
            ccp.setVisible(false);
        }
        if(botonPresionado==cancelarServicio){
            new Cliente_Cancelar_servicio().setVisible(true);
            ccp.setVisible(false);
        }
    }
}
