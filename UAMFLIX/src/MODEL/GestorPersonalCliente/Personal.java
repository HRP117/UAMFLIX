/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorPersonalCliente;

public class Personal extends Usuario{
    String IdPersonal;
    String Cargo;
    Float Sueldo;
    Boolean EstatusPersonal;

    public Personal(){
        
    }
    
    
    public String getIdPersonal() {
        return IdPersonal;
    }

    public String getCargo() {
        return Cargo;
    }

    public Float getSueldo() {
        return Sueldo;
    }

    public Boolean getEstatusPersonal() {
        return EstatusPersonal;
    }

    public void setIdPersonal(String IdPersonal) {
        this.IdPersonal = IdPersonal;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setSueldo(Float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setEstatusPersonal(Boolean EstatusPersonal) {
        this.EstatusPersonal = EstatusPersonal;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getApellido() {
        return Apellido;
    }

    @Override
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String getNickname() {
        return Nickname;
    }

    @Override
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    @Override
    public String getCorreo() {
        return Correo;
    }

    @Override
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String getTelefono() {
        return Telefono;
    }

    @Override
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String getContraseña() {
        return Contraseña;
    }

    @Override
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public void DatosPersonal(){
        System.out.println("Nombre: "+getNombre()
        +"\nid personal: "+getIdPersonal()
        +"\n"
        +"\nCargo: : "+getCargo()
        +"\nNickname: "+getNickname()
        +"\nContraseña: "+getContraseña()
        +"\nCorreo: " +getCorreo()+""
        + "\nTelefono: " +getTelefono()
        +"\nSueldo: "+ getSueldo());
    }
    
}
