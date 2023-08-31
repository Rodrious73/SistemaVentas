package Vista;

import dao.AdministradorJpaController;
import dao.EmpleadosJpaController;
import dto.Empleados;
import dto.Administrador;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

public class FraInicio extends javax.swing.JFrame {

    EmpleadosJpaController empleDAO = new EmpleadosJpaController();
    AdministradorJpaController adminDAO = new AdministradorJpaController();

    public FraInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        logoInicial();
        txtGmail.requestFocus();
        cargarSugerenciasCorreos();
    }

    private void logoInicial() {
        Icon miLogo = new ImageIcon(new ImageIcon(getClass().getResource("/img/logo.png")).getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), 0));
        lblImagen.setIcon(miLogo);
    }

    private void abrirEnlace(String enlace) {
        try {
            Desktop.getDesktop().browse(new URI(enlace));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        True para administradores
        False para empleados
     */
    private void abrirSistema(Object obj, boolean condicion, String titulo) {
        FraSistema fraSistema = new FraSistema(obj, condicion, titulo);
        fraSistema.setVisible(true);
        String title = fraSistema.getTitle();
        fraSistema.setTitle(title+titulo);
    }

    private void cargarSugerenciasCorreos() {
        List<Empleados> lista = empleDAO.findEmpleadosEntities();
        List<Administrador> listaAdmin = adminDAO.findAdministradorEntities();
        String[] correos = new String[lista.size() + listaAdmin.size()];
        for (int i = 0; i < lista.size(); i++) {
            correos[i] = lista.get(i).getCorreoEmple();
        }

        for (int i = 0; i < listaAdmin.size(); i++) {
            correos[lista.size() + i] = listaAdmin.get(i).getUsuario();
        }
        JList listaCorreos = new JList(correos);
        AutoCompleteDecorator.decorate(listaCorreos, txtGmail, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnGitHub = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTituloLogin = new javax.swing.JLabel();
        lblImgUsuario = new javax.swing.JLabel();
        lblImgPass = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        pwdContrasenia = new javax.swing.JPasswordField();
        lblCambiarPass = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnIniciarAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas - Inicio de Sesión");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 51, 51));
        lblTitulo.setText("Sistema de Ventas");

        btnGitHub.setBackground(new java.awt.Color(0, 0, 0));
        btnGitHub.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnGitHub.setForeground(new java.awt.Color(255, 255, 255));
        btnGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/github.png"))); // NOI18N
        btnGitHub.setText("GitHub");
        btnGitHub.setToolTipText("Ir a GitHub @Rodrious73");
        btnGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });

        btnEmail.setBackground(new java.awt.Color(255, 153, 153));
        btnEmail.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEmail.setForeground(new java.awt.Color(0, 0, 0));
        btnEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gmail.png"))); // NOI18N
        btnEmail.setText("Email");
        btnEmail.setToolTipText("Enviar un email (rodriousbig73@gmail.com)");
        btnEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGitHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblTitulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        lblTituloLogin.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloLogin.setText("Iniciar Sesión");

        lblImgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-de-sesion-usuario.png"))); // NOI18N
        lblImgUsuario.setToolTipText("");

        lblImgPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-de-sesion-pass.png"))); // NOI18N

        txtGmail.setToolTipText("Escriba su correo");

        pwdContrasenia.setToolTipText("Escriba su contraseña");

        lblCambiarPass.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblCambiarPass.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPass.setText("Cambiar contraseña?");
        lblCambiarPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCambiarPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCambiarPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCambiarPassMouseExited(evt);
            }
        });

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setToolTipText("Iniciar sesión");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnIniciarAdmin.setBackground(new java.awt.Color(212, 197, 197));
        btnIniciarAdmin.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnIniciarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        btnIniciarAdmin.setText("Administrador");
        btnIniciarAdmin.setToolTipText("Iniciar sesión como Administrador");
        btnIniciarAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblTituloLogin))
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblImgUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblImgPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCambiarPass)
                            .addComponent(pwdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTituloLogin)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgUsuario)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPass)
                    .addComponent(pwdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCambiarPass)
                .addGap(32, 32, 32)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        String enlace = "https://github.com/Rodrious73";
        abrirEnlace(enlace);
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        String correoDestino = "rodriousbig73@gmail.com";
        String subject = "Contact+me";
        String body = "";

        String mailtoLink = "mailto:" + correoDestino + "?subject=" + subject + "&body=" + body;
        abrirEnlace(mailtoLink);
    }//GEN-LAST:event_btnEmailActionPerformed

    private void lblCambiarPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarPassMouseClicked
        DlgCambiarContrasenia cambiarContrasenia = new DlgCambiarContrasenia(this, true, txtGmail.getText());
        cambiarContrasenia.setLocationRelativeTo(this);
        cambiarContrasenia.setVisible(true);
    }//GEN-LAST:event_lblCambiarPassMouseClicked

    private void lblCambiarPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarPassMouseEntered
        lblCambiarPass.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCambiarPassMouseEntered

    private void lblCambiarPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarPassMouseExited
        lblCambiarPass.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCambiarPassMouseExited

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        try {
            if (!txtGmail.getText().equals("") && (pwdContrasenia.getPassword().length > 0)) {
                String correo = txtGmail.getText();
                char[] password = pwdContrasenia.getPassword();
                String passwordString = new String(password);
                Empleados emple = empleDAO.iniciarSesion(correo, passwordString);
                if (emple != null) {
                    dispose();
                    //False para empleados
                    abrirSistema(emple, false, "Empleados");
                } else {
                    JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrectos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Verifique los campos.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnIniciarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarAdminActionPerformed
        try {
            if (!txtGmail.getText().equals("") && (pwdContrasenia.getPassword().length > 0)) {
                String usuario = txtGmail.getText();
                char[] password = pwdContrasenia.getPassword();
                String passwordString = new String(password);
                Administrador admin = adminDAO.iniciarSecionAdmin(usuario, passwordString);
                if (admin != null) {
                    dispose();
                    //True para administradores
                    abrirSistema(admin, true,"Administradores");
                } else {
                    JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrectos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Verifique los campos.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_btnIniciarAdminActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnGitHub;
    private javax.swing.JButton btnIniciarAdmin;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCambiarPass;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImgPass;
    private javax.swing.JLabel lblImgUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloLogin;
    private javax.swing.JPasswordField pwdContrasenia;
    private javax.swing.JTextField txtGmail;
    // End of variables declaration//GEN-END:variables
}
