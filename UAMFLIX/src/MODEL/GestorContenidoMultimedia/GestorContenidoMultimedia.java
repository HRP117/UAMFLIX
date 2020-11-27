
package MODEL.GestorContenidoMultimedia;

import VIEW.*;
import MODEL.GestorHMYE.*;
import MODEL.gestorBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;

public class GestorContenidoMultimedia {
     
    public boolean agregarCM(ContenidoMultimedia ContenidoMultimedia){
      conexion con = new conexion();
      PreparedStatement ps;
      try{
          Connection conexion = con.getConnection();
          String sql = "INSERT INTO 'uamflix'.'contenido_mult' ('ID_CM', 'TITULO',"
                  + "'CATEGORIA', 'SINOPSIS', 'DURACION', 'ID_DIR','ESTATUS_CM')"
                  + "VALUES(?,?,?,?,?,?,?)";
          ps = (PreparedStatement)conexion.prepareStatement(sql);
          ps.setString(1,ContenidoMultimedia.getIdContenido());      
          ps.setString(2,ContenidoMultimedia.getTitulo());
          ps.setString(3,ContenidoMultimedia.getCategoria());
          ps.setString(4,ContenidoMultimedia.getSinopsis());
          ps.setString(5,ContenidoMultimedia.getDuracion());
          ps.setString(6,ContenidoMultimedia.getIdDirector());
          ps.setBoolean(7,ContenidoMultimedia.getEstatus_CM());
          ps.executeUpdate();
             return true;
            
        }catch(SQLException ex){
            System.out.println("ERROR: " +ex);
            return false;
        }
    }
    
    
}
