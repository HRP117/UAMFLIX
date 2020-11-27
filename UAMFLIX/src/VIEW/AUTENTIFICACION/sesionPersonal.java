/*
ACTUAL
 */
package VIEW.AUTENTIFICACION;

import CONTROLLER.OyenteAutentificacion;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.Personal;
import MODEL.gestorBD.conexion;
import VIEW.PRINCIPAL.menuAdministrador;
import VIEW.PRINCIPAL.menuGerente;
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
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        au = new OyenteAutentificacion(this,jRegresar);
        jRegresar.addActionListener(au);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfpassword = new javax.swing.JPasswordField();
        tfmatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JB_INICIAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 190, 40));

        tfmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(tfmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 190, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ID_PERSONAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 190, 30));

        JB_INICIAR.setBackground(new java.awt.Color(255, 255, 255));
        JB_INICIAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_INICIAR.setText("iniciar");
        JB_INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_INICIARActionPerformed(evt);
            }
        });
        jPanel1.add(JB_INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 110, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "GERENTE", "ADMINISTRADOR", "EDITOR SITIO", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jRegresar.setBackground(new java.awt.Color(255, 255, 255));
        jRegresar.setText("REGRESAR");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                //JOptionPane.showMessageDialog(null, "Gerente inicado"); //imprime
                if(jComboBox1.getSelectedIndex()==1){
                    JOptionPane.showMessageDialog(null, "Gerente"); //no imprime
                    new menuGerente().setVisible(true);
                    this.setVisible(false);
                }
                if(jComboBox1.getSelectedIndex()==2){ //administrador
                    menuAdministrador ma =  new menuAdministrador();
                    ma.setVisible(true);
                    this.setVisible(false);
                }
                if(jComboBox1.getSelectedIndex()==3){//developer
                    
            JOptionPane.showMessageDialog(null, "NO LLEGAMOS A ESA IMPLEMENTACION");
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "No seleccionado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(sesionPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JB_INICIARActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRegresarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_INICIAR;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRegresar;
    private javax.swing.JTextField tfmatricula;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
