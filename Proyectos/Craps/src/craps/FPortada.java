package craps;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class FPortada extends javax.swing.JFrame {

    public FPortada() {
    initComponents();
    setSize(500,600);
    setResizable(false);
    setTitle("Portada Creadores");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);        
    ImageIcon wallpaper = new ImageIcon("src/images/Fondo1.jpg");
    Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lb_Wallpaper.getWidth(), lb_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
    lb_Wallpaper.setIcon(icono);
    ImageIcon portada = new ImageIcon("src/images/Portada.jpg");
    Icon icono2 = new ImageIcon(portada.getImage().getScaledInstance(lb_Portada.getWidth(), lb_Portada.getHeight(), Image.SCALE_DEFAULT));
    lb_Portada.setIcon(icono2);
    this.repaint(); 
    }
    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.jpg"));
    return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Regresar = new javax.swing.JButton();
        lb_Portada = new javax.swing.JLabel();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_Regresar.setBackground(new java.awt.Color(255, 153, 153));
        bt_Regresar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Regresar.setText("CONTINUAR");
        bt_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));
        getContentPane().add(lb_Portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 400));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RegresarActionPerformed
    FCraps craps = new FCraps();
    craps.setVisible(true);
    dispose();
    }//GEN-LAST:event_bt_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPortada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Regresar;
    private javax.swing.JLabel lb_Portada;
    private javax.swing.JLabel lb_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
