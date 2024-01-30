
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Estadistico extends javax.swing.JFrame {


    public Estadistico() {
        
        initComponents();
        setSize(500,350);
        setResizable(false);
        setTitle("Acceso al Sistema");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper5.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();      
        
     }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntradaManual = new javax.swing.JButton();
        EntradaAutomatica = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EntradaManual.setBackground(new java.awt.Color(255, 153, 153));
        EntradaManual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EntradaManual.setText("ENTRADA MANUAL");
        EntradaManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaManualActionPerformed(evt);
            }
        });
        getContentPane().add(EntradaManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        EntradaAutomatica.setBackground(new java.awt.Color(255, 153, 153));
        EntradaAutomatica.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EntradaAutomatica.setText("ENTRADA AUTOMATICA");
        EntradaAutomatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaAutomaticaActionPerformed(evt);
            }
        });
        getContentPane().add(EntradaAutomatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        Salir.setBackground(new java.awt.Color(255, 153, 153));
        Salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("PROGRAMA ESTADISTICO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaManualActionPerformed
              EntradaManual entradaManual = new EntradaManual();
         entradaManual.setVisible(true);
      
    }//GEN-LAST:event_EntradaManualActionPerformed

    private void EntradaAutomaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaAutomaticaActionPerformed
      EntradaAutomatica entradaAuto = new EntradaAutomatica();
         entradaAuto.setVisible(true);
    }//GEN-LAST:event_EntradaAutomaticaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadistico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntradaAutomatica;
    private javax.swing.JButton EntradaManual;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
