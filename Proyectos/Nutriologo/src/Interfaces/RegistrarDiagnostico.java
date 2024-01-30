package Interfaces;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import static Interfaces.Administrador.sesion_usuario;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistrarDiagnostico extends javax.swing.JFrame {
int IDcliente_update = 0;
    String user,ID;
    public RegistrarDiagnostico() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(610, 370);
        setResizable(false);
        IDcliente_update = GestionarDiagnostico.IDcliente_update;            
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper9.jpg");
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
        txt_Diagnostico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_Diagnostico2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("INGRESE EL NOMBRE DEL CLIENTE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        txt_Diagnostico.setBackground(new java.awt.Color(255, 255, 153));
        txt_Diagnostico.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_Diagnostico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Diagnostico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 570, 20));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diagnostico.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 100));

        txt_Diagnostico2.setBackground(new java.awt.Color(255, 255, 153));
        txt_Diagnostico2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_Diagnostico2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Diagnostico2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Diagnostico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 570, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("REGISTRAR DIAGNOSTICO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(255, 153, 153));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 240, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("INGRESE SU DIAGNOSTICO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("INGRESE EL NUMERO DEL CLIENTE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt_ID.setBackground(new java.awt.Color(255, 153, 153));
        txt_ID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 20));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int validacion = 0;
        String Diagno,Diagno2,Nombre,Numc;
        Diagno = txt_Diagnostico.getText().trim();
        Diagno2 = txt_Diagnostico2.getText().trim();
        Nombre = txt_Nombre.getText().trim();
        Numc = txt_ID.getText().trim();
        
       if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
       if(Numc.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }          
          if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into diagnostico values (?,?,?,?)");
                PHA.setString(1,Numc);
                PHA.setString(2, Nombre);
                PHA.setString(3, Diagno);
                PHA.setString(4, Diagno2);
                
                
                PHA.executeUpdate();
                HA.close();
                Limpiar();
                txt_Diagnostico.setBackground(Color.GREEN);
                txt_Diagnostico2.setBackground(Color.GREEN);
                txt_ID.setBackground(Color.GREEN);
                txt_Nombre.setBackground(Color.GREEN);
                 JOptionPane.showMessageDialog(null, "Registro Exitoso");
                 this.dispose();
                }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Diagnostico;
    private javax.swing.JTextField txt_Diagnostico2;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
    txt_Diagnostico.setText("");
    txt_Diagnostico2.setText("");
    txt_ID.setText("");
    txt_Nombre.setText("");
}
}
