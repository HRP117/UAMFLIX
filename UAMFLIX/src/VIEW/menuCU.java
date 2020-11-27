//bien
package VIEW;

import CONTROLLER.*;

public class menuCU extends javax.swing.JFrame {
    OyenteCliente oc;
    OyenteInformacion oi;
    public menuCU() {
        initComponents();

        oc =  new OyenteCliente(this,SERIE,PELICULA,DOCUMENTAL,REGRESAR,pagos);
        REGRESAR.addActionListener(oc);
        SERIE.addActionListener(oc);
        //BOTON PELICULAS
        PELICULA.addActionListener(oc);
        //BOTON DOCUMENTAL
        DOCUMENTAL.addActionListener(oc);
        //informacion pago 
        pagos.addActionListener(oc);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SERIE = new javax.swing.JButton();
        PELICULA = new javax.swing.JButton();
        DOCUMENTAL = new javax.swing.JButton();
        imagenMenu = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();
        colorBarraMenu = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pagos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));

        jPanel3.setBackground(new java.awt.Color(245, 45, 57));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SERIE.setText("SERIES");
        SERIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SERIEActionPerformed(evt);
            }
        });
        jPanel3.add(SERIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        PELICULA.setText("PELICULAS");
        PELICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PELICULAActionPerformed(evt);
            }
        });
        jPanel3.add(PELICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        DOCUMENTAL.setText("DOCUMENTALES");
        DOCUMENTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOCUMENTALActionPerformed(evt);
            }
        });
        jPanel3.add(DOCUMENTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        imagenMenu.setBackground(new java.awt.Color(245, 45, 57));
        imagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/menuCliente.png"))); // NOI18N
        imagenMenu.setText("jLabel1");
        jPanel3.add(imagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 530, 430));

        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        colorBarraMenu.setBackground(new java.awt.Color(201, 45, 57));
        colorBarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        colorBarraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        colorBarraMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 56, 252, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        colorBarraMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 127, 252, 60));

        pagos.setText("INFORMAME DE PAGOS");
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        colorBarraMenu.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/USER.png"))); // NOI18N
        colorBarraMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 120));

        jLabel2.setText("ACCEDIO COMO CLIENTE UNIVERSITARIO");
        colorBarraMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTENIDO MULTIMEDIA");
        colorBarraMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(colorBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(REGRESAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(colorBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

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

    private void SERIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SERIEActionPerformed
        // TODO add your handling coce here:
    }//GEN-LAST:event_SERIEActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // TODO add your handling coce here:
    }//GEN-LAST:event_REGRESARActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
        // TODO add your handling coce here:
    }//GEN-LAST:event_pagosActionPerformed

    private void PELICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PELICULAActionPerformed
        // TODO add your handling coce here:
    }//GEN-LAST:event_PELICULAActionPerformed

    private void DOCUMENTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOCUMENTALActionPerformed
        // TODO add your handling coce here:
    }//GEN-LAST:event_DOCUMENTALActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting coce (optional) ">
        /* If Nimbus (introcuced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(menuCU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuCU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DOCUMENTAL;
    private javax.swing.JButton PELICULA;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton SERIE;
    private javax.swing.JPanel colorBarraMenu;
    private javax.swing.JLabel imagenMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton pagos;
    // End of variables declaration//GEN-END:variables
}
