package calculadora;
//PAQUETES UTILES A LA INTERFAZ
import com.sun.javafx.geom.AreaOp;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.util.*;

public class FManual extends javax.swing.JFrame {
    //VARIABLES GLOBALES
    public static double suma = 0;
    public static int conteo=0;
    public static int arreglo[],valor=0;
    int i=0; 
    public static int cant_numeros;
    public static double media,mediana,rango,varianza,desviacionEstandar; 
//CONSTRUCTOR INTERFAZ, PARAMETROS Y DISEÑO
    public FManual() {
        initComponents();
        setSize(560, 300);
        setResizable(false);
        setTitle("Entrada Manual");
        setLocationRelativeTo(null);
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper.jpg");
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lb_Wallpaper.getWidth(), lb_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lb_Wallpaper.setIcon(icono);
        this.repaint();
        tf_Cantidad.requestFocusInWindow();
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

        lb_Titulo = new javax.swing.JLabel();
        tf_Cantidad = new javax.swing.JTextField();
        lb_Repeticion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_Continuar = new javax.swing.JButton();
        lb_Titulo1 = new javax.swing.JLabel();
        bt_Validar = new javax.swing.JButton();
        bt_Menu = new javax.swing.JButton();
        tf_NumRepeticion = new javax.swing.JTextField();
        lb_Cantidad1 = new javax.swing.JLabel();
        bt_Ingreso = new javax.swing.JButton();
        tf_Valor = new javax.swing.JTextField();
        lb_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_Titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_Titulo.setForeground(new java.awt.Color(255, 255, 153));
        lb_Titulo.setText("PARAMETROS ESTADISTICOS");
        getContentPane().add(lb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        tf_Cantidad.setBackground(new java.awt.Color(255, 255, 204));
        tf_Cantidad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tf_Cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Cantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CantidadActionPerformed(evt);
            }
        });
        getContentPane().add(tf_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 60, 25));

        lb_Repeticion.setBackground(new java.awt.Color(51, 51, 255));
        lb_Repeticion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_Repeticion.setForeground(new java.awt.Color(255, 255, 255));
        lb_Repeticion.setText("INDICE:");
        lb_Repeticion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lb_Repeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VALOR:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        bt_Continuar.setBackground(new java.awt.Color(255, 204, 153));
        bt_Continuar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Continuar.setText("Continuar Proceso");
        bt_Continuar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        bt_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 25));

        lb_Titulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_Titulo1.setForeground(new java.awt.Color(255, 255, 153));
        lb_Titulo1.setText("ENTRADA MANUAL");
        getContentPane().add(lb_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        bt_Validar.setBackground(new java.awt.Color(255, 204, 204));
        bt_Validar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_Validar.setText("Aceptar Valor");
        bt_Validar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 255, 255)));
        bt_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ValidarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        bt_Menu.setBackground(new java.awt.Color(255, 153, 153));
        bt_Menu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Menu.setText("MENU");
        bt_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        tf_NumRepeticion.setEditable(false);
        tf_NumRepeticion.setBackground(new java.awt.Color(204, 255, 204));
        tf_NumRepeticion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf_NumRepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_NumRepeticion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_NumRepeticion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(tf_NumRepeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 60, -1));

        lb_Cantidad1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_Cantidad1.setForeground(new java.awt.Color(153, 255, 153));
        lb_Cantidad1.setText("INGRESE LA CANTIDAD DE NUMEROS QUE HABRA(MAXIMO 100):");
        getContentPane().add(lb_Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        bt_Ingreso.setBackground(new java.awt.Color(255, 102, 102));
        bt_Ingreso.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_Ingreso.setText("Agregar");
        bt_Ingreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IngresoActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, 30));

        tf_Valor.setBackground(new java.awt.Color(204, 255, 204));
        tf_Valor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf_Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tf_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 60, -1));
        getContentPane().add(lb_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//INGRESO CANTIDAD DE NUMEROS Y BLOQUEO DE BOTONES Y CASILLAS
    private void bt_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ValidarActionPerformed
    cant_numeros = Integer.parseInt(tf_Cantidad.getText());
    tf_Cantidad.setEnabled(false);
    tf_Valor.setEnabled(true);
    tf_Valor.requestFocusInWindow();
    bt_Continuar.setEnabled(false);
    bt_Validar.setEnabled(false);
    arreglo= new int[cant_numeros];
    }//GEN-LAST:event_bt_ValidarActionPerformed
//VINCULO INTERFAZ MENU
    private void bt_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MenuActionPerformed
   FMenu interfazMenu = new FMenu();
   interfazMenu.setVisible(true);
   dispose();   
    }//GEN-LAST:event_bt_MenuActionPerformed

//BOTON CONTINUAR, LLAMADOS FUNCIONES Y OPERACIONES    
    private void bt_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ContinuarActionPerformed
       FResultadosManuales interfazManuales = new FResultadosManuales();
       interfazManuales.setVisible(true);
       dispose();
       Media();
       Mediana();
       Rango();
       Varianza();
       DesviacionEstandar();       
    }//GEN-LAST:event_bt_ContinuarActionPerformed
//INGRESO NUMEROS EN ARREGLO
    private void bt_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IngresoActionPerformed
           if(arreglo[i]<cant_numeros){
           tf_NumRepeticion.setText(Integer.toString(i+1));
           valor=Integer.parseInt(tf_Valor.getText());    
           arreglo[i]=valor;
           suma+=arreglo[i];
           tf_Valor.setText(""); 
           tf_Valor.requestFocusInWindow();
           i++;
           }
           if(i==cant_numeros){  //COMPARACION PARA AVANCE EN EL PROGRAMA
             JOptionPane.showMessageDialog(null, "Proceso Finalizado, Click en 'Continuar Proceso'");
             tf_Valor.setEnabled(false);
             tf_NumRepeticion.setText("");
             bt_Continuar.setEnabled(true);
           }
    }//GEN-LAST:event_bt_IngresoActionPerformed

    private void tf_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CantidadActionPerformed

    public static void main(String args[]) {
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FManual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Continuar;
    private javax.swing.JButton bt_Ingreso;
    private javax.swing.JButton bt_Menu;
    private javax.swing.JButton bt_Validar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_Cantidad1;
    private javax.swing.JLabel lb_Repeticion;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lb_Titulo1;
    private javax.swing.JLabel lb_Wallpaper;
    private javax.swing.JTextField tf_Cantidad;
    private javax.swing.JTextField tf_NumRepeticion;
    private javax.swing.JTextField tf_Valor;
    // End of variables declaration//GEN-END:variables
//OBTENCION MEDIA
 public void Media() {
    media = suma/cant_numeros; 
}
//OBTENCION MEDIANA
public void Mediana() {     
   int arregloMediana[];
    arregloMediana = arreglo;
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
public void Rango(){ //Rango Verificar Valor Minimo, solo devuelve el maximo
     int arreglorango[];
    arreglorango = arreglo;
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
    arreglovarianza=arreglo;
    for (i=0;i<cant_numeros;i++){
        sumatoria = Math.pow(arreglovarianza[i] - media,2);
        varianza = varianza+sumatoria;
    }
    varianza = varianza/(cant_numeros-1);
}
//OBTENCION DESVIACION ESTANDAR
public void DesviacionEstandar(){
    desviacionEstandar = Math.sqrt(varianza);
    double redondeo = Math.rint(desviacionEstandar*100)/100;
    desviacionEstandar = redondeo;
}
}
