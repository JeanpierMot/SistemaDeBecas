/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.controlador_estudiante;
import estructura.ListaEnlazada;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import model.Estudiante;
import vista.EstudianteDatosAcademicos;
import vista.Dashboard.*;

/**
 *
 * @author ASUS ROG
 */
public class EstudianteDatosPersonales extends javax.swing.JPanel {

    /**
     * Creates new form EstudianteDatos
     */
    // En EstudianteDatosPersonales.java
    private Dashboard vistaPrincipal;
    private controlador_estudiante controlador;
    private login1 estudiante;

    public EstudianteDatosPersonales(Dashboard vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        estudiante = new login1();
        controlador = new controlador_estudiante(vistaPrincipal);
        initComponents();
        JRadioButton rdbSi = new JRadioButton("Sí");
        JRadioButton rdbNo = new JRadioButton("No");

    }

    ButtonGroup grupo = new ButtonGroup();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        pnl_datosPersonales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        btn_siguiente_1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        pnl_datosPersonales.setBackground(new java.awt.Color(255, 255, 255));
        pnl_datosPersonales.setPreferredSize(new java.awt.Dimension(0, 539));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Digite su DNI");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombres Completos*");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese su edad");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ingrese sus nombres y apellidos correctamente.");

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ingrese correo personal*");

        btn_siguiente_1.setBackground(new java.awt.Color(21, 101, 192));
        btn_siguiente_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_siguiente_1MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_siguiente_1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_siguiente_1MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_siguiente_1MousePressed(evt);
            }
        });
        btn_siguiente_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        btn_siguiente_1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Siguiente");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        btn_siguiente_1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        javax.swing.GroupLayout pnl_datosPersonalesLayout = new javax.swing.GroupLayout(pnl_datosPersonales);
        pnl_datosPersonales.setLayout(pnl_datosPersonalesLayout);
        pnl_datosPersonalesLayout.setHorizontalGroup(
                pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(pnl_datosPersonalesLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addContainerGap(367, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                pnl_datosPersonalesLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_siguiente_1, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)));
        pnl_datosPersonalesLayout.setVerticalGroup(
                pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51,
                                        Short.MAX_VALUE)
                                .addComponent(btn_siguiente_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_datosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 530,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siguiente_1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_siguiente_1MouseClicked
        
        controlador.actualizarDatosPersonales(txt_nombres, txt_edad, txt_correo, txt_dni);
        
    }

    private void btn_siguiente_1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_siguiente_1MouseEntered

    }// GEN-LAST:event_btn_siguiente_1MouseEntered

    private void btn_siguiente_1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_siguiente_1MouseExited

    }// GEN-LAST:event_btn_siguiente_1MouseExited

    private void btn_siguiente_1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_siguiente_1MousePressed

    }// GEN-LAST:event_btn_siguiente_1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked

    }// GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel5MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_siguiente_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel pnl_datosPersonales;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
