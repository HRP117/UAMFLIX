/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW.PERSONAL_Y_CLIENTE;

import CONTROLLER.OyentePersonal;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import VIEW.INFORMACION.GERENTE_CONSULTAR_INFO_CLIENTE;
import MODEL.gestorBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan bc
 */
public class GERENTE_DESPEDIR_PERSONAL extends javax.swing.JFrame {

    OyentePersonal op;
    public GERENTE_DESPEDIR_PERSONAL() {
        initComponents();
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        op = new OyentePersonal(contratar, regresar, this);
        contratar.addActionListener(op);
        regresar.addActionListener(op);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opcion_ALTA = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contratar = new javax.swing.JButton();
        despedir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Opcion_BAJA = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        busqueda = new javax.swing.JTextField();
        buscar_personal = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        DESPEDIR = new javax.swing.JButton();

        Opcion_ALTA.setBackground(new java.awt.Color(201, 45, 57));
        Opcion_ALTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        Opcion_ALTA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("APELLIDO:");
        Opcion_ALTA.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_GUI_TITULO_INFORMACION_DEL_PERSONAL.jpg"))); // NOI18N
        Opcion_ALTA.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("NOMBRE:");
        Opcion_ALTA.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ESTATUS BECA:");
        Opcion_ALTA.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("CORREO:");
        Opcion_ALTA.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("CONTRASEÑA:");
        Opcion_ALTA.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("INGRESE SI NOMBRE");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 250, 30));

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("INGRESE SU APELLIDO");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 250, 30));

        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("INGRESE SU CORREO");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 30));

        jRadioButton1.setBackground(new java.awt.Color(201, 45, 57));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("<html>EDITOR DE SITIO</html>");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 70, 40));

        jRadioButton2.setBackground(new java.awt.Color(201, 45, 57));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("RECLUTADOR");
        Opcion_ALTA.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(201, 45, 57));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setText("ADMINISTRADOR");
        Opcion_ALTA.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(201, 45, 57));
        jButton1.setText("REGISTRAR");
        Opcion_ALTA.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(201, 45, 57));
        jButton4.setText("CANCELAR");
        Opcion_ALTA.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("INGRESE CONTRESEÑA");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, 30));

        jRadioButton4.setBackground(new java.awt.Color(201, 45, 57));
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton4.setText("<html>SOPORTE TECNICO</html>");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        Opcion_ALTA.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GERENTE_STATUS_LINEA.png"))); // NOI18N

        contratar.setBackground(new java.awt.Color(0, 0, 0));
        contratar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contratar.setForeground(new java.awt.Color(255, 255, 255));
        contratar.setText("CONTRATAR");
        contratar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contratarMouseClicked(evt);
            }
        });
        contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarActionPerformed(evt);
            }
        });

        despedir.setBackground(new java.awt.Color(0, 0, 0));
        despedir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        despedir.setForeground(new java.awt.Color(255, 255, 255));
        despedir.setText("DESPEDIR");
        despedir.setToolTipText("");
        despedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("STATUS PERSONAL");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_UAMLIX_PNG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(contratar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(despedir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(contratar)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(despedir)
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        Opcion_BAJA.setBackground(new java.awt.Color(201, 45, 57));
        Opcion_BAJA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        Opcion_BAJA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_PERSONAL", "NOMBRE_PERS", "CARGO", "SALARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonal);

        Opcion_BAJA.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 350));

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        Opcion_BAJA.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        buscar_personal.setBackground(new java.awt.Color(201, 45, 57));
        buscar_personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ICONO_BUSCADOR_1.png"))); // NOI18N
        buscar_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_personalActionPerformed(evt);
            }
        });
        Opcion_BAJA.add(buscar_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 40));
        Opcion_BAJA.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 190, 30));

        jLabel2.setText("ID_PERSONAL");
        Opcion_BAJA.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 110, 30));

        regresar.setBackground(new java.awt.Color(0, 0, 0));
        regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regresar.setForeground(new java.awt.Color(204, 255, 255));
        regresar.setText("REGRESAR");

        DESPEDIR.setBackground(new java.awt.Color(0, 0, 0));
        DESPEDIR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DESPEDIR.setForeground(new java.awt.Color(204, 255, 255));
        DESPEDIR.setText("DESPEDIR");
        DESPEDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESPEDIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DESPEDIR)
                        .addGap(21, 21, 21)))
                .addComponent(Opcion_BAJA, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(DESPEDIR))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Opcion_BAJA, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contratarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contratarMouseClicked
        // TODO add your handling code here:
        //ABRE EL PANEL PARA REGISTRAR A ALUMNO
    }//GEN-LAST:event_contratarMouseClicked

    private void contratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contratarActionPerformed
//DESPEDIR
    private void despedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirActionPerformed
        // TODO add your handling code here:
      JOptionPane.showMessageDialog(null,"SE ENCUENTRA EN ESA VENTANA");
    }//GEN-LAST:event_despedirActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void buscar_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_personalActionPerformed
        // TODO add your handling code here:
        gestorAutentificacion ga = new gestorAutentificacion();
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaPersonal.setModel(modelotabla);
        String campo =  busqueda.getText();
        String where = ""; //concatenacion
                if(!"".equals(campo)){
                        where = "WHERE ID_PERSONAL='"+campo+"'";
                    }
        PreparedStatement ps = null;
        ResultSet rs =  null;

        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            ps = conexion.prepareStatement("SELECT ID_PERSONAL,NOMBRE_PERS,CARGO,SALARIO FROM PERSONAL "+where);
            rs = ps.executeQuery();
            modelotabla.addColumn("ID_PERSONAL");
            modelotabla.addColumn("NOMBRE_PERS");
            modelotabla.addColumn("CARGO");
            modelotabla.addColumn("SALARIO");

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
            Logger.getLogger(GERENTE_DESPEDIR_PERSONAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscar_personalActionPerformed

    private void DESPEDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESPEDIRActionPerformed
        // TODO add your handling code here:
          PreparedStatement ps = null;
         try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            //String sql = "SELECT idpago,Nombre_pago,monto,fecha FROM pago";
            ps = conexion.prepareStatement("DELETE FROM personal WHERE ID_PERSONAL=?");
            ps.setString(1, cajaBuscar.getText());
            ps.executeUpdate();
             JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnas = rsmd.getColumnCount();
            

        } catch (SQLException ex) {
            Logger.getLogger(GERENTE_CONSULTAR_INFO_CLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DESPEDIRActionPerformed
//para que muestre al seleccionar la tabla en un textfield
    private void tablaPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonalMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs =  null;
        try{
            conexion con = new conexion();
            Connection conexion = con.getConnection();
            int fila = tablaPersonal.getSelectedRow();
            String codigo = tablaPersonal.getValueAt(fila, 0).toString();
            //ps = conexion.prepareStatement("SELECT ID_PERSONALCONTRASEÑA,NOMBRE_PERS,SALARIO FROM personal where SALARIO=?");
            ps = conexion.prepareStatement("SELECT * FROM PERSONAL WHERE ID_PERSONAL=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cajaBuscar.setText(rs.getString("ID_PERSONAL"));
//                cajaSalario.setText("NOMBRE_PERS");
//                //cajaSalario.setText("SALARIO");
            }
        }catch (SQLException ex) {
            Logger.getLogger(GERENTE_DESPEDIR_PERSONAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaPersonalMouseClicked

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

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
//            java.util.logging.Logger.getLogger(GERENTE_DESPEDIR_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_DESPEDIR_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_DESPEDIR_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GERENTE_DESPEDIR_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GERENTE_DESPEDIR_PERSONAL().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DESPEDIR;
    private javax.swing.JPanel Opcion_ALTA;
    private javax.swing.JPanel Opcion_BAJA;
    private javax.swing.JButton buscar_personal;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JButton contratar;
    private javax.swing.JButton despedir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tablaPersonal;
    // End of variables declaration//GEN-END:variables
}
