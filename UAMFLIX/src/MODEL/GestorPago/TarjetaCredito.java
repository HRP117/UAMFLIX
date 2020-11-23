/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPago;

import java.util.Date;

/**
 *
 * @author alan bc
 */
public class TarjetaCredito {
    String NumeroTarjeta;
    Integer CVV;
    String NombreTitular;

   //constructor//

    public TarjetaCredito(String NumeroTarjeta, Integer CVV, String NombreTitular) {
        this.NumeroTarjeta = NumeroTarjeta;
        this.CVV = CVV;
        this.NombreTitular = NombreTitular;
    }

   

    public TarjetaCredito() {
    }

    public String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(String NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }

    public Integer getCVV() {
        return CVV;
    }

    public void setCVV(Integer CVV) {
        this.CVV = CVV;
    }

    public String getNombreTitular() {
        return NombreTitular;
    }

    public void setNombreTitular(String NombreTitular) {
        this.NombreTitular = NombreTitular;
    }
    

   
}
