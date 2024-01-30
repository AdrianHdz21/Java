package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class FNumerosGeneradosAleatoriamente extends javax.swing.JFrame {
//VARIABLES GLOBALES
int arregloNumerosAleatorios[];
int cant_numeros;
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FNumerosGeneradosAleatoriamente() {
        initComponents();
        setSize(600, 350);
        setResizable(false);
        setTitle("Numeros Generados Aleatoriamente");
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
        ta_Numeros = new javax.swing.JTextArea();
        bt_Resultados = new javax.swing.JButton();
        bt_Datos = new javax.swing.JButton();
        bt_Menu = new javax.swing.JButton();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ta_Numeros.setEditable(false);
        ta_Numeros.setColumns(10);
        ta_Numeros.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        ta_Numeros.setLineWrap(true);
        ta_Numeros.setRows(9);
        ta_Numeros.setTabSize(10);
        ta_Numeros.setAutoscrolls(false);
        ta_Numeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ta_Numeros.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ta_Numeros.setMaximumSize(new java.awt.Dimension(10, 10));
        ta_Numeros.setMinimumSize(new java.awt.Dimension(1, 1));
        jScrollPane2.setViewportView(ta_Numeros);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 240));

        bt_Resultados.setBackground(new java.awt.Color(255, 153, 204));
        bt_Resultados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Resultados.setText("Mostrar Resultados");
        bt_Resultados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ResultadosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        bt_Datos.setBackground(new java.awt.Color(255, 153, 204));
        bt_Datos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Datos.setText("Mostrar Datos");
        bt_Datos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DatosActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        bt_Menu.setBackground(new java.awt.Color(255, 153, 204));
        bt_Menu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Menu.setText("Menu");
        bt_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//VINCULO INTERFAZ MENU
    private void bt_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MenuActionPerformed
   FMenu interfazMenu = new FMenu();
   interfazMenu.setVisible(true);
   dispose(); 
    }//GEN-LAST:event_bt_MenuActionPerformed
//LLENADO DATOS
    private void bt_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DatosActionPerformed
    String datos=""; 
       for (int i=0;i<FAutomatico.cant_numeros;i++){
       datos = Integer.toString(FAutomatico.arregloNumerosAleatorios[i]);         
       ta_Numeros.append(datos+"\t");     
       }       
    }//GEN-LAST:event_bt_DatosActionPerformed
//VINCULO A SIGUIENTE INTERFAZ RESULTADOS
    private void bt_ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResultadosActionPerformed
   FResultadosaAleatorios interfazResultados = new FResultadosaAleatorios();
   interfazResultados.setVisible(true);
   dispose();
    }//GEN-LAST:event_bt_ResultadosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FNumerosGeneradosAleatoriamente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Datos;
    private javax.swing.JButton bt_Menu;
    private javax.swing.JButton bt_Resultados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_Wallpaper;
    private javax.swing.JTextArea ta_Numeros;
    // End of variables declaration//GEN-END:variables
}
