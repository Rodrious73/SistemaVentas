package Vista;

import dao.AdministradorJpaController;
import dao.ReportesJpaController;
import dto.Administrador;
import dto.Reportes;
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DlgCorreos extends javax.swing.JDialog {

    AdministradorJpaController adminDAO = new AdministradorJpaController();
    ReportesJpaController repoDAO = new ReportesJpaController();
    List<Administrador> listaAdmin;
    private static String asunto = "";
    private static String cuerpo = "";
    private static String idEmpleado = "";
    private static boolean condicion;

    public DlgCorreos(java.awt.Frame parent, boolean modal, String asunto, String cuerpo, String idEmpleado, boolean condicion) {
        super(parent, modal);
        initComponents();
        listaCorreos();
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.idEmpleado = idEmpleado;
        this.condicion = condicion;
    }

    public String formatearTexto(String texto) {
        return texto.replace(" ", "+");
    }

    public static String getAsunto() {
        return asunto;
    }

    public static String getCuerpo() {
        return cuerpo;
    }

    public static String getIdEmpleado() {
        return idEmpleado;
    }

    public static boolean isCondicion() {
        return condicion;
    }

    private void listaCorreos() {
        List<Object> listaCorreos = new ArrayList<>();
        listaAdmin = adminDAO.findAdministradorEntities();
        Administrador admin = adminDAO.findAdministrador(1);
        for (Administrador administrador : listaAdmin) {
            listaCorreos.add(administrador.getCorreo());
        }
        cmbCorreos.setModel(new DefaultComboBoxModel<>(listaCorreos.toArray(new String[0])));
        txtNombreAdmin.setEditable(false);
        txtNombreAdmin.setText(admin.getNombre() + " " + admin.getApellido());
        cmbCorreos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCorreosActionPerformed(evt);
            }
        });
    }

    private void abrirEnlace(String enlace) {
        try {
            Desktop.getDesktop().browse(new URI(enlace));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbCorreos = new javax.swing.JComboBox<>();
        lblCorreo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Escoge a que admin le enviaras el reporte  :");

        cmbCorreos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCorreos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCorreosActionPerformed(evt);
            }
        });

        lblCorreo.setLabelFor(cmbCorreos);
        lblCorreo.setText("Correo :");

        lblNombre.setLabelFor(lblNombre);
        lblNombre.setText("Nombre Administrador :");

        btnAceptar.setBackground(new java.awt.Color(102, 255, 0));
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(lblCorreo)
                            .addComponent(cmbCorreos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCorreosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCorreosActionPerformed
        int selectedIndex = cmbCorreos.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < listaAdmin.size()) {
            Administrador selectedAdmin = listaAdmin.get(selectedIndex);
            txtNombreAdmin.setText(selectedAdmin.getNombre() + " " + selectedAdmin.getApellido());
        }
    }//GEN-LAST:event_cmbCorreosActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (condicion != false) {
            int selectedIndex = cmbCorreos.getSelectedIndex();
            int idAdmin = 0;
            if (selectedIndex >= 0 && selectedIndex < listaAdmin.size()) {
                String correoDestino = listaAdmin.get(selectedIndex).getCorreo();
                String subject = formatearTexto(asunto);
                String body = formatearTexto(cuerpo);
                idAdmin = listaAdmin.get(selectedIndex).getId();
                String mailtoLink = "mailto:" + correoDestino + "?subject=" + subject + "&body=" + body;
                abrirEnlace(mailtoLink);
            }
            Date fecha = new Date();
            Reportes repo = new Reportes(Integer.parseInt(idEmpleado), asunto, cuerpo, fecha, "sin respuesta", idAdmin);
            repoDAO.create(repo);
            dispose();
            JOptionPane.showMessageDialog(rootPane, "Se abrio el navegador para enviar el reporte.");
        } else {
            int selectedIndex = cmbCorreos.getSelectedIndex();
            int idAdmin = 0;
            if (selectedIndex >= 0 && selectedIndex < listaAdmin.size()) {
                idAdmin = listaAdmin.get(selectedIndex).getId();
            }
            Date fecha = new Date();
            Reportes repo = new Reportes(Integer.parseInt(idEmpleado), asunto, cuerpo, fecha, "sin respuesta", idAdmin);
            repoDAO.create(repo);
            dispose();
            JOptionPane.showMessageDialog(rootPane, "Se envio el reporte.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DlgCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String asunto = getAsunto();
                String cuerpo = getCuerpo();
                String idEmpleado = getIdEmpleado();
                boolean condicion = isCondicion();
                DlgCorreos dialog = new DlgCorreos(new javax.swing.JFrame(), true, asunto, cuerpo, idEmpleado, condicion);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbCorreos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombreAdmin;
    // End of variables declaration//GEN-END:variables
}
