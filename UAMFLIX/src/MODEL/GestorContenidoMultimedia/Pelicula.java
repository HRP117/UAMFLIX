
package MODEL.GestorContenidoMultimedia;

/**
 *
 * @author alan bc
 */
public class Pelicula extends ContenidoMultimedia{
  int Id_pelicula;
 String TituloP;

    public Pelicula(int Id_pelicula, String TituloP, int IdContenido, String Categoria, String Sinopsis, String Director, int Duracion) {
        super(IdContenido, Categoria, Sinopsis, Director, Duracion);
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
