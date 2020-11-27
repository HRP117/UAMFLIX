/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VIEW.PERSONAL_Y_CLIENTE;

import CONTROLLER.OyenteCliente;
import MODEL.GestorPersonalCliente.Cliente;
import MODEL.GestorPersonalCliente.gestorPersonalCliente;
import VIEW.INFORMACION.GERENTE_CONSULTAR_INFO_CLIENTE;
import MODEL.gestorBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xherm
 */
public class Cliente_Cancelar_servicio extends javax.swing.JFrame {

    /** Creates new form Cliente_Cancelar_servicio */
    OyenteCliente oc;
    public Cliente_Cancelar_servicio() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        //oc =  new OyenteCliente(this,REGRESAR, irConsultaPago);
        //REGRESAR.addActionListener(oc);
        //irConsultaPago.addActionListener(oc);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        colorBarraMenu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        irConsultaPago = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        BEliminar = new javax.swing.JButton();
        buscar_cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        cajaBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));

        colorBarraMenu.setBackground(new java.awt.Color(201, 45, 57));
        colorBarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        colorBarraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        colorBarraMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 252, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        colorBarraMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 56, 252, -1));

        irConsultaPago.setText("Consultar Pago");
        irConsultaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irConsultaPagoActionPerformed(evt);
            }
        });
        colorBarraMenu.add(irConsultaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 120, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        colorBarraMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 252, 20));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACCEDIO COMO ");
        colorBarraMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MENU PAGO");
        colorBarraMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 100, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CLIENTE UNIVERSITARIO");
        colorBarraMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANCELAR SERVICIO");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        colorBarraMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 40));

        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(206, 101, 21));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel10.setText("DATOS DEL USUARIO:");

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        BEliminar.setText("ELIMINAR CUENTA");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        buscar_cliente.setBackground(new java.awt.Color(201, 45, 57));
        buscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ICONO_BUSCADOR_1.png"))); // NOI18N
        buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_clienteActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BEliminar))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BEliminar)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(REGRESAR))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(colorBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(REGRESAR)
                        .addGap(6, 6, 6)
                        .addComponent(colorBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGRESARActionPerformed

    private void irConsultaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irConsultaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irConsultaPagoActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
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
        
        
    }//GEN-LAST:event_BEliminarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_clienteActionPerformed
     gestorPersonalCliente gpc =  new gestorPersonalCliente();
     Cliente cliente = new Cliente();
     if(busqueda.equals("")){
           JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
     }
     else{
        cliente.setIdCliente(busqueda.getText());
        String id = busqueda.getText();
        if(gpc.cancelarServicio(cliente,busqueda,id,tablaCliente)){
            JOptionPane.showMessageDialog(null,"Cliente "+ cliente.getNickname() +"  consultado :)");
        }
        else{
                JOptionPane.showMessageDialog(null,"No se elimino el Cliente :c");
        }
     }
     
    }//GEN-LAST:event_buscar_clienteActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs =  null;
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            int fila = tablaCliente.getSelectedRow();
            String codigo = tablaCliente.getValueAt(fila, 0).toString();
            //ps = conexion.prepareStatement("SELECT ID_PERSONALCONTRASEÑA,NOMBRE_PERS,SALARIO FROM personal where SALARIO=?");
            ps = conexion.prepareStatement("SELECT * FROM CLIENTES_CU WHERE ID_CLIENTE_CU=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while(rs.next()){
                cajaBuscar.setText(rs.getString("ID_CLIENTE_CU"));
                            }
        }catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaClienteMouseClicked

    private void cajaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(Cliente_Cancelar_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cliente_Cancelar_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cliente_Cancelar_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cliente_Cancelar_servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cliente_Cancelar_servicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton buscar_cliente;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JPanel colorBarraMenu;
    private javax.swing.JButton irConsultaPago;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables

}
