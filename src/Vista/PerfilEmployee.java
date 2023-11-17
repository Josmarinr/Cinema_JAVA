/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.DAO.ClienteDAO;
import Control.DAO.SalaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Modelo.Empleado;
import Modelo.Sesion;

public class PerfilEmployee extends javax.swing.JPanel {

    Empleado e;

    public PerfilEmployee(Empleado e) {
        this.e = e;
        initComponents();
        crearNuevosComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 227, 227));
        setPreferredSize(new java.awt.Dimension(1920, 960));
        setRequestFocusEnabled(false);
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("PERFIL");
        add(jLabel2);
        jLabel2.setBounds(100, 70, 260, 60);

        jPanel3.setPreferredSize(new java.awt.Dimension(1720, 730));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(59, 705, 383, 0);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION PERSONAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Cine Afiliado:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(720, 260, 160, 31);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Nombre:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 80, 110, 31);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Cedula:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(720, 80, 100, 31);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setText("Cargo:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 170, 90, 31);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Fecha Inicio Contrato:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(720, 170, 270, 31);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Salario:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 260, 100, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(100, 0, 1520, 350);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAMBIAR CONTRASEÑA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(550, 70, 440, 31);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField1);
        jPasswordField1.setBounds(550, 120, 440, 34);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Confirmar Contraseña:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(550, 170, 440, 31);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField2);
        jPasswordField2.setBounds(550, 220, 440, 34);

        jButton1.setText("CAMBIAR");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(720, 280, 90, 22);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(100, 360, 1520, 350);

        add(jPanel3);
        jPanel3.setBounds(100, 130, 1720, 730);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("CERRAR SESION");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(1620, 880, 190, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword())) && !String.valueOf(jPasswordField1.getPassword()).equals("") && !String.valueOf(jPasswordField2.getPassword()).equals("")) {
            ClienteDAO baseDatos = new ClienteDAO();
            baseDatos.cambiarContraseña(this.e.getId(), String.valueOf(jPasswordField1.getPassword()), "Empleado");
            JOptionPane.showMessageDialog(null, "La contraseña se modifico correctamente");
        } else
            JOptionPane.showMessageDialog(null, "Los campos no coinciden o estan vacios");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Sesion.getInstance().LogOut();
        MainPage.goMainPage();
        MainPage.account_label.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void crearNuevosComponentes() {
        JLabel label_nombre_e = new JLabel();
        label_nombre_e.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_nombre_e.setText(this.e.getNombre());
        jPanel2.add(label_nombre_e);
        label_nombre_e.setBounds(160, 80, 530, 30);

        JLabel label_cc_e = new JLabel();
        label_cc_e.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_cc_e.setText(String.valueOf(this.e.getCedula()));
        jPanel2.add(label_cc_e);
        label_cc_e.setBounds(990, 80, 480, 30);

        JLabel label_cargo_e = new JLabel();
        label_cargo_e.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_cargo_e.setText(this.e.getCargo());
        jPanel2.add(label_cargo_e);
        label_cargo_e.setBounds(160, 170, 530, 30);

        JLabel label_fecha_contrato_e = new JLabel();
        label_fecha_contrato_e.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_fecha_contrato_e.setText(this.e.getFecha_inicio_contrato());
        jPanel2.add(label_fecha_contrato_e);
        label_fecha_contrato_e.setBounds(990, 170, 480, 30);

        JLabel label_salario_e = new JLabel();
        label_salario_e.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_salario_e.setText(String.valueOf(this.e.getSalario()));
        jPanel2.add(label_salario_e);
        label_salario_e.setBounds(160, 260, 530, 30);

        JLabel label_cine_e = new JLabel();
        label_cine_e.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_cine_e.setText(this.e.getCine_afiliado());
        jPanel2.add(label_cine_e);
        label_cine_e.setBounds(990, 260, 480, 30);

        if ("Director".equals(this.e.getCargo())) {

            JButton btn_reporte = new JButton();
            btn_reporte.setFont(new java.awt.Font("Century Gothic", 1, 18));
            btn_reporte.setText("GENERAR REPORTES");
            btn_reporte.setFocusable(false);
            add(btn_reporte);
            btn_reporte.setBounds(865, 880, 200, 50);
            
            btn_reporte.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btn_reporteActionPerformed(e);
                }
            });
        }
    }
    
    public void btn_reporteActionPerformed(ActionEvent e){
        JFileChooser fc = new JFileChooser();
        fc.setApproveButtonText("Guardar");
        fc.showSaveDialog(null);
        File archivo = new File(fc.getSelectedFile()+".txt");
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
            SalaDAO baseDatos2 = new SalaDAO();
            salida.write(baseDatos2.StringOperaciones());
            salida.close();
        }catch(Exception ex){
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}