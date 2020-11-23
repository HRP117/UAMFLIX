
package MODEL.GestorAutentificacion;

import MODEL.GestorPersonalCliente.Usuario;

/**
 *
 * @author alan bc
 */
public class Auntentificacion {
    Usuario CorreoU;
    Usuario ContraseñaU;

    public Auntentificacion(Usuario CorreoU, Usuario ContraseñaU) {
        this.CorreoU = CorreoU;
        this.ContraseñaU = ContraseñaU;
    }

    public Usuario getCorreoU() {
        return CorreoU;
    }

    public void setCorreoU(Usuario CorreoU) {
        this.CorreoU = CorreoU;
    }

    public Usuario getContraseñaU() {
        return ContraseñaU;
    }

    public void setContraseñaU(Usuario ContraseñaU) {
        this.ContraseñaU = ContraseñaU;
    }
    
    
}
