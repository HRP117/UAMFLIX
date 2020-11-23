/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPersonalCliente;

/**
 *
 * @author alan bc
 */
public class Usuario {
    String Nombre;
    String Apellido;
    String Nickname;
    String Correo;
    String Telefono;
    String Contraseña;

    public Usuario(String Nombre, String Apellido, String Nickname, String Correo, String Telefono, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nickname = Nickname;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Contraseña = Contraseña;
    }
    public Usuario(){
        
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

    
}
