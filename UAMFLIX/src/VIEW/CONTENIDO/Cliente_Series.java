/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW.CONTENIDO;

import CONTROLLER.OyentecontenidoMultimedia;

/**
 *
 * @author iymf1
 */
public class Cliente_Series extends javax.swing.JFrame {

    /**
     * Creates new form Cliente_Series
     */
    OyentecontenidoMultimedia O_CM;
    public Cliente_Series() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
       O_CM = new OyentecontenidoMultimedia(this,jBotonRegresar,JB_PELICULAS,JB_DOCUMENTALES,JB_PLAY,JB_STOP,JB_BOB,JB_MALCOM);
       
       jBotonRegresar.addActionListener(O_CM);
       JB_PELICULAS.addActionListener(O_CM);
       JB_DOCUMENTALES.addActionListener(O_CM);
       JB_PLAY.addActionListener(O_CM);
       JB_STOP.addActionListener(O_CM);
       JB_BOB.addActionListener(O_CM);
       JB_MALCOM.addActionListener(O_CM);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        JB_PELICULAS = new javax.swing.JButton();
        JB_DOCUMENTALES = new javax.swing.JButton();
        jBotonRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto1 = new javax.swing.JTextArea();
        JB_PLAY = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextoMALCOM = new javax.swing.JTextArea();
        JB_MALCOM = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextoBob1 = new javax.swing.JTextArea();
        JB_BOB = new javax.swing.JButton();
        REPRODUCTOR = new javax.swing.JDesktopPane();
        JB_STOP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(201, 45, 57));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SERIES");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        JB_PELICULAS.setBackground(new java.awt.Color(255, 255, 255));
        JB_PELICULAS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JB_PELICULAS.setText("PELICULAS");
        JB_PELICULAS.setActionCommand("DOCUMENTALES");
        JB_PELICULAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_PELICULASActionPerformed(evt);
            }
        });

        JB_DOCUMENTALES.setBackground(new java.awt.Color(255, 255, 255));
        JB_DOCUMENTALES.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JB_DOCUMENTALES.setText("DOCUMENTALES");
        JB_DOCUMENTALES.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(JB_PELICULAS)
                        .addGap(76, 76, 76))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(JB_DOCUMENTALES)
                .addGap(59, 59, 59))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addGap(65, 65, 65)
                .addComponent(JB_PELICULAS)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_DOCUMENTALES)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(278, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        jBotonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        jBotonRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBotonRegresar.setText("Regresar");
        jPanel1.add(jBotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(450, 800));

        jPanel2.setBackground(new java.awt.Color(201, 45, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(460, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/Pelicula/mando.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("Titulo: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setText("Sinopsis: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        Texto1.setColumns(20);
        Texto1.setRows(5);
        Texto1.setText("Una de las misiones que tendrá que llevar a cabo este guerrero mandaloriano,\na parte de las muchas y grandes luchas que tendrá que vivir en el espacio,\nes la de buscar hasta encontrar a un niño para después, matarlo.\nPero este guerrero se niega a hacerlo, y lo convierte en su aprendiz.");
        Texto1.setEditable(false);
        jScrollPane1.setViewportView(Texto1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 240, 116));

        JB_PLAY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/BotonMult/redbutton.png"))); // NOI18N
        jPanel2.add(JB_PLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 60, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Año:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("The Mandalorian");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 20));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("2020");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Producción:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Disney");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/Pelicula/bobesponja.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 280));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setText("Titulo:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setText("Malcom el de enmedio");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Año:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 730, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setText("FOX");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 750, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setText("Produccion:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 750, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setText("Nickelodeon");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setText("Sinopsis:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 770, -1, -1));

        TextoMALCOM.setColumns(20);
        TextoMALCOM.setRows(5);
        TextoMALCOM.setText("Malcom,vive en una familia disfuncional\nde clase media pobre en Estados Unidos\nTodo cambia cuando la familia se entera \nque malcom es en realidad un niño\ngenio.");
        TextoMALCOM.setEditable(false);
        jScrollPane3.setViewportView(TextoMALCOM);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 800, 250, 120));

        JB_MALCOM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/BotonMult/redbutton.png"))); // NOI18N
        jPanel2.add(JB_MALCOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 930, 60, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/Pelicula/malcom.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel19.setText("Titulo:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setText("Año:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel21.setText("Produccion:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setText("Sinopsis:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel23.setText("Bob Esponja");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel24.setText("1999-2020");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel25.setText("1999-2020");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, -1, -1));

        TextoBob1.setColumns(20);
        TextoBob1.setRows(5);
        TextoBob1.setText("Es una serie animada que trata sobre las \naventuras de una esponja del mar amarilla\nrectangular y sus amigos que vive \nen una piña, e una ciudad llamada\nFondo de Bikini.");
        TextoBob1.setEditable(false);
        jScrollPane4.setViewportView(TextoBob1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 250, 120));

        JB_BOB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/BotonMult/redbutton.png"))); // NOI18N
        jPanel2.add(JB_BOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 60, -1));

        jScrollPane2.setViewportView(jPanel2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 506, 290));

        javax.swing.GroupLayout REPRODUCTORLayout = new javax.swing.GroupLayout(REPRODUCTOR);
        REPRODUCTOR.setLayout(REPRODUCTORLayout);
        REPRODUCTORLayout.setHorizontalGroup(
            REPRODUCTORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        REPRODUCTORLayout.setVerticalGroup(
            REPRODUCTORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(REPRODUCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 360, 160));

        JB_STOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/BotonMult/stop.png"))); // NOI18N
        jPanel1.add(JB_STOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 40, -1));
        JB_STOP.setVisible(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_PELICULASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PELICULASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_PELICULASActionPerformed
    
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
//            java.util.logging.Logger.getLogger(Cliente_Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cliente_Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cliente_Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cliente_Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cliente_Series().setVisible(true);
//            }
//        });
//        
//      
//    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_BOB;
    private javax.swing.JButton JB_DOCUMENTALES;
    private javax.swing.JButton JB_MALCOM;
    private javax.swing.JButton JB_PELICULAS;
    private javax.swing.JButton JB_PLAY;
    public javax.swing.JButton JB_STOP;
    public javax.swing.JDesktopPane REPRODUCTOR;
    private javax.swing.JTextArea Texto1;
    private javax.swing.JTextArea TextoBob1;
    private javax.swing.JTextArea TextoMALCOM;
    private javax.swing.JButton jBotonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
