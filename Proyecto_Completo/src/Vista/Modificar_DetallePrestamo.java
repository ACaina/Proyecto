
package Vista;

import Control.Conexion;
import Control.DetallePrestamo_Servicios;
import Modelo.DetallePrestamo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Modificar_DetallePrestamo extends javax.swing.JFrame {
    DetallePrestamo det;
    Connection cnx =null;
    private DetallePrestamo_Servicios servicios = new DetallePrestamo_Servicios();
   
    public Modificar_DetallePrestamo() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo1 = new javax.swing.JLabel();
        txtCodigoPresM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDestinoM = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        txtFechaM = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtBuscarCodigoCliM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigo1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCodigo1.setText("Código Prestamo:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("MODIFICAR DETALLE  PRESTAMO");

        lblMonto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMonto.setText("Destino:");

        lblDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDuracion.setText("Fecha emisión:");

        lblCodigo2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCodigo2.setText("Buscar por Código Cliente:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarCodigoCliM, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDestinoM)
                                        .addComponent(txtCodigoPresM, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaM, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo2)
                    .addComponent(txtBuscarCodigoCliM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoPresM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMonto)
                    .addComponent(txtDestinoM, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDuracion)
                    .addComponent(txtFechaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            cnx = Conexion.obtener();
            det = null;
            if (cnx!=  null)
            {
                this.det = this.servicios.recuperarPorId(Conexion.obtener(),txtBuscarCodigoCliM.getText());
                if (this.det != null)
                {
                    
                    txtCodigoPresM.setText(det.getCodigoprestamo());
                    txtDestinoM.setText(det.getDestino());
                    txtFechaM.setText(det.getFechaemision());
                }
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.gc();
        dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       try {
            det = new DetallePrestamo();
            det.setCodigocliente(txtBuscarCodigoCliM.getText());
            det.setCodigoprestamo(txtCodigoPresM.getText());
            det.setDestino(txtDestinoM.getText());
            det.setFechaemision(txtFechaM.getText());
            Conexion con = new Conexion();
            cnx = con.obtener();
            DetallePrestamo_Servicios vs = new DetallePrestamo_Servicios();
            vs.Modificar(cnx,det);
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_Insertar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,",Se presento el siguiente error: "+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_Insertar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,",Se presento el siguiente error: "+ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar_DetallePrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_DetallePrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_DetallePrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_DetallePrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_DetallePrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JTextField txtBuscarCodigoCliM;
    private javax.swing.JTextField txtCodigoPresM;
    private javax.swing.JTextField txtDestinoM;
    private javax.swing.JTextField txtFechaM;
    // End of variables declaration//GEN-END:variables
}
