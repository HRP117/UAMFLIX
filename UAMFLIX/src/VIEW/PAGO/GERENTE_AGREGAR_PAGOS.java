/*
 
 */
package VIEW.PAGO;

import CONTROLLER.OyentePago;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPago.Pago;
import MODEL.GestorPago.TarjetaCredito;
import MODEL.GestorPersonalCliente.Cliente;
import MODEL.GestorPersonalCliente.gestorPersonalCliente;
import javax.swing.JOptionPane;


public class GERENTE_AGREGAR_PAGOS extends javax.swing.JFrame {

   OyentePago op;
    public GERENTE_AGREGAR_PAGOS() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        op =  new OyentePago(REGRESAR, modificarPago, consultasalario, this);
        REGRESAR.addActionListener(op);
        modificarPago.addActionListener(op);
        consultasalario.addActionListener(op);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        modificarPago = new javax.swing.JButton();
        consultasalario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IDPAGO = new javax.swing.JTextField();
        MONTO = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        AGREGAR = new javax.swing.JButton();
        NTARJETA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        modificarPago.setBackground(new java.awt.Color(0, 0, 0));
        modificarPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificarPago.setForeground(new java.awt.Color(255, 255, 255));
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

        consultasalario.setBackground(new java.awt.Color(0, 0, 0));
        consultasalario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        consultasalario.setForeground(new java.awt.Color(255, 255, 255));
        consultasalario.setText("<html>CONSULTAR PAGO PERSONAL</html>");
        consultasalario.setToolTipText("");
        consultasalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasalarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAGO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/USER.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html>SE ENCUENTRA EN AGREGAR    PAGOS</html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(consultasalario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(modificarPago))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(consultasalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        IDPAGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPAGOActionPerformed(evt);
            }
        });

        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        NTARJETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NTARJETAActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID PAGO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("MONTO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("FECHA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NUMERO TARJETA");

        REGRESAR.setBackground(new java.awt.Color(201, 45, 57));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(AGREGAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(71, 71, 71)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(MONTO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(FECHA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NTARJETA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDPAGO))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(REGRESAR)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDPAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MONTO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NTARJETA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addComponent(AGREGAR)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NTARJETAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NTARJETAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NTARJETAActionPerformed

    private void IDPAGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPAGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDPAGOActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        // TODO add your handling code here:
        Cliente cliente =  new Cliente();
        Pago p =  new Pago();
        TarjetaCredito tj = new TarjetaCredito();
        gestorAutentificacion ga =  new gestorAutentificacion();
        gestorPersonalCliente gpc =  new gestorPersonalCliente();
        if(IDPAGO.getText().equals("")||FECHA.getText().equals("")||MONTO.getText().equals("")||NTARJETA.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
        }
        else{
            //duda: como hacer un set para cliente, que sea numTarjeta
            JOptionPane.showMessageDialog(null,"campos llenados");
            //TarjetaCredito tar = null;
            //ga.registrar(cliente);
            p.setIdPago(IDPAGO.getText());
            p.setCantidad(MONTO.getText());
            p.setFecha(FECHA.getText());
            
            //para la tarjeta
          
            tj.setNumeroTarjeta(NTARJETA.getText());
            cliente.setTarjeta(tj);
           
            System.out.println("Nombre: "+cliente.getNombre());
            //cliente.DatosCliente();

            if(gpc.agregarPago(p, tj)){
                System.out.println("pago nuevo registrado :)");
                //JOptionPane.showMessageDialog(null," "+ cliente.getNickname() +"  registrado :)");
            }
            //unico cambio
            else{
                JOptionPane.showMessageDialog(null,"No se registto el pago :c");
            }
 
        }
        
    }//GEN-LAST:event_AGREGARActionPerformed

    private void modificarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarPagoMouseClicked
        // TODO add your handling code here:
        //ABRE EL PANEL PARA REGISTRAR A ALUMNO
    }//GEN-LAST:event_modificarPagoMouseClicked

    private void modificarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarPagoActionPerformed

    private void consultasalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultasalarioActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGRESARActionPerformed

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
//            java.util.logging.Logger.getLogger(GERENTE_AGREGAR_PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_AGREGAR_PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_AGREGAR_PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_AGREGAR_PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GERENTE_AGREGAR_PAGOS().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JTextField FECHA;
    private javax.swing.JTextField IDPAGO;
    private javax.swing.JTextField MONTO;
    private javax.swing.JTextField NTARJETA;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton consultasalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton modificarPago;
    // End of variables declaration//GEN-END:variables
}
