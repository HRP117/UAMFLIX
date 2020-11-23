/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorAutentificacion;

import VIEW.*;
import MODEL.GestorPersonalCliente.Cliente;
import MODEL.GestorPersonalCliente.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;


public class gestorAutentificacion {
    //metodo registrar
   public boolean registrar(Cliente cliente){
        //int resultado=0;
      conexion con = new conexion();
      PreparedStatement ps;
      try{
          Connection conexion = con.getConnection();
          /*String sql = "insert into uamflix.clientes_cu(ID_CLIENTE_CU,NOMBRE_CU,CORREO_CU,TELEFONO_CU,"
                  + "NICKNAME,CONTRASEÑA,ESTATUS_CU,ESTATUS_B )"
                  + "values(?,?,?,?,?,?,?,?,?)";*/
          String sql = "INSERT INTO `uamflix`.`clientes_cu` (`ID_CLIENTE_CU`, `NOMBRE_CU`, `CORREO_CU`, `TELEFONO_CU`,"
                  + "`NICKNAME`, `CONTRASEÑA`, `ESTATUS_CU`, `ESTATUS_B`,`NUM_TARJETA`)"
                  + "VALUES(?,?,?,?,?,?,?,?,?)";
          ps = (PreparedStatement)conexion.prepareStatement(sql);
          ps.setString(1,cliente.getIdCliente());      
          ps.setString(2,cliente.getNombre());
          ps.setString(3,cliente.getCorreo());
          ps.setString(4,cliente.getTelefono());
          ps.setString(5,cliente.getNickname());
          ps.setString(6,cliente.getContraseña());
          ps.setBoolean(7,cliente.getEstatusCliente());
          ps.setBoolean(8,cliente.getEstatusBeca());
          ps.setString(9, cliente.getTarjeta().getNumeroTarjeta());
          ps.executeUpdate();
          //System.out.println("ps: "+ps);
            //ps.close();
            return true;
            
        }catch(SQLException ex){
            System.out.println("ERROR: " +ex);
            return false;
        }
    }
    public boolean iniciarSesion(Cliente cliente, String BuscarMatricula, String BuscarClave) {
        conexion con = new conexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM clientes_cu WHERE ID_CLIENTE_CU=? AND CONTRASEÑA=?";
        try {
            //System.out.println("SQL COMAND: "+sql);
            Connection conexion = con.getConnection();
            ps = (PreparedStatement) conexion.prepareStatement(sql); // 
            ps.setString(1, BuscarMatricula);   //  SE BUSCA LA MATRICULA EN LA BASE DE DATOS
            ps.setString(2, BuscarClave);       //  SE BUSCA LA PASSWORD EN LA BASE DE DATOS
            rs = ps.executeQuery(); //error
            if (rs.next()) {
                if (cliente.getContraseña().equals(BuscarClave)) {
                    cliente.setIdCliente(BuscarMatricula);
                    cliente.setNickname(rs.getString(5));
                    return true;

                } 
                else {
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(gestorAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
            return false;
        }
    }
    
   //inicio sesion personal
    public boolean sesionPersonal(Personal personal,String buscarContraseña,String buscarIdPersonal,String tipoPersonal){
        conexion con = new conexion();
        PreparedStatement ps;
        ResultSet rs;
    
        String sql = "SELECT * FROM PERSONAL WHERE ID_PERSONAL=? AND CONTRASEÑA_PERS=? AND CARGO=?";
        //String sql = "SELECT * FROM PERSONAL WHERE ID_PERSONAL=? AND CONTRASEÑA_PERS=?";
        try {
            Connection conexion = con.getConnection();
            ps = (PreparedStatement) conexion.prepareStatement(sql); // 
            ps.setString(1, buscarContraseña);   //  SE BUSCA LA PASSWORD EN LA BASE DE DATOS
            ps.setString(2, buscarIdPersonal);   //  SE BUSCA EL ID PERSONAL EN LA BASE DE DATOS
            ps.setString(3, tipoPersonal);      // se busca el tupoPersonal
            rs = ps.executeQuery(); //error
            if (rs.next()) {
                if (personal.getContraseña().equals(buscarContraseña)) {
                    personal.setIdPersonal(rs.getString(1));
                    personal.setNombre(rs.getString(2));
                    personal.setCargo(rs.getString(7));
                    return true;

                } 
                else {
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(gestorAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HAY UN Error, "+ex);
            return false;
        }
    }
    }

