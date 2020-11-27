/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorContenidoMultimedia;


/**
 *
 * @author alan bc
 */
public class Serie extends ContenidoMultimedia{
   int  IdSerie;
   String tituloSerie;
   //constructor

    public Serie(int IdSerie, String tituloSerie, String IdContenido, String Titulo, String Categoria, String Sinopsis, String Duracion, String IdDirector, Boolean Estatus_CM) {
        super(IdContenido, Titulo, Categoria, Sinopsis, Duracion, IdDirector, Estatus_CM);
        this.IdSerie = IdSerie;
        this.tituloSerie = tituloSerie;
    }
  
   

    public int getIdSerie() {
        return IdSerie;
    }

    public void setIdSerie(int IdSerie) {
        this.IdSerie = IdSerie;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }
   
}
