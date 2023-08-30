package Vista;

import dto.Administrador;
import dto.Empleados;
import javax.swing.JPanel;

public class FraSistema extends javax.swing.JFrame {

    Empleados emple;
    Administrador admin;
    private boolean condicion;

    public FraSistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        JpnInicio inicio = new JpnInicio();
        mostrarPaneles(inicio);
    }

    public FraSistema(Object obj, boolean condicion) {
        initComponents();
        this.setLocationRelativeTo(null);
        JpnInicio inicio = new JpnInicio();
        mostrarPaneles(inicio);
        this.condicion = condicion;
        jmnProveedores.setVisible(this.condicion);
        jmnEmpleados.setVisible(this.condicion);
        if (condicion) {
            admin = (Administrador) obj;
        } else {
            emple = (Empleados) obj;
        }
    }

    private void mostrarPaneles(JPanel jpanel) {
        jpanel.setSize(900, 428);
        jpanel.setLocation(0, 0);
        jpnContendor.removeAll();
        jpnContendor.add(jpanel);
        jpnContendor.revalidate();
        jpnContendor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnContendor = new javax.swing.JPanel();
        mnbMenus = new javax.swing.JMenuBar();
        jmnInicio = new javax.swing.JMenu();
        jmnVentas = new javax.swing.JMenu();
        jmnProductos = new javax.swing.JMenu();
        jmnClientes = new javax.swing.JMenu();
        jmnProveedores = new javax.swing.JMenu();
        jmnEmpleados = new javax.swing.JMenu();
        jmnReportes = new javax.swing.JMenu();
        jmnPerfil = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas - ");

        javax.swing.GroupLayout jpnContendorLayout = new javax.swing.GroupLayout(jpnContendor);
        jpnContendor.setLayout(jpnContendorLayout);
        jpnContendorLayout.setHorizontalGroup(
            jpnContendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jpnContendorLayout.setVerticalGroup(
            jpnContendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        mnbMenus.setBackground(new java.awt.Color(255, 255, 0));
        mnbMenus.setForeground(new java.awt.Color(0, 0, 0));
        mnbMenus.setPreferredSize(new java.awt.Dimension(70, 35));

        jmnInicio.setText("Inicio");
        jmnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnInicioMouseClicked(evt);
            }
        });
        mnbMenus.add(jmnInicio);

        jmnVentas.setText("Ventas");
        jmnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnVentasMouseClicked(evt);
            }
        });
        mnbMenus.add(jmnVentas);

        jmnProductos.setText("Productos");
        jmnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnProductos.setMargin(new java.awt.Insets(3, 11, 5, 11));
        jmnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnProductosMouseClicked(evt);
            }
        });
        mnbMenus.add(jmnProductos);

        jmnClientes.setText("Clientes");
        jmnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnClientesMouseClicked(evt);
            }
        });
        mnbMenus.add(jmnClientes);

        jmnProveedores.setText("Proveedores");
        jmnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnProveedoresMouseClicked(evt);
            }
        });
        jmnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnProveedoresActionPerformed(evt);
            }
        });
        mnbMenus.add(jmnProveedores);

        jmnEmpleados.setText("Empleados");
        mnbMenus.add(jmnEmpleados);

        jmnReportes.setText("Reportes");
        jmnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnReportesMouseClicked(evt);
            }
        });
        mnbMenus.add(jmnReportes);

        jmnPerfil.setText("Perfil");
        jmnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnPerfilMouseClicked(evt);
            }
        });
        mnbMenus.add(jmnPerfil);

        mnuSalir.setText("Salir");
        mnuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        mnbMenus.add(mnuSalir);

        setJMenuBar(mnbMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnVentasMouseClicked
        JpnVentas ventas = new JpnVentas();
        mostrarPaneles(ventas);
    }//GEN-LAST:event_jmnVentasMouseClicked

    private void jmnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnInicioMouseClicked
        JpnInicio inicio = new JpnInicio();
        mostrarPaneles(inicio);
    }//GEN-LAST:event_jmnInicioMouseClicked

    private void jmnPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnPerfilMouseClicked
        int id;
        if (condicion) {
            id = admin.getId();
            JpnPerfilAdmin perfilAdmin = new JpnPerfilAdmin(id);
            mostrarPaneles(perfilAdmin);
        } else {
            id = emple.getId();
            JpnPerfil perfil = new JpnPerfil(id);
            mostrarPaneles(perfil);
        }
    }//GEN-LAST:event_jmnPerfilMouseClicked

    private void jmnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnReportesMouseClicked
        int id;
        if (condicion) {
            id = admin.getId();
            JpnReporteAdmin reporteAdmin = new JpnReporteAdmin(id);
            mostrarPaneles(reporteAdmin);
        } else {
            id = emple.getId();
            JpnReporte reporte = new JpnReporte(id);
            mostrarPaneles(reporte);
        }
    }//GEN-LAST:event_jmnReportesMouseClicked

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        dispose();
        FraInicio inicio = new FraInicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void jmnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnClientesMouseClicked
        JpnClientes clientes = new JpnClientes();
        mostrarPaneles(clientes);
    }//GEN-LAST:event_jmnClientesMouseClicked

    private void jmnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnProductosMouseClicked
        int admin;
        if (condicion) {
            admin = 1;
        } else {
            admin = 0;
        }
        JpnProductos productos = new JpnProductos(true, admin);
        mostrarPaneles(productos);
    }//GEN-LAST:event_jmnProductosMouseClicked

    private void jmnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnProveedoresActionPerformed
        
    }//GEN-LAST:event_jmnProveedoresActionPerformed

    private void jmnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnProveedoresMouseClicked
        JpnProveedores proveedores = new JpnProveedores();
        mostrarPaneles(proveedores);
    }//GEN-LAST:event_jmnProveedoresMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FraSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmnClientes;
    private javax.swing.JMenu jmnEmpleados;
    private javax.swing.JMenu jmnInicio;
    private javax.swing.JMenu jmnPerfil;
    private javax.swing.JMenu jmnProductos;
    private javax.swing.JMenu jmnProveedores;
    private javax.swing.JMenu jmnReportes;
    private javax.swing.JMenu jmnVentas;
    private javax.swing.JPanel jpnContendor;
    private javax.swing.JMenuBar mnbMenus;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
