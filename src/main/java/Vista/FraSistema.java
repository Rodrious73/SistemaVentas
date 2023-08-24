package Vista;

import dto.Empleados;
import javax.swing.JPanel;

public class FraSistema extends javax.swing.JFrame {
    
    Empleados emple;
    
    public FraSistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        JpnInicio inicio = new JpnInicio();
        mostrarPaneles(inicio);
    }
    
    public FraSistema(Object obj){
        initComponents();
        this.setLocationRelativeTo(null);
        JpnInicio inicio = new JpnInicio();
        mostrarPaneles(inicio);
        emple = (Empleados) obj;
    }
    
    private void mostrarPaneles(JPanel jpanel){
        jpanel.setSize(900,428);
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
        jmnReportes = new javax.swing.JMenu();
        jmnPerfil = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        JpnPerfil perfil = new JpnPerfil(emple.getId());
        mostrarPaneles(perfil);
    }//GEN-LAST:event_jmnPerfilMouseClicked

    private void jmnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnReportesMouseClicked
        JpnReporte reporte = new JpnReporte(emple.getId());
        mostrarPaneles(reporte);
    }//GEN-LAST:event_jmnReportesMouseClicked

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        dispose();
        FraInicio inicio =  new FraInicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void jmnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnClientesMouseClicked
        JpnClientes clientes = new JpnClientes();
        mostrarPaneles(clientes);
    }//GEN-LAST:event_jmnClientesMouseClicked

    private void jmnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnProductosMouseClicked
        JpnProductos productos = new JpnProductos(true);
        mostrarPaneles(productos);
    }//GEN-LAST:event_jmnProductosMouseClicked

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
    private javax.swing.JMenu jmnInicio;
    private javax.swing.JMenu jmnPerfil;
    private javax.swing.JMenu jmnProductos;
    private javax.swing.JMenu jmnReportes;
    private javax.swing.JMenu jmnVentas;
    private javax.swing.JPanel jpnContendor;
    private javax.swing.JMenuBar mnbMenus;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
