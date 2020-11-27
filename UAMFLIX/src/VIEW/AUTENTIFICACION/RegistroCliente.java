//orden
package VIEW.AUTENTIFICACION;

import CONTROLLER.OyenteAutentificacion;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPago.TarjetaCredito;
import MODEL.GestorPersonalCliente.Cliente;
import javax.swing.JOptionPane;

public class RegistroCliente extends javax.swing.JFrame {
    OyenteAutentificacion oyenteAutentificacion;
    public RegistroCliente() {
        initComponents();
         setLocationRelativeTo(null); //ventana en medio de la pantalla
        //boton registrarse
        oyenteAutentificacion = new OyenteAutentificacion(JB_REGRESAR,JB_REGISTRARSE,this);  
        JB_REGISTRARSE.addActionListener(oyenteAutentificacion);
        JB_REGRESAR.addActionListener(oyenteAutentificacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        contrasena = new javax.swing.JPasswordField();
        nombre = new javax.swing.JTextField();
        tarjeta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JB_REGISTRARSE = new javax.swing.JButton();
        JB_REGRESAR = new javax.swing.JButton();
        matricula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Telefono1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titularTarjeta = new javax.swing.JTextField();
        fechaVenc = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(201, 45, 57));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        fondo.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 320, 40));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        fondo.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 320, 40));
        fondo.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 320, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NUMERO TARJETA");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NOMBRE");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 30));
        fondo.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 320, 40));

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        fondo.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 320, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("NICKNAME");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CORREO");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("TELEFONO");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 90, 30));

        JB_REGISTRARSE.setText("REGISTRARSE");
        JB_REGISTRARSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_REGISTRARSEActionPerformed(evt);
            }
        });
        fondo.add(JB_REGISTRARSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 110, 30));

        JB_REGRESAR.setText("REGRESAR");
        JB_REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_REGRESARActionPerformed(evt);
            }
        });
        fondo.add(JB_REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));
        fondo.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 320, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("MATRICULA");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, 30));
        fondo.add(Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 320, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE TITULAR");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("FECHA VENCIMIENTO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("CVV");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 430, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void JB_REGISTRARSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_REGISTRARSEActionPerformed
        
        Cliente cliente =  new Cliente();
        TarjetaCredito tj = new TarjetaCredito();
        gestorAutentificacion ga =  new gestorAutentificacion();
        String contraseña =  new String(contrasena.getPassword());//para convertirlo en string
        if(contrasena.getText().equals("")||correo.getText().equals("")||nickname.getText().equals("")||nombre.getText().equals("")){
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
            cliente.setContraseña(contrasena.getText());
            cliente.setCorreo(correo.getText());
            cliente.setNickname(nickname.getText());
            cliente.setTelefono(Telefono1.getText());// FALTO TELEFONO
            cliente.setEstatusCliente(true);
            cliente.setEstatusBeca(true);
          
            tj.setNumeroTarjeta(tarjeta.getText());
            cliente.setTarjeta(tj);
            
            //para la tarjeta
            
            tj.setNombreTitular(titularTarjeta.getText());
            cliente.setTarjeta(tj);
            
            tj.setFechaVenc(fechaVenc.getText());
            cliente.setTarjeta(tj);
            
            tj.setCVV(cvv.getText());
            cliente.setTarjeta(tj);
            
            System.out.println("Nombre: "+cliente.getNombre());
            cliente.DatosCliente();

            if(ga.registrar(cliente,tj) && ga.datosTarjeta(cliente,tj)){
                System.out.println("Cliente nuevo registrado :)");
                JOptionPane.showMessageDialog(null,"Cliente "+ cliente.getNickname() +"  registrado :)");
            }
            //unico cambio
            else{
                JOptionPane.showMessageDialog(null,"No se registto el Cliente :c");
            }
 
        }
    }//GEN-LAST:event_JB_REGISTRARSEActionPerformed

    private void JB_REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_REGRESARActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JB_REGRESARActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_REGISTRARSE;
    private javax.swing.JButton JB_REGRESAR;
    private javax.swing.JTextField Telefono1;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField fechaVenc;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nickname;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tarjeta;
    private javax.swing.JTextField titularTarjeta;
    // End of variables declaration//GEN-END:variables
}
