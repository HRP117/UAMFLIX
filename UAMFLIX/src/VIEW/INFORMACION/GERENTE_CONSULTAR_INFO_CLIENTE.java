//EN REVISION
package VIEW.INFORMACION;

import CONTROLLER.*;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.Personal;
import MODEL.gestorBD.conexion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class GERENTE_CONSULTAR_INFO_CLIENTE extends javax.swing.JFrame {
    OyenteInformacion oi;
    public GERENTE_CONSULTAR_INFO_CLIENTE() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        //debe ir oyente informacion
        oi = new OyenteInformacion(ALTA_CLIENTE,BAJA_CLIENTE,regresar, this);
        ALTA_CLIENTE.addActionListener(oi);
        BAJA_CLIENTE.addActionListener(oi);
        regresar.addActionListener(oi);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        CONSULTAR = new javax.swing.JButton();
        ALTA_CLIENTE = new javax.swing.JButton();
        BAJA_CLIENTE = new javax.swing.JButton();
        PDF = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(201, 45, 57));
        jLabel2.setText("<html>INGRESE SÓLO UN DATO DEL CLIENTE A CONSULTAR PARA RESULTADOS ESPECIFICOS.</html>");

        regresar.setBackground(new java.awt.Color(0, 51, 51));
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("REGRESAR");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ICONO_USUARIO_2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 2));
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_CLIENTE_CU", "NOMBRE_CU", "CORREO_CU", "NICKNAME", "ESTATUS_CU", "ESTATUS_B"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCliente.setSelectionForeground(new java.awt.Color(153, 153, 0));
        jScrollPane1.setViewportView(tablaCliente);

        CONSULTAR.setBackground(new java.awt.Color(255, 255, 255));
        CONSULTAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CONSULTAR.setForeground(new java.awt.Color(201, 45, 57));
        CONSULTAR.setText("CONSULTAR");
        CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTARActionPerformed(evt);
            }
        });

        ALTA_CLIENTE.setBackground(new java.awt.Color(201, 45, 57));
        ALTA_CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        ALTA_CLIENTE.setText("ALTA CLIENTE");
        ALTA_CLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTA_CLIENTEActionPerformed(evt);
            }
        });

        BAJA_CLIENTE.setBackground(new java.awt.Color(201, 45, 57));
        BAJA_CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        BAJA_CLIENTE.setText("BAJA CLIENTE");

        PDF.setBackground(new java.awt.Color(255, 255, 255));
        PDF.setText("GENERAR PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ALTA_CLIENTE)
                        .addGap(50, 50, 50)
                        .addComponent(BAJA_CLIENTE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(PDF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CONSULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ALTA_CLIENTE)
                    .addComponent(BAJA_CLIENTE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PDF)
                    .addComponent(CONSULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTARActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaCliente.setModel(modelotabla);
        
        PreparedStatement ps = null;
        ResultSet rs =  null;
        gestorAutentificacion ga = new gestorAutentificacion();
        
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
           String sql = "SELECT ID_CLIENTE_CU,NOMBRE_CU,CORREO_CU,NICKNAME,ESTATUS_CU,ESTATUS_B FROM CLIENTES_CU";
           ps = conexion.prepareStatement(sql);
           rs = ps.executeQuery();
           modelotabla.addColumn("ID_CLIENTE_CU");
           modelotabla.addColumn("NOMBRE_CU");
           modelotabla.addColumn("CORREO_CU");
           modelotabla.addColumn("NICKNAME");
           modelotabla.addColumn("ESTATUS_CU");
           modelotabla.addColumn("ESTATUS_B");
           ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
           
           while(rs.next()){
               Object fila[] = new Object[columnas];
               for(int i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
               }
               modelotabla.addRow(fila);
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CONSULTARActionPerformed

    private void ALTA_CLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTA_CLIENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALTA_CLIENTEActionPerformed

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        MessageFormat header  = new MessageFormat("GERENTE-INFORMACIÓN CLIENTES"
                + "");
        MessageFormat footer  = new MessageFormat("Page");
        
        try{
            tablaCliente.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            
        // TODO add your handling code here:
//        String path="";
//        JFileChooser j = new JFileChooser();
//        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int x = j.showSaveDialog(this);
//        
//        if(x == JFileChooser.APPROVE_OPTION){
//            path = j.getSelectedFile().getPath();
//        }
//        Document doc=new Document();
//        
//        try {
//            PdfWriter.getInstance(doc,new FileOutputStream(path+"ab123.pdf"));
//            doc.open();
//            PdfPTable tbl = new PdfPTable(6); //se ingresa el numero de columnas
//            //se añaden las columnas
//            tbl.addCell("ID_CLIENTE_CU");
//            tbl.addCell("NOMBRE_CU");
//            tbl.addCell("CORREO_CU");
//            tbl.addCell("NICKNAME");
//            tbl.addCell("ESTATUS_CU");
//            tbl.addCell("ESTATUS_B");
//            //RECORRA LA TABLA
//            for (int i = 0; i < tablaCliente.getRowCount(); i++) {
//                String ID = tablaCliente.getValueAt(i, 0).toString();
//                String NOMBRE = tablaCliente.getValueAt(i, 1).toString();
//                String CORREO = tablaCliente.getValueAt(i, 2).toString();
//                String NICKNAME = tablaCliente.getValueAt(i, 3).toString();
//                String ESTATUS_CU = tablaCliente.getValueAt(i, 4).toString();
//                String ESTATUS_B = tablaCliente.getValueAt(i, 5).toString();
//
//                //añadimos las celdas como string
//                tbl.addCell(ID);
//                tbl.addCell(NOMBRE);
//                tbl.addCell(CORREO);
//                tbl.addCell(NICKNAME);
//                tbl.addCell(ESTATUS_CU);
//                tbl.addCell(ESTATUS_B);
//            }
//            //AÑADIMOS LAS CELDAS AL PDF
//            doc.add(tbl);
//            JOptionPane.showMessageDialog(null, "PDF DESCARGADO", "ALERT MESSAGE",JOptionPane.WARNING_MESSAGE);
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DocumentException ex) {
//            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        doc.close();
        
    }//GEN-LAST:event_PDFActionPerformed

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
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GERENTE_CONSULTAR_INFO_CLIENTE().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA_CLIENTE;
    private javax.swing.JButton BAJA_CLIENTE;
    private javax.swing.JButton CONSULTAR;
    private javax.swing.JButton PDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
