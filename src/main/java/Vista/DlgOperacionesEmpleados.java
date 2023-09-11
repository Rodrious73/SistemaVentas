package Vista;

import dao.DespedidosJpaController;
import dao.EmpleadosJpaController;
import dto.Despedidos;
import dto.Empleados;
import java.util.Date;
import javax.swing.JOptionPane;

public class DlgOperacionesEmpleados extends javax.swing.JDialog {

    EmpleadosJpaController empleDAO = new EmpleadosJpaController();
    DespedidosJpaController despeDAO = new DespedidosJpaController();
    private static Empleados empleados;
    private static Despedidos despedidos;
    /*
        Para despedir true;
        Para reencorporar false;
     */
    private static boolean condicion;
    private int n = 0;

    public DlgOperacionesEmpleados(java.awt.Frame parent, boolean modal, Object object, boolean condicion) {
        super(parent, modal);
        initComponents();
        btnCancelar.setVisible(false);
        this.condicion = condicion;
        if (condicion) {
            this.empleados = (Empleados) object;
            cargarDatosEmpleados();
            btnContratar.setVisible(false);
            lblFecha.setVisible(false);
            lblTituloFecha.setVisible(false);
        }else{
            this.despedidos = (Despedidos) object;
            cargarDatosDespedidos();
            btnDespedir.setVisible(false);
            btnEditar.setVisible(false);
        }   
    }

    public static Empleados getEmpleados() {
        return empleados;
    }

    public static boolean isCondicion() {
        return condicion;
    }
    
    private void cargarDatosEmpleados() {
        txtId.setText(empleados.getId() + "");
        txtDni.setText(empleados.getDniEmple());
        txtNombres.setText(empleados.getNombreEmple());
        txtApellidos.setText(empleados.getAppaEmple() + " " + empleados.getApmaEmple());
        txtCorreo.setText(empleados.getCorreoEmple());
        txtCelular.setText(empleados.getCeluEmple());
    }
    
    private void cargarDatosDespedidos(){
        txtId.setText(despedidos.getIdEmp()+ "");
        txtDni.setText(despedidos.getDniEmple());
        txtNombres.setText(despedidos.getNombreEmple());
        txtApellidos.setText(despedidos.getAppaEmple() + " " + despedidos.getApmaEmple());
        txtCorreo.setText(despedidos.getCorreoEmple());
        txtCelular.setText(despedidos.getCeluEmple());
        lblFecha.setText(despedidos.getFechades()+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnDespedir = new javax.swing.JButton();
        btnContratar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblTituloFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleado");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Empleados");

        lblId.setText("ID :");

        lblDni.setText("DNI :");

        lblNombres.setText("NOMBRES :");

        lblApellidos.setText("APELLIDOS :");

        lblCorreo.setText("CORREO :");

        lblCelular.setText("CELULAR :");

        txtId.setEditable(false);

        txtDni.setEditable(false);

        txtNombres.setEditable(false);

        txtApellidos.setEditable(false);

        txtCorreo.setEditable(false);

        txtCelular.setEditable(false);

        btnEditar.setBackground(new java.awt.Color(255, 255, 51));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 204));
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnDespedir.setBackground(new java.awt.Color(255, 0, 0));
        btnDespedir.setForeground(new java.awt.Color(0, 0, 0));
        btnDespedir.setText("Despedir");
        btnDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespedirActionPerformed(evt);
            }
        });

        btnContratar.setBackground(new java.awt.Color(51, 255, 51));
        btnContratar.setForeground(new java.awt.Color(0, 0, 0));
        btnContratar.setText("Contratar");
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 0, 0));
        lblFecha.setText("Fecha de despido :");

        lblTituloFecha.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblTituloFecha.setForeground(new java.awt.Color(255, 0, 0));
        lblTituloFecha.setText("Fecha de despido :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombres)
                                    .addComponent(lblDni)
                                    .addComponent(lblId)
                                    .addComponent(lblApellidos)
                                    .addComponent(lblCorreo)
                                    .addComponent(lblCelular))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombres)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId)
                                    .addComponent(txtDni)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDespedir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTituloFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha)
                                .addGap(83, 83, 83)))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContratar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(btnContratar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCerrar)
                    .addComponent(btnDespedir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblTituloFecha))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (n == 0) {
            txtCorreo.selectAll();
            txtCorreo.requestFocusInWindow();
            habilitarEditar(true);
            n = 1;
        } else {
            try {
                empleados.setCorreoEmple(txtCorreo.getText());
                empleados.setCeluEmple(txtCelular.getText());
                empleDAO.edit(empleados);
                habilitarEditar(false);
                JOptionPane.showMessageDialog(rootPane, "Se edito correctamente");
                n = 0;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Hubo un error");
                n = 1;
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cargarDatosEmpleados();
        habilitarEditar(false);
        n = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespedirActionPerformed
        try {
            int respuesta = JOptionPane.showConfirmDialog(null, "Quieres despedir al empleado " + txtDni.getText() + " ?", "Despedir Empleado", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                Despedidos temp = new Despedidos();
                temp.setIdEmple(Integer.parseInt(txtId.getText()));
                temp.setDniEmple(txtDni.getText());
                temp.setNombreEmple(txtNombres.getText());
                temp.setAppaEmple(empleados.getAppaEmple());
                temp.setApmaEmple(empleados.getApmaEmple());
                temp.setCorreoEmple(txtCorreo.getText());
                temp.setCeluEmple(txtCelular.getText());
                temp.setPassEmple(txtDni.getText());
                temp.setFechades(new Date());
                int idEmpleado = Integer.parseInt(txtId.getText());
                despeDAO.create(temp);
                empleDAO.destroy(idEmpleado);
                JOptionPane.showMessageDialog(null, "Se despidio correctamente.");
                dispose();
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_btnDespedirActionPerformed

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
        try {
            int respuesta = JOptionPane.showConfirmDialog(null, "Quieres contratar al empleado " + txtDni.getText() + " ?", "Contratar Empleado", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                Empleados temp = new Empleados();
                temp.setDniEmple(txtDni.getText());
                temp.setNombreEmple(txtNombres.getText());
                temp.setAppaEmple(despedidos.getAppaEmple());
                temp.setApmaEmple(despedidos.getApmaEmple());
                temp.setCorreoEmple(txtCorreo.getText());
                temp.setCeluEmple(txtCelular.getText());
                temp.setPassEmple(txtDni.getText());
                int idEmpleDespedido = Integer.parseInt(txtId.getText());
                empleDAO.create(temp);
                despeDAO.destroy(idEmpleDespedido);
                JOptionPane.showMessageDialog(null, "Se contrato correctamente.");
                dispose();
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_btnContratarActionPerformed

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
            java.util.logging.Logger.getLogger(DlgOperacionesEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgOperacionesEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgOperacionesEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgOperacionesEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Empleados empleados = getEmpleados();
                boolean condicion = isCondicion();
                DlgOperacionesEmpleados dialog = new DlgOperacionesEmpleados(new javax.swing.JFrame(), true, empleados, condicion);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnContratar;
    private javax.swing.JButton btnDespedir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloFecha;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

    private void habilitarEditar(boolean condicion) {
        txtCorreo.setEditable(condicion);
        txtCelular.setEditable(condicion);
        btnCancelar.setVisible(condicion);
    }

}
