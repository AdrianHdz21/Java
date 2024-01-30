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


public class RegistrarLaboratoriales extends javax.swing.JFrame {
  int IDcliente_update = 0;
    String user,ID;
    public RegistrarLaboratoriales() {
        initComponents();
        setSize(810, 370);
        setResizable(false);
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        IDcliente_update = GestionarLaboratoriales.IDcliente_update;        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper8.jpg");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Glucosa1 = new javax.swing.JTextField();
        txt_Glucosa2 = new javax.swing.JTextField();
        txt_Glucosa3 = new javax.swing.JTextField();
        txt_Glucosa4 = new javax.swing.JTextField();
        txt_Insulina1 = new javax.swing.JTextField();
        txt_Insulina2 = new javax.swing.JTextField();
        txt_Insulina3 = new javax.swing.JTextField();
        txt_Insulina4 = new javax.swing.JTextField();
        txt_Trigliceridos1 = new javax.swing.JTextField();
        txt_Trigliceridos2 = new javax.swing.JTextField();
        txt_Trigliceridos3 = new javax.swing.JTextField();
        txt_Colesterol1 = new javax.swing.JTextField();
        txt_Colesterol2 = new javax.swing.JTextField();
        txt_Colesterol3 = new javax.swing.JTextField();
        txt_Colesterol4 = new javax.swing.JTextField();
        txt_LDL1 = new javax.swing.JTextField();
        txt_HDL2 = new javax.swing.JTextField();
        txt_HDL3 = new javax.swing.JTextField();
        txt_HDL4 = new javax.swing.JTextField();
        txt_Trigliceridos4 = new javax.swing.JTextField();
        txt_LDL2 = new javax.swing.JTextField();
        txt_LDL3 = new javax.swing.JTextField();
        txt_LDL4 = new javax.swing.JTextField();
        txt_HDL1 = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("REGISTRAR LABORATORIALES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("ID CLIENTE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("DATOS QUIMICOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("GLUCOSA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("INSULINA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("TRIGLICERIDOS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("COLESTEROL TOTAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("HDL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("LDL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("FECHA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("FECHA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("FECHA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setText("FECHA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        txt_ID.setBackground(new java.awt.Color(153, 255, 153));
        txt_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 250, -1));

        txt_Nombre.setBackground(new java.awt.Color(153, 255, 153));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, -1));

        txt_Glucosa1.setBackground(new java.awt.Color(153, 153, 255));
        txt_Glucosa1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Glucosa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Glucosa1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Glucosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 120, -1));

        txt_Glucosa2.setBackground(new java.awt.Color(153, 153, 255));
        txt_Glucosa2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Glucosa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Glucosa2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Glucosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 120, -1));

        txt_Glucosa3.setBackground(new java.awt.Color(153, 153, 255));
        txt_Glucosa3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Glucosa3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Glucosa3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Glucosa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 120, -1));

        txt_Glucosa4.setBackground(new java.awt.Color(153, 153, 255));
        txt_Glucosa4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Glucosa4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Glucosa4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Glucosa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 120, -1));

        txt_Insulina1.setBackground(new java.awt.Color(153, 153, 255));
        txt_Insulina1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Insulina1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Insulina1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Insulina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, -1));

        txt_Insulina2.setBackground(new java.awt.Color(153, 153, 255));
        txt_Insulina2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Insulina2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Insulina2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Insulina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, -1));

        txt_Insulina3.setBackground(new java.awt.Color(153, 153, 255));
        txt_Insulina3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Insulina3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Insulina3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Insulina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 120, -1));

        txt_Insulina4.setBackground(new java.awt.Color(153, 153, 255));
        txt_Insulina4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Insulina4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Insulina4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Insulina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 120, -1));

        txt_Trigliceridos1.setBackground(new java.awt.Color(153, 153, 255));
        txt_Trigliceridos1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Trigliceridos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Trigliceridos1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Trigliceridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 120, -1));

        txt_Trigliceridos2.setBackground(new java.awt.Color(153, 153, 255));
        txt_Trigliceridos2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Trigliceridos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Trigliceridos2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Trigliceridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 120, -1));

        txt_Trigliceridos3.setBackground(new java.awt.Color(153, 153, 255));
        txt_Trigliceridos3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Trigliceridos3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Trigliceridos3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Trigliceridos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 120, -1));

        txt_Colesterol1.setBackground(new java.awt.Color(153, 153, 255));
        txt_Colesterol1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Colesterol1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Colesterol1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Colesterol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 120, -1));

        txt_Colesterol2.setBackground(new java.awt.Color(153, 153, 255));
        txt_Colesterol2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Colesterol2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Colesterol2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Colesterol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, -1));

        txt_Colesterol3.setBackground(new java.awt.Color(153, 153, 255));
        txt_Colesterol3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Colesterol3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Colesterol3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Colesterol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 120, -1));

        txt_Colesterol4.setBackground(new java.awt.Color(153, 153, 255));
        txt_Colesterol4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Colesterol4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Colesterol4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Colesterol4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 120, -1));

        txt_LDL1.setBackground(new java.awt.Color(153, 153, 255));
        txt_LDL1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_LDL1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LDL1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_LDL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, -1));

        txt_HDL2.setBackground(new java.awt.Color(153, 153, 255));
        txt_HDL2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_HDL2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HDL2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_HDL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 120, -1));

        txt_HDL3.setBackground(new java.awt.Color(153, 153, 255));
        txt_HDL3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_HDL3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HDL3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_HDL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 120, -1));

        txt_HDL4.setBackground(new java.awt.Color(153, 153, 255));
        txt_HDL4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_HDL4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HDL4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_HDL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 120, -1));

        txt_Trigliceridos4.setBackground(new java.awt.Color(153, 153, 255));
        txt_Trigliceridos4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Trigliceridos4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Trigliceridos4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Trigliceridos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 120, -1));

        txt_LDL2.setBackground(new java.awt.Color(153, 153, 255));
        txt_LDL2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_LDL2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LDL2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_LDL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 120, -1));

        txt_LDL3.setBackground(new java.awt.Color(153, 153, 255));
        txt_LDL3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_LDL3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LDL3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_LDL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 120, -1));

        txt_LDL4.setBackground(new java.awt.Color(153, 153, 255));
        txt_LDL4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_LDL4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LDL4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_LDL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 120, -1));

        txt_HDL1.setBackground(new java.awt.Color(153, 153, 255));
        txt_HDL1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_HDL1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HDL1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_HDL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 120, -1));

        jButton_Agregar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 100));

        jLabel14.setBackground(new java.awt.Color(51, 255, 0));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("GUARDAR");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jLabel_Wallpaper.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
      int validacion = 0;
      String Nombre,Numc,Gluco1,Gluco2,Gluco3,Gluco4,Insu1,Insu2,Insu3,Insu4,Trigli1,Trigli2,Trigli3,Trigli4,Colest1,Colest2,Colest3,Colest4,HDL1,HDL2,HDL3,HDL4,LDL1,LDL2,LDL3,LDL4;
      Nombre = txt_Nombre.getText().trim();
      Numc = txt_ID.getText().trim();
      Gluco1 = txt_Glucosa1.getText().trim();
      Gluco2 = txt_Glucosa2.getText().trim();
      Gluco3 = txt_Glucosa3.getText().trim();
      Gluco4 = txt_Glucosa4.getText().trim();
      Insu1 = txt_Insulina1.getText().trim();
      Insu2 = txt_Insulina2.getText().trim();
      Insu3 = txt_Insulina3.getText().trim();
      Insu4 = txt_Insulina4.getText().trim();
      Trigli1 = txt_Trigliceridos1.getText().trim();
      Trigli2 = txt_Trigliceridos2.getText().trim();
      Trigli3 = txt_Trigliceridos3.getText().trim();
      Trigli4 = txt_Trigliceridos4.getText().trim();
      Colest1 = txt_Colesterol1.getText().trim();
      Colest2 = txt_Colesterol2.getText().trim();
      Colest3 = txt_Colesterol3.getText().trim();
      Colest4 = txt_Colesterol4.getText().trim();
      HDL1 = txt_HDL1.getText().trim();
      HDL2 = txt_HDL2.getText().trim();
      HDL3 = txt_HDL3.getText().trim();
      HDL4 = txt_HDL4.getText().trim();
      LDL1 = txt_LDL1.getText().trim();
      LDL2 = txt_LDL2.getText().trim();
      LDL3 = txt_LDL3.getText().trim();
      LDL4 = txt_LDL4.getText().trim();      
      if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
      if(Numc.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
      if(Gluco1.equals("")){
            txt_Glucosa1.setBackground(Color.red);
            validacion++;
        }
          if(Insu1.equals("")){
            txt_Insulina1.setBackground(Color.red);
            validacion++;
        }
        if(Trigli1.equals("")){
            txt_Trigliceridos1.setBackground(Color.red);
            validacion++;
        }
        if(Colest1.equals("")){
            txt_Colesterol1.setBackground(Color.red);
            validacion++;
        }
        if(HDL1.equals("")){
            txt_HDL1.setBackground(Color.red);
            validacion++;
        }
        if(LDL1.equals("")){
            txt_LDL1.setBackground(Color.red);
            validacion++;
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into laboratoriales values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1,Numc);
                PHA.setString(2, Nombre);
                PHA.setString(3, Gluco1);
                PHA.setString(4, Gluco2);
                PHA.setString(5, Gluco3);
                PHA.setString(6, Gluco4);
                PHA.setString(7, Insu1);
                PHA.setString(8, Insu2);
                PHA.setString(9, Insu3);
                PHA.setString(10, Insu4);
                PHA.setString(11, Trigli1);
                PHA.setString(12, Trigli2);
                PHA.setString(13, Trigli3);
                PHA.setString(14, Trigli4);
                PHA.setString(15, Colest1);
                PHA.setString(16, Colest2);
                PHA.setString(17, Colest3);
                PHA.setString(18, Colest4);
                PHA.setString(19, HDL1);
                PHA.setString(20, HDL2);
                PHA.setString(21, HDL3);
                PHA.setString(22, HDL4);
                PHA.setString(23, LDL1);
                PHA.setString(24, LDL2);
                PHA.setString(25, LDL3);
                PHA.setString(26, LDL4);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
txt_Nombre.setBackground(Color.GREEN);    
txt_ID.setBackground(Color.GREEN);    
txt_Glucosa1.setBackground(Color.GREEN);    
txt_Glucosa2.setBackground(Color.GREEN);    
txt_Glucosa3.setBackground(Color.GREEN);    
txt_Glucosa4.setBackground(Color.GREEN);    
txt_Insulina1.setBackground(Color.GREEN);    
txt_Insulina2.setBackground(Color.GREEN);    
txt_Insulina3.setBackground(Color.GREEN);    
txt_Insulina4.setBackground(Color.GREEN);    
txt_Trigliceridos1.setBackground(Color.GREEN);    
txt_Trigliceridos2.setBackground(Color.GREEN);    
txt_Trigliceridos3.setBackground(Color.GREEN);    
txt_Trigliceridos4.setBackground(Color.GREEN);    
txt_Colesterol1.setBackground(Color.GREEN);    
txt_Colesterol2.setBackground(Color.GREEN);    
txt_Colesterol3.setBackground(Color.GREEN);    
txt_Colesterol4.setBackground(Color.GREEN);    
txt_HDL1.setBackground(Color.GREEN);    
txt_HDL2.setBackground(Color.GREEN);    
txt_HDL3.setBackground(Color.GREEN);    
txt_HDL4.setBackground(Color.GREEN);    
txt_LDL1.setBackground(Color.GREEN);    
txt_LDL2.setBackground(Color.GREEN);    
txt_LDL3.setBackground(Color.GREEN);    
txt_LDL4.setBackground(Color.GREEN);
                
                   JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
      
      
    }//GEN-LAST:event_jButton_AgregarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarLaboratoriales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Agregar;
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
    private javax.swing.JTextField txt_Colesterol1;
    private javax.swing.JTextField txt_Colesterol2;
    private javax.swing.JTextField txt_Colesterol3;
    private javax.swing.JTextField txt_Colesterol4;
    private javax.swing.JTextField txt_Glucosa1;
    private javax.swing.JTextField txt_Glucosa2;
    private javax.swing.JTextField txt_Glucosa3;
    private javax.swing.JTextField txt_Glucosa4;
    private javax.swing.JTextField txt_HDL1;
    private javax.swing.JTextField txt_HDL2;
    private javax.swing.JTextField txt_HDL3;
    private javax.swing.JTextField txt_HDL4;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Insulina1;
    private javax.swing.JTextField txt_Insulina2;
    private javax.swing.JTextField txt_Insulina3;
    private javax.swing.JTextField txt_Insulina4;
    private javax.swing.JTextField txt_LDL1;
    private javax.swing.JTextField txt_LDL2;
    private javax.swing.JTextField txt_LDL3;
    private javax.swing.JTextField txt_LDL4;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Trigliceridos1;
    private javax.swing.JTextField txt_Trigliceridos2;
    private javax.swing.JTextField txt_Trigliceridos3;
    private javax.swing.JTextField txt_Trigliceridos4;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
txt_Nombre.setText("");    
txt_ID.setText("");    
txt_Glucosa1.setText("");    
txt_Glucosa2.setText("");    
txt_Glucosa3.setText("");    
txt_Glucosa4.setText("");    
txt_Insulina1.setText("");    
txt_Insulina2.setText("");    
txt_Insulina3.setText("");    
txt_Insulina4.setText("");    
txt_Trigliceridos1.setText("");    
txt_Trigliceridos2.setText("");    
txt_Trigliceridos3.setText("");    
txt_Trigliceridos4.setText("");    
txt_Colesterol1.setText("");    
txt_Colesterol2.setText("");    
txt_Colesterol3.setText("");    
txt_Colesterol4.setText("");    
txt_HDL1.setText("");    
txt_HDL2.setText("");    
txt_HDL3.setText("");    
txt_HDL4.setText("");    
txt_LDL1.setText("");    
txt_LDL2.setText("");    
txt_LDL3.setText("");    
txt_LDL4.setText("");       
}
}
