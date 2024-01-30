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

public class RegistrarHabitos extends javax.swing.JFrame {
   int IDcliente_update = 0;
    String user,ID;
    public RegistrarHabitos() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(820, 520);
        setResizable(false);
        IDcliente_update = GestionarHabitos.IDcliente_update;     
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper9.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); 
        try {
            Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("select * from habitosdie WHERE ID_pac = '" + IDcliente_update + "'");
            ResultSet HA1 = PHA.executeQuery();
            if (HA1.next()) {                
                txt_NumCl.setText(HA1.getString("ID_pac"));
                txt_Nombre.setText(HA1.getString("Nombre"));
                txt_Peso.setText(HA1.getString("Peso"));
                txt_Dietas.setText(HA1.getString("Dieta_med"));
                txt_Razones.setText(HA1.getString("Raz_aban"));
                txt_Indi.setText(HA1.getString("Alim_ind"));
                txt_AlimG.setText(HA1.getString("Alim_gus"));
                txt_AlimD.setText(HA1.getString("Alim_disgus"));
                txt_Alergia.setText(HA1.getString("Alerg_int"));
                txt_Prepara.setText(HA1.getString("Prep_Alim"));
                txt_ConQuien.setText(HA1.getString("Quien_com"));
                txt_NumC.setText(HA1.getString("Num_com"));
                txt_Sal.setText(HA1.getString("Agreg_sal"));
                txt_Tiempo.setText(HA1.getString("Tiemp_ham"));
                txt_Observaciones.setText(HA1.getString("Obser"));
         }
        }catch (SQLException e) {
            System.err.println("Error al cargar usuario" + e);
            JOptionPane.showMessageDialog(null, "Error al cargar contactar administrador");
        }        
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Peso = new javax.swing.JTextField();
        txt_Alergia = new javax.swing.JTextField();
        txt_Indi = new javax.swing.JTextField();
        txt_AlimD = new javax.swing.JTextField();
        txt_Prepara = new javax.swing.JTextField();
        txt_Tiempo = new javax.swing.JTextField();
        txt_Observaciones = new javax.swing.JTextField();
        txt_ConQuien = new javax.swing.JTextField();
        txt_NumC = new javax.swing.JTextField();
        txt_Sal = new javax.swing.JTextField();
        txt_Razones = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_NumCl = new javax.swing.JTextField();
        txt_Dietas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_AlimG = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("DIETAS Y MEDICAMENTOS PARA BAJAR DE PESO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ALIMENTOS QUE GUSTAN:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("¿EN QUE TIEMPO DE COMIDA TIENE MAS HABRE?:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("¿CON QUIEN COME?:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("PESO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("¿QUIEN PREPARA SUS ALIMENTOS?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("¿AGREGA SAL A LOS ALIMENTOS ANTES DE PROBARLOS':");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("RAZONES DE ABANDONO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("ALIMENTOS INDISPENSABLES:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("ALERGIA/INTOLERANCIA:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("OBSERVACIONES:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("¿CUANTAS COMIDAS REALIZA AL DIA?");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("REGISTRO HABITOS DIETETICOS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        txt_Peso.setBackground(new java.awt.Color(255, 153, 153));
        txt_Peso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, -1));

        txt_Alergia.setBackground(new java.awt.Color(255, 153, 153));
        txt_Alergia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Alergia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Alergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 300, -1));

        txt_Indi.setBackground(new java.awt.Color(255, 153, 153));
        txt_Indi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Indi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Indi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 300, -1));

        txt_AlimD.setBackground(new java.awt.Color(255, 153, 153));
        txt_AlimD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_AlimD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_AlimD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 300, -1));

        txt_Prepara.setBackground(new java.awt.Color(255, 153, 153));
        txt_Prepara.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Prepara.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Prepara, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 300, -1));

        txt_Tiempo.setBackground(new java.awt.Color(255, 153, 153));
        txt_Tiempo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Tiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 370, -1));

        txt_Observaciones.setBackground(new java.awt.Color(255, 153, 153));
        txt_Observaciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Observaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 370, -1));

        txt_ConQuien.setBackground(new java.awt.Color(255, 153, 153));
        txt_ConQuien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ConQuien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_ConQuien, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 370, -1));

        txt_NumC.setBackground(new java.awt.Color(255, 153, 153));
        txt_NumC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_NumC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_NumC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 370, -1));

        txt_Sal.setBackground(new java.awt.Color(255, 153, 153));
        txt_Sal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Sal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 370, -1));

        txt_Razones.setBackground(new java.awt.Color(255, 153, 153));
        txt_Razones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Razones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Razones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 100, 100));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ID CLIENTE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(255, 153, 153));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 220, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("NOMBRE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txt_NumCl.setBackground(new java.awt.Color(255, 153, 153));
        txt_NumCl.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_NumCl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_NumCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 220, -1));

        txt_Dietas.setBackground(new java.awt.Color(255, 153, 153));
        txt_Dietas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Dietas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Dietas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 300, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("ALIMENTOS QUE DISGUSTAN:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        txt_AlimG.setBackground(new java.awt.Color(255, 153, 153));
        txt_AlimG.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_AlimG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_AlimG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 300, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        jLabel17.setBackground(new java.awt.Color(51, 255, 51));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("GUARDAR");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int validacion = 0;
        String NumCli,Nombre,Peso,P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,Observaciones;
        NumCli = txt_NumCl.getText().trim();
        Nombre = txt_Nombre.getText().trim();
        Peso = txt_Peso.getText().trim();
        P1 = txt_Dietas.getText().trim();
        P2 = txt_Razones.getText().trim();
        P3 = txt_Indi.getText().trim();
        P4 = txt_AlimG.getText().trim();
        P5 = txt_AlimD.getText().trim();
        P6 = txt_Alergia.getText().trim();
        P7 = txt_Prepara.getText().trim();
        P8 = txt_ConQuien.getText().trim();
        P9 = txt_NumC.getText().trim();
        P10 = txt_Sal.getText().trim();
        P11 = txt_Tiempo.getText().trim();
        Observaciones = txt_Observaciones.getText().trim();
        if(NumCli.equals("")){
            txt_NumCl.setBackground(Color.red);
            validacion++;
        }
        if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
        if(Peso.equals("")){
            txt_Peso.setBackground(Color.red);
            validacion++;
        }
        if(P1.equals("")){
            txt_Dietas.setBackground(Color.red);
            validacion++;
        }
        if(P2.equals("")){
            txt_Razones.setBackground(Color.red);
            validacion++;
        }
        if(P3.equals("")){
            txt_Indi.setBackground(Color.red);
            validacion++;
        }
        if(P4.equals("")){
            txt_AlimG.setBackground(Color.red);
            validacion++;
        }
        if(P5.equals("")){
            txt_AlimD.setBackground(Color.red);
            validacion++;
        }
        if(P6.equals("")){
            txt_Alergia.setBackground(Color.red);
            validacion++;
        }
        if(P7.equals("")){
            txt_Prepara.setBackground(Color.red);
            validacion++;
        }
        if(P8.equals("")){
            txt_ConQuien.setBackground(Color.red);
            validacion++;
        }
        if(P9.equals("")){
            txt_NumC.setBackground(Color.red);
            validacion++;
        }
        if(P10.equals("")){
            txt_Sal.setBackground(Color.red);
            validacion++;
        }
        if(P11.equals("")){
            txt_Tiempo.setBackground(Color.red);
            validacion++;
        }
        if(Observaciones.equals("")){
            txt_Observaciones.setBackground(Color.red);
            validacion++;
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into habitosdie values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1,NumCli);
                PHA.setString(2, Nombre);
                PHA.setString(3, Peso);
                PHA.setString(4, P1);
                PHA.setString(5, P2);
                PHA.setString(6, P3);
                PHA.setString(7, P4);
                PHA.setString(8, P5);
                PHA.setString(9, P6);
                PHA.setString(10, P7);
                PHA.setString(11, P8);
                PHA.setString(12, P9);
                PHA.setString(13, P10);
                PHA.setString(14, P11);
                PHA.setString(15, Observaciones);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
    txt_NumCl.setBackground(Color.GREEN);
    txt_Nombre.setBackground(Color.GREEN);
    txt_Peso.setBackground(Color.GREEN);
    txt_Dietas.setBackground(Color.GREEN);
    txt_Razones.setBackground(Color.GREEN);
    txt_AlimG.setBackground(Color.GREEN);
    txt_Indi.setBackground(Color.GREEN);
    txt_AlimD.setBackground(Color.GREEN);
    txt_Alergia.setBackground(Color.GREEN);
    txt_Prepara.setBackground(Color.GREEN);
    txt_ConQuien.setBackground(Color.GREEN);
    txt_NumC.setBackground(Color.GREEN);
    txt_Sal.setBackground(Color.GREEN);
    txt_Tiempo.setBackground(Color.GREEN);
    txt_Observaciones.setBackground(Color.GREEN);
                
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarHabitos().setVisible(true);
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Alergia;
    private javax.swing.JTextField txt_AlimD;
    private javax.swing.JTextField txt_AlimG;
    private javax.swing.JTextField txt_ConQuien;
    private javax.swing.JTextField txt_Dietas;
    private javax.swing.JTextField txt_Indi;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NumC;
    private javax.swing.JTextField txt_NumCl;
    private javax.swing.JTextField txt_Observaciones;
    private javax.swing.JTextField txt_Peso;
    private javax.swing.JTextField txt_Prepara;
    private javax.swing.JTextField txt_Razones;
    private javax.swing.JTextField txt_Sal;
    private javax.swing.JTextField txt_Tiempo;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
    txt_NumCl.setText("");
    txt_Nombre.setText("");
    txt_Peso.setText("");
    txt_Dietas.setText("");
    txt_Razones.setText("");
    txt_Indi.setText("");
    txt_AlimG.setText((""));
    txt_AlimD.setText("");
    txt_Alergia.setText("");
    txt_Prepara.setText("");
    txt_ConQuien.setText("");
    txt_NumC.setText("");
    txt_Sal.setText("");
    txt_Tiempo.setText("");
    txt_Observaciones.setText("");    
}
}
