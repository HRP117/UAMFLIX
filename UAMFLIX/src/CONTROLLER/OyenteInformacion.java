
package CONTROLLER;

import VIEW.*;
import VIEW.AUTENTIFICACION.RegistroCliente;
import VIEW.AUTENTIFICACION.inicioSesionCliente;
import VIEW.INFORMACION.Administrador_ConsultarPago;
import VIEW.INFORMACION.Cliente_consultarPago;
import VIEW.INFORMACION.GERENTE_CONSULTAR_INFO_CLIENTE;
import VIEW.INFORMACION.GERENTE_CONSULTAR_PAGO;
import VIEW.INFORMACION.GERENTE_CONS_INFO_PERSONAL;
import VIEW.PAGO.Administrador_CancelarPago;
import VIEW.PAGO.Administrador_ModificarPago;
import VIEW.PAGO.GERENTE_AGREGAR_PAGOS;
import VIEW.PAGO.GERENTE_MODIFICAR_SALARIO;
import VIEW.PERSONAL_Y_CLIENTE.Cliente_Cancelar_servicio;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_ALTA_BAJA_1_ALTA;
import VIEW.PERSONAL_Y_CLIENTE.GERENTE_ALTA_BAJA_2_BAJA;
import VIEW.PRINCIPAL.menuAdministrador;
import VIEW.PRINCIPAL.menuCU;
import VIEW.PRINCIPAL.menuGerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OyenteInformacion implements ActionListener {
    //gui consultar pago
    JButton regresarConsultarPago, modificarSalario; //gerente:consultar pago
    JButton irAgregarpago;
    GERENTE_CONSULTAR_PAGO GUIconsultarPago;
    GERENTE_AGREGAR_PAGOS gap;
    
    //GERENTE CONSULTAR INFORMACION PERSONAL
    JButton regresarConsultarPersonal;
    GERENTE_CONS_INFO_PERSONAL GUIPERSONAL;
     
    
    //GERENTE: CONSULTAR INFORMACION CLIENTE
    JButton regresarConsultarCliente;
    JButton irAltaCliente, irBajaCliente;
    GERENTE_CONSULTAR_INFO_CLIENTE GUICONSULTARINFOCLIENTE;

    
    JButton consultaPago, consultarSalarios;
    JButton consultarPersonal, menuConsultaPago;
    JButton regresarModificarSalario;
    //CLIENTE:CONSULTAR PAGO
    JButton regresar_cliente_consultaPago, cancelarServicio;

    
    RegistroCliente registro;
    inicioSesionCliente sesion;
    GERENTE_MODIFICAR_SALARIO gms;
    menuCU mcu;
    Cliente_consultarPago ccp;
    Cliente_Cancelar_servicio ccs;
    menuGerente mg;

    //GUIS DE ADMINISTRADOR
    Administrador_ConsultarPago GUI_ADM_CONS_PAGO;
    Administrador_CancelarPago  GUI_ADM_CANC_PAGO;
    Administrador_ModificarPago GUI_ADM_MOD_PAGO;
    //BOTONES ADMINISTRADOR
    JButton BOTON_ADM_Cancelar, BOTON_ADM_CONSULTAR, BOTON_ADM_MODIFICAR_PAGO, BOTON_ADM_REGRESAR;//ADMIN
    JButton BOTON2_ADM_Cancelar, BOTON2_ADM_CONSULTAR, BOTON2_ADM_CONSULTAR_PAGO, BOTON2_ADM_REGRESAR;//ADMIN2
    JButton BOTON3_ADM_Cancelar, BOTON3_ADM_CONSULTAR, BOTON3_ADM_MODIFICAR_PAGO, BOTON3_ADM_REGRESAR;//ADMIN


    
      //GUI: Administrador_ModificarPago -OSCAR-
    public OyenteInformacion(Administrador_ModificarPago GUI_ADM_MOD_PAGO, JButton BOTON_ADM_Cancelar, JButton BOTON_ADM_CONSULTAR, JButton BOTON_ADM_REGRESAR) {    
        this.GUI_ADM_MOD_PAGO = GUI_ADM_MOD_PAGO;
        this.BOTON2_ADM_Cancelar = BOTON_ADM_Cancelar;
        this.BOTON2_ADM_CONSULTAR = BOTON_ADM_CONSULTAR;
        this.BOTON2_ADM_REGRESAR = BOTON_ADM_REGRESAR;
    }

    //GUI: Administrador_CancelarPago - OSCAR
    public OyenteInformacion(Administrador_CancelarPago GUI_ADM_CANC_PAGO, JButton BOTON_ADM_CONSULTAR, JButton BOTON_ADM_MODIFICAR_PAGO, JButton BOTON_ADM_REGRESAR) {
        this.GUI_ADM_CANC_PAGO = GUI_ADM_CANC_PAGO;
        this.BOTON3_ADM_CONSULTAR = BOTON_ADM_CONSULTAR;
        this.BOTON3_ADM_MODIFICAR_PAGO = BOTON_ADM_MODIFICAR_PAGO;
        this.BOTON3_ADM_REGRESAR = BOTON_ADM_REGRESAR;
    }
    //GUI: Administrador_ConsultarPago - OSCAR
    public OyenteInformacion(Administrador_ConsultarPago GUI_ADM_CONS_PAGO, JButton BOTON_ADM_Cancelar, JButton BOTON_ADM_MODIFICAR_PAGO, JButton BOTON_ADM_REGRESAR) {
        this.GUI_ADM_CONS_PAGO = GUI_ADM_CONS_PAGO;
        this.BOTON_ADM_Cancelar = BOTON_ADM_Cancelar;
        //this.BOTON_ADM_CONSULTAR = BOTON_ADM_CONSULTAR;
        this.BOTON_ADM_MODIFICAR_PAGO = BOTON_ADM_MODIFICAR_PAGO;
        this.BOTON_ADM_REGRESAR = BOTON_ADM_REGRESAR;
    }
    
    public OyenteInformacion(menuCU mcu, JButton consultaPago) {
        this.consultaPago = consultaPago;
        this.mcu = mcu;
    }

//GERENTE:GUI CONSULTAR CLIENTE//
    public OyenteInformacion(JButton irAltaCliente, JButton irBajaCliente, JButton regresarConsultarCliente, GERENTE_CONSULTAR_INFO_CLIENTE GUICONSULTARINFOCLIENTE) {
        this.irAltaCliente = irAltaCliente;
        this.irBajaCliente = irBajaCliente;
        this.regresarConsultarCliente = regresarConsultarCliente;
        this.GUICONSULTARINFOCLIENTE = GUICONSULTARINFOCLIENTE;
    }

    //GUI GERENTE: CONSULTAR INFORMACION PERSONAL//
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
    
    //gui:Gerente consultar pago
    public OyenteInformacion(JButton irAgregarpago, JButton regresarConsultarPago, JButton modificarSalario, GERENTE_CONSULTAR_PAGO GUIconsultarPago) {
        this.irAgregarpago=irAgregarpago;
        this.regresarConsultarPago = regresarConsultarPago;
        this.modificarSalario = modificarSalario;
        this.GUIconsultarPago = GUIconsultarPago;
    }

    public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();

        if (botonPresionado == consultaPago) {
            new Cliente_consultarPago().setVisible(true);
            registro.setVisible(false);
            sesion.setVisible(false);
        }
        //gui consultar pago
        if (botonPresionado == regresar_cliente_consultaPago) {
            new menuCU().setVisible(true);
            ccp.setVisible(false);
        }
        if (botonPresionado == cancelarServicio) {
            new Cliente_Cancelar_servicio().setVisible(true);
            ccp.setVisible(false);
        }
        //GUI GERENTE CONSULTAR INFORMACION CLIENTE
        //consultaInfoCliente,regresarConsultarCliente
        if (botonPresionado == regresarConsultarCliente) {
            new menuGerente().setVisible(true);
            GUICONSULTARINFOCLIENTE.setVisible(false);
        }
        if (botonPresionado == irAltaCliente) {
            new GERENTE_ALTA_BAJA_1_ALTA().setVisible(true);
            GUICONSULTARINFOCLIENTE.setVisible(false);
        }
        if (botonPresionado == irBajaCliente) {
            new GERENTE_ALTA_BAJA_2_BAJA().setVisible(true);
            GUICONSULTARINFOCLIENTE.setVisible(false);
        }
        
        //GUI GERENTE CONSULTAR PAGO
        if (botonPresionado == regresarConsultarPago) {
            new menuGerente().setVisible(true);
            GUIconsultarPago.setVisible(false);
        }

        if (botonPresionado == modificarSalario) {
            new GERENTE_MODIFICAR_SALARIO().setVisible(true);
            GUIconsultarPago.setVisible(false);
        }
        if(botonPresionado==irAgregarpago){
            new GERENTE_AGREGAR_PAGOS().setVisible(true);
            GUIconsultarPago.setVisible(false);
        }
        //GUI: consultar informacion personal
        if (botonPresionado == regresarConsultarPersonal) {
            new menuGerente().setVisible(true);
            GUIPERSONAL.setVisible(false);
        }
        if(botonPresionado==BOTON_ADM_Cancelar){// CANCELAR PAGO 
            new Administrador_CancelarPago().setVisible(true);
            GUI_ADM_CONS_PAGO.setVisible(false);
        }/*if(botonPresionado==BOTON_ADM_CONSULTAR){ // CONSULTAR PAGO}*/
        if(botonPresionado==BOTON_ADM_MODIFICAR_PAGO){ // MODIFICAR PAGO
            new Administrador_ModificarPago().setVisible(true);
            GUI_ADM_CONS_PAGO.setVisible(false);
        }
        if(botonPresionado==BOTON_ADM_REGRESAR){ // REGRESAR A LA VENTANA ANTERIOR
            new menuAdministrador().setVisible(true);
            GUI_ADM_CONS_PAGO.setVisible(false);
        }
        //EVENTOS PARA Administrador_ModificarPago
        if(botonPresionado==BOTON2_ADM_Cancelar){// CANCELAR PAGO 
            new Administrador_CancelarPago().setVisible(true);
            GUI_ADM_MOD_PAGO.setVisible(false);
        }/*if(botonPresionado==BOTON_ADM_CONSULTAR){ // CONSULTAR PAGO}*/
        if(botonPresionado==BOTON2_ADM_CONSULTAR){ // MODIFICAR PAGO
            new Administrador_ConsultarPago().setVisible(true);
            GUI_ADM_MOD_PAGO.setVisible(false);
        }
        if(botonPresionado==BOTON2_ADM_REGRESAR){ // REGRESAR A LA VENTANA ANTERIOR
            new menuAdministrador().setVisible(true);
            GUI_ADM_MOD_PAGO.setVisible(false);
        }
        //EVENTOS PARA Administrador_CancelarPago
        if(botonPresionado==BOTON3_ADM_CONSULTAR){
            new Administrador_ConsultarPago().setVisible(true);
            GUI_ADM_CANC_PAGO.setVisible(false);
        }
        if(botonPresionado==BOTON3_ADM_MODIFICAR_PAGO){
            new Administrador_ModificarPago().setVisible(true);
            GUI_ADM_CANC_PAGO.setVisible(false);
        }
        if(botonPresionado==BOTON3_ADM_REGRESAR){
            new menuAdministrador().setVisible(true);
            GUI_ADM_CANC_PAGO.setVisible(false);
        }

    }
}
