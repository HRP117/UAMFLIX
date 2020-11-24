/*
ACTUAL
 */
package VIEW;

import CONTROLLER.OyenteAutentificacion;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alan bc
 */
public class sesionPersonal extends javax.swing.JFrame {
    conexion con = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    OyenteAutentificacion au;
    public sesionPersonal() {
        initComponents();
        //regresar al menu prinicpal
        au = new OyenteAutentificacion(jRegresar);
        jRegresar.addActionListener(au);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfpassword = new javax.swing.JPasswordField();
        tfmatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JB_INICIAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, 380));

        tfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 200, 40));

        tfmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(tfmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 210, 40));

        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 210, 30));

        jLabel3.setText("MATRICULA/ID CLIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 210, 30));

        JB_INICIAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_INICIAR.setText("iniciar");
        JB_INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_INICIARActionPerformed(evt);
            }
        });
        jPanel1.add(JB_INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 110, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "GERENTE", "ADMINISTRADOR", "EDITOR SITIO", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jRegresar.setText("REGRESAR");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //contra,id,tipo
        String id = tfmatricula.getText();
        String password = tfpassword.getText();

        gestorAutentificacion ga = new gestorAutentificacion();
        Personal personal = new Personal();
        Connection conexion = con.getConnection();

        try {
            String sql = "SELECT * FROM PERSONAL WHERE ID_PERSONAL=? AND CONTRASEÑA_PERS=? AND CARGO=?";

            ps = conexion.prepareStatement(sql);
            ps.setString(1,tfmatricula.getText());
            ps.setString(2, tfpassword.getText());
            ps.setString(3, String.valueOf(jComboBox1.getSelectedItem()));
            rs = ps.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Gerente inicado"); //imprime
                if(jComboBox1.getSelectedIndex()==1){
                    JOptionPane.showMessageDialog(null, "Gerente"); //no imprime
                    menuGerente mg =  new menuGerente();
                    mg.setVisible(true);
                    //                             sesionPersonal sp = null;
                    //                             sp.setVisible(false);
                }
                if(jComboBox1.getSelectedIndex()==2){
//                    menuAdministrador ma =  new menuAdministrador();
//                    ma.setVisible(true);
                }
                if(jComboBox1.getSelectedIndex()==3){
                    
//                    ma.setVisible(true);
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "No seleccionado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(sesionPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*String buscarCargo = jComboBox1.getSelectedItem().toString();
        //no entra
        if (tfmatricula.getText().equals(" ") || tfpassword.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene  los campos");
        }
        else{
            //String buscarCargo = personal.setCargo(String.valueOf(jComboBox1.getSelectedItem())); //establecemos el cargo
            personal.setIdPersonal(tfmatricula.getText());
            personal.setContraseña(tfpassword.getText());
            personal.DatosPersonal();
            String BuscariD = tfmatricula.getText();
            String BuscarPassword = tfpassword.getText();

            if (ga.sesionPersonal(personal, BuscariD, BuscarPassword,buscarCargo)) {
                JOptionPane.showMessageDialog(null,"personal "+ personal.getNickname() +"  inciciado :)");
            }
            else{
                JOptionPane.showMessageDialog(null,"No se incio el personal :c");
            }
        }

        */
    }//GEN-LAST:event_JB_INICIARActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(sesionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sesionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sesionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sesionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sesionPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_INICIAR;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRegresar;
    private javax.swing.JTextField tfmatricula;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
