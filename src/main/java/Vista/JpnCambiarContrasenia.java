package Vista;

import dao.EmpleadosJpaController;
import dto.Empleados;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JpnCambiarContrasenia extends javax.swing.JPanel {

    EmpleadosJpaController empleDAO = new EmpleadosJpaController();

    public JpnCambiarContrasenia(String correo) {
        initComponents();
        lblImagen.setSize(177, 110);
        txtCorreo.setText(correo);
        logoInicial();
    }

    private void logoInicial() {
        Icon miLogo = new ImageIcon(new ImageIcon(getClass().getResource("/img/logo-contrasenia.png")).getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), 0));
        lblImagen.setIcon(miLogo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblContraseniaActual = new javax.swing.JLabel();
        pwdContraseniaActual = new javax.swing.JPasswordField();
        lblContraseniaNueva = new javax.swing.JLabel();
        pwdContraseniaNueva = new javax.swing.JPasswordField();
        lblConfirmarContrasenia = new javax.swing.JLabel();
        pwdConfirmarContrasenia = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Cambiar Contraseña");

        lblCorreo.setLabelFor(txtCorreo);
        lblCorreo.setText("Correo :");

        lblContraseniaActual.setLabelFor(pwdContraseniaActual);
        lblContraseniaActual.setText("Contraseña actual :");

        lblContraseniaNueva.setLabelFor(pwdContraseniaNueva);
        lblContraseniaNueva.setText("Contraseña nueva :");

        lblConfirmarContrasenia.setLabelFor(pwdConfirmarContrasenia);
        lblConfirmarContrasenia.setText("Confirmar contraseña :");

        btnAceptar.setBackground(new java.awt.Color(102, 255, 102));
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirmarContrasenia)
                    .addComponent(lblContraseniaNueva)
                    .addComponent(lblContraseniaActual)
                    .addComponent(lblCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo)
                    .addComponent(pwdContraseniaActual)
                    .addComponent(pwdContraseniaNueva)
                    .addComponent(pwdConfirmarContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseniaActual)
                    .addComponent(pwdContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseniaNueva)
                    .addComponent(pwdContraseniaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmarContrasenia)
                    .addComponent(pwdConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))
                        .addGap(101, 101, 101)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        javax.swing.JDialog dialog = (javax.swing.JDialog) SwingUtilities.getWindowAncestor(this);
        dialog.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        try {
            if (!txtCorreo.getText().equals("") && (pwdContraseniaActual.getPassword().length > 0)) {
                String correo = txtCorreo.getText();
                char[] password = pwdContraseniaActual.getPassword();
                String passwordString = new String(password);
                Empleados emple = empleDAO.iniciarSesion(correo, passwordString);
                if (emple != null) {
                    if (pwdContraseniaNueva.getPassword().length > 0 && pwdConfirmarContrasenia.getPassword().length > 0) {
                        char[] passwordNuevo = pwdContraseniaNueva.getPassword();
                        String passwordStringNuevo = new String(passwordNuevo);
                        char[] passwordConfirmar = pwdConfirmarContrasenia.getPassword();
                        String passwordStringConfirmar = new String(passwordConfirmar);
                        if (passwordStringNuevo.equals(passwordStringConfirmar)) {
                            int result = empleDAO.cambiarContrasenia(correo, passwordStringNuevo);
                            if (result==1) {
                                JOptionPane.showMessageDialog(null, "Se cambio la contraseña correctamente.");
                                javax.swing.JDialog dialog = (javax.swing.JDialog) SwingUtilities.getWindowAncestor(this);
                                dialog.dispose();
                            }else{
                                JOptionPane.showMessageDialog(null, "No se cambio la contraseña correctamente.");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Verifique los campos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrecto.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblConfirmarContrasenia;
    private javax.swing.JLabel lblContraseniaActual;
    private javax.swing.JLabel lblContraseniaNueva;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField pwdConfirmarContrasenia;
    private javax.swing.JPasswordField pwdContraseniaActual;
    private javax.swing.JPasswordField pwdContraseniaNueva;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
