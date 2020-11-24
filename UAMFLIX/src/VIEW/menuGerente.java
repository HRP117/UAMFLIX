/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;
import CONTROLLER.*;

/**
 *
 * @author alan bc
 */
public class menuGerente extends javax.swing.JFrame {

    OyentePrincipal op;
    public menuGerente() {
        initComponents();
        //mover a oyente principal
        op = new OyentePrincipal(this,REGRESAR,consultaPago, consultaSalario, consultaCliente, altaCliente, contratar, consultaPersonal);
        REGRESAR.addActionListener(op);
        consultaPago.addActionListener(op);
        consultaSalario.addActionListener(op);
        consultaCliente.addActionListener(op);
        altaCliente.addActionListener(op);
        contratar.addActionListener(op);
        consultaPersonal.addActionListener(op);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        consultaPago = new javax.swing.JButton();
        consultaSalario = new javax.swing.JButton();
        consultaCliente = new javax.swing.JButton();
        altaCliente = new javax.swing.JButton();
        contratar = new javax.swing.JButton();
        consultaPersonal = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consultaPago.setText("CONSULTAR PAGOS");
        jPanel1.add(consultaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 280, 30));

        consultaSalario.setText("CONSULTAR SALARIOS PERSONAL");
        consultaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaSalarioActionPerformed(evt);
            }
        });
        jPanel1.add(consultaSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 30));

        consultaCliente.setText("CONSULTAR INFORMACION CLIENTE");
        jPanel1.add(consultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 280, 30));

        altaCliente.setText("ALTA CLIENTE");
        altaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaClienteActionPerformed(evt);
            }
        });
        jPanel1.add(altaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, 40));

        contratar.setText("CONTRATAR");
        contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarActionPerformed(evt);
            }
        });
        jPanel1.add(contratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 110, 40));

        consultaPersonal.setText("CONSULTAR INFORMACION PERSONAL");
        jPanel1.add(consultaPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 240, 30));

        REGRESAR.setText("REGRESAR");
        jPanel1.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaSalarioActionPerformed

    private void altaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaClienteActionPerformed

    private void contratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contratarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Administrador_ModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador_ModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador_ModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador_ModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton altaCliente;
    private javax.swing.JButton consultaCliente;
    private javax.swing.JButton consultaPago;
    private javax.swing.JButton consultaPersonal;
    private javax.swing.JButton consultaSalario;
    private javax.swing.JButton contratar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
