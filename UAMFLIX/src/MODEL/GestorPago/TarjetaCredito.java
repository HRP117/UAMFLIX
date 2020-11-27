/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPago;

import MODEL.GestorPersonalCliente.Cliente;
import java.util.Date;

/**
 *
 * @author alan bc
 */
public class TarjetaCredito extends Cliente{
    String NumeroTarjeta;
    String CVV;
    String NombreTitular;
    String fechaVenc;

   //constructor//

//    public TarjetaCredito(String NumeroTarjeta, Integer CVV, String NombreTitular) {
//        this.NumeroTarjeta = NumeroTarjeta;
//        this.CVV = CVV;
//        this.NombreTitular = NombreTitular;
//    }

   

    
    
    //metodos y atributos de la clase tarejta
    public TarjetaCredito() {
    }
    

    public String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(String NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getNombreTitular() {
        return NombreTitular;
    }

    public void setNombreTitular(String NombreTitular) {
        this.NombreTitular = NombreTitular;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
    

   
}
