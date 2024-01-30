package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class FNumerosGeneradosManualmente extends javax.swing.JFrame {
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FNumerosGeneradosManualmente() {
        initComponents();
        setSize(600,300);
        setResizable(false);
        setTitle("Numeros Generados Manualmente");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        ta_NumerosM = new javax.swing.JTextArea();
        bt_Resultados = new javax.swing.JButton();
        bt_Menu = new javax.swing.JButton();
        bt_Datos = new javax.swing.JButton();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ta_NumerosM.setEditable(false);
        ta_NumerosM.setColumns(10);
        ta_NumerosM.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
        ta_NumerosM.setLineWrap(true);
        ta_NumerosM.setRows(10);
        ta_NumerosM.setTabSize(10);
        jScrollPane2.setViewportView(ta_NumerosM);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 210));

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
        getContentPane().add(bt_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        bt_Datos.setBackground(new java.awt.Color(153, 255, 153));
        bt_Datos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Datos.setText("Mostrar Datos");
        bt_Datos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DatosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//LLENADO DATOS
    private void bt_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DatosActionPerformed
  String datos=""; 
     for (int i=0;i<FManual.cant_numeros;i++){
         datos = Integer.toString(FManual.arreglo[i]);         
         ta_NumerosM.append(datos+"\t");     
     }    
    }//GEN-LAST:event_bt_DatosActionPerformed
//VINCULO INTERFAZ RESULTADOS
    private void bt_ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResultadosActionPerformed
        FResultadosManuales interfazResultados = new FResultadosManuales();
        interfazResultados.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_ResultadosActionPerformed
//VINCULO INTERFAZ MENU
    private void bt_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MenuActionPerformed
   FMenu interfazMenu = new FMenu();
   interfazMenu.setVisible(true);
   dispose();
    }//GEN-LAST:event_bt_MenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FNumerosGeneradosManualmente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Datos;
    private javax.swing.JButton bt_Menu;
    private javax.swing.JButton bt_Resultados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_Wallpaper;
    private javax.swing.JTextArea ta_NumerosM;
    // End of variables declaration//GEN-END:variables
}
