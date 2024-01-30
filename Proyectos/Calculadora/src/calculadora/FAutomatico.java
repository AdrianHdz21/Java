package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FAutomatico extends javax.swing.JFrame {
   //VARIABLES GLOBALES
    double suma = 0;
    int conteo=0,i=0;
    public static int cant_numeros=0;
    public static double media,mediana,rango,varianza,desviacionEstandar;
    int valorMimino,valorMaximo;
    public static int arregloNumerosAleatorios[];
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FAutomatico() {
    initComponents();
        setSize(600, 300);
        setResizable(false);
        setTitle("Entrada Automatica");
         setLocationRelativeTo(null);
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lb_Wallpaper.getWidth(), lb_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lb_Wallpaper.setIcon(icono);
        this.repaint(); 
        tf_CantidadNum.requestFocusInWindow();
        bt_Continuar.setEnabled(false);
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

        tf_CantidadNum = new javax.swing.JTextField();
        bt_Continuar = new javax.swing.JButton();
        lb_Titulo = new javax.swing.JLabel();
        lb_Titulo1 = new javax.swing.JLabel();
        lb_Cantidad = new javax.swing.JLabel();
        bt_Validar = new javax.swing.JButton();
        lb_Rango = new javax.swing.JLabel();
        lb_Minimo = new javax.swing.JLabel();
        lb_Maximo = new javax.swing.JLabel();
        tf_Maximo = new javax.swing.JTextField();
        tf_Minimo = new javax.swing.JTextField();
        bt_Menu = new javax.swing.JButton();
        lb_Cantidad1 = new javax.swing.JLabel();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_CantidadNum.setBackground(new java.awt.Color(255, 255, 204));
        tf_CantidadNum.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tf_CantidadNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_CantidadNum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(tf_CantidadNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 60, 25));

        bt_Continuar.setBackground(new java.awt.Color(255, 204, 153));
        bt_Continuar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Continuar.setText("Continuar Proceso");
        bt_Continuar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        bt_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 150, 25));

        lb_Titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_Titulo.setForeground(new java.awt.Color(255, 255, 153));
        lb_Titulo.setText("ENTRADA AUTOMATICA");
        getContentPane().add(lb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        lb_Titulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_Titulo1.setForeground(new java.awt.Color(255, 255, 153));
        lb_Titulo1.setText("PARAMETROS ESTADISTICOS");
        getContentPane().add(lb_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        lb_Cantidad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_Cantidad.setForeground(new java.awt.Color(153, 255, 153));
        lb_Cantidad.setText("INGRESE LA CANTIDAD DE NUMEROS QUE HABRA(MAXIMO 100):");
        getContentPane().add(lb_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        bt_Validar.setBackground(new java.awt.Color(255, 204, 204));
        bt_Validar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Validar.setText("Aceptar Valor");
        bt_Validar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 255, 255)));
        bt_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ValidarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        lb_Rango.setBackground(new java.awt.Color(51, 51, 255));
        lb_Rango.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_Rango.setForeground(new java.awt.Color(255, 255, 255));
        lb_Rango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Rango.setText("RANGO:");
        lb_Rango.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lb_Rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        lb_Minimo.setBackground(new java.awt.Color(255, 204, 204));
        lb_Minimo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_Minimo.setForeground(new java.awt.Color(255, 255, 255));
        lb_Minimo.setText("Minimo:");
        lb_Minimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lb_Minimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        lb_Maximo.setBackground(new java.awt.Color(255, 204, 204));
        lb_Maximo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_Maximo.setForeground(new java.awt.Color(255, 255, 255));
        lb_Maximo.setText("Minimo:");
        lb_Maximo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lb_Maximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        tf_Maximo.setBackground(new java.awt.Color(153, 255, 153));
        tf_Maximo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf_Maximo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Maximo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Maximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_MaximoKeyReleased(evt);
            }
        });
        getContentPane().add(tf_Maximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 70, 25));

        tf_Minimo.setBackground(new java.awt.Color(153, 255, 153));
        tf_Minimo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf_Minimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Minimo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Minimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_MinimoKeyReleased(evt);
            }
        });
        getContentPane().add(tf_Minimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 25));

        bt_Menu.setBackground(new java.awt.Color(255, 153, 153));
        bt_Menu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Menu.setText("MENU");
        bt_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        lb_Cantidad1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_Cantidad1.setForeground(new java.awt.Color(255, 51, 51));
        lb_Cantidad1.setText("PRESIONE ENTER PARA INGRESAR NUMERO");
        getContentPane().add(lb_Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//INGRESO CANTIDAD NUMEROS
    private void bt_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ValidarActionPerformed
    tf_Maximo.setEnabled(false);
    tf_Minimo.setEnabled(false);
    cant_numeros = Integer.parseInt(tf_CantidadNum.getText());
    tf_CantidadNum.setEnabled(false);
    bt_Validar.setEnabled(false);
    JOptionPane.showMessageDialog(null, "Ingrese el numero minimo");
    tf_Minimo.setEnabled(true);
    tf_Minimo.requestFocusInWindow();
    }//GEN-LAST:event_bt_ValidarActionPerformed
//BOTON VINCULO INTERFAZ MENU
    private void bt_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MenuActionPerformed
   FMenu interfazMenu = new FMenu();
   interfazMenu.setVisible(true);
   dispose();  
    }//GEN-LAST:event_bt_MenuActionPerformed
//INGRESO VALOR MINIMO
    private void tf_MinimoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_MinimoKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          tf_Maximo.setEnabled(false);
          JOptionPane.showMessageDialog(null, "Ingrese el numero maximo'");
          tf_Maximo.requestFocusInWindow();
          valorMimino=Integer.parseInt(tf_Minimo.getText());
          tf_Minimo.setEnabled(false);
          tf_Maximo.setEnabled(true);          
         }
    }//GEN-LAST:event_tf_MinimoKeyReleased
//INGRESO VALOR MAXIMO
    private void tf_MaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_MaximoKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          tf_Minimo.setEnabled(false);
          JOptionPane.showMessageDialog(null, "Numeros Agregados, Continue el Proceso'");
          valorMaximo=Integer.parseInt(tf_Maximo.getText());
          tf_Maximo.setEnabled(false);
          bt_Continuar.setEnabled(true);
       }
    }//GEN-LAST:event_tf_MaximoKeyReleased
//VINCULO A SIGUIENTE INTERFAZ , CREACION NUMEROS ALEATORIOS
    private void bt_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ContinuarActionPerformed
      arregloNumerosAleatorios = new int [cant_numeros];
      for(int k = 0; k<cant_numeros; k++){
      Random aleatorio = new Random();
      arregloNumerosAleatorios[k] = aleatorio.nextInt(valorMaximo-valorMimino+1)+valorMimino;
      suma+=arregloNumerosAleatorios[k];
      }
      FNumerosGeneradosAleatoriamente interfazNumeros = new FNumerosGeneradosAleatoriamente();
      interfazNumeros.setVisible(true);
      dispose();
      Media();
      Mediana();
      Rango();
      Varianza();
      Desviacion();
    }//GEN-LAST:event_bt_ContinuarActionPerformed
    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAutomatico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Continuar;
    private javax.swing.JButton bt_Menu;
    private javax.swing.JButton bt_Validar;
    private javax.swing.JLabel lb_Cantidad;
    private javax.swing.JLabel lb_Cantidad1;
    private javax.swing.JLabel lb_Maximo;
    private javax.swing.JLabel lb_Minimo;
    private javax.swing.JLabel lb_Rango;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lb_Titulo1;
    private javax.swing.JLabel lb_Wallpaper;
    private javax.swing.JTextField tf_CantidadNum;
    private javax.swing.JTextField tf_Maximo;
    private javax.swing.JTextField tf_Minimo;
    // End of variables declaration//GEN-END:variables
//OBTENCION MEDIA
public void Media(){
        media = suma/cant_numeros;
}
//OBTENCION MEDIANA
public void Mediana(){
    int arregloMediana[];
    arregloMediana = arregloNumerosAleatorios;
    int cantidad;
    cantidad=cant_numeros;
    if(cantidad % 2 == 1){
       mediana = arregloMediana[(cantidad)/2];       
    }
    else{
       double sumaMedios = (arregloMediana[cantidad/2] + arregloMediana[cantidad/2-1] + 0);
       mediana = sumaMedios/2;
    }   
}
//OBTENCION RANGO
public void Rango(){
    int arreglorango[];
    arreglorango = arregloNumerosAleatorios;
    int maximo = arreglorango[0];
    int minimo = arreglorango[0];
    for(i = 0;i<cant_numeros;i++){
        if(maximo<arreglorango[i]){
            maximo=arreglorango[i];
        }
        if(minimo>arreglorango[i]){
            minimo=arreglorango[i];
        }        
    }
    rango = maximo-minimo;
}
//OBTENCION VARIANZA
public void Varianza(){
    double sumatoria;
    int arreglovarianza[];
    arreglovarianza=arregloNumerosAleatorios;
        for (i=0;i<cant_numeros;i++){
            sumatoria = Math.pow(arreglovarianza[i] - media,2);
            varianza = varianza+sumatoria;
        }
        varianza = varianza/(cant_numeros-1);
}
//OBTENCION DESVIACION ESTANDAR
public void Desviacion(){
       desviacionEstandar = Math.sqrt(varianza);
       double redondeo = Math.rint(desviacionEstandar*100)/100;
       desviacionEstandar = redondeo;
}
}
