package craps;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class FCraps extends javax.swing.JFrame {
    public static int contador =0;

    public FCraps() {
        initComponents();
        setSize(670, 370);
        setResizable(false);
        setTitle("Menu Principal");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);        
        ImageIcon wallpaper = new ImageIcon("src/images/Fondo1.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lb_Wallpaper.getWidth(), lb_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lb_Wallpaper.setIcon(icono);
        this.repaint(); 
        if(contador==0){
           bt_FinR.setEnabled(false);   
        }
        else{
           bt_FinR.setEnabled(true);
        }
        bt_Limpiar.setEnabled(false);
    }

    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono.jpg"));
    return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabla = new javax.swing.JScrollPane();
        ta_Datos = new javax.swing.JTextArea();
        bt_Reglas = new javax.swing.JButton();
        bt_Terminar = new javax.swing.JButton();
        bt_FinR = new javax.swing.JButton();
        bt_TirarD = new javax.swing.JButton();
        bt_Portada = new javax.swing.JButton();
        bt_Limpiar = new javax.swing.JButton();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_Datos.setEditable(false);
        ta_Datos.setColumns(20);
        ta_Datos.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        ta_Datos.setLineWrap(true);
        ta_Datos.setRows(5);
        Tabla.setViewportView(ta_Datos);

        getContentPane().add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 230));

        bt_Reglas.setBackground(new java.awt.Color(255, 102, 102));
        bt_Reglas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Reglas.setText("Reglas");
        bt_Reglas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Reglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReglasActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Reglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 70, -1));

        bt_Terminar.setBackground(new java.awt.Color(255, 102, 102));
        bt_Terminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Terminar.setText("Terminar");
        bt_Terminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TerminarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Terminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 90, -1));

        bt_FinR.setBackground(new java.awt.Color(255, 102, 102));
        bt_FinR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_FinR.setText("Fin De Ronda");
        bt_FinR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_FinR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FinRActionPerformed(evt);
            }
        });
        getContentPane().add(bt_FinR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 100, -1));

        bt_TirarD.setBackground(new java.awt.Color(255, 102, 102));
        bt_TirarD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_TirarD.setText("Tirar Dados");
        bt_TirarD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_TirarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TirarDActionPerformed(evt);
            }
        });
        getContentPane().add(bt_TirarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, -1));

        bt_Portada.setBackground(new java.awt.Color(255, 102, 102));
        bt_Portada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Portada.setText("Portada");
        bt_Portada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Portada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PortadaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 90, 20));

        bt_Limpiar.setBackground(new java.awt.Color(255, 102, 102));
        bt_Limpiar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Limpiar.setText("Limpiar Pantalla");
        bt_Limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 120, 20));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReglasActionPerformed
    bt_Limpiar.setEnabled(true);
    bt_Portada.setEnabled(false);
    bt_FinR.setEnabled(false);
    bt_TirarD.setEnabled(false);
    bt_Terminar.setEnabled(false);
    bt_Reglas.setEnabled(false);
    ta_Datos.setText("");
    ta_Datos.append("Un jugador tira dos dados. Cada dado tiene seis caras, las cuales \n" +
                    "contienen uno, dos, tres cuatro, cinco y seis puntos, respectivamente\n" +
                    "Una vez que los dados dejan de moverse, se calcula la suma \n" +
                    "de los puntos en las dos caras superiores: \n" +
                    "-Si la suma es 7 u 11 en el primer tiro, el jugador gana. \n" +
                    "-Si la suma es 2, 3 ó 12 en el primer tiro, el jugador pierde. \n" +
                    "-Si la suma es 4, 5, 6, 8, 9 ó 10 en el primer tiro, esta suma se \n" +
                    "convierte en el “punto” del jugador.\n" +
                    "Para ganar, el jugador debe seguir tirando los dados hasta que salga\n" +
                    "otra vez “su punto” (es decir, que tire ese mismo valor de punto). \n" +
                    "El jugador pierde si tira un 7 antes de llegar a su punto");
    }//GEN-LAST:event_bt_ReglasActionPerformed

    private void bt_TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TerminarActionPerformed
    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
    dispose();
    System.exit(0);
    }//GEN-LAST:event_bt_TerminarActionPerformed

    private void bt_FinRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FinRActionPerformed
    ta_Datos.setText("");
    bt_TirarD.setEnabled(false);
    Craps2 juego = new Craps2();
    juego.resultados();
    bt_Limpiar.setEnabled(true);
    }//GEN-LAST:event_bt_FinRActionPerformed

    private void bt_TirarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TirarDActionPerformed
    bt_Limpiar.setEnabled(false);
    contador++;
    if(contador>=1){
        bt_FinR.setEnabled(true);
        }
    Craps2 juego = new Craps2();
    juego.jugar();
    }//GEN-LAST:event_bt_TirarDActionPerformed

    private void bt_PortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PortadaActionPerformed
    FPortada frame = new FPortada();
    frame.setVisible(true);
    dispose();
    }//GEN-LAST:event_bt_PortadaActionPerformed

    private void bt_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LimpiarActionPerformed
    ta_Datos.setText("");
    bt_Portada.setEnabled(true);
    bt_TirarD.setEnabled(true);
    bt_Terminar.setEnabled(true);
    bt_Reglas.setEnabled(true);
    bt_Limpiar.setEnabled(false);
    bt_FinR.setEnabled(true);
    }//GEN-LAST:event_bt_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FCraps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCraps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCraps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCraps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCraps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JButton bt_FinR;
    private javax.swing.JButton bt_Limpiar;
    private javax.swing.JButton bt_Portada;
    private javax.swing.JButton bt_Reglas;
    private javax.swing.JButton bt_Terminar;
    private javax.swing.JButton bt_TirarD;
    private javax.swing.JLabel lb_Wallpaper;
    public static javax.swing.JTextArea ta_Datos;
    // End of variables declaration//GEN-END:variables
}
