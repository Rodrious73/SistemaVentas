package Vista;

import dao.EmpleadosJpaController;
import dao.ReportesJpaController;
import dto.Empleados;
import dto.Reportes;
import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class JpnReporteAdmin extends javax.swing.JPanel {

    ReportesJpaController reportesDAO = new ReportesJpaController();
    EmpleadosJpaController empleDAO = new EmpleadosJpaController();

    private DefaultTableModel tableModel;
    private DefaultTableModel tableModel2;
    private int idAdmin;

    public JpnReporteAdmin(int id) {
        initComponents();
        this.idAdmin = id;
        tableModel = (DefaultTableModel) tblReportes.getModel();
        tableModel2 = (DefaultTableModel) tblReportesRespuesta.getModel();
        cargarReportesSinRespuesta(id);
        cargarReportesConRespuesta(id);
    }

    private void cargarReportesSinRespuesta(int idAdmin) {
        tableModel.setRowCount(0);

        List<Reportes> lista = reportesDAO.findReportesByAdministrador(idAdmin);

        for (Reportes reporte : lista) {
            if (reporte.getRespuesta().equalsIgnoreCase("sin respuesta")) {
                Object[] rowData = {
                    reporte.getIdRepo(),
                    reporte.getIdEmple(),
                    reporte.getAsunto(),
                    reporte.getRespuesta()
                };
                tableModel.addRow(rowData);
            }
        }
    }
    
    private void cargarReportesConRespuesta(int idAdmin) {
        tableModel2.setRowCount(0);

        List<Reportes> lista = reportesDAO.findReportesByAdministrador(idAdmin);

        for (Reportes reporte : lista) {
            if (!reporte.getRespuesta().equalsIgnoreCase("sin respuesta")) {
                Object[] rowData = {
                    reporte.getIdRepo(),
                    reporte.getIdEmple(),
                    reporte.getAsunto(),
                    reporte.getRespuesta()
                };
                tableModel2.addRow(rowData);
            }
        }
    }

    private void abrirEnlace(String enlace) {
        try {
            Desktop.getDesktop().browse(new URI(enlace));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String formatearTexto(String texto) {
        return texto.replace(" ", "+");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIDEmpleado = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        lblAsunto = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        btnResponder = new javax.swing.JButton();
        btnEnviarGmail = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblIdReporte = new javax.swing.JLabel();
        txtIdReporte = new javax.swing.JTextField();
        lblDescripcion1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaRespuesta = new javax.swing.JTextArea();
        jtbPanelDos = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblReportesRespuesta = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 51, 51)));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Responder Reportes");

        lblIDEmpleado.setText("EMPLEADO ID :");

        txtIDEmpleado.setEditable(false);

        lblAsunto.setText("ASUNTO :");

        txtAsunto.setEditable(false);

        lblDescripcion.setText("DESCRIPCIÓN :");

        txaDescripcion.setEditable(false);
        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        btnResponder.setBackground(new java.awt.Color(51, 255, 0));
        btnResponder.setForeground(new java.awt.Color(0, 0, 0));
        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });

        btnEnviarGmail.setBackground(new java.awt.Color(255, 102, 102));
        btnEnviarGmail.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviarGmail.setText("Enviar por Gmail");
        btnEnviarGmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarGmailMouseClicked(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblIdReporte.setText("REPORTE ID :");

        txtIdReporte.setEditable(false);

        lblDescripcion1.setText("RESPUESTA :");

        txaRespuesta.setColumns(20);
        txaRespuesta.setRows(5);
        jScrollPane3.setViewportView(txaRespuesta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnResponder)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnEnviarGmail)
                                    .addGap(27, 27, 27)
                                    .addComponent(btnLimpiar))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblIDEmpleado)
                                        .addComponent(lblIdReporte)
                                        .addComponent(lblAsunto)
                                        .addComponent(lblDescripcion))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtIdReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(133, 133, 133))
                                        .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDescripcion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdReporte)
                    .addComponent(txtIdReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDEmpleado)
                    .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsunto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResponder)
                    .addComponent(btnEnviarGmail)
                    .addComponent(btnLimpiar))
                .addGap(31, 31, 31))
        );

        jtbPanelDos.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 255, 0)));

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "REPORTE ID", "EMPLEADO ID", "ASUNTO", "RESPUESTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReportesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblReportes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtbPanelDos.addTab("Sin respuesta", jPanel3);

        tblReportesRespuesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "REPORTE ID", "EMPLEADO ID", "ASUNTO", "RESPUESTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReportesRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReportesRespuestaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblReportesRespuesta);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtbPanelDos.addTab("Respondidos", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbPanelDos)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbPanelDos))
                .addContainerGap())
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

    private void btnEnviarGmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarGmailMouseClicked
        if (!txtAsunto.getText().equalsIgnoreCase("") && !txaRespuesta.getText().equalsIgnoreCase("")) {
            int idEmpleado = Integer.parseInt(txtIDEmpleado.getText());
            Empleados emple = empleDAO.findEmpleados(idEmpleado);
            String asunto = txtAsunto.getText();
            String cuerpo = txaRespuesta.getText();
            String correoDestino = emple.getCorreoEmple();
            String subject = formatearTexto(asunto);
            String body = formatearTexto(cuerpo);
            String mailtoLink = "mailto:" + correoDestino + "?subject=" + subject + "&body=" + body;
            abrirEnlace(mailtoLink);
            Reportes temp = reportesDAO.findReportes(Integer.parseInt(txtIdReporte.getText()));
            temp.setRespuesta(cuerpo);
            try {
                reportesDAO.edit(temp);
            } catch (Exception ex) {
                System.out.println("Error " + ex);
            }
            cargarReportesSinRespuesta(idAdmin);
            cargarReportesConRespuesta(idAdmin);
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnEnviarGmailMouseClicked

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        if (!txtAsunto.getText().equalsIgnoreCase("") && !txaRespuesta.getText().equalsIgnoreCase("")) {
            int idReporte = Integer.parseInt(txtIdReporte.getText());
            Reportes temp = reportesDAO.findReportes(idReporte);
            temp.setRespuesta(txaRespuesta.getText());
            try {
                reportesDAO.edit(temp);
            } catch (Exception ex) {
                System.out.println("Error " + ex);
            }
            JOptionPane.showMessageDialog(null, "Se envio respuesta correctamente");
            cargarReportesSinRespuesta(idAdmin);
            cargarReportesConRespuesta(idAdmin);
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnResponderActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportesMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblReportes.getModel();
        int row = tblReportes.getSelectedRow();
        if (row >= 0) {
            int idReporte = Integer.parseInt(model.getValueAt(row, 0).toString());
            int idEmpleado = Integer.parseInt(model.getValueAt(row, 1).toString());
            String asunto = model.getValueAt(row, 2).toString();
            String respuesta = model.getValueAt(row, 3).toString();
            Reportes reporte = reportesDAO.findReportes(idReporte);
            txtIdReporte.setText(idReporte + "");
            txtIDEmpleado.setText(idEmpleado + "");
            txtAsunto.setText(asunto);
            txaDescripcion.setText(reporte.getDescripcion());
            txaRespuesta.setText(respuesta);
            txaRespuesta.selectAll();
            txaRespuesta.requestFocusInWindow();
        }
    }//GEN-LAST:event_tblReportesMouseClicked

    private void tblReportesRespuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportesRespuestaMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblReportesRespuesta.getModel();
        int row = tblReportesRespuesta.getSelectedRow();
        if (row >= 0) {
            int idReporte = Integer.parseInt(model.getValueAt(row, 0).toString());
            
            DlgOperacionesReportes operacionesReporte = new DlgOperacionesReportes((JFrame) SwingUtilities.getWindowAncestor(this),true, idReporte);
            operacionesReporte.setLocationRelativeTo(this);
            operacionesReporte.setVisible(true);
        }
        cargarReportesConRespuesta(idAdmin);
        cargarReportesSinRespuesta(idAdmin);
    }//GEN-LAST:event_tblReportesRespuestaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarGmail;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResponder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jtbPanelDos;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblIDEmpleado;
    private javax.swing.JLabel lblIdReporte;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblReportes;
    private javax.swing.JTable tblReportesRespuesta;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextArea txaRespuesta;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtIdReporte;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtIDEmpleado.setText("");
        txtIdReporte.setText("");
        txtAsunto.setText("");
        txaDescripcion.setText("");
        txaRespuesta.setText("");
    }
}
