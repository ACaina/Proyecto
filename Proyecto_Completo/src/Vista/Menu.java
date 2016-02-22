
package Vista;

import Control.Conexion;
import Control.Usuario_Servicios;
import Modelo.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

  private Connection cnx = null;        
    private Usuario_Servicios servicios = new Usuario_Servicios();
    Usuario usuario;
    public Menu() {
         initComponents();
         this.jLabel3.setVisible(false);
         this.jLabel1.setVisible(false);
         this.jLabel4.setVisible(false);
         this.jtxtcontraseña.setVisible(false);
         this.jtxtusuario.setVisible(false);
         this.btnAceptar.setVisible(false);          
         this.jbtcancelar.setVisible(false);     
       
         
        setLocationRelativeTo(null);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jbtcancelar = new javax.swing.JButton();
        jtxtusuario = new javax.swing.JTextField();
        jtxtcontraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMiniciarsesion = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        JMenusalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setForeground(new java.awt.Color(102, 51, 255));
        setSize(new java.awt.Dimension(800, 800));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("INICIO DE SESIÓN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 230, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("CONTRASEÑA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 100, -1));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jbtcancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
        jbtcancelar.setText("CANCELAR");
        jbtcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));
        getContentPane().add(jtxtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 170, -1));
        getContentPane().add(jtxtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 170, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 430));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        jMenu1.setText("ARCHIVO");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        JMiniciarsesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMiniciarsesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JMiniciarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/connect.png"))); // NOI18N
        JMiniciarsesion.setText("INICIAR SESIÒN");
        JMiniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMiniciarsesionActionPerformed(evt);
            }
        });
        jMenu1.add(JMiniciarsesion);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disconnect.png"))); // NOI18N
        jMenuItem4.setText("CERRAR SESIÒN");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        JMenusalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        JMenusalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JMenusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/door_in.png"))); // NOI18N
        JMenusalir.setText("SALIR APLICACIÒN");
        JMenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenusalirActionPerformed(evt);
            }
        });
        jMenu1.add(JMenusalir);

        MenuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group.png"))); // NOI18N
        jMenu2.setText("CLIENTES");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group_add.png"))); // NOI18N
        jMenuItem3.setText("NUEVO CLIENTE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrar cliente.png"))); // NOI18N
        jMenuItem1.setText("MODIFICAR CLIENTE");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarcliente.png"))); // NOI18N
        jMenuItem10.setText("ELIMINAR CLIENTE");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        MenuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        jMenu3.setText("PRESTAMOS");
        jMenu3.setEnabled(false);
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamo.png"))); // NOI18N
        jMenu7.setText("PRÉSTAMO");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo prestamo.png"))); // NOI18N
        jMenuItem5.setText("NUEVO PRÉSTAMO");
        jMenuItem5.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jMenuItem5ComponentAdded(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrator (2).png"))); // NOI18N
        jMenuItem6.setText("MODIFICAR PRÉSTAMO");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarprestamo.png"))); // NOI18N
        jMenuItem12.setText("ELIMINAR PRÉSTAMO");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenu3.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/detalle.png"))); // NOI18N
        jMenu8.setText("DETALLE DEL PRÉSTAMO");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevodetalle.png"))); // NOI18N
        jMenuItem15.setText("NUEVO DETALLE PRÉSTAMO");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificardetalle.png"))); // NOI18N
        jMenuItem16.setText("MODIFICAR DETALLE PRÉSTAMO");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminardetalle.png"))); // NOI18N
        jMenuItem17.setText("ELIMINAR DETALLE PRÉSTAMO");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenu3.add(jMenu8);

        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amortizacion.png"))); // NOI18N
        jMenuItem18.setText("AMORTIZACIÓN PRÉSTAMO");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        MenuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenu4.setText("REPORTES");
        jMenu4.setEnabled(false);
        jMenu4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar cliente.png"))); // NOI18N
        jMenuItem7.setText("LISTAR CLIENTES");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar prestamo (2).png"))); // NOI18N
        jMenuItem8.setText("LISTAR PRESTAMOS");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadetalle.png"))); // NOI18N
        jMenuItem11.setText("LISTAR DETALLE PRESTAMOS");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        MenuBar.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrar.png"))); // NOI18N
        jMenu6.setText("ADMINISTRAR");
        jMenu6.setEnabled(false);
        jMenu6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group_add.png"))); // NOI18N
        jMenuItem2.setText("REGISTRO USUARIO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarusuario.png"))); // NOI18N
        jMenuItem13.setText("MODIFICAR USUARIO");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarusuario.png"))); // NOI18N
        jMenuItem14.setText("ELIMINAR USUARIO");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        MenuBar.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        jMenu5.setText("AYUDA");
        jMenu5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acerca de.png"))); // NOI18N
        jMenuItem9.setText("ACERCA DE");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        MenuBar.add(jMenu5);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenusalirActionPerformed
        // TODO add your handling code here
         int slir = JOptionPane.showConfirmDialog(this, "REALMENTE DESEA CERRAR LA APLICACION","CERRANDO APLICACION",0,3);
        if(slir==JOptionPane.OK_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_JMenusalirActionPerformed

    private void JMiniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMiniciarsesionActionPerformed
 
          this.jLabel3.setVisible(true);
          this.jLabel1.setVisible(true);
          this.jLabel4.setVisible(true);
          this.jtxtcontraseña.setVisible(true);
          this.jtxtusuario.setVisible(true);
          this.btnAceptar.setVisible(true);
          this.jbtcancelar.setVisible(true);
         
         
    }//GEN-LAST:event_JMiniciarsesionActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Menu m=new Menu();
    m.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Cliente_Insertar cli = new Cliente_Insertar();       
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
          
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Modifcar_Prestamo p = new Modifcar_Prestamo();       
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JOptionPane.showMessageDialog(this,
                                "          ''UNIVERSIDAD NACIONAL DE CHIMBORAZO''" +
                             //   "\n                                              "+
                                "\n                        FACULTAD DE INGENIERIA "+
                               // "\n                                              "+
                                "\n               ESCUELA DE SISTEMAS Y COMPUTACIÓN"+
                                         "\n                                              "+
                                "\n                   '' PROYECTO DE PROGRAMACIÓN ''"+
                                        "\n                                              "+
                                "\n   INTEGRANTES:"+
                                          "\n                                              "+
                                "\n THALIA VELOZ"+
                                "\n DANNY CACERES"+
                                "\n ANDRES CAINA"+
                                "\n JULIO SANAGUANO"+
                                        "\n                                              "+
                                        "\n                                              "+
                                " TUTORA:"+
                                        "ING. MARGARITA AUCANCELA", 
                                "ACERCA DE...",
                                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Listar_Clientes cli = new Listar_Clientes();       
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Listar_Prestamos cli = new Listar_Prestamos();       
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Listar_DetallePrestamo cli = new Listar_DetallePrestamo();       
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuItem5ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ComponentAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cliente_Modificar cli = new Cliente_Modificar();       
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Cliente_Eliminar cli = new Cliente_Eliminar();       
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Nuevo_Prestamo p = new Nuevo_Prestamo();       
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Eliminar_Prestamo p = new Eliminar_Prestamo();       
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Nuevo_DetallePrestamo d = new Nuevo_DetallePrestamo();       
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        Modificar_DetallePrestamo d = new Modificar_DetallePrestamo();       
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        Eliminar_DetallePrestamo d = new Eliminar_DetallePrestamo();       
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Modificar_Usuario u = new Modificar_Usuario();       
        u.setVisible(true);
        u.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Eliminar_Usuario u = new Eliminar_Usuario();       
        u.setVisible(true);
        u.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        try{

            cnx = Conexion.obtener();
            usuario=null;
            if (cnx!=  null)
            {

                this.usuario = this.servicios.InicioSesion(Conexion.obtener(),jtxtusuario.getText(),jtxtcontraseña.getText());

                if (this.usuario != null)
                {
                    
                    JOptionPane.showMessageDialog(this, "Inicio de Sesión correcto ");
                       
                       this.jMenu2.getModel().setEnabled(true);
                       this.jMenu3.getModel().setEnabled(true);
                       this.jMenu4.getModel().setEnabled(true);
                       this.jMenu6.getModel().setEnabled(true);
                       this.jMenuItem4.getModel().setEnabled(true);
                       this.jLabel3.setVisible(false);
                       this.jLabel1.setVisible(false);
                       this.jLabel4.setVisible(false);
                       this.jtxtcontraseña.setVisible(false);
                       this.jtxtusuario.setVisible(false);
                       this.btnAceptar.setVisible(false);
                       this.jbtcancelar.setVisible(false);
                   
                    
                }
                else
                {
                    
                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos ");
                    
                }
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error ");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Ha surgido un error ");
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jbtcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancelarActionPerformed
        System.gc();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtcancelarActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Registro_Usuario sesion=new Registro_Usuario();
        sesion.setVisible(true);
        sesion.setLocationRelativeTo(null);
        //this.jMenuItem2.getModel().setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        Amortizacion sesion=new Amortizacion();
        sesion.setVisible(true);
        sesion.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenusalir;
    private javax.swing.JMenuItem JMiniciarsesion;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JButton jbtcancelar;
    private javax.swing.JPasswordField jtxtcontraseña;
    private javax.swing.JTextField jtxtusuario;
    // End of variables declaration//GEN-END:variables
}
