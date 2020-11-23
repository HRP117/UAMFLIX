/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPago;

public class validar_pago {
    Boolean Validacion;
    Pago ComprobarPago;
    TarjetaCredito ComprobarTarjeta;


    public Boolean getValidacion() {
        return Validacion;
    }

    public Pago getComprobarPago() {
        return ComprobarPago;
    }

    public TarjetaCredito getComprobarTarjeta() {
        return ComprobarTarjeta;
    }

    public void setValidacion(Boolean Validacion) {
        this.Validacion = Validacion;
    }

    public void setComprobarPago(Pago ComprobarPago) {
        this.ComprobarPago = ComprobarPago;
    }

    public void setComprobarTarjeta(TarjetaCredito ComprobarTarjeta) {
        this.ComprobarTarjeta = ComprobarTarjeta;
    }    
}
