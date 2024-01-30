package Interfaces;
import static Interfaces.Administrador.sesion_usuario;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.WindowConstants;

public class InformacionEnfermedades extends javax.swing.JFrame {
    String ID;
    String user;
    int IDcliente_update = 0;

      public InformacionEnfermedades() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        IDcliente_update = GestionarEnfermedades.IDcliente_update;
        setSize(810, 670);
        setResizable(false);
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_NumCliente = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jButton_AgregarEnfermedades = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_Cardiaca = new javax.swing.JTextField();
        txt_Vascular = new javax.swing.JTextField();
        txt_Cerebrovascular = new javax.swing.JTextField();
        txt_Epoc = new javax.swing.JTextField();
        txt_Asma = new javax.swing.JTextField();
        txt_Intersticial = new javax.swing.JTextField();
        txt_Fibrosis = new javax.swing.JTextField();
        txt_DM = new javax.swing.JTextField();
        txt_Tiroides = new javax.swing.JTextField();
        txt_Renal = new javax.swing.JTextField();
        txt_Hepatica = new javax.swing.JTextField();
        txt_Metabolico = new javax.swing.JTextField();
        txt_Dolor = new javax.swing.JTextField();
        txt_Disnea = new javax.swing.JTextField();
        txt_Mareos = new javax.swing.JTextField();
        txt_Ortopnea = new javax.swing.JTextField();
        txt_Edema = new javax.swing.JTextField();
        txt_Taquicardia = new javax.swing.JTextField();
        txt_Claudicacion = new javax.swing.JTextField();
        txt_Fatiga = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("•ENFERMEDAD PULMONAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 282, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("• Asma:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("• Alteración de Tiroides:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("• Enf. Cardiaca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("• Enf Intersticial Pulmonar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("•Disnea en reposo o con  esfuerzos leves:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("• EPOC:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("• Fibrosis Cística ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("• Enf Periférica Vascular:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("• Enf Cerebrovascular:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("•Dolor o molestia en el pecho,  cuello, mandíbula o brazo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 350, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("• Síndrome Metabólico");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("•Edema de tobillo:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("• DM 1 o 2:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("•Mareos o desmayos:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 204, 0));
        jLabel17.setText("INFORMACION DE ENFERMEDADES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 240, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("•Palpitaciones o taquicardia:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, 20));

        jLabel20.setBackground(new java.awt.Color(153, 255, 153));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("•ENFERMEDAD METABOLICA");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("•Claudicación intermitente:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, 20));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("•Fatiga fácil:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("•Ortopnea o Disnea paroxística  nocturna:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, 20));

        jLabel25.setBackground(new java.awt.Color(153, 255, 153));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ESCRIBA SI/NO EN LAS CASIILAS COLOR AZUL PARA CADA CASO:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("• Enf Renal: ");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 20));

        jLabel27.setBackground(new java.awt.Color(153, 255, 153));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ID CLIENTE:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel28.setBackground(new java.awt.Color(153, 255, 153));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("•ENFERMEDAD CARDIOVASCULAR");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel29.setBackground(new java.awt.Color(153, 255, 153));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("NOMBRE:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txt_NumCliente.setBackground(new java.awt.Color(255, 204, 153));
        txt_NumCliente.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_NumCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NumCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_NumCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, -1));

        txt_Nombre.setBackground(new java.awt.Color(255, 204, 153));
        txt_Nombre.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 220, -1));

        jLabel58.setBackground(new java.awt.Color(153, 255, 153));
        jLabel58.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("•SIGNOS Y SINTOMAS");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, 20));

        jButton_AgregarEnfermedades.setBackground(new java.awt.Color(153, 0, 0));
        jButton_AgregarEnfermedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton_AgregarEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarEnfermedadesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AgregarEnfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 100, 100));

        jLabel18.setBackground(new java.awt.Color(51, 255, 153));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 204, 0));
        jLabel18.setText("GUARDAR");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 70, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("• Enf Hepática:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 20));

        txt_Cardiaca.setBackground(new java.awt.Color(153, 153, 255));
        txt_Cardiaca.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Cardiaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cardiaca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Cardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));

        txt_Vascular.setBackground(new java.awt.Color(153, 153, 255));
        txt_Vascular.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Vascular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Vascular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Vascular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, -1));

        txt_Cerebrovascular.setBackground(new java.awt.Color(153, 153, 255));
        txt_Cerebrovascular.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Cerebrovascular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cerebrovascular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Cerebrovascular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        txt_Epoc.setBackground(new java.awt.Color(153, 153, 255));
        txt_Epoc.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Epoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Epoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Epoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, -1));

        txt_Asma.setBackground(new java.awt.Color(153, 153, 255));
        txt_Asma.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Asma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Asma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Asma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, -1));

        txt_Intersticial.setBackground(new java.awt.Color(153, 153, 255));
        txt_Intersticial.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Intersticial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Intersticial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Intersticial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 130, -1));

        txt_Fibrosis.setBackground(new java.awt.Color(153, 153, 255));
        txt_Fibrosis.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Fibrosis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Fibrosis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Fibrosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, -1));

        txt_DM.setBackground(new java.awt.Color(153, 153, 255));
        txt_DM.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_DM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_DM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, -1));

        txt_Tiroides.setBackground(new java.awt.Color(153, 153, 255));
        txt_Tiroides.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Tiroides.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tiroides.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Tiroides, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 130, -1));

        txt_Renal.setBackground(new java.awt.Color(153, 153, 255));
        txt_Renal.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Renal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Renal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Renal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 130, -1));

        txt_Hepatica.setBackground(new java.awt.Color(153, 153, 255));
        txt_Hepatica.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Hepatica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Hepatica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Hepatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 130, -1));

        txt_Metabolico.setBackground(new java.awt.Color(153, 153, 255));
        txt_Metabolico.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Metabolico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Metabolico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Metabolico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 130, -1));

        txt_Dolor.setBackground(new java.awt.Color(153, 153, 255));
        txt_Dolor.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Dolor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Dolor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Dolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 130, -1));

        txt_Disnea.setBackground(new java.awt.Color(153, 153, 255));
        txt_Disnea.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Disnea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Disnea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Disnea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 130, -1));

        txt_Mareos.setBackground(new java.awt.Color(153, 153, 255));
        txt_Mareos.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Mareos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Mareos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Mareos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 130, -1));

        txt_Ortopnea.setBackground(new java.awt.Color(153, 153, 255));
        txt_Ortopnea.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Ortopnea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Ortopnea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Ortopnea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 130, -1));

        txt_Edema.setBackground(new java.awt.Color(153, 153, 255));
        txt_Edema.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Edema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Edema.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Edema, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 130, -1));

        txt_Taquicardia.setBackground(new java.awt.Color(153, 153, 255));
        txt_Taquicardia.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Taquicardia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Taquicardia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Taquicardia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 130, -1));

        txt_Claudicacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_Claudicacion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Claudicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Claudicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Claudicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 130, -1));

        txt_Fatiga.setBackground(new java.awt.Color(153, 153, 255));
        txt_Fatiga.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Fatiga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Fatiga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Fatiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 130, -1));

        jLabel_Wallpaper.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Wallpaper.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AgregarEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarEnfermedadesActionPerformed
        int validacion = 0;
        String 	ID_Pa ,Nombre,Enf_Card,Enf_Per,Enf_Cereb,EPOC,Asma,Enf_Inter,Fibr_Cis,DM,Alt_Tir,Enf_Ren,Enf_Hepa,Sind_Met,Dolor_Braz,Disnea,Mareos,Ortop_Disn,Edema_Tob,Taqui,Claud_Inter,Fat_Fac;
        ID_Pa= txt_NumCliente.getText().trim();
        Nombre = txt_Nombre.getText().trim();
        Enf_Card = txt_Cardiaca.getText().trim();
        Enf_Per = txt_Vascular.getText().trim();
        Enf_Cereb = txt_Cerebrovascular.getText().trim();
        EPOC = txt_Epoc.getText().trim();
        Asma = txt_Asma.getText().trim();
        Enf_Inter = txt_Intersticial.getText().trim();
        Fibr_Cis = txt_Fibrosis.getText().trim();
        DM = txt_DM.getText().trim();
        Alt_Tir = txt_Tiroides.getText().trim();
        Enf_Ren = txt_Renal.getText().trim();
        Enf_Hepa = txt_Hepatica.getText().trim();
        Sind_Met = txt_Metabolico.getText().trim();
        Dolor_Braz = txt_Dolor.getText().trim();
        Disnea = txt_Disnea.getText().trim();
        Mareos = txt_Mareos.getText().trim();
        Ortop_Disn = txt_Ortopnea.getText().trim();
        Edema_Tob = txt_Edema.getText().trim();
        Taqui = txt_Taquicardia.getText().trim();
        Claud_Inter = txt_Claudicacion.getText().trim();
        Fat_Fac = txt_Fatiga.getText().trim();
               
        if(ID_Pa.equals("")){
            txt_NumCliente.setBackground(Color.red);
            validacion++;
        }
        if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
         if(Enf_Card.equals("")){
            txt_Cardiaca.setBackground(Color.red);
            validacion++;
        }
          if(Enf_Per.equals("")){
            txt_Vascular.setBackground(Color.red);
            validacion++;
        }
           if(Enf_Cereb.equals("")){
            txt_Cerebrovascular.setBackground(Color.red);
            validacion++;
        }
            if(EPOC.equals("")){
            txt_Epoc.setBackground(Color.red);
            validacion++;
        }
             if(Asma.equals("")){
            txt_Asma.setBackground(Color.red);
            validacion++;
        }
              if(Enf_Inter.equals("")){
            txt_Intersticial.setBackground(Color.red);
            validacion++;
        }
               if(Fibr_Cis.equals("")){
            txt_Fibrosis.setBackground(Color.red);
            validacion++;
        }
                if(DM.equals("")){
            txt_DM.setBackground(Color.red);
            validacion++;
        }
                 if(Alt_Tir.equals("")){
            txt_Tiroides.setBackground(Color.red);
            validacion++;
        }
                  if(Enf_Ren.equals("")){
            txt_Renal.setBackground(Color.red);
            validacion++;
        }
                   if(Enf_Hepa.equals("")){
            txt_Hepatica.setBackground(Color.red);
            validacion++;
        }
                    if(Sind_Met.equals("")){
            txt_Metabolico.setBackground(Color.red);
            validacion++;
        }
                     if(Dolor_Braz.equals("")){
            txt_Dolor.setBackground(Color.red);
            validacion++;
        }
                      if(Disnea.equals("")){
            txt_Disnea.setBackground(Color.red);
            validacion++;
        }
                       if(Mareos.equals("")){
            txt_Mareos.setBackground(Color.red);
            validacion++;
        }
                        if(Ortop_Disn.equals("")){
            txt_Ortopnea.setBackground(Color.red);
            validacion++;
        }
                         if(Edema_Tob.equals("")){
            txt_Edema.setBackground(Color.red);
            validacion++;
        }
                          if(Taqui.equals("")){
            txt_Taquicardia.setBackground(Color.red);
            validacion++;
        }
                           if(Claud_Inter.equals("")){
            txt_Claudicacion.setBackground(Color.red);
            validacion++;
        }
                            if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
                             if(Fat_Fac.equals("")){
            txt_Fatiga.setBackground(Color.red);
            validacion++;
        }
            if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into enfermedades values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1,ID_Pa);
                PHA.setString(2, Nombre);
                PHA.setString(3, Enf_Card);
                PHA.setString(4, Enf_Per);
                PHA.setString(5, Enf_Cereb);
                PHA.setString(6, EPOC);
                PHA.setString(7, Asma);
                PHA.setString(8, Enf_Inter);
                PHA.setString(9, Fibr_Cis);
                PHA.setString(10, DM);
                PHA.setString(11, Alt_Tir);
                PHA.setString(12, Enf_Ren);
                PHA.setString(13, Enf_Hepa);
                PHA.setString(14, Sind_Met);
                PHA.setString(15, Dolor_Braz);
                PHA.setString(16, Disnea);
                PHA.setString(17, Mareos);
                PHA.setString(18, Ortop_Disn);
                PHA.setString(19, Edema_Tob);
                PHA.setString(20, Taqui);
                PHA.setString(21, Claud_Inter);
                PHA.setString(22, Fat_Fac);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
                txt_NumCliente.setText("");
txt_Nombre.setBackground(Color.GREEN);
txt_Cardiaca.setBackground(Color.GREEN);
txt_Vascular.setBackground(Color.GREEN);
txt_Cerebrovascular.setBackground(Color.GREEN);
txt_Epoc.setBackground(Color.GREEN);
txt_Asma.setBackground(Color.GREEN);
txt_Intersticial.setBackground(Color.GREEN);
txt_Fibrosis.setBackground(Color.GREEN);
txt_DM.setBackground(Color.GREEN);
txt_Tiroides.setBackground(Color.GREEN);
txt_Renal.setBackground(Color.GREEN);
txt_Hepatica.setBackground(Color.GREEN);
txt_Metabolico.setBackground(Color.GREEN);
txt_Dolor.setBackground(Color.GREEN);
txt_Disnea.setBackground(Color.GREEN);
txt_Mareos.setBackground(Color.GREEN);
txt_Ortopnea.setBackground(Color.GREEN);
txt_Edema.setBackground(Color.GREEN);
txt_Taquicardia.setBackground(Color.GREEN);
txt_Claudicacion.setBackground(Color.GREEN);
txt_Fatiga.setBackground(Color.GREEN);          
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                 InformacionEnfermedades2 gestionarEnfermedades2 = new InformacionEnfermedades2();
                 gestionarEnfermedades2.setVisible(true);
}catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
   }
   }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");

    }//GEN-LAST:event_jButton_AgregarEnfermedadesActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEnfermedades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregarEnfermedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Asma;
    private javax.swing.JTextField txt_Cardiaca;
    private javax.swing.JTextField txt_Cerebrovascular;
    private javax.swing.JTextField txt_Claudicacion;
    private javax.swing.JTextField txt_DM;
    private javax.swing.JTextField txt_Disnea;
    private javax.swing.JTextField txt_Dolor;
    private javax.swing.JTextField txt_Edema;
    private javax.swing.JTextField txt_Epoc;
    private javax.swing.JTextField txt_Fatiga;
    private javax.swing.JTextField txt_Fibrosis;
    private javax.swing.JTextField txt_Hepatica;
    private javax.swing.JTextField txt_Intersticial;
    private javax.swing.JTextField txt_Mareos;
    private javax.swing.JTextField txt_Metabolico;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NumCliente;
    private javax.swing.JTextField txt_Ortopnea;
    private javax.swing.JTextField txt_Renal;
    private javax.swing.JTextField txt_Taquicardia;
    private javax.swing.JTextField txt_Tiroides;
    private javax.swing.JTextField txt_Vascular;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
txt_NumCliente.setText("");
txt_Nombre.setText("");
txt_Cardiaca.setText("");
txt_Vascular.setText("");
txt_Cerebrovascular.setText("");
txt_Epoc.setText("");
txt_Asma.setText("");
txt_Intersticial.setText("");
txt_Fibrosis.setText("");
txt_DM.setText("");
txt_Tiroides.setText("");
txt_Renal.setText("");
txt_Hepatica.setText("");
txt_Metabolico.setText("");
txt_Dolor.setText("");
txt_Disnea.setText("");
txt_Mareos.setText("");
txt_Ortopnea.setText("");
txt_Edema.setText("");
txt_Taquicardia.setText("");
txt_Claudicacion.setText("");
txt_Fatiga.setText("");
};
public void combertir(){
}
}
