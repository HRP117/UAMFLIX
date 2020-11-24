/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import VIEW.Cliente_consultarPago;
import VIEW.GERENTE_CONSULTAR_INFO_CLIENTE;
import VIEW.GERENTE_CONSULTAR_PAGO;
import VIEW.GERENTE_CONS_INFO_PERSONAL;
import VIEW.Registro;
import VIEW.inicioSesion;
import VIEW.menuCU;
import VIEW.menuGerente;
import javax.swing.JButton;

public class repertorio {
    
       JButton consultaPago,consultarSalarios,consultaInfoCliente;
    JButton consultarPersonal,menuConsultaPago,modificarSalario;
    JButton regresarConsultarPago,regresarConsultarCliente;
    JButton regresarConsultarPersonal,regresarModificarSalario;
    JButton regresar_cliente_consultaPago,cancelarServicio;
    Registro registro;
    inicioSesion sesion;
    menuCU mcu;
    Cliente_consultarPago ccp;
    menuGerente mg;
    GERENTE_CONSULTAR_INFO_CLIENTE GUICONSULTARINFOCLIENTE;
    GERENTE_CONS_INFO_PERSONAL GUI_INFO_PER;
    GERENTE_CONSULTAR_PAGO GUIconsultarPago;
    GERENTE_CONS_INFO_PERSONAL GUIPERSONAL;

    public repertorio(JButton regresar_cliente_consultaPago, JButton cancelarServicio, GERENTE_CONSULTAR_PAGO GUIconsultarPago) {
        this.regresar_cliente_consultaPago = regresar_cliente_consultaPago;
        this.cancelarServicio = cancelarServicio;
        this.GUIconsultarPago = GUIconsultarPago;
    }
    
    
}
