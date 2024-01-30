package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FResultadosaAleatorios extends javax.swing.JFrame {
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FResultadosaAleatorios() {
        initComponents();
        setSize(600, 300);
        setResizable(false);
        setTitle("Resultado Operaciones Con Numeros Aleatorios");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_DatosA = new javax.swing.JTextArea();
        bt_Resultados = new javax.swing.JButton();
        bt_Menu = new javax.swing.JButton();
        bt_Datos = new javax.swing.JButton();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_DatosA.setEditable(false);
        ta_DatosA.setColumns(20);
        ta_DatosA.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        ta_DatosA.setRows(5);
        ta_DatosA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(ta_DatosA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 560, 210));

        bt_Resultados.setBackground(new java.awt.Color(204, 255, 204));
        bt_Resultados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Resultados.setText("Mostrar Resultados");
        bt_Resultados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ResultadosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        bt_Menu.setBackground(new java.awt.Color(204, 255, 204));
        bt_Menu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Menu.setText("Menu");
        bt_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        bt_Datos.setBackground(new java.awt.Color(204, 255, 204));
        bt_Datos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Datos.setText("Mostrar Datos");
        bt_Datos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DatosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//VINCULO A INTERFAZ MENU
    private void bt_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MenuActionPerformed
   FMenu interfazMenu = new FMenu();
   interfazMenu.setVisible(true);
   dispose();  
    }//GEN-LAST:event_bt_MenuActionPerformed
//VINCULO A INTERFAZ ANTERIOR
    private void bt_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DatosActionPerformed
       FNumerosGeneradosAleatoriamente interfazAleatorio = new FNumerosGeneradosAleatoriamente();
       interfazAleatorio.setVisible(true);
       dispose();
    }//GEN-LAST:event_bt_DatosActionPerformed
//LLENADO RESULTADOS
    private void bt_ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResultadosActionPerformed
    String me =  Double.toString(FAutomatico.media);
    String medi = Double.toString(FAutomatico.mediana);
    String ran = Double.toString(FAutomatico.rango);
    String var = Double.toString(FAutomatico.varianza);
    String des = Double.toString(FAutomatico.desviacionEstandar);
    ta_DatosA.append("La Media Es:"+me+"\n\n");
    ta_DatosA.append("La Mediana Es:"+medi+"\n\n");
    ta_DatosA.append("El Rango Es:"+ran+"\n\n");
    ta_DatosA.append("La Varianza Es:"+var+"\n\n");
    ta_DatosA.append("La Desviacion Estandar Es:"+des+"\n\n");
    }//GEN-LAST:event_bt_ResultadosActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FResultadosaAleatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Datos;
    private javax.swing.JButton bt_Menu;
    private javax.swing.JButton bt_Resultados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Wallpaper;
    private javax.swing.JTextArea ta_DatosA;
    // End of variables declaration//GEN-END:variables
}
