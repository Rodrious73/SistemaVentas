package Vista;

import dao.EmpleadosJpaController;
import dao.ResultadoDniDAO;
import dto.Empleados;
import dto.ResultadoDni;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.SoloNumeros;

public class JpnEmpleados extends javax.swing.JPanel {

    EmpleadosJpaController empleDAO = new EmpleadosJpaController();
    private DefaultTableModel tableModel;
    private DefaultTableModel tableModel2;

    public JpnEmpleados() {
        initComponents();
        tableModel = (DefaultTableModel) tblEmpleados.getModel();
        tableModel2 = (DefaultTableModel) tblTodoEmpleados.getModel();
        cargarEmpleados();
        cargarTodosEmpleados();
        SoloNumeros.soloNumeros(txtDNI, 8);
        SoloNumeros.soloNumeros(txtBusqueda, 8);
        btnAgregar.setVisible(false);
        btnCancelar.setVisible(false);
    }

    private void cargarEmpleados() {
        tableModel.setRowCount(0);

        List<Empleados> lista = empleDAO.findEmpleadosEntities();

        for (Empleados empleados : lista) {
            String apellidos = empleados.getAppaEmple() + " " + empleados.getApmaEmple();
            Object[] rowData = {
                empleados.getId(),
                empleados.getNombreEmple(),
                apellidos,
                empleados.getDniEmple(),
                empleados.getCorreoEmple()
            };
            tableModel.addRow(rowData);
        }
    }
    
    private void cargarTodosEmpleados(){
        tableModel2.setRowCount(0);

        List<Empleados> lista = empleDAO.findEmpleadosEntities();

        for (Empleados empleados : lista) {
            String apellidos = empleados.getAppaEmple() + " " + empleados.getApmaEmple();
            Object[] rowData = {
                empleados.getId(),
                empleados.getDniEmple(),
                empleados.getNombreEmple(),
                apellidos
            };
            tableModel2.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlnicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        lblBusqueda = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnPdf = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApPaterno = new javax.swing.JLabel();
        txtApPaterno = new javax.swing.JTextField();
        lblApMaterno = new javax.swing.JLabel();
        txtApMaterno = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTodoEmpleados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "APELLIDOS", "N° DNI", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);
        if (tblEmpleados.getColumnModel().getColumnCount() > 0) {
            tblEmpleados.getColumnModel().getColumn(0).setMinWidth(15);
            tblEmpleados.getColumnModel().getColumn(0).setMaxWidth(30);
            tblEmpleados.getColumnModel().getColumn(1).setMinWidth(210);
            tblEmpleados.getColumnModel().getColumn(1).setMaxWidth(250);
            tblEmpleados.getColumnModel().getColumn(2).setMinWidth(210);
            tblEmpleados.getColumnModel().getColumn(2).setMaxWidth(250);
            tblEmpleados.getColumnModel().getColumn(3).setMinWidth(100);
            tblEmpleados.getColumnModel().getColumn(3).setMaxWidth(120);
            tblEmpleados.getColumnModel().getColumn(4).setMinWidth(210);
            tblEmpleados.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        lblBusqueda.setText("Buscar por DNI :");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        btnPdf.setBackground(new java.awt.Color(255, 0, 0));
        btnPdf.setForeground(new java.awt.Color(0, 0, 0));
        btnPdf.setText("PDF");
        btnPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlnicioLayout = new javax.swing.GroupLayout(pnlnicio);
        pnlnicio.setLayout(pnlnicioLayout);
        pnlnicioLayout.setHorizontalGroup(
            pnlnicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlnicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(pnlnicioLayout.createSequentialGroup()
                        .addComponent(lblBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPdf)))
                .addContainerGap())
        );
        pnlnicioLayout.setVerticalGroup(
            pnlnicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlnicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlnicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusqueda)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleados", pnlnicio);

        lblCorreo.setText("CORREO :");

        lblNombre.setText("NOMBRE :");

        lblApPaterno.setText("AP. PATERNO :");

        lblApMaterno.setText("AP. MATERNO :");

        lblDNI.setText("DNI :");

        lblCelular.setText("CELULAR :");

        btnBuscar.setBackground(new java.awt.Color(255, 255, 153));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(102, 255, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        tblTodoEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "N° DNI", "NOMBRES", "APELLIDOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTodoEmpleados);
        if (tblTodoEmpleados.getColumnModel().getColumnCount() > 0) {
            tblTodoEmpleados.getColumnModel().getColumn(0).setMinWidth(15);
            tblTodoEmpleados.getColumnModel().getColumn(0).setMaxWidth(30);
            tblTodoEmpleados.getColumnModel().getColumn(2).setResizable(false);
            tblTodoEmpleados.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDNI)
                            .addComponent(lblNombre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCelular)
                                .addComponent(lblCorreo)
                                .addComponent(lblApMaterno)
                                .addComponent(lblApPaterno)
                                .addComponent(txtNombre)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar)
                                    .addGap(6, 6, 6))
                                .addComponent(txtApPaterno)
                                .addComponent(txtApMaterno)
                                .addComponent(txtCorreo)
                                .addComponent(txtCelular)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApPaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApMaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnCancelar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo Empleado", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Despedir Empleado", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        String dni = txtBusqueda.getText().trim();
        List<Empleados> lista = empleDAO.buscarEmpleados(dni);
        tableModel.setRowCount(0);
        for (Empleados empleados : lista) {
            String apellidos = empleados.getAppaEmple() + " " + empleados.getApmaEmple();
            Object[] rowData = {
                empleados.getId(),
                empleados.getNombreEmple(),
                apellidos,
                empleados.getDniEmple(),
                empleados.getCorreoEmple()
            };
            tableModel.addRow(rowData);
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtDNI.getText().equals("")) {
            Empleados temp = empleDAO.findEmpleadoByDniEmple(txtDNI.getText());
            if (temp != null) {
                JOptionPane.showMessageDialog(null, "El DNI le pertence al empleado " + temp.getNombreEmple() + " - " + temp.getAppaEmple() + " - " + temp.getApmaEmple());
            } else {
                ResultadoDniDAO resultadoDAO = new ResultadoDniDAO();
                ResultadoDni resultado = resultadoDAO.obtenerDatosPorDni(txtDNI.getText());
                if (resultado != null) {
                    activarAgregar(true);
                    txtNombre.setText(resultado.getNombres());
                    txtApPaterno.setText(resultado.getApellido_paterno());
                    txtApMaterno.setText(resultado.getApellido_materno());
                    txtCorreo.requestFocus();
                } else {
                    int respuesta = JOptionPane.showConfirmDialog(null, "No se encontraron resultados para el DNI " + txtDNI.getText() + " \n¿Quieres agregarlo manualmente?", "Mensaje", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        btnBuscar.setVisible(false);
                        txtDNI.requestFocus();
                        btnAgregar.setVisible(true);
                        btnCancelar.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        activarAgregar(false);
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (!txtDNI.getText().equals("") && !txtNombre.getText().equals("") && !txtApPaterno.getText().equals("") && !txtApMaterno.getText().equals("")) {
                String dni = txtDNI.getText();
                String nombres = txtNombre.getText();
                String apellido_paterno = txtApPaterno.getText();
                String apellido_materno = txtApMaterno.getText();
                String correo = "registrar correo";
                String celular = " sin cel";
                if (!txtCorreo.getText().equals("")) {
                    correo = txtCorreo.getText();
                }
                if (!txtCelular.getText().equals("")) {
                    celular = txtCelular.getText();
                }

                Empleados temp = new Empleados(correo, dni, nombres, apellido_paterno, apellido_materno, dni, celular);
                empleDAO.create(temp);
                activarAgregar(false);
                limpiarCampos();
                cargarTodosEmpleados();
                JOptionPane.showMessageDialog(null, "Se agrego el empleado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Verifique los campos.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApMaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlnicio;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblTodoEmpleados;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    /*
        True = agregar
        False = cancelar  
     */
    private void activarAgregar(boolean condicion) {
        btnBuscar.setVisible(!condicion);
        btnAgregar.setVisible(condicion);
        btnCancelar.setVisible(condicion);
        txtDNI.setEditable(!condicion);
        txtNombre.setEditable(!condicion);
        txtApPaterno.setEditable(!condicion);
        txtApMaterno.setEditable(!condicion);
    }

    private void limpiarCampos() {
        txtDNI.setText("");
        txtNombre.setText("");
        txtApPaterno.setText("");
        txtApMaterno.setText("");
        txtCorreo.setText("");
        txtCelular.setText("");
    }
}
