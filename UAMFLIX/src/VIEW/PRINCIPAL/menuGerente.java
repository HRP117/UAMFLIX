/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW.PRINCIPAL;
import CONTROLLER.*;

/**
 *
 * @author alan bc
 */
public class menuGerente extends javax.swing.JFrame {

    OyentePrincipal op;
    public menuGerente() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
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
        consultaPersonal = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        consultaCliente = new javax.swing.JButton();
        altaCliente = new javax.swing.JButton();
        contratar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        consultaPago = new javax.swing.JButton();
        consultaSalario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consultaPersonal.setBackground(new java.awt.Color(255, 255, 255));
        consultaPersonal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consultaPersonal.setText("CONSULTAR INFORMACION PERSONAL");
        jPanel1.add(consultaPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 280, 30));

        REGRESAR.setBackground(new java.awt.Color(201, 45, 57));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGRESAR.setText("REGRESAR");
        jPanel1.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 30));

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));

        consultaCliente.setBackground(new java.awt.Color(255, 255, 255));
        consultaCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consultaCliente.setText("CONSULTAR INFORMACION CLIENTE");

        altaCliente.setBackground(new java.awt.Color(255, 255, 255));
        altaCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        altaCliente.setText("ALTA CLIENTE");
        altaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaClienteActionPerformed(evt);
            }
        });

        contratar.setBackground(new java.awt.Color(255, 255, 255));
        contratar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contratar.setText("CONTRATAR");
        contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(altaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contratar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(consultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contratar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 350, 140));

        jPanel3.setBackground(new java.awt.Color(240, 45, 57));

        consultaPago.setBackground(new java.awt.Color(255, 255, 255));
        consultaPago.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consultaPago.setText("CONSULTAR PAGOS");

        consultaSalario.setBackground(new java.awt.Color(255, 255, 255));
        consultaSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consultaSalario.setText("CONSULTAR SALARIOS PERSONAL");
        consultaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(consultaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 350, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 282, 380));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("<html>ASEGURA TENER UN BUEN CONTROL SOBRE LA CLIENTELA Y PERSONAL</html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 220, 30));

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
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton altaCliente;
    private javax.swing.JButton consultaCliente;
    private javax.swing.JButton consultaPago;
    private javax.swing.JButton consultaPersonal;
    private javax.swing.JButton consultaSalario;
    private javax.swing.JButton contratar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
