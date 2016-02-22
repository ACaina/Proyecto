/*
 * Andres Caina
 * Julio Sanaguano 
 * Thalia Veloz
 * Daniel Caceres
 */
package Vista;

import Control.Conexion;
import Control.Cliente_Servicios;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Cliente_Modificar extends javax.swing.JFrame {
    Cliente cli ;
    Connection cnx =null;
    private Cliente_Servicios servicios = new Cliente_Servicios(); 
    

    public Cliente_Modificar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar = new javax.swing.JButton();
        txtBuscarClienteM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDireccionM = new javax.swing.JTextField();
        txtTelefonoM = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtIng_MensualM = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtApellidosM = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtNombresM = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jCBTipoEmpleoM = new javax.swing.JComboBox();
        lblPrecio1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 450));

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Buscar por cédula:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDireccionM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionMActionPerformed(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPrecio.setText("Ingreso Mensual:");

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMarca.setText("Apellidos:");

        txtIng_MensualM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIng_MensualMActionPerformed(evt);
            }
        });

        lblModelo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblModelo.setText("Nombres:");

        lblColor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblColor.setText("Dirección:");

        lblPlaca.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPlaca.setText("Teléfono:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 153));
        jLabel3.setText("MODIFICAR CLIENTE");

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jCBTipoEmpleoM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una opción", "Administrativo", "Docente" }));

        lblPrecio1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPrecio1.setText("Tipo Empleo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarClienteM, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblColor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecio))
                            .addComponent(lblPrecio1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefonoM)
                            .addComponent(txtApellidosM)
                            .addComponent(txtNombresM)
                            .addComponent(txtDireccionM)
                            .addComponent(txtIng_MensualM, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jCBTipoEmpleoM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarClienteM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtApellidosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtNombresM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtDireccionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIng_MensualM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1)
                    .addComponent(jCBTipoEmpleoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            cli = new Cliente();
            cli.setCedula(txtBuscarClienteM.getText());
            cli.setApellidos(txtApellidosM.getText());
            cli.setNombres(txtNombresM.getText());
            cli.setDireccion(txtDireccionM.getText());
            cli.setTelefono(txtTelefonoM.getText());
            cli.setIng_Mensual(Double.parseDouble(txtIng_MensualM.getText()));
            cli.setTipoem(jCBTipoEmpleoM.getSelectedItem().toString());
            Conexion con = new Conexion();
            cnx = con.obtener();
            Cliente_Servicios vs = new Cliente_Servicios();
            vs.Modificar(cnx,cli);
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_Insertar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,",Se presento el siguiente error: "+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_Insertar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,",Se presento el siguiente error: "+ex);     
        }
      
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDireccionMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionMActionPerformed

    private void txtIng_MensualMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIng_MensualMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIng_MensualMActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.gc();
        dispose();
      
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
            
            cnx = Conexion.obtener(); 
            cli = null; 
            if (cnx!=  null)
            {
      
                this.cli = this.servicios.recuperarPorId(Conexion.obtener(),txtBuscarClienteM.getText());
                
                if (this.cli != null)                       
                {
                    txtApellidosM.setText(cli.getApellidos());
                    txtNombresM.setText(cli.getNombres());
                    txtDireccionM.setText(cli.getDireccion());
                    txtTelefonoM.setText(cli.getTelefono());
                    txtIng_MensualM.setText(cli.getIng_Mensual().toString());                
                    jCBTipoEmpleoM.setSelectedItem(cli.getTipoem().toString());
              
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
            java.util.logging.Logger.getLogger(Cliente_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCBTipoEmpleoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JTextField txtApellidosM;
    private javax.swing.JTextField txtBuscarClienteM;
    private javax.swing.JTextField txtDireccionM;
    private javax.swing.JTextField txtIng_MensualM;
    private javax.swing.JTextField txtNombresM;
    private javax.swing.JTextField txtTelefonoM;
    // End of variables declaration//GEN-END:variables
}
