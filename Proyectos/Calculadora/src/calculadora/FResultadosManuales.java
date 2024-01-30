package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class FResultadosManuales extends javax.swing.JFrame {
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FResultadosManuales() {
        initComponents();
        setSize(600, 300);
        setResizable(false);
        setTitle("Resultado Operaciones Con Numeros Manuales");
        setLocationRelativeTo(null);
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper.jpg");
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

        bt_Resultados = new javax.swing.JButton();
        bt_Menu = new javax.swing.JButton();
        bt_Datos = new javax.swing.JButton();
        ta_Resultados = new javax.swing.JScrollPane();
        ta_DatosM = new javax.swing.JTextArea();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_Resultados.setBackground(new java.awt.Color(153, 255, 153));
        bt_Resultados.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Resultados.setText("Mostrar Resultados");
        bt_Resultados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ResultadosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        bt_Menu.setBackground(new java.awt.Color(153, 255, 153));
        bt_Menu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Menu.setText("MENU");
        bt_Menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        bt_Datos.setBackground(new java.awt.Color(153, 255, 153));
        bt_Datos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Datos.setText("Mostrar Datos");
        bt_Datos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DatosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        ta_DatosM.setEditable(false);
        ta_DatosM.setColumns(20);
        ta_DatosM.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        ta_DatosM.setRows(5);
        ta_Resultados.setViewportView(ta_DatosM);

        getContentPane().add(ta_Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 220));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//VINCULO INTERFAZ DATOS MANUALES
    private void bt_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DatosActionPerformed
      FNumerosGeneradosManualmente interfazManual = new FNumerosGeneradosManualmente();
      interfazManual.setVisible(true);
      dispose();
    }//GEN-LAST:event_bt_DatosActionPerformed
//VINCULO INTERFAZ MENU
    private void bt_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MenuActionPerformed
      FMenu interfazMenu = new FMenu();
      interfazMenu.setVisible(true);
      dispose();
    }//GEN-LAST:event_bt_MenuActionPerformed
//LLENADO DE DATOS
    private void bt_ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResultadosActionPerformed
    String me =  Double.toString(FManual.media);
    String medi = Double.toString(FManual.mediana);
    String ran = Double.toString(FManual.rango);
    String var = Double.toString(FManual.varianza);
    String des = Double.toString(FManual.desviacionEstandar);
    ta_DatosM.append("La Media Es:"+me+"\n\n");
    ta_DatosM.append("La Mediana Es:"+medi+"\n\n");
    ta_DatosM.append("El Rango Es:"+ran+"\n\n");
    ta_DatosM.append("La Varianza Es:"+var+"\n\n");
    ta_DatosM.append("La Desviacion Estandar Es:"+des+"\n\n");
    }//GEN-LAST:event_bt_ResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(FResultadosManuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FResultadosManuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FResultadosManuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FResultadosManuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FResultadosManuales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Datos;
    private javax.swing.JButton bt_Menu;
    private javax.swing.JButton bt_Resultados;
    private javax.swing.JLabel lb_Wallpaper;
    private javax.swing.JTextArea ta_DatosM;
    private javax.swing.JScrollPane ta_Resultados;
    // End of variables declaration//GEN-END:variables
}
