/*
orden
 */
package VIEW;

import CONTROLLER.OyenteAutentificacion;
import CONTROLLER.OyentePrincipal;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.Cliente;
import javax.swing.JOptionPane;


public class inicioSesion extends javax.swing.JFrame {
OyentePrincipal oyentePrincipal;
OyenteAutentificacion au;
    public inicioSesion() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        //boton registrarse
        oyentePrincipal =  new OyentePrincipal(this, JB_REGISTRAR, JB_INICIAR);
        JB_REGISTRAR.addActionListener(oyentePrincipal);
        JB_INICIAR.addActionListener(oyentePrincipal);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        JB_REGISTRAR = new javax.swing.JButton();
        tfpassword = new javax.swing.JPasswordField();
        tfmatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JB_INICIAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\alan bc\\Documents\\NetBeansProjects\\PRUEBA1_UAMFLIX\\src\\IMAGENES\\logo.png")); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 290, 370));

        JB_REGISTRAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_REGISTRAR.setText("Registrarse");
        JB_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_REGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(JB_REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 50));

        tfpassword.setText("jPasswordField1");
        tfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 250, 40));

        tfmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(tfmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 250, 40));

        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("MATRICULA/ID CLIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 210, 30));

        JB_INICIAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JB_INICIAR.setText("iniciar");
        JB_INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_INICIARActionPerformed(evt);
            }
        });
        jPanel1.add(JB_INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpasswordActionPerformed

    private void tfmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmatriculaActionPerformed

    private void JB_INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_INICIARActionPerformed
        gestorAutentificacion ga = new gestorAutentificacion();
        Cliente cliente = new Cliente();
        if(tfmatricula.getText().equals(" ") || tfpassword.getText().equals(" ")){
            JOptionPane.showMessageDialog(null,"Por favor rellene  los campos");
        }
        //si te llena los campos
        else{
            cliente.setIdCliente(tfmatricula.getText());
            cliente.setContraseña(tfpassword.getText());
            cliente.DatosCliente();
            String BuscarMatricula = tfmatricula.getText();
            String BuscarClave = tfpassword.getText();
            if(ga.iniciarSesion(cliente, BuscarMatricula, BuscarClave)){ //error
                JOptionPane.showMessageDialog(null,"Cliente "+ cliente.getNickname() +"  inciciado :)");
            }
            else{
                JOptionPane.showMessageDialog(null,"No se incio el Cliente :c");
            }

        }
    }//GEN-LAST:event_JB_INICIARActionPerformed

    private void JB_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_REGISTRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_REGISTRARActionPerformed

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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_INICIAR;
    private javax.swing.JButton JB_REGISTRAR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField tfmatricula;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
