/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.CardLayout;
import javax.swing.SwingUtilities;
import vista.EstudianteDatosAcademicos;
import vista.Dashboard.*;

/**
 *
 * @author ASUS ROG
 */
public class EstudianteRequisitos extends javax.swing.JPanel {

    /**
     * Creates new form EstudianteDatos
     */
    // En EstudianteDatosPersonales.java
    private Dashboard vistaPrincipal;

    public EstudianteRequisitos(Dashboard vistaPrincipal) {
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
        pnl_datosPersonales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_siguiente_1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chk_Pobreza = new javax.swing.JCheckBox();
        chk_NPobre = new javax.swing.JCheckBox();
        chk_EPobreza = new javax.swing.JCheckBox();
        txt_EDiscapacidad = new javax.swing.JCheckBox();
        txt_primerMiembroU = new javax.swing.JCheckBox();
        txt_cIndigenas = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_actividadE = new javax.swing.JTextArea();

        jToggleButton1.setText("jToggleButton1");

        pnl_datosPersonales.setBackground(new java.awt.Color(255, 255, 255));
        pnl_datosPersonales.setPreferredSize(new java.awt.Dimension(0, 539));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Marca cualquier situación especial que aplique a tu caso");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(" hayas participado (dentro o fuera de la UNMSM).");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("¿Perteneces a alguna de las siguientes clasificaciones socioeconómicas?");

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Enumera cualquier actividad extracurricular, voluntariado o proyecto comunitario en el que");

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
        btn_siguiente_1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        chk_Pobreza.setBackground(new java.awt.Color(255, 255, 255));
        chk_Pobreza.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        chk_Pobreza.setForeground(new java.awt.Color(0, 0, 0));
        chk_Pobreza.setText("Pobre");

        chk_NPobre.setBackground(new java.awt.Color(255, 255, 255));
        chk_NPobre.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        chk_NPobre.setForeground(new java.awt.Color(0, 0, 0));
        chk_NPobre.setText("No pobre");

        chk_EPobreza.setBackground(new java.awt.Color(255, 255, 255));
        chk_EPobreza.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        chk_EPobreza.setForeground(new java.awt.Color(0, 0, 0));
        chk_EPobreza.setText(" Extrema pobreza");

        txt_EDiscapacidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_EDiscapacidad.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_EDiscapacidad.setForeground(new java.awt.Color(0, 0, 0));
        txt_EDiscapacidad.setText("Estudiante con discapacidad");

        txt_primerMiembroU.setBackground(new java.awt.Color(255, 255, 255));
        txt_primerMiembroU.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_primerMiembroU.setForeground(new java.awt.Color(0, 0, 0));
        txt_primerMiembroU.setText(" Primer miembro de la familia en asistir a la universidad ");
        txt_primerMiembroU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_primerMiembroUActionPerformed(evt);
            }
        });

        txt_cIndigenas.setBackground(new java.awt.Color(255, 255, 255));
        txt_cIndigenas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_cIndigenas.setForeground(new java.awt.Color(0, 0, 0));
        txt_cIndigenas.setText(" Proveniente de comunidades indígenas o remotas ");

        txt_actividadE.setColumns(20);
        txt_actividadE.setRows(5);
        jScrollPane1.setViewportView(txt_actividadE);

        javax.swing.GroupLayout pnl_datosPersonalesLayout = new javax.swing.GroupLayout(pnl_datosPersonales);
        pnl_datosPersonales.setLayout(pnl_datosPersonalesLayout);
        pnl_datosPersonalesLayout.setHorizontalGroup(
            pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosPersonalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_siguiente_1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(txt_EDiscapacidad)
                            .addComponent(txt_cIndigenas)
                            .addComponent(txt_primerMiembroU)
                            .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(chk_EPobreza)
                        .addGap(63, 63, 63)
                        .addComponent(chk_Pobreza)
                        .addGap(77, 77, 77)
                        .addComponent(chk_NPobre)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pnl_datosPersonalesLayout.setVerticalGroup(
            pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_EPobreza)
                    .addComponent(chk_Pobreza)
                    .addComponent(chk_NPobre))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_EDiscapacidad)
                .addGroup(pnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_siguiente_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(pnl_datosPersonalesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_cIndigenas)
                        .addGap(18, 18, 18)
                        .addComponent(txt_primerMiembroU)
                        .addContainerGap(74, Short.MAX_VALUE))))
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

    private void btn_siguiente_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_siguiente_1MouseClicked
        vistaPrincipal.mostrarPanel("datosSustento");
    }//GEN-LAST:event_btn_siguiente_1MouseClicked

    private void btn_siguiente_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_siguiente_1MouseEntered

    }//GEN-LAST:event_btn_siguiente_1MouseEntered

    private void btn_siguiente_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_siguiente_1MouseExited

    }//GEN-LAST:event_btn_siguiente_1MouseExited

    private void btn_siguiente_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_siguiente_1MousePressed

    }//GEN-LAST:event_btn_siguiente_1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void txt_primerMiembroUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_primerMiembroUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_primerMiembroUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_siguiente_1;
    private javax.swing.JCheckBox chk_EPobreza;
    private javax.swing.JCheckBox chk_NPobre;
    private javax.swing.JCheckBox chk_Pobreza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel pnl_datosPersonales;
    private javax.swing.JCheckBox txt_EDiscapacidad;
    private javax.swing.JTextArea txt_actividadE;
    private javax.swing.JCheckBox txt_cIndigenas;
    private javax.swing.JCheckBox txt_primerMiembroU;
    // End of variables declaration//GEN-END:variables
}
