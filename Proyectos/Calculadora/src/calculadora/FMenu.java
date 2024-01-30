package calculadora;

import com.sun.xml.internal.ws.api.message.Message;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class FMenu extends javax.swing.JFrame {

    public FMenu() {
        initComponents();
        setSize(350, 300);
        setResizable(false);
        setTitle("Menu Principal");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);        
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); 
    }
    
     @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));
    return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Manual = new javax.swing.JButton();
        bt_Automatica = new javax.swing.JButton();
        lb_Subtitulo = new javax.swing.JLabel();
        bt_Salir = new javax.swing.JButton();
        lb_Titulo = new javax.swing.JLabel();
        bt_Creditos = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_Manual.setBackground(new java.awt.Color(255, 255, 153));
        bt_Manual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Manual.setText("ENTRADA MANUAL");
        bt_Manual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ManualActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 100, 200, 25));

        bt_Automatica.setBackground(new java.awt.Color(255, 255, 153));
        bt_Automatica.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Automatica.setText("ENTRADA AUTOMATICA");
        bt_Automatica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Automatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AutomaticaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Automatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 130, 200, 25));

        lb_Subtitulo.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        lb_Subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_Subtitulo.setText("Por favor eliga una opcion");
        getContentPane().add(lb_Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        bt_Salir.setBackground(new java.awt.Color(255, 255, 153));
        bt_Salir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Salir.setText("SALIR");
        bt_Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 50, 25));

        lb_Titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_Titulo.setText("Calculadora Aritmetica");
        getContentPane().add(lb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 10, 200, -1));

        bt_Creditos.setBackground(new java.awt.Color(153, 255, 153));
        bt_Creditos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Creditos.setText("Creditos");
        bt_Creditos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 51, 51)));
        bt_Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CreditosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 20));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ManualActionPerformed
   FManual interfazManual = new FManual();
   interfazManual.setVisible(true);
   dispose();
    }//GEN-LAST:event_bt_ManualActionPerformed

    private void bt_AutomaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AutomaticaActionPerformed
    FAutomatico interfazAuto = new FAutomatico();
    interfazAuto.setVisible(true);
    dispose();
    }//GEN-LAST:event_bt_AutomaticaActionPerformed

    private void bt_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalirActionPerformed
    JOptionPane.showMessageDialog(null, "\"Gracias por usar nuestra calculadora\"");
    dispose();
    }//GEN-LAST:event_bt_SalirActionPerformed

    private void bt_CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CreditosActionPerformed
    FPortada portada = new FPortada();
    portada.setVisible(true);
    dispose();
    }//GEN-LAST:event_bt_CreditosActionPerformed

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
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Automatica;
    private javax.swing.JButton bt_Creditos;
    private javax.swing.JButton bt_Manual;
    private javax.swing.JButton bt_Salir;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel lb_Subtitulo;
    private javax.swing.JLabel lb_Titulo;
    // End of variables declaration//GEN-END:variables
}
