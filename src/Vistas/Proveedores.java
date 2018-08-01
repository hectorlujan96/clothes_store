/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Conexion.Conexion;
import Modelos.ModeloCliente;
import Modelos.ModeloProveedores;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yairf
 */
public class Proveedores extends javax.swing.JPanel {

     private TableRowSorter trsFiltro;
    private Conexion conexion = Conexion.getInstance();
    DefaultTableModel modelo;
    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
        conexion.establecerConexion();
        Object[][] x = ModeloProveedores.llenarProveedor(conexion.getConection());
        String[] nombreColumnas = {"ID","Razon social", "# Telefono", "Direccion" ,"Correo electronico"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaProveedor.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtRazon = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new Componentes.BotonesAzules();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        btnEliminar = new Componentes.BotonesAzules();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel1.setText("Agregar Proveedor");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 190, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel13.setText("Razón Social:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 10));

        txtRazon.setBackground(new java.awt.Color(218, 217, 217));
        txtRazon.setForeground(new java.awt.Color(102, 153, 255));
        txtRazon.setBorder(null);
        txtRazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonActionPerformed(evt);
            }
        });
        jPanel5.add(txtRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, 40));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 170, 10));

        txtTelefono.setBackground(new java.awt.Color(218, 217, 217));
        txtTelefono.setForeground(new java.awt.Color(102, 153, 255));
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel5.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 170, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel14.setText("Telefono:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel12.setText("Correo:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        txtCorreo.setBackground(new java.awt.Color(218, 217, 217));
        txtCorreo.setForeground(new java.awt.Color(102, 153, 255));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel5.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, 40));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 370, 10));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel17.setText("Dirección:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, 20));

        txtDireccion.setBackground(new java.awt.Color(218, 217, 217));
        txtDireccion.setForeground(new java.awt.Color(102, 153, 255));
        txtDireccion.setBorder(null);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel5.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 370, 40));

        btnAgregar.setText("Agregar:");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 120, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jLabel2.setText("Buscar Proveedor");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 160, 30));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 270, 40));

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Razon Social", "Telefono", "Dirección", "Correo"
            }
        ));
        jScrollPane2.setViewportView(tablaProveedor);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 180));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 120, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 890, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
         ModeloProveedores p = new ModeloProveedores(txtRazon.getText(), txtTelefono.getText(), txtCorreo.getText(), txtDireccion.getText());

        conexion.establecerConexion();
        int resultado = p.guardarRegistroProveedor(conexion.getConection(), p);
        conexion.cerrarConexion();

        if (resultado == 1) {
            System.out.println("Agregado correctamente");
        }

        conexion.establecerConexion();
        Object[][] x = ModeloProveedores.llenarProveedor(conexion.getConection());
        String[] nombreColumnas = {"ID","Razon social", "# Telefono", "Direccion" ,"Correo electronico"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaProveedor.setModel(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel) tablaProveedor.getModel();
        String dato = String.valueOf(tm.getValueAt(tablaProveedor.getSelectedRow(), 0));
        int celda = Integer.parseInt(dato);
        System.out.println(dato);

        conexion.establecerConexion();
        ModeloProveedores.eliminarProveedor(conexion.getConection(), celda);

        Object[][] x = ModeloProveedores.llenarProveedor(conexion.getConection());
        String[] nombreColumnas = {"ID","Razon social", "# Telefono", "Direccion" ,"Correo electronico"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaProveedor.setModel(modelo);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaProveedor.getModel());
        tablaProveedor.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    public void filtro() {
        int columnaABuscar = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), columnaABuscar));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BotonesAzules btnAgregar;
    private Componentes.BotonesAzules btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JTable tablaProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRazon;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
