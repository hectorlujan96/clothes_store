/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author yairf
 */
public class Clientes extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        botonesAzules2 = new Componentes.BotonesAzules();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botonesAzules3 = new Componentes.BotonesAzules();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jLabel1.setText("Agregar Cliente");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 160, 30));

        jLabel10.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 10));

        jTextField8.setBackground(new java.awt.Color(218, 217, 217));
        jTextField8.setForeground(new java.awt.Color(102, 153, 255));
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, 40));

        jLabel13.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel13.setText("Apellido M:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 10));

        jTextField10.setBackground(new java.awt.Color(218, 217, 217));
        jTextField10.setForeground(new java.awt.Color(102, 153, 255));
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, 40));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 170, 10));

        jTextField11.setBackground(new java.awt.Color(218, 217, 217));
        jTextField11.setForeground(new java.awt.Color(102, 153, 255));
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 170, 40));

        jLabel14.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel14.setText("Apellido P:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 20));

        jLabel12.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel12.setText("RFC:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jTextField12.setBackground(new java.awt.Color(218, 217, 217));
        jTextField12.setForeground(new java.awt.Color(102, 153, 255));
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, 40));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 10));

        jLabel11.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel11.setText("Sexo:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 20));

        jTextField9.setBackground(new java.awt.Color(218, 217, 217));
        jTextField9.setForeground(new java.awt.Color(102, 153, 255));
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 40));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 170, 10));

        jLabel16.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel16.setText("Fecha Nacimiento:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 20));

        jTextField14.setBackground(new java.awt.Color(218, 217, 217));
        jTextField14.setForeground(new java.awt.Color(102, 153, 255));
        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 120, 40));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 120, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 370, 10));

        jLabel17.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel17.setText("Domicilio:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        jTextField15.setBackground(new java.awt.Color(218, 217, 217));
        jTextField15.setBorder(null);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 370, 40));

        jLabel15.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel15.setText("Telefono:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 20));

        jRadioButton1.setBackground(new java.awt.Color(218, 217, 217));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 20, 20));

        jRadioButton2.setBackground(new java.awt.Color(218, 217, 217));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 20, 20));

        botonesAzules2.setText("Agregar");
        jPanel5.add(botonesAzules2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 120, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jLabel2.setText("Buscar Cliente");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 160, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido M", "Apellido P", "RFC", "Telefono", "Sexo:", "Domicilio"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 180));

        botonesAzules3.setText("Eliminar");
        jPanel4.add(botonesAzules3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 120, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 890, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BotonesAzules botonesAzules2;
    private Componentes.BotonesAzules botonesAzules3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
