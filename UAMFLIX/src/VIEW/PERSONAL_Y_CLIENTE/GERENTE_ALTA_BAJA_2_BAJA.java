/*
:D
 */
package VIEW.PERSONAL_Y_CLIENTE;

import CONTROLLER.OyentePersonal;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.gestorPersonalCliente;
import VIEW.INFORMACION.GERENTE_CONSULTAR_INFO_CLIENTE;
import MODEL.gestorBD.conexion;
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
     initComponents();
     setLocationRelativeTo(null); //ventana en medio de la pantalla
     op = new OyentePersonal(this,REGRESAR, ALTA);
     REGRESAR.addActionListener(op);
     ALTA.addActionListener(op);   
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ALTA = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Opcion_2_BAJA = new javax.swing.JPanel();
        busqueda = new javax.swing.JTextField();
        buscar_cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        REGRESAR = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

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
                                .addGap(84, 84, 84)
                                .addComponent(jButton3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        Opcion_2_BAJA.setBackground(new java.awt.Color(201, 45, 57));
        Opcion_2_BAJA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));

        busqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        buscar_cliente.setBackground(new java.awt.Color(201, 45, 57));
        buscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ICONO_BUSCADOR_1.png"))); // NOI18N
        buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_clienteActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout Opcion_2_BAJALayout = new javax.swing.GroupLayout(Opcion_2_BAJA);
        Opcion_2_BAJA.setLayout(Opcion_2_BAJALayout);
        Opcion_2_BAJALayout.setHorizontalGroup(
            Opcion_2_BAJALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opcion_2_BAJALayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Opcion_2_BAJALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Opcion_2_BAJALayout.createSequentialGroup()
                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Opcion_2_BAJALayout.setVerticalGroup(
            Opcion_2_BAJALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opcion_2_BAJALayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Opcion_2_BAJALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        REGRESAR.setBackground(new java.awt.Color(0, 0, 0));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGRESAR.setForeground(new java.awt.Color(201, 45, 57));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(0, 0, 0));
        eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eliminar.setForeground(new java.awt.Color(201, 45, 57));
        eliminar.setText("<html>ELIMINAR CUENTA</html>");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        cajaBuscar.setBackground(new java.awt.Color(0, 0, 0));
        cajaBuscar.setForeground(new java.awt.Color(204, 255, 255));
        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ID_CLIENTE_CU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion_2_BAJA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Opcion_2_BAJA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JOptionPane.showMessageDialog(null, "YA ESTA EN LA PANTALLA DE BAJA CLIENTE");
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
//                //cajaSalario.setText("SALARIO");
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


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_2_BAJA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GERENTE_ALTA_BAJA_2_BAJA().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA;
    private javax.swing.JPanel Opcion_2_BAJA;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton buscar_cliente;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonal;
    // End of variables declaration//GEN-END:variables
}
