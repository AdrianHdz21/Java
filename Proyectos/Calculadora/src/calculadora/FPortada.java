package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class FPortada extends javax.swing.JFrame {
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FPortada() {
        initComponents();
        setSize(500, 550);
        setResizable(false);
        setTitle("Entrada Manual");
        setLocationRelativeTo(null);
        ImageIcon wallpaper = new ImageIcon("src/images/Portada.PNG");
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lb_Wallpaper.getWidth(), lb_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lb_Wallpaper.setIcon(icono);
        this.repaint();
    }
//METODO COLOCACION ICONO    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.png"));
        return retValue;
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Continuar = new javax.swing.JButton();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_Continuar.setBackground(new java.awt.Color(255, 153, 153));
        bt_Continuar.setFont(new java.awt.Font("Tw Cen MT", 3, 12)); // NOI18N
        bt_Continuar.setText("REGRESAR");
        bt_Continuar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 204)));
        bt_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, 30));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//VINCULO INTERFAZ MENU
    private void bt_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ContinuarActionPerformed
        FMenu menu = new FMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_ContinuarActionPerformed
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
    private javax.swing.JButton bt_Continuar;
    private javax.swing.JLabel lb_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
