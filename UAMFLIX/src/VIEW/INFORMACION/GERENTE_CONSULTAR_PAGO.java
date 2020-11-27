
package VIEW.INFORMACION;

import CONTROLLER.*;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.Personal;
import MODEL.gestorBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GERENTE_CONSULTAR_PAGO extends javax.swing.JFrame {
    OyenteInformacion oi;
    public GERENTE_CONSULTAR_PAGO() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        oi = new OyenteInformacion(agregarPago,Regresar, modificarPago,this);
        agregarPago.addActionListener(oi);
        Regresar.addActionListener(oi);
        modificarPago.addActionListener(oi);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel33 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        modificarPago = new javax.swing.JButton();
        agregarPago = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Opcion_ALTA = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPago = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("PUESTO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        modificarPago.setBackground(new java.awt.Color(0, 0, 0));
        modificarPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificarPago.setForeground(new java.awt.Color(255, 55, 55));
        modificarPago.setText("MODIFICAR SALARIO");
        modificarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarPagoMouseClicked(evt);
            }
        });
        modificarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPagoActionPerformed(evt);
            }
        });

        agregarPago.setBackground(new java.awt.Color(0, 0, 0));
        agregarPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agregarPago.setForeground(new java.awt.Color(255, 51, 51));
        agregarPago.setText("<html>AGREGAR PAGOS</html>");
        agregarPago.setToolTipText("");
        agregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPagoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAGO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(agregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(modificarPago))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(modificarPago)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(agregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Opcion_ALTA.setBackground(new java.awt.Color(201, 45, 57));
        Opcion_ALTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        Opcion_ALTA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setBackground(new java.awt.Color(0, 0, 0));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 51, 51));
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 80, 30));

        Regresar.setBackground(new java.awt.Color(0, 0, 0));
        Regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 51, 51));
        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        tablaPago.setAutoCreateRowSorter(true);
        tablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idPago", "Nombre_pago", "monto", "fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPago);

        Opcion_ALTA.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 230));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("GENERAR PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_ALTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_ALTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarPagoMouseClicked
        // TODO add your handling code here:
        //ABRE EL PANEL PARA REGISTRAR A ALUMNO

    }//GEN-LAST:event_modificarPagoMouseClicked

    private void modificarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarPagoActionPerformed

    private void agregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarPagoActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarActionPerformed
//boton que despliega las tablas
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPago.setModel(modelotabla);
        
        PreparedStatement ps = null;
        ResultSet rs =  null;
        gestorAutentificacion ga = new gestorAutentificacion();
        Personal personal = new Personal();
        
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
           String sql = "SELECT ID_PAGO,MONTO,FECHA,NUM_TARJETA FROM pagos";
           ps = conexion.prepareStatement(sql);
           rs = ps.executeQuery();
           modelotabla.addColumn("ID_PAGO");
           modelotabla.addColumn("MONTO");
           modelotabla.addColumn("FECHA");
           modelotabla.addColumn("NUM_TARJETA");
           
           while(rs.next()){
               Object fila[] = new Object[4];
               for(int i=0;i<4;i++){
                    fila[i] = rs.getObject(i+1);
               }
               modelotabla.addRow(fila);
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MessageFormat header  = new MessageFormat("PAGOS"); //TITULO
        MessageFormat footer  = new MessageFormat("Page");
        
        try{
            tablaPago.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_PAGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_PAGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_PAGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_PAGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GERENTE_CONSULTAR_PAGO().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Opcion_ALTA;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton agregarPago;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarPago;
    private javax.swing.JTable tablaPago;
    // End of variables declaration//GEN-END:variables
}
