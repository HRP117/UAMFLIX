/*
 bien
 */
package VIEW.PERSONAL_Y_CLIENTE;

import CONTROLLER.*;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPago.TarjetaCredito;
import MODEL.GestorPersonalCliente.Cliente;
import javax.swing.JOptionPane;


public class GERENTE_ALTA_BAJA_1_ALTA extends javax.swing.JFrame {
    
    OyentePersonal op;
    public GERENTE_ALTA_BAJA_1_ALTA() {
        //setLocationRelativeTo(null); //ventana en medio de la pantalla
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        op = new OyentePersonal(BAJA, REGRESAR, this);
        REGRESAR.addActionListener(op);
        BAJA.addActionListener(op);
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
        jButton2 = new javax.swing.JButton();
        BAJA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Opcion_ALTA = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        matricula = new javax.swing.JTextField();
        nickname = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        REGISTRAR = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        tarjeta = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_CLIENTE.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ALTA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BAJA.setBackground(new java.awt.Color(0, 0, 0));
        BAJA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BAJA.setForeground(new java.awt.Color(255, 255, 255));
        BAJA.setText("BAJA");
        BAJA.setToolTipText("");
        BAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJAActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButton2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(BAJA)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAJA)
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Opcion_ALTA.setBackground(new java.awt.Color(201, 45, 57));
        Opcion_ALTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        Opcion_ALTA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("MATRICULA:");
        Opcion_ALTA.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GUI_GERENTE_TITULO_INFORMACIÓN_DEL_CLIENTE_A_REGISTRAR.png"))); // NOI18N
        Opcion_ALTA.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("NOMBRE:");
        Opcion_ALTA.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("NICKNAME:");
        Opcion_ALTA.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("CORREO:");
        Opcion_ALTA.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        nombre.setForeground(new java.awt.Color(204, 204, 204));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 250, 30));

        matricula.setForeground(new java.awt.Color(204, 204, 204));
        matricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 250, 30));

        nickname.setForeground(new java.awt.Color(204, 204, 204));
        nickname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 30));

        correo.setForeground(new java.awt.Color(204, 204, 204));
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, 30));

        REGISTRAR.setBackground(new java.awt.Color(0, 0, 0));
        REGISTRAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(255, 51, 51));
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        REGRESAR.setBackground(new java.awt.Color(0, 0, 0));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGRESAR.setForeground(new java.awt.Color(255, 51, 51));
        REGRESAR.setText("REGRESAR");
        Opcion_ALTA.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        tarjeta.setForeground(new java.awt.Color(204, 204, 204));
        tarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 250, 30));

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 250, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("CONTRASEÑA:");
        Opcion_ALTA.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("NUMERO TARJETA");
        Opcion_ALTA.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 30));

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 250, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("TELEFONO");
        Opcion_ALTA.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_ALTA, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_ALTA, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //ABRE EL PANEL PARA REGISTRAR A ALUMNO

    }//GEN-LAST:event_jButton2MouseClicked

    //alta
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog(null,"USTED YA ESTA EN LA PANTALLA DE ALTA CLIENTE");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAJAActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknameActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        // TODO add your handling code here:
        //agregarle lo de registro cliente
        Cliente cliente =  new Cliente();
        TarjetaCredito tj =  new TarjetaCredito();
        gestorAutentificacion ga =  new gestorAutentificacion();
        String contraseña =  new String(contrasena.getPassword());//para convertirlo en string
        if(tarjeta.getText().equals("")||tarjeta.getText().equals("")||correo.getText().equals("")||nickname.getText().equals("")||nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
        }
        else{
            //duda: como hacer un set para cliente, que sea numTarjeta
            JOptionPane.showMessageDialog(null,"campos llenados");
           //TarjetaCredito tar = null;
           //ga.registrar(cliente);
            cliente.setNombre(nombre.getText());
            cliente.setApellido("");// FALTO APELLIDO
            cliente.setIdCliente(matricula.getText());
            cliente.setContraseña(tarjeta.getText());
            cliente.setCorreo(correo.getText());
            cliente.setNickname(nickname.getText());
            cliente.setTelefono(tarjeta.getText());// FALTO TELEFONO
            cliente.setEstatusCliente(true);
            cliente.setEstatusBeca(true);
            tj.setNumeroTarjeta(tarjeta.getText());
            cliente.setTarjeta(tj);
            System.out.println("Nombre: "+cliente.getNombre());
            cliente.DatosCliente();
            //tar.setNumeroTarjeta(tarjeta.getText());
            // no entra 
            if(ga.registrar(cliente,tj)){
                System.out.println("Cliente nuevo registrado :)");
                JOptionPane.showMessageDialog(null,"Cliente "+ cliente.getNickname() +"  registrado :)");
            }
            //unico cambio
            else{
                JOptionPane.showMessageDialog(null,"No se registro el Cliente :c");
            }
        }
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

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
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_1_ALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_1_ALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_1_ALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_ALTA_BAJA_1_ALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GERENTE_ALTA_BAJA_1_ALTA().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAJA;
    private javax.swing.JPanel Opcion_ALTA;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nickname;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tarjeta;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
