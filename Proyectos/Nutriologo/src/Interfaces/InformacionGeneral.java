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

public class InformacionGeneral extends javax.swing.JFrame {
int IDcliente_update = 0;
    String user, ID;
    public InformacionGeneral() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(600,500);
        setResizable(false);
        IDcliente_update = GestionarClientes.IDcliente_update;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        try {
            Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("select * FROM clientes WHERE ID = '" + IDcliente_update + "'");
            ResultSet HA1 = PHA.executeQuery();
            if (HA1.next()) {
                txt_ID.setText(HA1.getString("ID"));
                txt_Nombre.setText(HA1.getString("Nombre"));
                txt_Fecha.setText(HA1.getString("Fecha"));
                txt_Edad.setText(HA1.getString("Edad"));
                txt_Sexo.setText(HA1.getString("Sexo"));
                txt_Ocupacion.setText(HA1.getString("Ocupacion"));
                txt_Edo.setText(HA1.getString("EstadoCivil"));
                txt_Hijos.setText(HA1.getString("NumeroHijos"));
                txt_Telefono.setText(HA1.getString("Telefono"));
                txt_Religion.setText(HA1.getString("Religion"));
                txt_Correo.setText(HA1.getString("Correo"));
                txt_MotivoCon.setText(HA1.getString("Moticocon"));
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

        jLabel12 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        txt_Fecha = new javax.swing.JTextField();
        txt_Edo = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Religion = new javax.swing.JTextField();
        txt_Hijos = new javax.swing.JTextField();
        txt_Ocupacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_Sexo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_MotivoCon = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("INFORMACION GENERAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("ID CLIENTE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("EDAD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("OCUPACION:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("TELEFONO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("CORREO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText(" FECHA NACIMIENTO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("ESTADO CIVIL:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("RELIGION:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MOTIVO CONSULTA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("SEXO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, -1));

        txt_Edad.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Edad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, -1));

        txt_Correo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Correo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, -1));

        txt_Fecha.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Fecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 190, -1));

        txt_Edo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Edo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Edo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Edo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 190, -1));

        txt_Telefono.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, -1));

        txt_Religion.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Religion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Religion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 200, -1));

        txt_Hijos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Hijos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Hijos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Hijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 200, -1));

        txt_Ocupacion.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Ocupacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Ocupacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 110, 100));

        txt_Sexo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_Sexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 200, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("NUMERO DE HIJOS:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setText("NOMBRE:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txt_ID.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        txt_MotivoCon.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txt_MotivoCon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MotivoCon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_MotivoCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 230, -1));

        jLabel_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int validacion = 0;
        String NumC,Nombre, Telefono,Sexo,NumeroHijos,Motivo,Edad,Ocupacion,Correo,Fecha,EstadoCivil,Religion;
        NumC = txt_ID.getText().trim();
        Nombre = txt_Nombre.getText().trim();
        Edad = txt_Edad.getText().trim();
        Ocupacion = txt_Ocupacion.getText().trim();
        Correo = txt_Correo.getText().trim();
        Telefono = txt_Telefono.getText().trim();
        EstadoCivil = txt_Edo.getText().trim();
        Fecha = txt_Fecha.getText().trim();
        Religion = txt_Religion.getText().trim();
        Sexo = txt_Sexo.getText().trim();
        NumeroHijos = txt_Hijos.getText().trim();
        Motivo = txt_MotivoCon.getText().trim();
                 
        if(Motivo.equals("")){
        txt_MotivoCon.setBackground(Color.red);
        validacion++;
        }
        if(NumC.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
        if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
        if(Edad.equals("")){
            txt_Edad.setBackground(Color.red);
            validacion++;
        }
        if(Ocupacion.equals("")){
            txt_Ocupacion.setBackground(Color.red);
            validacion++;
        }
        if(Correo.equals("")){
            txt_Correo.setBackground(Color.red);
            validacion++;
        }if(Telefono.equals("")){
            txt_Telefono.setBackground(Color.red);
            validacion++;
        }
        if(EstadoCivil.equals("")){
            txt_Edo.setBackground(Color.red);
            validacion++;
        }
        if(Fecha.equals("")){
            txt_Fecha.setBackground(Color.red);
            validacion++;
        }
        if(Religion.equals("")){
            txt_Religion.setBackground(Color.red);
            validacion++;
        }
        if(Sexo.equals("")){
            txt_Sexo.setBackground(Color.red);
            validacion++;
        }
        if(NumeroHijos.equals("")){
            txt_Hijos.setBackground(Color.red);
            validacion++;
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into clientes values (?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1,NumC);
                PHA.setString(2, Nombre);
                PHA.setString(3, Fecha);
                PHA.setString(4, Edad);
                PHA.setString(5, Sexo);
                PHA.setString(6, Ocupacion);
                PHA.setString(7, EstadoCivil);
                PHA.setString(8, NumeroHijos);
                PHA.setString(9, Telefono);
                PHA.setString(10,Religion);
                PHA.setString(11, Correo);
                PHA.setString(12, Motivo);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
                txt_ID.setBackground(Color.GREEN);
                txt_Nombre.setBackground(Color.GREEN);
                txt_Edad.setBackground(Color.GREEN);
                txt_Ocupacion.setBackground(Color.GREEN);
                txt_Correo.setBackground(Color.GREEN);
                txt_Telefono.setBackground(Color.GREEN);
                txt_Fecha.setBackground(Color.GREEN);
                txt_Edo.setBackground(Color.GREEN);
                txt_Religion.setBackground(Color.GREEN);
                txt_Sexo.setBackground(Color.GREEN);
                txt_Hijos.setBackground(Color.GREEN);
                txt_MotivoCon.setBackground(Color.GREEN);
                
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
            java.util.logging.Logger.getLogger(InformacionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionGeneral().setVisible(true);
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Edo;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_Hijos;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_MotivoCon;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Ocupacion;
    private javax.swing.JTextField txt_Religion;
    private javax.swing.JTextField txt_Sexo;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
    txt_Nombre.setText("");
  txt_Edad.setText("");
  txt_Ocupacion.setText("");
  txt_Correo.setText("");
  txt_Telefono.setText("");
  txt_Edo.setText("");
  txt_ID.setText("");
txt_Religion.setText("");
  txt_Fecha.setText("");
  txt_Sexo.setText("");
  txt_Hijos.setText("");
  txt_MotivoCon.setText("");
}
}
