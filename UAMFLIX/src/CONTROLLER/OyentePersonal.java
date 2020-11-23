
package CONTROLLER;

import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OyentePersonal implements ActionListener{
    //alta cliente: 3 botones y la gui
    JButton bajacliente,registrarAlta,regresarMenuGerente;
    GERENTE_ALTA_BAJA_1_ALTA gaba;
    GERENTE_ALTA_BAJA_2_BAJA gabb;
    
    //baja cliente:
    JButton altaCliente,eliminarCuenta,buscarCliente;

    public OyentePersonal(JButton bajacliente, JButton registrarAlta, JButton regresarMenuGerente, GERENTE_ALTA_BAJA_1_ALTA gaba) {
        this.bajacliente = bajacliente;
        this.registrarAlta = registrarAlta;
        this.regresarMenuGerente = regresarMenuGerente;
        this.gaba = gaba;
    }
    
    //baja cliente
     public OyentePersonal(GERENTE_ALTA_BAJA_2_BAJA gabb,JButton regresarMenuGerente, JButton altaCliente, JButton eliminarCuenta, JButton buscarCliente) {
        this.gabb = gabb;
         this.regresarMenuGerente = regresarMenuGerente;
        this.altaCliente = altaCliente;
        this.eliminarCuenta = eliminarCuenta;
        this.buscarCliente = buscarCliente;
    }

    public OyentePersonal(JButton regresar, JButton CONSULTAR, GERENTE_CONSULTAR_INFO_CLIENTE aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
        public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        
        
    }
    
}
