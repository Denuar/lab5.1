/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_denuarchirinos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Denuar
 */
public class Pantalla extends javax.swing.JFrame {
    ArrayList <Usuario> usuarios= new ArrayList();
    int estado=0;
    ArrayList <Clan> clanes = new ArrayList();
    int posUser;
    
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        jd_registrar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nombreU = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        dc_fechaNac = new rojeru_san.componentes.RSDateChooser();
        txt_edad = new javax.swing.JTextField();
        btn_colorFav = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jd_iniciarSesion = new javax.swing.JDialog();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jd_menu = new javax.swing.JDialog();
        tp_menu = new javax.swing.JTabbedPane();
        p_clan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_clan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_miembrosClan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        p_cartas = new javax.swing.JPanel();
        jd_crearClan = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        txt_nombreClan = new javax.swing.JTextField();
        btn_procesar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_iniciarSesion = new javax.swing.JButton();

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre Usuario");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Fecha Nacimiento");

        jLabel7.setText("Edad");

        jLabel8.setText("Color Favorito");

        btn_colorFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorFavActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_registrarLayout = new javax.swing.GroupLayout(jd_registrar.getContentPane());
        jd_registrar.getContentPane().setLayout(jd_registrarLayout);
        jd_registrarLayout.setHorizontalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_registrarLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)))
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nombreU, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_contraseña, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_colorFav, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btn_guardar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_colorFav, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btn_guardar)
                .addGap(36, 36, 36))
        );

        jLabel9.setText("Usuario");

        jLabel10.setText("Contraseña");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_iniciarSesionLayout = new javax.swing.GroupLayout(jd_iniciarSesion.getContentPane());
        jd_iniciarSesion.getContentPane().setLayout(jd_iniciarSesionLayout);
        jd_iniciarSesionLayout.setHorizontalGroup(
            jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_iniciarSesionLayout.createSequentialGroup()
                .addGroup(jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_iniciarSesionLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addGroup(jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txt_pass)))
                    .addGroup(jd_iniciarSesionLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btn_aceptar)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jd_iniciarSesionLayout.setVerticalGroup(
            jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_iniciarSesionLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(56, 56, 56)
                .addGroup(jd_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btn_aceptar)
                .addGap(65, 65, 65))
        );

        jLabel6.setText("jLabel6");

        jLabel11.setText("Clan Actual");

        txt_clan.setText("Sin Clan");

        jLabel12.setText("MIembros del Clan");

        jButton1.setText("Crear Clan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_clanLayout = new javax.swing.GroupLayout(p_clan);
        p_clan.setLayout(p_clanLayout);
        p_clanLayout.setHorizontalGroup(
            p_clanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clanLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(p_clanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_clanLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(cb_miembrosClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_clanLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_clan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jButton1)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        p_clanLayout.setVerticalGroup(
            p_clanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clanLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(p_clanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_clan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(54, 54, 54)
                .addGroup(p_clanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_miembrosClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        tp_menu.addTab("Clan", p_clan);

        javax.swing.GroupLayout p_cartasLayout = new javax.swing.GroupLayout(p_cartas);
        p_cartas.setLayout(p_cartasLayout);
        p_cartasLayout.setHorizontalGroup(
            p_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        p_cartasLayout.setVerticalGroup(
            p_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        tp_menu.addTab("Cartas", p_cartas);

        javax.swing.GroupLayout jd_menuLayout = new javax.swing.GroupLayout(jd_menu.getContentPane());
        jd_menu.getContentPane().setLayout(jd_menuLayout);
        jd_menuLayout.setHorizontalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_menu, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jd_menuLayout.setVerticalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_menu, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel13.setText("Nombre del clan");

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearClanLayout = new javax.swing.GroupLayout(jd_crearClan.getContentPane());
        jd_crearClan.getContentPane().setLayout(jd_crearClanLayout);
        jd_crearClanLayout.setHorizontalGroup(
            jd_crearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearClanLayout.createSequentialGroup()
                .addGroup(jd_crearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearClanLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel13)
                        .addGap(46, 46, 46)
                        .addComponent(txt_nombreClan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearClanLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btn_procesar)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jd_crearClanLayout.setVerticalGroup(
            jd_crearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearClanLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jd_crearClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_nombreClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_procesar)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_iniciarSesion.setText("Iniciar Sesion");
        btn_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btn_registrar)
                .addGap(141, 141, 141)
                .addComponent(btn_iniciarSesion)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_iniciarSesion))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        jd_registrar.setModal(true);//cuando la subventana abre, la ventana padre se bloquea
        jd_registrar.setLocationRelativeTo(this);//setea la ventana con respecto a la ventana padre
        jd_registrar.pack();
        jd_registrar.setVisible(true);//hago visible la ventana
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarSesionActionPerformed
        // TODO add your handling code here:
        jd_iniciarSesion.setModal(true);//cuando la subventana abre, la ventana padre se bloquea
        jd_iniciarSesion.setLocationRelativeTo(this);//setea la ventana con respecto a la ventana padre
        jd_iniciarSesion.pack();
        jd_iniciarSesion.setVisible(true);//hago visible la ventana
    }//GEN-LAST:event_btn_iniciarSesionActionPerformed

    private void btn_colorFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorFavActionPerformed
        // TODO add your handling code here:
         Color c = JColorChooser.showDialog(this, "Seleccione un color", Color.yellow);// a esta variable se le asigan el color que se selecciona
        btn_colorFav.setBackground(c);//colorea el jl_Texto
    }//GEN-LAST:event_btn_colorFavActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String nombre = txt_nombre.getText(), nombreU=txt_nombreU.getText(), 
                contraseña = txt_contraseña.getText(), apellido= txt_apellido.getText(), edad;
        int nMazos=3;
        Color colorFav = btn_colorFav.getBackground();
        Date fechaNac = dc_fechaNac.getDatoFecha();        
        long edad2= fechaNac.getTime();
        double edad5 = (new Date().getTime()-fechaNac.getTime())/(1000*60*60*24*360);

        txt_edad.setText(edad5+" años");
        usuarios.add(new Usuario(nombre, apellido, nombreU, contraseña, colorFav, fechaNac, edad5, nMazos));
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombreU().equals(txt_user.getText()) && usuarios.get(i).getContraseña().equals(txt_pass.getText())){
                JOptionPane.showMessageDialog(this,"Bienvenido "+ usuarios.get(i).getNombre());
                estado=1;
                posUser=i;
            }
        }
        if (estado==0){
            JOptionPane.showMessageDialog(this,"Nombre o contraseña incorrecta");
        }
        else if (estado==1){
        jd_menu.setModal(true);//cuando la subventana abre, la ventana padre se bloquea
        jd_menu.setLocationRelativeTo(this);//setea la ventana con respecto a la ventana padre
        jd_menu.pack();
        jd_menu.setVisible(true);//hago visible la ventana
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jd_crearClan.setModal(true);//cuando la subventana abre, la ventana padre se bloquea
        jd_crearClan.setLocationRelativeTo(this);//setea la ventana con respecto a la ventana padre
        jd_crearClan.pack();
        jd_crearClan.setVisible(true);//hago visible la ventana
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        ArrayList<Usuario> lista = new ArrayList();
        lista.add(usuarios.get(posUser));
        clanes.add(new Clan(txt_nombreClan.getText(), lista));
        txt_clan.setText(txt_nombreClan.getText());
        JOptionPane.showMessageDialog(this, "clan creado correctamente");
    }//GEN-LAST:event_btn_procesarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_colorFav;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_iniciarSesion;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cb_miembrosClan;
    private rojeru_san.componentes.RSDateChooser dc_fechaNac;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDialog jd_crearClan;
    private javax.swing.JDialog jd_iniciarSesion;
    private javax.swing.JDialog jd_menu;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JPanel p_cartas;
    private javax.swing.JPanel p_clan;
    private javax.swing.JTabbedPane tp_menu;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_clan;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreClan;
    private javax.swing.JTextField txt_nombreU;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
