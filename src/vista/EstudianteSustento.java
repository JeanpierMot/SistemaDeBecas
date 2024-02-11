/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.controlador_estudiante;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.TextField;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.EstudianteDatosAcademicos;
import vista.Dashboard.*;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author ASUS ROG
 */
public class EstudianteSustento extends javax.swing.JPanel {

    /**
     * Creates new form EstudianteDatos
     */
    // En EstudianteDatosPersonales.java
    private Dashboard vistaPrincipal;

    public EstudianteSustento(Dashboard vistaPrincipal) {

        this.vistaPrincipal = vistaPrincipal;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        pnl_datosPersonales = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_finalizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ruta = new javax.swing.JTextField();
        ruta1 = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ruta2 = new javax.swing.JTextField();
        btn_guardar2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ruta3 = new javax.swing.JTextField();
        btn_guardar3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnl_datosPersonales.setBackground(new java.awt.Color(255, 255, 255));
        pnl_datosPersonales.setPreferredSize(new java.awt.Dimension(0, 539));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Adjunte un pdf que certifique su promedio ponderado");

        btn_finalizar.setBackground(new java.awt.Color(21, 101, 192));
        btn_finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_finalizarMousePressed(evt);
            }
        });
        btn_finalizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        btn_finalizar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Finalizar");
        btn_finalizar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Adjunte en un pdf su DNI");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Adjunte reporte de matricula ");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Adjunte archivo que certifique su situacion económica");

        btn_guardar.setBackground(new java.awt.Color(153, 153, 153));
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guardarMousePressed(evt);
            }
        });
        btn_guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        btn_guardar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("...");
        btn_guardar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ruta.setForeground(new java.awt.Color(0, 0, 0));
        ruta.setText("Seleccione aqui el archivo ...");
        ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        ruta1.setBackground(new java.awt.Color(255, 255, 255));
        ruta1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ruta1.setForeground(new java.awt.Color(0, 0, 0));
        ruta1.setText("Seleccione aqui el archivo ...");
        ruta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ruta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ruta1MouseClicked(evt);
            }
        });
        ruta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta1ActionPerformed(evt);
            }
        });

        btn_guardar1.setBackground(new java.awt.Color(153, 153, 153));
        btn_guardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guardar1MousePressed(evt);
            }
        });
        btn_guardar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        btn_guardar1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("...");
        btn_guardar1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        ruta2.setBackground(new java.awt.Color(255, 255, 255));
        ruta2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ruta2.setForeground(new java.awt.Color(0, 0, 0));
        ruta2.setText("Seleccione aqui el archivo ...");
        ruta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ruta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta2ActionPerformed(evt);
            }
        });

        btn_guardar2.setBackground(new java.awt.Color(153, 153, 153));
        btn_guardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardar2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guardar2MousePressed(evt);
            }
        });
        btn_guardar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        btn_guardar2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("...");
        btn_guardar2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        ruta3.setBackground(new java.awt.Color(255, 255, 255));
        ruta3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ruta3.setForeground(new java.awt.Color(0, 0, 0));
        ruta3.setText("Seleccione aqui el archivo ...");
        ruta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ruta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta3ActionPerformed(evt);
            }
        });

        btn_guardar3.setBackground(new java.awt.Color(153, 153, 153));
        btn_guardar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardar3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guardar3MousePressed(evt);
            }
        });
        btn_guardar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        btn_guardar3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("...");
        btn_guardar3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        javax.swing.GroupLayout pnl_datosPersonalesLayout = new javax.swing.GroupLayout(pnl_datosPersonales);
        pnl_datosPersonales.setLayout(pnl_datosPersonalesLayout);
        pnl_datosPersonalesLayout.setHorizontalGroup(
            pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosPersonalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addComponent(ruta3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addComponent(ruta1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addComponent(ruta2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        pnl_datosPersonalesLayout.setVerticalGroup(
            pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruta2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruta3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_datosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseClicked
        
        // metodo para guardar todos los datos
        //Finalizar el registro
        
        
        System.out.println("Lista");
        vistaPrincipal.getLista().imprimir();
        System.exit(0);
    }//GEN-LAST:event_btn_finalizarMouseClicked

    private void btn_finalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseEntered

    }//GEN-LAST:event_btn_finalizarMouseEntered

    private void btn_finalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseExited

    }//GEN-LAST:event_btn_finalizarMouseExited

    private void btn_finalizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMousePressed

    }//GEN-LAST:event_btn_finalizarMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        guardarArchivo(ruta);
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void guardarArchivo(JTextField ruta) {
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            ruta.setText(archivo.getAbsolutePath());
        }

    }


    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered

    }//GEN-LAST:event_btn_guardarMouseEntered

    private void btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseExited

    }//GEN-LAST:event_btn_guardarMouseExited

    private void btn_guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMousePressed

    }//GEN-LAST:event_btn_guardarMousePressed

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaActionPerformed

    private void ruta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruta1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_guardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar1MouseClicked
        guardarArchivo(ruta1);
    }//GEN-LAST:event_btn_guardar1MouseClicked

    private void btn_guardar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar1MouseEntered

    private void btn_guardar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar1MouseExited

    private void btn_guardar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar1MousePressed

    private void ruta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruta2ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btn_guardar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar2MouseClicked
        guardarArchivo(ruta2);
    }//GEN-LAST:event_btn_guardar2MouseClicked

    private void btn_guardar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar2MouseEntered

    private void btn_guardar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar2MouseExited

    private void btn_guardar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar2MousePressed

    private void ruta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruta3ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btn_guardar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar3MouseClicked
        guardarArchivo(ruta3);
    }//GEN-LAST:event_btn_guardar3MouseClicked

    private void btn_guardar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar3MouseEntered

    private void btn_guardar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar3MouseExited

    private void btn_guardar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar3MousePressed

    private void ruta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruta1MouseClicked
       
    }//GEN-LAST:event_ruta1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_finalizar;
    private javax.swing.JPanel btn_guardar;
    private javax.swing.JPanel btn_guardar1;
    private javax.swing.JPanel btn_guardar2;
    private javax.swing.JPanel btn_guardar3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel pnl_datosPersonales;
    private javax.swing.JTextField ruta;
    private javax.swing.JTextField ruta1;
    private javax.swing.JTextField ruta2;
    private javax.swing.JTextField ruta3;
    // End of variables declaration//GEN-END:variables
}
