
package MODEL.GestorPersonalCliente;

import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPago.Pago;
import MODEL.GestorPago.TarjetaCredito;
import VIEW.INFORMACION.GERENTE_CONSULTAR_INFO_CLIENTE;
import VIEW.PAGO.GERENTE_MODIFICAR_SALARIO;
import MODEL.gestorBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class gestorPersonalCliente{
    JTable tablaPersonal,tablaCliente;
    JTextField busqueda,id,cajaSalario;
    
    public boolean altaPersonal(Personal personal){
        PreparedStatement ps;

        try {
            conexion con = new conexion();
            Connection conexion = con.getConnection();

            String sql = "INSERT INTO `uamflix`.`personal` (`ID_PERSONAL`,`NOMBRE_PERS`,`TELEFONO_PERS`,`CORREO_PERS`,"
                    + "`CONTRASEÑA_PERS`, `ESTATUS_PERS`, `CARGO`,`SALARIO`)"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            ps = (PreparedStatement) conexion.prepareStatement(sql);
            ps.setString(1, personal.getIdPersonal());
            ps.setString(2, personal.getNombre());
            ps.setString(3, personal.getTelefono());
            ps.setString(4, personal.getCorreo());
            ps.setString(5, personal.getContraseña());
            ps.setBoolean(6, personal.getEstatusPersonal()); //error
            ps.setString(7, personal.getCargo());
            ps.setString(8, personal.getSueldo());
            ps.executeUpdate();
            return true;
            
        }catch(SQLException ex){
            System.out.println("ERROR: " +ex);
            return false;
        }
    }
    public void modificarSalario(Personal personal, JTextField id,JTextField cajaSalario){
        PreparedStatement ps = null;
        int rs;
        //ResultSet rs =  null;

        try{
          conexion con = new conexion();
          Connection conexion = con.getConnection();
        
          String sql = "UPDATE personal SET SALARIO=? WHERE ID_PERSONAL=?";
          ps = (PreparedStatement)conexion.prepareStatement(sql);
          ps.setString(1, cajaSalario.getText());
          ps.setString(2, id.getText());
          rs = ps.executeUpdate();
          System.out.println("rs: "+rs);
          if(rs>0){
            JOptionPane.showMessageDialog(null, "SALARIO MODIFICADO CORRECTAMENTE! :)");
          }
          else{
            JOptionPane.showMessageDialog(null, "SALARIO NO MODIFICADO :(");
          }
        }
        catch(SQLException ex){
            System.out.println("ERROR: " +ex);
        }
    }
    
    public boolean consultarSalario(Personal personal,JTable tablaPersonal,JTextField busqueda){
          DefaultTableModel modelotabla = new DefaultTableModel();
          tablaPersonal.setModel(modelotabla);
          String campo =  busqueda.getText();
          String where = ""; //concatenacion
        if(!"".equals(campo)){
            where = "WHERE ID_PERSONAL='"+campo+"'";
        }
        PreparedStatement ps = null;
        ResultSet rs =  null;
    
        try{
          conexion con = new conexion();
          Connection conexion = con.getConnection();
        
          String sql = "SELECT ID_PERSONAL,NOMBRE_PERS,CARGO,SALARIO FROM personal ";
          ps = (PreparedStatement)conexion.prepareStatement(sql+where);
          //ps.executeUpdate();
          rs = ps.executeQuery();
          modelotabla.addColumn("ID_PERSONAL");
          modelotabla.addColumn("NOMBRE_PERS");
          modelotabla.addColumn("CARGO");
          modelotabla.addColumn("SALARIO");
          
          ResultSetMetaData rsmd = rs.getMetaData();
          int columnas = rsmd.getColumnCount();

           while(rs.next()){
                Object fila[] = new Object[columnas];
                for(int i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
                modelotabla.addRow(fila);
            }
           
           return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_MODIFICAR_SALARIO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean cancelarServicio(Cliente cliente,JTextField busqueda,String matricula,JTable tablaCliente){
       gestorPersonalCliente gpc = new gestorPersonalCliente();
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPersonal.setModel(modelotabla);
        String campo =  busqueda.getText();
        String where = ""; //concatenacion
        if(!"".equals(campo)){
            where = "WHERE ID_CLIENTE_CU='"+campo+"'";
        }
        PreparedStatement ps = null;
        ResultSet rs =  null;
    
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            ps = conexion.prepareStatement("SELECT ID_CLIENTE_CU,NOMBRE_CU,CORREO_CU,NICKNAME,ESTATUS_CU FROM CLIENTES_CU "+where);
            rs = ps.executeQuery();
            modelotabla.addColumn("ID_CLIENTE_CU");
            modelotabla.addColumn("NOMBRE_CU");
            modelotabla.addColumn("CORREO_CU");
            modelotabla.addColumn("NICKNAME");
            modelotabla.addColumn("ESTATUS_CU");

            
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            

            while(rs.next()){
                Object fila[] = new Object[columnas];
                for(int i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
                modelotabla.addRow(fila);
            }
        return true;
        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   //AGREGAR PAGO
    public boolean agregarPago(Pago pago,TarjetaCredito tarjeta){
         conexion con = new conexion();
      PreparedStatement ps;
      try{
          Connection conexion = con.getConnection();
         String sql = "INSERT INTO `uamflix`.`PAGOS` (`ID_PAGO`, `MONTO`, `FECHA`,`NUM_TARJETA`)"
                  + "VALUES(?,?,?,?)";
          
          ps = (PreparedStatement)conexion.prepareStatement(sql);
          ps.setString(1,pago.getIdPago());   
          ps.setString(2,pago.getCantidad());
          ps.setString(3, pago.getFecha());
          ps.setString(4,tarjeta.getNumeroTarjeta());
          ps.executeUpdate();
          return true; 
       
      }catch(SQLException ex){
            System.out.println("ERROR: " +ex);
            return false;
        }
    }
    
    //ADMINISTRADOR
    
     public void AdministradorCancelarPago(JButton BuscarPago, JTextField IdClienteBusqueda, JTable tablaPagos){
        /*
        */
        // TODO add your handling code here:
        //gestorAutentificacion ga = new gestorAutentificacion();
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPagos.setModel(modelotabla);
        String campo =  IdClienteBusqueda.getText();
        String where = ""; //concatenacion
        
        PreparedStatement ps = null;
        ResultSet rs =  null;
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            String sql = "";
            if(campo.equals("")){
                sql = "SELECT * FROM Pagos";                
            }
            else{
                sql = "SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos WHERE ID_PAGO="+campo;
                //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos ");
                //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos WHERE ID_PAGO="+campo);
            }
            System.out.println("SQL: "+sql);
            ps = conexion.prepareStatement(sql);
            //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos ");
            //ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            modelotabla.addColumn("ID_PAGO");
            modelotabla.addColumn("MONTO");
            modelotabla.addColumn("FECHA");
            modelotabla.addColumn("NUM_TARJETA");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            while(rs.next()){
                Object fila[] = new Object[columnas];
                for(int i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
                modelotabla.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
        }
    }
    // -------------OSCAR-------------------------
    
    public void BuscarPago(JTable tablaPagos,  JTextField IdClienteBusqueda){
        //gestorAutentificacion ga = new gestorAutentificacion();
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPagos.setModel(modelotabla);
        String campo =  IdClienteBusqueda.getText();
        String where = ""; //concatenacion

        PreparedStatement ps = null;
        ResultSet rs =  null;
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            String sql = "";
            if(campo.equals("")){
                sql = "SELECT * FROM Pagos";
            }
            else{
                sql = "SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos WHERE ID_PAGO="+campo;
                //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos ");
                //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos WHERE ID_PAGO="+campo);
            }
            System.out.println("SQL: "+sql);
            ps = conexion.prepareStatement(sql);
            //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos ");
            //ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            modelotabla.addColumn("ID_PAGO");
            modelotabla.addColumn("MONTO");
            modelotabla.addColumn("FECHA");
            modelotabla.addColumn("NUM_TARJETA");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            while(rs.next()){
                Object fila[] = new Object[columnas];
                for(int i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
                modelotabla.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
        }
    }
    
    // ADMINISTRADOR - AutorizarAdminVizualizarPagos
    public boolean AutorizarAdminVizualizarPagos(Personal p){
        //System.out.println("ID_Pago2: "+ID_Pago);
        String ID_Pago;
        System.out.println("...");
        conexion con = new conexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM PERSONAL WHERE ID_PERSONAL=? AND CARGO=?";
        try {
            Connection conexion = con.getConnection();
            ps = (PreparedStatement) conexion.prepareStatement(sql); // 
            ps.setString(1, p.getIdPersonal());    //  SE BUSCA EL ID_PERSONAL EN LA BASE DE DATOS
            ps.setString(2, p.getCargo());   //  SE BUSCA EL CARGO DEL PERSONAL EN LA BASE DE DATOS
            rs = ps.executeQuery();     //  Error
            if (rs.next()) {
                ID_Pago = rs.getString(1);
                if (p.getIdPersonal().equals(ID_Pago)){
                    System.out.println("SE AUTORIZÓ AL ADMINISTRADOR A CONSULTAR LA BASE DE DATOS PARA PAGO");
                    return true;
                }
                else {
                    System.out.println("NO SE AUTORIZO AL ADMIN");
                    return false;
                }
                //return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(gestorAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
            return false;
        }
    }
    
    public boolean CancelarPago(Pago p, String ID_Pago){
        //System.out.println("ID_Pago2: "+ID_Pago);
        System.out.println("CancelandoPago.....");
        conexion con = new conexion();
        PreparedStatement ps;
        int rs;
        String sql = "DELETE FROM `uamflix`.`pagos` WHERE (`ID_PAGO`=?);";
        try {
            Connection conexion = con.getConnection();
            ps = (PreparedStatement) conexion.prepareStatement(sql); // 
            ps.setString(1, ID_Pago);    //  SE BUSCA EL ID_PERSONAL EN LA BASE DE DATOS
            rs = ps.executeUpdate();     //  Error
            if (rs>0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(gestorAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
            return false;
        }
    }
    
    public void AdminConsultarPago(JTable tablaPagos, JTextField IdClienteBusqueda){
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPagos.setModel(modelotabla);
        String campo =  IdClienteBusqueda.getText();
        PreparedStatement ps = null;
        ResultSet rs =  null;
        try {
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            String sql = "";
            if(campo.equals("")){
                sql = "SELECT * FROM Pagos";
            }
            else{
                sql = "SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos WHERE ID_PAGO="+campo;
                //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos ");
                //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos WHERE ID_PAGO="+campo);
            }
            System.out.println("SQL: "+sql);
            ps = conexion.prepareStatement(sql);
            //ps = conexion.prepareStatement("SELECT ID_PAGO, MONTO, FECHA, NUM_TARJETA FROM Pagos ");
            //ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            modelotabla.addColumn("ID_PAGO");
            modelotabla.addColumn("MONTO");
            modelotabla.addColumn("FECHA");
            modelotabla.addColumn("NUM_TARJETA");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            while(rs.next()){
                Object fila[] = new Object[columnas];
                for(int i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
                modelotabla.addRow(fila);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
        }
    }
    
    public void AdminModificarPagos(JTextField IdClienteBusqueda, JTextField ModificaMonto){
        /*          */
        //DefaultTableModel modelotabla = new DefaultTableModel();
        String campo =  IdClienteBusqueda.getText();
        String campo2 =  ModificaMonto.getText();
        PreparedStatement ps = null;
        int rs;//resultado
        try {
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            String sql = "UPDATE `uamflix`.`pagos` SET `MONTO` = '"+campo2+"' WHERE (`ID_PAGO` = '"+campo+"'); ";
            System.out.println("SQL: "+sql);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeUpdate();
            
            System.out.println("rs: "+rs);
            if(rs>0){
                JOptionPane.showMessageDialog(null, "PAGO MODIFICADO CORRECTAMENTE! :)");
            }
            else{
                JOptionPane.showMessageDialog(null, "PAGO NO MODIFICADO :(");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
        }
    }
      
    
}
