/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPersonalCliente;

import MODEL.GestorPago.TarjetaCredito;
import java.util.Objects;

public class Cliente extends Usuario{
    String IdCliente;
    Boolean EstatusBeca;
    Boolean EstatusProyecto;
    Boolean EstatusCliente;
    TarjetaCredito tarjeta;

    public Cliente(String IdCliente, Boolean EstatusBeca, Boolean EstatusProyecto, Boolean EstatusCliente, TarjetaCredito tarjeta, String Nombre, String Apellido, String Nickname, String Correo, String Telefono, String Contraseña) {
        super(Nombre, Apellido, Nickname, Correo, Telefono, Contraseña);
        this.IdCliente = IdCliente;
        this.EstatusBeca = EstatusBeca;
        this.EstatusProyecto = EstatusProyecto;
        this.EstatusCliente = EstatusCliente;
        this.tarjeta = tarjeta;
    }

    public Cliente(String Nombre, String Apellido, String Nickname, String Correo, String Telefono, String Contraseña) {
        super(Nombre, Apellido, Nickname, Correo, Telefono, Contraseña);
    }
    
    
    public Cliente(){
        
    }
    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Boolean getEstatusBeca() {
        return EstatusBeca;
    }

    public void setEstatusBeca(Boolean EstatusBeca) {
        this.EstatusBeca = EstatusBeca;
    }

    public Boolean getEstatusProyecto() {
        return EstatusProyecto;
    }

    public void setEstatusProyecto(Boolean EstatusProyecto) {
        this.EstatusProyecto = EstatusProyecto;
    }

    public Boolean getEstatusCliente() {
        return EstatusCliente;
    }

    public void setEstatusCliente(Boolean EstatusCliente) {
        this.EstatusCliente = EstatusCliente;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    public void DatosCliente(){
        System.out.println("ID Cliente: "+ getIdCliente() 
                +"\nNombre: "+getNombre()+""
                + "\nApellido: "+getApellido()
                +"\nPassword: "+getContraseña()
                +"\nCorreo: " +getCorreo()
                +"\nNickname: "+getNickname()
                +"\nTelefono: "+getTelefono()
                +"\nEstatus Beca: "+getEstatusBeca()
                +"\nEstatus Cliente: " +getEstatusCliente());
    }
}