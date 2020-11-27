/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPago;

import MODEL.GestorPersonalCliente.Usuario;
import java.util.Date;

public class Pago {
    String Fecha;
    TarjetaCredito Tarjeta;
    String Nombre;
    Usuario TipoUsuario;
    String Cantidad;
    String idPago;

    public String getFecha() {
        return Fecha;
    }

    public TarjetaCredito getTarjeta() {
        return Tarjeta;
    }

    public String getNombre() {
        return Nombre;
    }

    public Usuario getTipoUsuario() {
        return TipoUsuario;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setTarjeta(TarjetaCredito Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipoUsuario(Usuario TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
    
}
