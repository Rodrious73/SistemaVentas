package Vista;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dao.ClientesJpaController;
import dto.Clientes;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class JpnClientes extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    ClientesJpaController cliDAO = new ClientesJpaController();
    
    public JpnClientes() {
        initComponents();
        tableModel = (DefaultTableModel) tblTablaDeClientes.getModel();
        inicio();
        cargarClientes();
    }
    
    private void cargarClientes() {
        tableModel.setRowCount(0);

        List<Clientes> lista = cliDAO.findClientesEntities();

        for (Clientes clientes : lista) {
            Object[] rowData = {
                clientes.getIdCliente(),
                clientes.getDni(),
                clientes.getNombres(),
                clientes.getApellidos(),
                clientes.getCorreo(),
                clientes.getCelular()
            };
            tableModel.addRow(rowData);
        }
    }

    private void inicio() {
        jpnResultados.setVisible(false);
        txtRdni.setEditable(false);
        txtRnombresc.setEditable(false);
        txtRnombres.setEditable(false);
        txtRappa.setEditable(false);
        txtRapma.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDni = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jpnResultados = new javax.swing.JPanel();
        lblRdni = new javax.swing.JLabel();
        txtRdni = new javax.swing.JTextField();
        lblRnombresc = new javax.swing.JLabel();
        txtRnombresc = new javax.swing.JTextField();
        lblRnombres = new javax.swing.JLabel();
        txtRnombres = new javax.swing.JTextField();
        lblRappa = new javax.swing.JLabel();
        txtRappa = new javax.swing.JTextField();
        lblRapma = new javax.swing.JLabel();
        txtRapma = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpnClientesBD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaDeClientes = new javax.swing.JTable();

        lblDni.setText("N° DNI :");

        btnBuscar.setBackground(new java.awt.Color(102, 255, 51));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblRdni.setText("DNI :");

        lblRnombresc.setText("Nombres completos :");

        lblRnombres.setText("Nombres :");

        lblRappa.setText("Apellido paterno :");

        lblRapma.setText("Apellido materno :");

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 102));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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

        javax.swing.GroupLayout jpnResultadosLayout = new javax.swing.GroupLayout(jpnResultados);
        jpnResultados.setLayout(jpnResultadosLayout);
        jpnResultadosLayout.setHorizontalGroup(
            jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRdni)
                    .addComponent(txtRnombresc)
                    .addComponent(txtRnombres)
                    .addComponent(txtRappa)
                    .addGroup(jpnResultadosLayout.createSequentialGroup()
                        .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRdni)
                            .addComponent(lblRnombresc)
                            .addComponent(lblRnombres)
                            .addComponent(lblRappa)
                            .addComponent(lblRapma))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRapma))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnResultadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(21, 21, 21))
        );
        jpnResultadosLayout.setVerticalGroup(
            jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResultadosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblRdni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRnombresc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRnombresc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRnombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRappa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRappa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRapma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRapma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Clientes en el sistema");

        jLabel2.setText("BUSCAR POR N° DNI : ");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        tblTablaDeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "DNI", "NOMBRES", "APELLIDOS", "CORREO", "N° CEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaDeClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaDeClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaDeClientes);
        if (tblTablaDeClientes.getColumnModel().getColumnCount() > 0) {
            tblTablaDeClientes.getColumnModel().getColumn(0).setMinWidth(15);
            tblTablaDeClientes.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jpnClientesBDLayout = new javax.swing.GroupLayout(jpnClientesBD);
        jpnClientesBD.setLayout(jpnClientesBDLayout);
        jpnClientesBDLayout.setHorizontalGroup(
            jpnClientesBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnClientesBDLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jpnClientesBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnClientesBDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))
                    .addGroup(jpnClientesBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpnClientesBDLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        jpnClientesBDLayout.setVerticalGroup(
            jpnClientesBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnClientesBDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnClientesBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnClientesBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpnClientesBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String dni = txtDNI.getText();
        String apitoken = "5de6591d68ff26fa772da0188ee0acaf5a8763411fb5b8f50d799b3bd5f0a8c4";
        String url = "https://apiperu.dev/api/dni/" + dni + "?api_token=" + apitoken;
        try {
            URL enlace = new URL(url);
            URLConnection request = enlace.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootObject = root.getAsJsonObject();
            if (rootObject.get("success").getAsBoolean()) {
                jpnResultados.setVisible(true);
                JsonObject dataObject = rootObject.getAsJsonObject("data");

                String nombreCompleto = dataObject.get("nombre_completo").getAsString();
                String numero = dataObject.get("numero").getAsString();
                String nombres = dataObject.get("nombres").getAsString();
                String apellidoPaterno = dataObject.get("apellido_paterno").getAsString();
                String apellidoMaterno = dataObject.get("apellido_materno").getAsString();

                txtRdni.setText(numero);
                txtRnombresc.setText(nombreCompleto);
                txtRnombres.setText(nombres);
                txtRappa.setText(apellidoPaterno);
                txtRapma.setText(apellidoMaterno);
                txtDNI.setText("");
            } else {
                jpnResultados.setVisible(false);
                JOptionPane.showMessageDialog(null, "El DNI no fue encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jpnResultados.setVisible(false);
        txtDNI.setText("");
        txtDNI.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String ndni = txtRdni.getText();
        String nombres = txtRnombres.getText();
        String apellidos = txtRappa.getText() + " " + txtRapma.getText();
        Clientes temp = new Clientes(ndni, nombres, apellidos);
        DlgRegistrarClientes registrar = new DlgRegistrarClientes((JFrame) SwingUtilities.getWindowAncestor(this), true, temp);
        registrar.setLocationRelativeTo(this);
        registrar.setVisible(true);
        cargarClientes();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        String dni = txtBusqueda.getText().trim();
        List<Clientes> lista = cliDAO.buscarClientes(dni);
        tableModel.setRowCount(0);
        for (Clientes clientes : lista) {
            Object[] row = {
                clientes.getIdCliente(),
                clientes.getDni(),
                clientes.getNombres(),
                clientes.getApellidos(),
                clientes.getCorreo(),
                clientes.getCelular()
            };
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void tblTablaDeClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaDeClientesMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblTablaDeClientes.getModel();
        int row = tblTablaDeClientes.getSelectedRow();
        if (row >= 0) {
            int idCliente = Integer.parseInt(model.getValueAt(row, 0).toString());
            String dniCliente = model.getValueAt(row, 1).toString();
            String nombCliente = model.getValueAt(row, 2).toString();
            String apellCliente = model.getValueAt(row, 3).toString();
            String correo = model.getValueAt(row, 4).toString();
            String celular = model.getValueAt(row, 5).toString();
            
            Clientes temp = new Clientes(idCliente, dniCliente, nombCliente, apellCliente, correo, celular);
            
            DlgOperacionesClientes operacionesClientes = new DlgOperacionesClientes((JFrame) SwingUtilities.getWindowAncestor(this),true, temp);
            operacionesClientes.setLocationRelativeTo(this);
            operacionesClientes.setVisible(true);
        }
        cargarClientes();
    }//GEN-LAST:event_tblTablaDeClientesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnClientesBD;
    private javax.swing.JPanel jpnResultados;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblRapma;
    private javax.swing.JLabel lblRappa;
    private javax.swing.JLabel lblRdni;
    private javax.swing.JLabel lblRnombres;
    private javax.swing.JLabel lblRnombresc;
    private javax.swing.JTable tblTablaDeClientes;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtRapma;
    private javax.swing.JTextField txtRappa;
    private javax.swing.JTextField txtRdni;
    private javax.swing.JTextField txtRnombres;
    private javax.swing.JTextField txtRnombresc;
    // End of variables declaration//GEN-END:variables
}
