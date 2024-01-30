package Interfaces;

import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class RegistrarClientes extends javax.swing.JFrame {
String user;
   
    public RegistrarClientes() {
        initComponents();
        user = Ingreso.user;
        setSize(400, 430);
        setResizable(false);
        setTitle("Registro de Datos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper11.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_Nivel = new javax.swing.JComboBox<>();
        txt_Pass = new javax.swing.JPasswordField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Usuario = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("REGISTRAR CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        cmb_Nivel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente" }));
        cmb_Nivel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cmb_Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, -1));

        txt_Pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Pass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, -1));

        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, -1));

        txt_Usuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, -1));

        jButton_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton_Registrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 204)));
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 100));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("NIVEL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        int validacion = 0,Nivel;
        String Nombre, Usuario, Pass,cmb_nivel="";
        Nombre = txt_Nombre.getText().trim();
        Usuario = txt_Usuario.getText().trim();
        Pass = txt_Pass.getText().trim();
        Nivel = cmb_Nivel.getSelectedIndex()+1;
        
        
        if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
        if(Usuario.equals("")){
            txt_Usuario.setBackground(Color.red);
            validacion++;
        }
        if(Pass.equals("")){
            txt_Pass.setBackground(Color.red);
            validacion++;
        }
        if(Nivel == 1){
          cmb_nivel ="Administrador" ; 
        }else if(Nivel == 2){
            cmb_nivel="Cliente";            
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into nutriologo values (?,?,?,?,?)");
                PHA.setInt(1,0);
                PHA.setString(2, Nombre);
                PHA.setString(3, Usuario);
                PHA.setString(4, Pass);
                PHA.setString(5, cmb_nivel);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
                txt_Nombre.setBackground(Color.GREEN);
                txt_Usuario.setBackground(Color.GREEN);
                txt_Pass.setBackground(Color.GREEN);
                                
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
    
                               
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
    txt_Nombre.setText("");
    txt_Pass.setText("");
    txt_Usuario.setText("");
    cmb_Nivel.setSelectedIndex(0);
 }

}
