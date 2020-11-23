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

    public Documental(int IdDocumental, String TituloDoc, int IdContenido, String Categoria, String Sinopsis, String Director, int Duracion) {
        super(IdContenido, Categoria, Sinopsis, Director, Duracion);
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
