
package Interfaces;

import static Interfaces.Administrador.sesion_usuario;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;


public class InformacionRiesgosNutrimentales extends javax.swing.JFrame {
int IDcliente_update = 0;
    String user,ID;
    public InformacionRiesgosNutrimentales() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(590, 480);
        setResizable(false);
       IDcliente_update = GestionarRiesgosNutrimentales.IDcliente_update;
       setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper7.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); 
      /*  try {
            Connection HA = Conexion.conectar();
           // PreparedStatement PHA = HA.prepareStatement("SELECT * FROM riesgosnutri WHERE ID = '" + IDcliente_update + "'");
            ResultSet HA1 = PHA.executeQuery();
            if (HA1.next()) {
                txt_Nombre.setText(HA1.getString("Nombre"));
                txt_ID.setText(HA1.getString("ID_pac"));
                txt_Medicamentos.setText(HA1.getString("Medicamentos"));
                txt_CigarrosxD.setText(HA1.getString("Num_Cig"));
                txt_VxS.setText(HA1.getString("Num_VecxSem"));
                txt_Frecuencia.setText(HA1.getString("Frecu"));
          }

        } catch (SQLException e) {
            System.err.println("Error al cargar usuario" + e);
            JOptionPane.showMessageDialog(null, "Error al cargar contactar administrador");
        }*/
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Medicamentos = new javax.swing.JTextField();
        txt_VxS = new javax.swing.JTextField();
        txt_Frecuencia = new javax.swing.JTextField();
        txt_CigarrosxD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Tabaquismo = new javax.swing.JTextField();
        txt_Drogas = new javax.swing.JTextField();
        txt_Alcohol = new javax.swing.JTextField();
        txt_Cafe = new javax.swing.JTextField();
        txt_Te = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("MARQUE SI/NO PARA CADA CASO ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TABAQUISMO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ALCOHOL:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("NUM.VECES/SEMANA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("FRECUENCIA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("NUM. CIGARROS/DIA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("USO DE DROGAS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("CAFE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("TE:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        txt_Medicamentos.setBackground(new java.awt.Color(102, 255, 102));
        txt_Medicamentos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Medicamentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Medicamentos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 520, -1));

        txt_VxS.setBackground(new java.awt.Color(102, 255, 102));
        txt_VxS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_VxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_VxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_VxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 250, -1));

        txt_Frecuencia.setBackground(new java.awt.Color(102, 255, 102));
        txt_Frecuencia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Frecuencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Frecuencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 250, -1));

        txt_CigarrosxD.setBackground(new java.awt.Color(102, 255, 102));
        txt_CigarrosxD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_CigarrosxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CigarrosxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CigarrosxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 250, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 100, 100));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("ID CLIENTE:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("MEDICAMENTOS:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(102, 255, 102));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, -1));

        txt_ID.setBackground(new java.awt.Color(102, 255, 102));
        txt_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, -1));

        jLabel13.setBackground(new java.awt.Color(0, 204, 51));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("GUARDAR");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        txt_Tabaquismo.setBackground(new java.awt.Color(255, 204, 204));
        txt_Tabaquismo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Tabaquismo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tabaquismo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Tabaquismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        txt_Drogas.setBackground(new java.awt.Color(255, 204, 204));
        txt_Drogas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Drogas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Drogas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Drogas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DrogasActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Drogas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, -1));

        txt_Alcohol.setBackground(new java.awt.Color(255, 204, 204));
        txt_Alcohol.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Alcohol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alcohol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Alcohol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, -1));

        txt_Cafe.setBackground(new java.awt.Color(255, 204, 204));
        txt_Cafe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Cafe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cafe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, -1));

        txt_Te.setBackground(new java.awt.Color(255, 204, 204));
        txt_Te.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Te.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Te.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Te, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 90, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("EN LAS CASILLAS COLOR ROSA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("REGISTRO FACTORES DE RIESGO NUTRIMENTAL");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int validacion = 0;
     String NumC,Nombre,Medi,Taba,Drogas,Alcohol,Cafe,NumCigxD,NumVxS,Frecu,Te;
     NumC = txt_ID.getText().trim();
     Nombre = txt_Nombre.getText().trim();
     Medi = txt_Medicamentos.getText().trim();
     Taba = txt_Tabaquismo.getText().trim();
     Drogas = txt_Drogas.getText().trim();
     Alcohol = txt_Alcohol.getText().trim();
     Cafe = txt_Cafe.getText().trim();
     NumCigxD = txt_CigarrosxD.getText().trim();
     NumVxS = txt_VxS.getText().trim();
     Frecu = txt_Frecuencia.getText().trim();
     Te = txt_Te.getText().trim();
     if(NumC.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
      if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
       if(Medi.equals("")){
            txt_Medicamentos.setBackground(Color.red);
            validacion++;
        }
        if(Taba.equals("")){
            txt_Tabaquismo.setBackground(Color.red);
            validacion++;
        }
         if(Drogas.equals("")){
            txt_Drogas.setBackground(Color.red);
            validacion++;
        }
          if(Alcohol.equals("")){
            txt_Alcohol.setBackground(Color.red);
            validacion++;
        }
           if(Cafe.equals("")){
            txt_Cafe.setBackground(Color.red);
            validacion++;
        }
            if(NumCigxD.equals("")){
            txt_CigarrosxD.setBackground(Color.red);
            validacion++;
        }
             if(NumVxS.equals("")){
            txt_VxS.setBackground(Color.red);
            validacion++;
        }
              if(Frecu.equals("")){
            txt_Frecuencia.setBackground(Color.red);
            validacion++;
        }
               if(Te.equals("")){
            txt_Te.setBackground(Color.red);
            validacion++;
        }
               if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into riesgosnutri values (?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1,NumC);
                PHA.setString(2, Nombre);
                PHA.setString(3, Medi);
                PHA.setString(4, Taba);
                PHA.setString(5, Drogas);
                PHA.setString(6, Alcohol);
                PHA.setString(7, Cafe);
                PHA.setString(8, NumCigxD);
                PHA.setString(9, NumVxS);
                PHA.setString(10, Frecu);
                PHA.setString(11, Te);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
   txt_ID.setBackground(Color.GREEN);
   txt_Nombre.setBackground(Color.GREEN);
   txt_Medicamentos.setBackground(Color.GREEN);
   txt_Tabaquismo.setBackground(Color.GREEN);
   txt_Drogas.setBackground(Color.GREEN);
   txt_Alcohol.setBackground(Color.GREEN);
   txt_Cafe.setBackground(Color.GREEN);
   txt_CigarrosxD.setBackground(Color.GREEN);
   txt_VxS.setBackground(Color.GREEN);
   txt_Frecuencia.setBackground(Color.GREEN);
   txt_Te.setBackground(Color.GREEN);
                
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
           
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_DrogasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DrogasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DrogasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InformacionRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionRiesgosNutrimentales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Alcohol;
    private javax.swing.JTextField txt_Cafe;
    private javax.swing.JTextField txt_CigarrosxD;
    private javax.swing.JTextField txt_Drogas;
    private javax.swing.JTextField txt_Frecuencia;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Medicamentos;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Tabaquismo;
    private javax.swing.JTextField txt_Te;
    private javax.swing.JTextField txt_VxS;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
   txt_ID.setText("");
   txt_Nombre.setText("");
   txt_Medicamentos.setText("");
   txt_Tabaquismo.setText(""); 
   txt_Drogas.setText(""); 
   txt_Alcohol.setText(""); 
   txt_Cafe.setText(""); 
   txt_CigarrosxD.setText("");
   txt_VxS.setText("");
   txt_Frecuencia.setText("");
   txt_Te.setText(""); 
}
}
