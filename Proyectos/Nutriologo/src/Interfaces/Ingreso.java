package Interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import ConexionBD.Conexion;
import javax.swing.JOptionPane;

public class Ingreso extends javax.swing.JFrame {
    public static String user = " ";
public static String pass = " ";
public static String ID = "";


 public Ingreso() {
     
        initComponents();
        setSize(420,550);
        setResizable(false);
        setTitle("Acceso al Sistema");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper5.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();      
        
        ImageIcon wallpaper_logo = new ImageIcon("src/imagenes/Logo.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
 }
 
 @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Ingreso = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JTextField();
        txt_Pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jButton_Ingreso.setBackground(new java.awt.Color(255, 255, 51));
        jButton_Ingreso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Ingreso.setText("ACCEDER");
        jButton_Ingreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 100, -1));

        txt_Usuario.setBackground(new java.awt.Color(102, 102, 255));
        txt_Usuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, -1));

        txt_Pass.setBackground(new java.awt.Color(102, 102, 255));
        txt_Pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Pass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 200, -1));

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("CREADO POR EL EQUIPO 9");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 200, -1));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 240, 250));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresoActionPerformed
         user = txt_Usuario.getText().trim();
        pass = txt_Pass.getText().trim();
        
        if(!user.equals("")||!pass.equals("")){
            
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement(" select Nivel, ID from nutriologo where Usuario = '" + user + "' and Pass = '" + pass + "'");
                ResultSet HA1 = PHA.executeQuery();
                if(HA1.next()){
                    String tipo_nivel = HA1.getString("Nivel");
                     ID = HA1.getString("ID");
                                                           
                    if(tipo_nivel.equalsIgnoreCase("Administrador")){
                        dispose();
                        new Administrador().setVisible(true);
                     }else if(tipo_nivel.equalsIgnoreCase("Cliente")){
                          dispose();
                        new Clientes().setVisible(true);
                     }
                }else{
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                    txt_Usuario.setText("");
                    txt_Pass.setText("");
                }
            }catch(SQLException e){
                System.err.println("Error en Boton Acceder"+ e);
               
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
        }
         
    }//GEN-LAST:event_jButton_IngresoActionPerformed

   
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(() -> {
            new Ingreso().setVisible(true);
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
