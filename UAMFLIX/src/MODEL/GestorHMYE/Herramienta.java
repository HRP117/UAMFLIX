/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorHMYE;

/**
 *
 * @author alan bc
 */
public class Herramienta {
    int    IdHerramienta;
    String TipoHerramienta;
    String DescripcionHerramienta;

    public Integer getIdHerramienta() {
        return IdHerramienta;
    }

    public String getTipoHerramienta() {
        return TipoHerramienta;
    }

    public String getDescripcionHerramienta() {
        return DescripcionHerramienta;
    }

    public void setIdHerramienta(Integer IdHerramienta) {
        this.IdHerramienta = IdHerramienta;
    }

    public void setTipoHerramienta(String TipoHerramienta) {
        this.TipoHerramienta = TipoHerramienta;
    }

    public void setDescripcionHerramienta(String DescripcionHerramienta) {
        this.DescripcionHerramienta = DescripcionHerramienta;
    }


}
