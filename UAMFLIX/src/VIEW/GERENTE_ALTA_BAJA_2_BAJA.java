/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.OyentePersonal;
import CONTROLLER.OyentePersonal;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GERENTE_ALTA_BAJA_2_BAJA extends javax.swing.JFrame {

 OyentePersonal op;    
public GERENTE_ALTA_BAJA_2_BAJA() {
     setLocationRelativeTo(null); //ventana en medio de la pantalla
     initComponents();
     op = new OyentePersonal(this,REGRESAR, ALTA, eliminar, buscar_cliente);
     REGRESAR.addActionListener(op);
     ALTA.addActionListener(op);   
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ALTA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Opcion_2_BAJA = new javax.swing.JPanel();
        busqueda = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        buscar_cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        REGRESAR = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_CLIENTE.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        ALTA.setBackground(new java.awt.Color(0, 0, 0));
        ALTA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ALTA.setForeground(new java.awt.Color(255, 255, 255));
        ALTA.setText("ALTA");
        ALTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ALTAMouseClicked(evt);
            }
        });
        ALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTAActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BAJA");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(ALTA))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButton3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ALTA)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 220, 380));

        Opcion_2_BAJA.setBackground(new java.awt.Color(201, 45, 57));
        Opcion_2_BAJA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        Opcion_2_BAJA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busqueda.setForeground(new java.awt.Color(204, 204, 204));
        busqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        Opcion_2_BAJA.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ICONO_USUARIO_3.png"))); // NOI18N
        Opcion_2_BAJA.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        buscar_cliente.setBackground(new java.awt.Color(201, 45, 57));
        buscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ICONO_BUSCADOR_1.png"))); // NOI18N
        buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_clienteActionPerformed(evt);
            }
        });
        Opcion_2_BAJA.add(buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 60, 40));

        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_CLIENTE_CU", "NOMBRE_CU", "CORREO_CU", "NICKNAME", "ESTATUS_CLIENTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonal);

        Opcion_2_BAJA.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 500, 270));

        jPanel2.add(Opcion_2_BAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 520, 340));

        REGRESAR.setBackground(new java.awt.Color(0, 0, 0));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGRESAR.setForeground(new java.awt.Color(201, 45, 57));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        jPanel2.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 30));

        eliminar.setBackground(new java.awt.Color(0, 0, 0));
        eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eliminar.setForeground(new java.awt.Color(201, 45, 57));
        eliminar.setText("<html>ELIMINAR CUENTA</html>");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 140, 30));

        cajaBuscar.setBackground(new java.awt.Color(0, 0, 0));
        cajaBuscar.setForeground(new java.awt.Color(204, 255, 255));
        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 250, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ID_CLIENTE_CU");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton eliminar cliente
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
         try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            ps = conexion.prepareStatement("DELETE FROM CLIENTES_CU WHERE ID_CLIENTE_CU=?");
            ps.setString(1, cajaBuscar.getText());
            ps.executeUpdate();
             JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnas = rsmd.getColumnCount();
            

        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed
//busqueda
    private void buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_clienteActionPerformed
        // TODO add your handling code here:
          gestorAutentificacion ga = new gestorAutentificacion();
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPersonal.setModel(modelotabla);
        String campo =  cajaBuscar.getText();
        String where = ""; //concatenacion
//        if(!"".equals(campo)){
//            where = "WHERE ID_CLIENTE_CU='"+campo+"'";
//        }
        PreparedStatement ps = null;
        ResultSet rs =  null;
    
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            ps = conexion.prepareStatement("SELECT ID_CLIENTE_CU,NOMBRE_CU,CORREO_CU,NICKNAME,ESTATUS_CU FROM CLIENTES_CU ");
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

        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscar_clienteActionPerformed

    private void ALTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTAMouseClicked
        // TODO add your handling code here:
        //ABRE EL PANEL PARA REGISTRAR A ALUMNO
    }//GEN-LAST:event_ALTAMouseClicked

    private void ALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALTAActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    //TABLA DE CLIENTE
    private void tablaPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonalMouseClicked
        // TODO add your handling code here:
           PreparedStatement ps = null;
        ResultSet rs =  null;
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            int fila = tablaPersonal.getSelectedRow();
            String codigo = tablaPersonal.getValueAt(fila, 0).toString();
            //ps = conexion.prepareStatement("SELECT ID_PERSONALCONTRASEÑA,NOMBRE_PERS,SALARIO FROM personal where SALARIO=?");
            ps = conexion.prepareStatement("SELECT * FROM CLIENTES_CU WHERE ID_CLIENTE_CU=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cajaBuscar.setText(rs.getString("ID_CLIENTE_CU"));
//                cajaSalario.setText("NOMBRE_PERS");
//                cajaSalario.setText("SALARIO");
            }
        }catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaPersonalMouseClicked
    //BOTON REGISTRAR
    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
       
    }//GEN-LAST:event_REGRESARActionPerformed

    private void cajaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GERENTE_ALTA_BAJA_2_BAJA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA;
    private javax.swing.JPanel Opcion_2_BAJA;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton buscar_cliente;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonal;
    // End of variables declaration//GEN-END:variables
}
