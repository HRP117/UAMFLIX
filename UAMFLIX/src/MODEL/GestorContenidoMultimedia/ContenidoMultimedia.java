
package MODEL.GestorContenidoMultimedia;

public class ContenidoMultimedia {
  int IdContenido;
  String Categoria;
  String Sinopsis;
  String Director;
  int Duracion;
    
  //constructor//
    public ContenidoMultimedia(int IdContenido, String Categoria, String Sinopsis, String Director, int Duracion) {
        this.IdContenido = IdContenido;
        this.Categoria = Categoria;
        this.Sinopsis = Sinopsis;
        this.Director = Director;
        this.Duracion = Duracion;
    }
  //metodos//

    public int getIdContenido() {
        return IdContenido;
    }

    public void setIdContenido(int IdContenido) {
        this.IdContenido = IdContenido;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }
  
}


