package Vista;

import dao.ProveedoresJpaController;
import dao.TecnologiaJpaController;
import dto.Proveedores;
import dto.Tecnologia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

public class JpnProductos extends javax.swing.JPanel {

    private boolean condicion;
    ProveedoresJpaController proveeDAO = new ProveedoresJpaController();
    TecnologiaJpaController tecnoDAO = new TecnologiaJpaController();
    List<Proveedores> listaProvee;
    private int idProveedor = 1;
    private int idProducto;
    private DefaultTableModel tableModel;

    public JpnProductos(boolean condicion, int admin) {
        initComponents();
        this.condicion = condicion;
        tableModel = (DefaultTableModel) tblProductos.getModel();
        AutoCompleteDecorator.decorate(cbmProveedores);
        cargarSugerenciasCategorias();
        listaProveedores();
        cargarProductos();
        idProducto = 0;
        if (admin == 1) {
            btnEliminar.setVisible(true);
        } else {
            btnEliminar.setVisible(false);
        }
    }

    private void cargarSugerenciasCategorias() {
        List<Tecnologia> lista = tecnoDAO.findTecnologiaEntities();
        String[] categorias = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            categorias[i] = lista.get(i).getCategoria();
        }
        JList listaCategorias = new JList(categorias);
        AutoCompleteDecorator.decorate(listaCategorias, txtCategoria, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

    private void cargarProductos() {
        tableModel.setRowCount(0);

        List<Tecnologia> lista = tecnoDAO.findTecnologiaEntities();

        for (Tecnologia productos : lista) {
            int idProve = productos.getIdProveedor();
            Proveedores prove = proveeDAO.findProveedores(idProve);
            String nombreProve = prove.getEmpreProve();
            Object[] rowData = {
                productos.getIdproducto(),
                productos.getNombreproducto(),
                nombreProve,
                productos.getCantidad(),
                productos.getPrecio()
            };
            tableModel.addRow(rowData);
        }
    }

    private void listaProveedores() {
        List<Object> listaProveedores = new ArrayList<>();
        listaProvee = proveeDAO.findProveedoresEntities();
        Proveedores provee = proveeDAO.findProveedores(1);
        for (Proveedores proveedor : listaProvee) {
            listaProveedores.add(proveedor.getEmpreProve());
        }
        cbmProveedores.setModel(new DefaultComboBoxModel<>(listaProveedores.toArray(new String[0])));
        cbmProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmProveedoresActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombprod = new javax.swing.JLabel();
        txtNombpro = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        cbmProveedores = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setName(""); // NOI18N

        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Operaciones");

        lblNombprod.setText("Nombre producto :");

        lblProveedor.setText("Proveedor :");

        cbmProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbmProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmProveedoresActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad :");

        lblPrecio.setText("Precio :");

        lblMarca.setText("Marca :");

        lblCategoria.setText("Categoria :");

        btnAgregar.setBackground(new java.awt.Color(255, 255, 153));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 255, 153));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 153));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("x");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbmProveedores, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lblTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNombprod)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombpro)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProveedor)
                                    .addComponent(lblCantidad)
                                    .addComponent(lblPrecio)
                                    .addComponent(lblMarca)
                                    .addComponent(lblCategoria))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombprod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbmProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Proovedor", "Cant.", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(15);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(30);
            tblProductos.getColumnModel().getColumn(3).setMinWidth(30);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(50);
            tblProductos.getColumnModel().getColumn(4).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        lblBuscar.setText("Buscar por nombre :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbmProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmProveedoresActionPerformed
        int selectedIndex = cbmProveedores.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < listaProvee.size()) {
            Proveedores selectProveedor = listaProvee.get(selectedIndex);
            idProveedor = selectProveedor.getIdProve();
        }
    }//GEN-LAST:event_cbmProveedoresActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtNombpro.getText().equals("") && !txtCantidad.getText().equals("") && !txtPrecio.getText().equals("") && !txtMarca.getText().equals("") && !txtCategoria.getText().equals("")) {
            try {
                String nombrePro = txtNombpro.getText();
                int cantidad = Integer.parseInt(txtCantidad.getText());
                double precio = Double.parseDouble(txtPrecio.getText());
                String marca = txtMarca.getText();
                String categoria = txtCategoria.getText();

                Tecnologia temp = new Tecnologia(nombrePro, idProveedor, cantidad, precio, marca, categoria);

                tecnoDAO.create(temp);

                limparCammpos();

                JOptionPane.showMessageDialog(null, "Se agrego con exito");

                cargarProductos();
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limparCammpos();
        idProducto = 0;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!txtNombpro.getText().equals("") && !txtCantidad.getText().equals("") && !txtPrecio.getText().equals("") && !txtMarca.getText().equals("") && !txtCategoria.getText().equals("")) {
            try {
                String nombrePro = txtNombpro.getText();
                int cantidad = Integer.parseInt(txtCantidad.getText());
                double precio = Double.parseDouble(txtPrecio.getText());
                String marca = txtMarca.getText();
                String categoria = txtCategoria.getText();

                Tecnologia temp = new Tecnologia(idProducto, nombrePro, idProveedor, cantidad, precio, marca, categoria);

                tecnoDAO.edit(temp);

                limparCammpos();

                JOptionPane.showMessageDialog(null, "Se edito con exito");

                cargarProductos();
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
        int row = tblProductos.getSelectedRow();
        if (row >= 0) {
            idProducto = Integer.parseInt(model.getValueAt(row, 0).toString());
            Tecnologia temp = tecnoDAO.findTecnologia(idProducto);

            txtNombpro.setText(temp.getNombreproducto());
            txtCantidad.setText(temp.getCantidad() + "");
            txtPrecio.setText(temp.getPrecio() + "");
            txtMarca.setText(temp.getMarca());
            txtCategoria.setText(temp.getCategoria());

            for (int i = 0; i < listaProvee.size(); i++) {
                Proveedores proveedorObj = listaProvee.get(i);
                if (proveedorObj.getIdProve() == temp.getIdProveedor()) {
                    cbmProveedores.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String nombre = txtBuscar.getText().trim();
        List<Tecnologia> lista = tecnoDAO.buscarClientes(nombre);
        tableModel.setRowCount(0);
        for (Tecnologia productos : lista) {
            int idProve = productos.getIdProveedor();
            Proveedores prove = proveeDAO.findProveedores(idProve);
            String nombreProve = prove.getEmpreProve();
            Object[] rowData = {
                productos.getIdproducto(),
                productos.getNombreproducto(),
                nombreProve,
                productos.getCantidad(),
                productos.getPrecio()
            };
            tableModel.addRow(rowData);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idProducto != 0) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar al producto " + txtNombpro.getText() + " ?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                try {
                    tecnoDAO.destroy(idProducto);
                    limparCammpos();
                    cargarProductos();
                    JOptionPane.showMessageDialog(null, "Se elimino con exito.");
                } catch (Exception e) {
                    System.out.println("Error " + e);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila en la tabla.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbmProveedores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombprod;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombpro;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void limparCammpos() {
        txtNombpro.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtMarca.setText("");
        txtCategoria.setText("");
    }

}
