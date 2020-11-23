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

    public Serie(int IdSerie, String tituloSerie, int IdContenido, String Categoria, String Sinopsis, String Director, int Duracion) {
        super(IdContenido, Categoria, Sinopsis, Director, Duracion);
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
