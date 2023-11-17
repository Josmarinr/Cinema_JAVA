
package Vista;

import Control.DAO.*;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modelo.Sesion;
import Modelo.Pelicula;
import Modelo.Usuario;
import Modelo.Empleado;


public class MainPage extends javax.swing.JFrame {

    private CineDistriDAO baseDatos;
    private PeliculaDAO baseDatos2;
    private Sesion sesion = Sesion.getInstance();
    private static JFrame frame;
    private static JFrame frameLogin = new Login();
    private static int cineId;
    private static int puntCine;
    List<Pelicula> peliculas = new ArrayList<>();
    public static JLabel account_label;

    public static int getCineId() {
        return cineId;
    }

    public static JFrame getFrameLogin() {
        return frameLogin;
    }

    public MainPage() {
        this.frame = this;
        initComponents();
        cartelera();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartelera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        cartelera.setBackground(new java.awt.Color(229, 227, 227));
        cartelera.setEnabled(false);
        cartelera.setMinimumSize(new java.awt.Dimension(1200, 500));
        cartelera.setPreferredSize(new java.awt.Dimension(1100, 500));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("EN CARTELERA");

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 500));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 75, 50);
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 95));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SELECCIONA UN MULTIPLEX");
        jLabel8.setPreferredSize(new java.awt.Dimension(700, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout carteleraLayout = new javax.swing.GroupLayout(cartelera);
        cartelera.setLayout(carteleraLayout);
        carteleraLayout.setHorizontalGroup(
            carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carteleraLayout.createSequentialGroup()
                .addGroup(carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carteleraLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(carteleraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2, Short.MAX_VALUE))
            .addGroup(carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE))
        );
        carteleraLayout.setVerticalGroup(
            carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carteleraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );

        getContentPane().add(cartelera);
        cartelera.setBounds(0, 120, 1360, 640);

        account_label= new JLabel();;
        encabezado.setBackground(new java.awt.Color(0, 0, 0));
        encabezado.setMinimumSize(new java.awt.Dimension(1366, 768));
        encabezado.setPreferredSize(new java.awt.Dimension(1366, 768));
        encabezado.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Header.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        encabezado.add(jLabel1);
        jLabel1.setBounds(10, 30, 490, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Buttons/UserIcon/UserIcon.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        encabezado.add(jLabel5);
        jLabel5.setBounds(1300, 30, 50, 58);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Buttons/Cartelera_button.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setEnabled(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jLabel3.setVisible(false);
        encabezado.add(jLabel3);
        jLabel3.setBounds(1070, 30, 120, 58);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Buttons/Comidas_button.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setEnabled(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jLabel4.setVisible(false);;
        encabezado.add(jLabel4);
        jLabel4.setBounds(1190, 30, 110, 58);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Titan", "Unicentro", "Plaza Central", "Gran Estación", "Embajador", "Las Americas" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        encabezado.add(jComboBox1);
        jComboBox1.setBounds(650, 50, 151, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MULTIPLEX");
        encabezado.add(jLabel6);
        jLabel6.setBounds(520, 30, 104, 58);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Estrella Roja.png"))); // NOI18N
        jLabel7.setText("PUNTUAR CINEPLEX");
        jLabel7.setEnabled(false);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.setVisible(false);
        encabezado.add(jLabel7);
        jLabel7.setBounds(810, 40, 250, 50);

        getContentPane().add(encabezado);
        encabezado.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Buttons/Cartelera_button_entered.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/MainPage/Buttons/Cartelera_button.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("Data/MainPage/Buttons/UserIcon/UserIcon_entered.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("Data/MainPage/Buttons/UserIcon/UserIcon.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("Data/MainPage/Buttons/Comidas_button_entered.png")));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("Data/MainPage/Buttons/Comidas_button.png")));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (sesion.isLogged()) {
            getContentPane().removeAll();
            getContentPane().add(encabezado).setBounds(0, 0, 1366, 768);
            getContentPane().add(new ComidaGUI()).setBounds(0, 120, 1366, 768);
            getContentPane().revalidate();
            getContentPane().repaint();
        } else {
            getFrameLogin().setVisible(true);
            frame.setEnabled(false);
        }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        getContentPane().removeAll();
        getContentPane().add(encabezado).setBounds(0, 0, 1366, 768);
        getContentPane().add(cartelera).setBounds(0, 120, 1366, 768);
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jLabel3MouseClicked

    public static JPanel getEncabezado() {
        return encabezado;
    }

    public static JPanel getCartelera() {
        return cartelera;
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static javax.swing.JComboBox getJComboBox1() {
        return jComboBox1;
    }

    public static void goMainPage() {
        MainPage.getFrame().getContentPane().removeAll();
        MainPage.getJComboBox1().setSelectedIndex(0);
        MainPage.getFrame().getContentPane().add(MainPage.getEncabezado()).setBounds(0, 0, 1366, 120);
        MainPage.getFrame().getContentPane().add(jPanel1).setBounds(0, 120, 1366, 768);
        MainPage.getFrame().getContentPane().add(MainPage.getCartelera()).setBounds(0, 120, 1366, 768);
        MainPage.getFrame().getContentPane().revalidate();
        MainPage.getFrame().getContentPane().repaint();
    }


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem() == jComboBox1.getItemAt(0)) {

            getContentPane().add(jPanel1, 0);

            jLabel3.setEnabled(false);
            jLabel3.setVisible(false);
            jLabel4.setEnabled(false);
            jLabel4.setVisible(false);
            jLabel7.setEnabled(false);
            jLabel7.setVisible(false);
            cartelera.setEnabled(false);

            getContentPane().revalidate();
            getContentPane().repaint();

        } else {
            getContentPane().remove(jPanel1);
            baseDatos = new CineDistriDAO();
            List<String> datos = baseDatos.cine(jComboBox1.getSelectedIndex());

            List<String> nombre = new ArrayList<>();
            List<String> puntuacion = new ArrayList<>();
            for (int i = 1; i < datos.size(); i += 2) {
                puntuacion.add(datos.get(i));
            }
            for (int i = 0; i < datos.size(); i += 2) {
                nombre.add(datos.get(i));
            }
            cineId = jComboBox1.getSelectedIndex();

            

            jLabel3.setEnabled(true);
            jLabel3.setVisible(true);
            jLabel4.setEnabled(true);
            jLabel4.setVisible(true);
            jLabel7.setEnabled(true);
            jLabel7.setVisible(true);
            cartelera.setEnabled(true);

            getContentPane().revalidate();
            getContentPane().repaint();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        if (!sesion.isLogged()) {
            frameLogin.setVisible(true);
            this.setEnabled(false);
        } else {
            if (sesion.getPersona().getClass().getName() == "proyectocinedistri.Usuario") {
                getContentPane().removeAll();
                getContentPane().add(encabezado).setBounds(0, 0, 1366, 120);
                getContentPane().add(new PerfilUser((Usuario) sesion.getPersona())).setBounds(0, 120, 1366, 768);
                getContentPane().revalidate();
                getContentPane().repaint();
            } else {
                getContentPane().removeAll();
                getContentPane().add(encabezado).setBounds(0, 0, 1366, 120);
                getContentPane().add(new PerfilEmployee((Empleado) sesion.getPersona())).setBounds(0, 120, 1366, 768);
                getContentPane().revalidate();
                getContentPane().repaint();
            }

        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        JFrame puntuar = new Puntuar("Multiplex", MainPage.getJComboBox1().getSelectedIndex());
        puntuar.setVisible(true);
        puntuar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        goMainPage();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void JPanelPeliculaMouseClicked(java.awt.event.MouseEvent evt, Pelicula peli, JFrame frame, int indx) {
        if (cartelera.isEnabled()) {
            getContentPane().removeAll();
            getContentPane().add(encabezado).setBounds(0, 0, 1366, 120);
            getContentPane().add(new PeliculaGUI(peli, this, indx)).setBounds(0, 120, 1366, 768);
            getContentPane().revalidate();
            getContentPane().repaint();
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel cartelera;
    private static javax.swing.JPanel encabezado;
    private static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    public void cartelera() {
        baseDatos2 = new PeliculaDAO();
        List<String> id = new ArrayList<>();
        List<String> nombre = new ArrayList<>();
        List<String> descrip = new ArrayList<>();
        for (int i = 0; i < baseDatos2.cartelera().size(); i += 4) {
            id.add(baseDatos2.cartelera().get(i));
        }
        for (int i = 1; i < baseDatos2.cartelera().size(); i += 4) {
            nombre.add(baseDatos2.cartelera().get(i));
        }
        for (int i = 2; i < baseDatos2.cartelera().size(); i += 4) {
            descrip.add(baseDatos2.cartelera().get(i));
        }
        for (int i = 0; i < id.size(); i++) {
            jPanel3.add(new ProductoConcretoPanel(new Pelicula(nombre.get(i), "/Data/Pelicula/" + id.get(i) + ".jpg", descrip.get(i))));
            peliculas.add(new Pelicula(nombre.get(i), "/Data/Pelicula/" + id.get(i) + ".jpg", descrip.get(i)));
        }

        Component[] cmp = jPanel3.getComponents();

        for (int i = 0; i < 4; i++) {
            Pelicula aux = peliculas.get(i);
            int indx = i + 1;
            if (cmp[i] instanceof javax.swing.JPanel) {
                cmp[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                cmp[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        JPanelPeliculaMouseClicked(evt, aux, frame, indx);
                    }
                });
            }
        }
    }
}
