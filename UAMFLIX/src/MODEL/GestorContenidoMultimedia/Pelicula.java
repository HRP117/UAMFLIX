
package MODEL.GestorContenidoMultimedia;

/**
 *
 * @author alan bc
 */
public class Pelicula extends ContenidoMultimedia{
  int Id_pelicula;
 String TituloP;

    public Pelicula(int Id_pelicula, String TituloP, String IdContenido, String Titulo, String Categoria, String Sinopsis, String Duracion, String IdDirector, Boolean Estatus_CM) {
        super(IdContenido, Titulo, Categoria, Sinopsis, Duracion, IdDirector, Estatus_CM);
        this.Id_pelicula = Id_pelicula;
        this.TituloP = TituloP;
    }

 
 
 //metodos//

    public int getId_pelicula() {
        return Id_pelicula;
    }

    public void setId_pelicula(int Id_pelicula) {
        this.Id_pelicula = Id_pelicula;
    }

    public String getTituloP() {
        return TituloP;
    }

    public void setTituloP(String TituloP) {
        this.TituloP = TituloP;
    }

}
