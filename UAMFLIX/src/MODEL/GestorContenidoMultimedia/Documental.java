/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorContenidoMultimedia;
public class Documental extends ContenidoMultimedia{
  int IdDocumental;
  String TituloDoc;
  
  //constructor//

    public Documental(int IdDocumental, String TituloDoc, String IdContenido, String Titulo, String Categoria, String Sinopsis, String Duracion, String IdDirector, Boolean Estatus_CM) {
        super(IdContenido, Titulo, Categoria, Sinopsis, Duracion, IdDirector, Estatus_CM);
        this.IdDocumental = IdDocumental;
        this.TituloDoc = TituloDoc;
    }
    
 
  //metodos//

    public int getIdDocumental() {
        return IdDocumental;
    }

    public void setIdDocumental(int IdDocumental) {
        this.IdDocumental = IdDocumental;
    }

    public String getTituloDoc() {
        return TituloDoc;
    }

    public void setTituloDoc(String TituloDoc) {
        this.TituloDoc = TituloDoc;
    }
    
}
