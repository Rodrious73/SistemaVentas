package Vista;

import dao.AdministradorJpaController;
import dao.ReportesJpaController;
import dto.Administrador;
import dto.Reportes;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class JpnReporte extends javax.swing.JPanel {

    ReportesJpaController reportesDAO = new ReportesJpaController();
    AdministradorJpaController adminDAO = new AdministradorJpaController();

    private DefaultTableModel tableModel;

    public JpnReporte(int id) {
        initComponents();
        txtIDEmpleado.setEditable(false);
        txtIDEmpleado.setText(id + "");
        tableModel = (DefaultTableModel) tblReportes.getModel();
        txtAsunto.requestFocus();
        cargarReportes(id);
    }

    private void cargarReportes(int idEmpleado) {
        tableModel.setRowCount(0);

        List<Reportes> lista = reportesDAO.findReportesByEmpleado(idEmpleado);

        for (Reportes reporte : lista) {
            Object[] rowData = {
                reporte.getIdRepo(),
                reporte.getIdEmple(),
                reporte.getAsunto(),
                reporte.getRespuesta()
            };
            tableModel.addRow(rowData);
        }
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
        btnEnviar = new javax.swing.JButton();
        btnEnviarGmail = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 51, 51)));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Reportes");

        lblIDEmpleado.setText("EMPLEADO ID :");

        lblAsunto.setText("ASUNTO :");

        lblDescripcion.setText("DESCRIPCIÓN :");

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        btnEnviar.setBackground(new java.awt.Color(51, 255, 0));
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIDEmpleado)
                                    .addComponent(lblAsunto)
                                    .addComponent(lblDescripcion))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnEnviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEnviarGmail)
                                .addGap(41, 41, 41)
                                .addComponent(btnLimpiar))
                            .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDEmpleado)
                    .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsunto)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnEnviarGmail)
                    .addComponent(btnLimpiar))
                .addGap(71, 71, 71))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 255, 0)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (!txtAsunto.getText().equalsIgnoreCase("") && !txaDescripcion.getText().equalsIgnoreCase("")) {
            String idEmpleado = txtIDEmpleado.getText();
            String asunto = txtAsunto.getText();
            String cuerpo = txaDescripcion.getText();
            DlgCorreos correos = new DlgCorreos((JFrame) SwingUtilities.getWindowAncestor(this), true, asunto, cuerpo, idEmpleado, true);
            correos.setLocationRelativeTo(this);
            correos.setVisible(true);
            cargarReportes(Integer.parseInt(idEmpleado));
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnEnviarGmailMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (!txtAsunto.getText().equalsIgnoreCase("") && !txaDescripcion.getText().equalsIgnoreCase("")) {
            String idEmpleado = txtIDEmpleado.getText();
            String asunto = txtAsunto.getText();
            String cuerpo = txaDescripcion.getText();
            DlgCorreos correos = new DlgCorreos((JFrame) SwingUtilities.getWindowAncestor(this), true, asunto, cuerpo, idEmpleado, false);
            correos.setLocationRelativeTo(this);
            correos.setVisible(true);
            cargarReportes(Integer.parseInt(idEmpleado));
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportesMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblReportes.getModel();
        int row = tblReportes.getSelectedRow();
        if (row >= 0) {
            int idReporte = Integer.parseInt(model.getValueAt(row, 0).toString());
            Reportes temp = reportesDAO.findReportes(idReporte);
            Administrador tempAdmin = adminDAO.findAdministrador(temp.getIdAdmin());
            String informacion = "\t\tINFORMACIÓN DE REPORTE\n\n";
            informacion += "ID REPORTE : \t" + temp.getIdRepo()+ "\n";
            informacion += "DESTINATARIO : \t" + tempAdmin.getNombre()+ "\n";
            informacion += "\tCORREO : \t" + tempAdmin.getCorreo()+ "\n";
            informacion += "ASUNTO : \t" + temp.getAsunto() + "\n";
            informacion += "DESCRIPCIÓN : " + temp.getDescripcion() + "\n";
            informacion += "RESPUESTA : " + temp.getRespuesta() + "\n";

            JOptionPane.showMessageDialog(null, informacion);
        }
    }//GEN-LAST:event_tblReportesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarGmail;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIDEmpleado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblReportes;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtIDEmpleado;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtAsunto.setText("");
        txaDescripcion.setText("");
    }
}
