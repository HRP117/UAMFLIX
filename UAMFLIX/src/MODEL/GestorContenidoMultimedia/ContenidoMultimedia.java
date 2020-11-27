
package MODEL.GestorContenidoMultimedia;

public class ContenidoMultimedia {
  String IdContenido;
  String Titulo;
  String Categoria;
  String Sinopsis;
  String Duracion;
  String IdDirector;
  Boolean Estatus_CM;

    public ContenidoMultimedia(){}
    
    public ContenidoMultimedia(String IdContenido, String Titulo, String Categoria, String Sinopsis, String Duracion, String IdDirector, Boolean Estatus_CM) {
        this.IdContenido = IdContenido;
        this.Titulo = Titulo;
        this.Categoria = Categoria;
        this.Sinopsis = Sinopsis;
        this.Duracion = Duracion;
        this.IdDirector = IdDirector;
        this.Estatus_CM = Estatus_CM;
    }

    public String getIdContenido() {
        return IdContenido;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public String getDuracion() {
        return Duracion;
    }

    public String getIdDirector() {
        return IdDirector;
    }

    public Boolean getEstatus_CM() {
        return Estatus_CM;
    }

    public void setIdContenido(String IdContenido) {
        this.IdContenido = IdContenido;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public void setIdDirector(String IdDirector) {
        this.IdDirector = IdDirector;
    }

    public void setEstatus_CM(Boolean Estatus_CM) {
        this.Estatus_CM = Estatus_CM;
    }
}