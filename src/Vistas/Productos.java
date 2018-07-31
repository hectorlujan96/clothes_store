/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Conexion.Conexion;
import Modelos.ModeloEmpleado;
import Modelos.ModeloProductos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yairf
 */
public class Productos extends javax.swing.JPanel {

    private TableRowSorter trsFiltro;

    private Conexion conexion = Conexion.getInstance();
    DefaultTableModel modelo;
    /**
     * Creates new form Prodeuctos
     */
    public Productos() {
        initComponents();
        
        conexion.establecerConexion();
        Object[][] x = ModeloProductos.llenarProductos(conexion.getConection());
        String[] nombreColumnas = {"ID", "Marca", "Talla", "Precio_c", "Precio_v", "Existencia", "Observaciones"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaProductos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnEliminar = new Componentes.BotonesAzules();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtPrecio_c = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtPrecio_v = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtTalla = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        botonesAzules3 = new Componentes.BotonesAzules();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel2.setText("Buscar Producto");
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

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Precio Compra", "Precio Venta", "Marca", "Talla", "Cantidad", "Observaciones"
            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 180));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 120, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 890, 300));

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel1.setText("Agregar Producto");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 180, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel13.setText("Precio Compra:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 20));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 10));

        txtPrecio_c.setBackground(new java.awt.Color(218, 217, 217));
        txtPrecio_c.setForeground(new java.awt.Color(102, 153, 255));
        txtPrecio_c.setBorder(null);
        txtPrecio_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio_cActionPerformed(evt);
            }
        });
        jPanel5.add(txtPrecio_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, 40));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 150, 10));

        txtPrecio_v.setBackground(new java.awt.Color(218, 217, 217));
        txtPrecio_v.setForeground(new java.awt.Color(102, 153, 255));
        txtPrecio_v.setBorder(null);
        txtPrecio_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio_vActionPerformed(evt);
            }
        });
        jPanel5.add(txtPrecio_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 150, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel14.setText("Precio venta:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel12.setText("Marca:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        txtMarca.setBackground(new java.awt.Color(218, 217, 217));
        txtMarca.setForeground(new java.awt.Color(102, 153, 255));
        txtMarca.setBorder(null);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel5.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, 40));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 160, 10));

        txtTalla.setBackground(new java.awt.Color(218, 217, 217));
        txtTalla.setForeground(new java.awt.Color(102, 153, 255));
        txtTalla.setBorder(null);
        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });
        jPanel5.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 40));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 170, 10));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel16.setText("Cantidad:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, 20));

        txtCantidad.setBackground(new java.awt.Color(218, 217, 217));
        txtCantidad.setForeground(new java.awt.Color(102, 153, 255));
        txtCantidad.setBorder(null);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel5.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 120, 40));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 120, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 390, 10));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel17.setText("Observaciones:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        txtObservaciones.setBackground(new java.awt.Color(218, 217, 217));
        txtObservaciones.setBorder(null);
        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });
        jPanel5.add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 390, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel15.setText("Talla:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 20));

        botonesAzules3.setText("Agregar");
        botonesAzules3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonesAzules3ActionPerformed(evt);
            }
        });
        jPanel5.add(botonesAzules3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 120, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtPrecio_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio_cActionPerformed

    private void txtPrecio_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio_vActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void botonesAzules3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonesAzules3ActionPerformed
        // TODO add your handling code here:
        
        ModeloProductos pro = new ModeloProductos(Double.parseDouble(txtPrecio_c.getText()), Double.parseDouble(txtPrecio_v.getText()), txtMarca.getText(), txtTalla.getText(), Integer.parseInt(txtCantidad.getText()), txtObservaciones.getText());
        conexion.establecerConexion();
        int resultado = pro.guardarRegistroProducto(conexion.getConection(), pro);
        conexion.cerrarConexion();

        if (resultado == 1) {
            System.out.println("Agregado correctamente");
        }

       conexion.establecerConexion();
        Object[][] x = ModeloProductos.llenarProductos(conexion.getConection());
        String[] nombreColumnas = {"ID", "Marca", "Talla", "Precio_c", "Precio_v", "Existencia", "Observaciones"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaProductos.setModel(modelo);
    }//GEN-LAST:event_botonesAzules3ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel) tablaProductos.getModel();
        String dato = String.valueOf(tm.getValueAt(tablaProductos.getSelectedRow(), 0));
        int celda = Integer.parseInt(dato);
        System.out.println(dato);

        conexion.establecerConexion();
        ModeloProductos.eliminarProducto(conexion.getConection(), celda);

        Object[][] x = ModeloProductos.llenarProductos(conexion.getConection());
        String[] nombreColumnas = {"ID", "Marca", "Talla", "Precio_c", "Precio_v", "Existencia", "Observaciones"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaProductos.setModel(modelo);
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
        trsFiltro = new TableRowSorter(tablaProductos.getModel());
        tablaProductos.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

     public void filtro() {
        int columnaABuscar = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), columnaABuscar));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BotonesAzules botonesAzules3;
    private Componentes.BotonesAzules btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPrecio_c;
    private javax.swing.JTextField txtPrecio_v;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
