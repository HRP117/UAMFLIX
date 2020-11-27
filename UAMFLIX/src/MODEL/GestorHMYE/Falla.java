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
public class Falla {
     Integer IdError;
    String TipoError;
    String DescripcionError;

    public Integer getIdError() {
        return IdError;
    }

    public String getTipoError() {
        return TipoError;
    }

    public String getDescripcionError() {
        return DescripcionError;
    }

    public void setIdError(Integer IdError) {
        this.IdError = IdError;
    }

    public void setTipoError(String TipoError) {
        this.TipoError = TipoError;
    }

    public void setDescripcionError(String DescripcionError) {
        this.DescripcionError = DescripcionError;
    }
}
