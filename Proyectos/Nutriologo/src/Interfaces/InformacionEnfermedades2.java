
package Interfaces;

import ConexionBD.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InformacionEnfermedades2 extends javax.swing.JFrame {
int IDcliente_update = 0;
    String user, ID;
    
    public InformacionEnfermedades2() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        IDcliente_update = GestionarEnfermedades.IDcliente_update;
        setSize(780, 630);
        setResizable(false);
        setTitle("Cuenta de Cliente - Sesion de " + user);
        
       setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper6.jpg");
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

        jLabel36 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_Actividad = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txt_Observaciones = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_Frecuencia = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jButton_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txt_EdadH = new javax.swing.JTextField();
        txt_EdadM = new javax.swing.JTextField();
        txt_Tabaquismo = new javax.swing.JTextField();
        txt_SedentarismoM = new javax.swing.JTextField();
        txt_SedentarismoD = new javax.swing.JTextField();
        txt_SedentarismoMe = new javax.swing.JTextField();
        txt_ObesidadH = new javax.swing.JTextField();
        txt_ObesidadM = new javax.swing.JTextField();
        txt_ObesidadHAS = new javax.swing.JTextField();
        txt_DisplidemiasLDL = new javax.swing.JTextField();
        txt_DispliemiasHDL = new javax.swing.JTextField();
        txt_Colesterol = new javax.swing.JTextField();
        txt_Glucosa = new javax.swing.JTextField();
        txt_HistoriaFamiliar = new javax.swing.JTextField();
        txt_IAM = new javax.swing.JTextField();
        txt_MuerteSubita = new javax.swing.JTextField();
        txt_Revascularizacion = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("• <3 d/s:");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("• >3 m:");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("• <30 min/d (Moderada):");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("• 102cm-Hombres:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 204, 0));
        jLabel53.setText("• SEDENTARISMO");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("• >55 ♀/M:");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 20));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 204, 0));
        jLabel45.setText("• DISPLIDEMIAS: ");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, 20));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 204, 0));
        jLabel32.setText("• EDAD");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("• LDL >130 mg/dl:");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 20));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setText("• OBESIDAD:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("• >45 ♂/H:");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("• Tabaquismo o <6 meses sin");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 0));
        jLabel52.setText("•FACTORES DE RIESGO ECV");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("• HAS (140/90 o fx):");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("• HDL <40 mg/dl :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 130, 20));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("• 88 cm Mujeres: ");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("• Colesterol > 200 mg/dl:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 20));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("• Muerte súbita:");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 20));

        txt_Actividad.setBackground(new java.awt.Color(255, 204, 153));
        txt_Actividad.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Actividad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Actividad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 200, -1));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("• Frecuencia(V/S):");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 204, 0));
        jLabel48.setText("• PREDIABETES");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 20));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("• Glucosa >100 y <126:");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("• <55 ♂ y <65 años ♀ :");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 20));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("• DATOS EXTRA");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 110, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("• Actividad Fisica(Tipo):");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txt_Observaciones.setBackground(new java.awt.Color(255, 204, 153));
        txt_Observaciones.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Observaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Observaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 390, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("•Nombre:");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("• Revascularización");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setText("• HISTORIA FAMILIAR-PRIMERA LINEA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 20));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("• IAM :");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, 20));

        txt_Frecuencia.setBackground(new java.awt.Color(255, 204, 153));
        txt_Frecuencia.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Frecuencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Frecuencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 200, -1));

        txt_Cantidad.setBackground(new java.awt.Color(255, 204, 153));
        txt_Cantidad.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 220, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("• Cantidad:");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jButton_Guardar.setBackground(new java.awt.Color(153, 0, 0));
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 100, 100));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("GUARDAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(255, 204, 153));
        txt_Nombre.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 400, -1));

        txt_ID.setBackground(new java.awt.Color(255, 204, 153));
        txt_ID.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 400, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("• ID_Cliente:");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("• Observaciones:");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        txt_EdadH.setBackground(new java.awt.Color(153, 153, 255));
        txt_EdadH.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_EdadH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EdadH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_EdadH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        txt_EdadM.setBackground(new java.awt.Color(153, 153, 255));
        txt_EdadM.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_EdadM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EdadM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_EdadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        txt_Tabaquismo.setBackground(new java.awt.Color(153, 153, 255));
        txt_Tabaquismo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Tabaquismo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tabaquismo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Tabaquismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, -1));

        txt_SedentarismoM.setBackground(new java.awt.Color(153, 153, 255));
        txt_SedentarismoM.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_SedentarismoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SedentarismoM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_SedentarismoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));

        txt_SedentarismoD.setBackground(new java.awt.Color(153, 153, 255));
        txt_SedentarismoD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_SedentarismoD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SedentarismoD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_SedentarismoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, -1));

        txt_SedentarismoMe.setBackground(new java.awt.Color(153, 153, 255));
        txt_SedentarismoMe.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_SedentarismoMe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SedentarismoMe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_SedentarismoMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, -1));

        txt_ObesidadH.setBackground(new java.awt.Color(153, 153, 255));
        txt_ObesidadH.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ObesidadH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ObesidadH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ObesidadH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, -1));

        txt_ObesidadM.setBackground(new java.awt.Color(153, 153, 255));
        txt_ObesidadM.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ObesidadM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ObesidadM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ObesidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, -1));

        txt_ObesidadHAS.setBackground(new java.awt.Color(153, 153, 255));
        txt_ObesidadHAS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ObesidadHAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ObesidadHAS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ObesidadHAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, -1));

        txt_DisplidemiasLDL.setBackground(new java.awt.Color(153, 153, 255));
        txt_DisplidemiasLDL.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_DisplidemiasLDL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DisplidemiasLDL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_DisplidemiasLDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, -1));

        txt_DispliemiasHDL.setBackground(new java.awt.Color(153, 153, 255));
        txt_DispliemiasHDL.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_DispliemiasHDL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DispliemiasHDL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_DispliemiasHDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 130, -1));

        txt_Colesterol.setBackground(new java.awt.Color(153, 153, 255));
        txt_Colesterol.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Colesterol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Colesterol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Colesterol, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 130, -1));

        txt_Glucosa.setBackground(new java.awt.Color(153, 153, 255));
        txt_Glucosa.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Glucosa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Glucosa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Glucosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        txt_HistoriaFamiliar.setBackground(new java.awt.Color(153, 153, 255));
        txt_HistoriaFamiliar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_HistoriaFamiliar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HistoriaFamiliar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_HistoriaFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 130, -1));

        txt_IAM.setBackground(new java.awt.Color(153, 153, 255));
        txt_IAM.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_IAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_IAM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_IAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, -1));

        txt_MuerteSubita.setBackground(new java.awt.Color(153, 153, 255));
        txt_MuerteSubita.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_MuerteSubita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MuerteSubita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_MuerteSubita, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 130, -1));

        txt_Revascularizacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_Revascularizacion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Revascularizacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Revascularizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Revascularizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, -1));

        jLabel_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        int validacion = 0;
        String Nombre,Id,Mas_45H,Mas_55M,Tabaquismo,Seden_Mod,Seden_3di,Seden_3Mes,Obes_102H,Obes_88M,HAS,LDL,HDL,Colest,Gluco_Mas100,Hist_Fam,IAM,Muerte_Sub,Revas,Act_Fis,Frecu,Cant,Obser;
        Nombre = txt_Nombre.getText().trim();
        Id = txt_ID.getText().trim();
        Mas_45H = txt_EdadM.getText().trim();
        Mas_55M = txt_EdadM.getText().trim();
        Tabaquismo = txt_Tabaquismo.getText().trim();
        Seden_Mod = txt_SedentarismoM.getText().trim();
        Seden_3di = txt_SedentarismoD.getText().trim();
        Seden_3Mes = txt_SedentarismoMe.getText().trim();
        Obes_102H = txt_ObesidadH.getText().trim();
        Obes_88M = txt_ObesidadM.getText().trim();
        HAS = txt_ObesidadHAS.getText().trim();
        LDL = txt_DisplidemiasLDL.getText().trim();
        HDL = txt_DispliemiasHDL.getText().trim();
        Colest = txt_Colesterol.getText().trim();
        Gluco_Mas100 = txt_Glucosa.getText().trim();
        Hist_Fam = txt_HistoriaFamiliar.getText().trim();
        IAM = txt_IAM.getText().trim();
        Muerte_Sub = txt_MuerteSubita.getText().trim();
        Revas = txt_Revascularizacion.getText().trim();
        Act_Fis = txt_Actividad.getText().trim();
        Frecu = txt_Frecuencia.getText().trim();
        Cant = txt_Cantidad.getText().trim();
        Obser = txt_Observaciones.getText().trim();
        if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
        if(Id.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
        if(Mas_45H.equals("")){
            txt_EdadH.setBackground(Color.red);
            validacion++;
        }
        if(Mas_55M.equals("")){
            txt_EdadM.setBackground(Color.red);
            validacion++;
        }
        if(Tabaquismo.equals("")){
            txt_Tabaquismo.setBackground(Color.red);
            validacion++;
        }
        if(Seden_Mod.equals("")){
            txt_SedentarismoM.setBackground(Color.red);
            validacion++;
        }
        if(Seden_3di.equals("")){
            txt_SedentarismoD.setBackground(Color.red);
            validacion++;
        }
        if(Seden_3Mes.equals("")){
            txt_SedentarismoMe.setBackground(Color.red);
            validacion++;
        }
        if(Obes_102H.equals("")){
            txt_ObesidadH.setBackground(Color.red);
            validacion++;
        }
        if(Obes_88M.equals("")){
            txt_ObesidadM.setBackground(Color.red);
            validacion++;
        }
        if(HAS.equals("")){
            txt_ObesidadHAS.setBackground(Color.red);
            validacion++;
        }
        if(LDL.equals("")){
            txt_DisplidemiasLDL.setBackground(Color.red);
            validacion++;
        }
        if(HDL.equals("")){
            txt_DispliemiasHDL.setBackground(Color.red);
            validacion++;
        }
        if(Colest.equals("")){
            txt_Colesterol.setBackground(Color.red);
            validacion++;
        }
        if(Gluco_Mas100.equals("")){
            txt_Glucosa.setBackground(Color.red);
            validacion++;
        }
        if(Hist_Fam.equals("")){
            txt_HistoriaFamiliar.setBackground(Color.red);
            validacion++;
        }
        if(IAM.equals("")){
            txt_IAM.setBackground(Color.red);
            validacion++;
        }
        if(Muerte_Sub.equals("")){
            txt_MuerteSubita.setBackground(Color.red);
            validacion++;
        }
        if(Revas.equals("")){
            txt_Revascularizacion.setBackground(Color.red);
            validacion++;
        }
        if(Act_Fis.equals("")){
            txt_Actividad.setBackground(Color.red);
            validacion++;
        }
        if(Frecu.equals("")){
            txt_Frecuencia.setBackground(Color.red);
            validacion++;
        }
        if(Cant.equals("")){
            txt_Cantidad.setBackground(Color.red);
            validacion++;
        }
        if(Obser.equals("")){
            txt_Observaciones.setBackground(Color.red);
            validacion++;
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into enfermedades2 values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1, Id);
                PHA.setString(2, Nombre);
                PHA.setString(3, Mas_45H);
                PHA.setString(4, Mas_55M);
                PHA.setString(5, Tabaquismo);
                PHA.setString(6, Seden_Mod);
                PHA.setString(7, Seden_3di);
                PHA.setString(8, Seden_3Mes);
                PHA.setString(9, Obes_102H);
                PHA.setString(10, Obes_88M);
                PHA.setString(11, HAS);
                PHA.setString(12, LDL);
                PHA.setString(13, HDL);
                PHA.setString(14, Colest);
                PHA.setString(15, Gluco_Mas100);
                PHA.setString(16, Hist_Fam);
                PHA.setString(17, IAM);
                PHA.setString(18, Muerte_Sub);
                PHA.setString(19, Revas);
                PHA.setString(20, Act_Fis);
                PHA.setString(21, Frecu);
                PHA.setString(22, Cant);
                PHA.setString(23, Obser);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
txt_EdadM.setBackground(Color.GREEN);
txt_EdadM.setBackground(Color.GREEN);
txt_Tabaquismo.setBackground(Color.GREEN);
txt_SedentarismoM.setBackground(Color.GREEN);
txt_SedentarismoD.setBackground(Color.GREEN);
txt_SedentarismoMe.setBackground(Color.GREEN);
txt_ObesidadH.setBackground(Color.GREEN);
txt_ObesidadM.setBackground(Color.GREEN);
txt_ObesidadHAS.setBackground(Color.GREEN);
txt_DisplidemiasLDL.setBackground(Color.GREEN);
txt_DispliemiasHDL.setBackground(Color.GREEN);
txt_Colesterol.setBackground(Color.GREEN);
txt_Glucosa.setBackground(Color.GREEN);
txt_HistoriaFamiliar.setBackground(Color.GREEN);
txt_IAM.setBackground(Color.GREEN);
txt_MuerteSubita.setBackground(Color.GREEN);
txt_Revascularizacion.setBackground(Color.GREEN);
txt_Actividad.setBackground(Color.GREEN);
txt_Frecuencia.setBackground(Color.GREEN);
txt_Nombre.setBackground(Color.GREEN);
txt_ID.setBackground(Color.GREEN);
txt_Cantidad.setBackground(Color.GREEN);
txt_Observaciones.setBackground(Color.GREEN);
                
                
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
    
        
        
    }//GEN-LAST:event_jButton_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEnfermedades2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Actividad;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Colesterol;
    private javax.swing.JTextField txt_DisplidemiasLDL;
    private javax.swing.JTextField txt_DispliemiasHDL;
    private javax.swing.JTextField txt_EdadH;
    private javax.swing.JTextField txt_EdadM;
    private javax.swing.JTextField txt_Frecuencia;
    private javax.swing.JTextField txt_Glucosa;
    private javax.swing.JTextField txt_HistoriaFamiliar;
    private javax.swing.JTextField txt_IAM;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_MuerteSubita;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_ObesidadH;
    private javax.swing.JTextField txt_ObesidadHAS;
    private javax.swing.JTextField txt_ObesidadM;
    private javax.swing.JTextField txt_Observaciones;
    private javax.swing.JTextField txt_Revascularizacion;
    private javax.swing.JTextField txt_SedentarismoD;
    private javax.swing.JTextField txt_SedentarismoM;
    private javax.swing.JTextField txt_SedentarismoMe;
    private javax.swing.JTextField txt_Tabaquismo;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
txt_EdadM.setText("");
txt_EdadM.setText("");
txt_Tabaquismo.setText("");
txt_SedentarismoM.setText("");
txt_SedentarismoD.setText("");
txt_SedentarismoMe.setText("");
txt_ObesidadH.setText("");
txt_ObesidadM.setText("");
txt_ObesidadHAS.setText("");
txt_DisplidemiasLDL.setText("");
txt_DispliemiasHDL.setText("");
txt_Colesterol.setText("");
txt_Glucosa.setText("");
txt_HistoriaFamiliar.setText("");
txt_IAM.setText("");
txt_MuerteSubita.setText("");
txt_Revascularizacion.setText("");
txt_Actividad.setText("");
txt_Frecuencia.setText("");
txt_Cantidad.setText("");
txt_Observaciones.setText(""); 
txt_Nombre.setText(""); 
txt_ID.setText(""); 
}
}
