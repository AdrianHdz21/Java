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


public class RegistrarAntropometria extends javax.swing.JFrame {

   int IDcliente_update = 0;
    String user,ID;
    public RegistrarAntropometria() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(800, 550);
        IDcliente_update = GestionarAntropometria.IDcliente_update; 
        setResizable(false);
           setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper10.jpg");
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_PesoHa = new javax.swing.JTextField();
        txt_CambioPeso = new javax.swing.JTextField();
        txt_Peso1 = new javax.swing.JTextField();
        txt_Peso2 = new javax.swing.JTextField();
        txt_Peso3 = new javax.swing.JTextField();
        txt_Peso4 = new javax.swing.JTextField();
        txt_Talla1 = new javax.swing.JTextField();
        txt_IMC1 = new javax.swing.JTextField();
        txt_Cintura1 = new javax.swing.JTextField();
        txt_Triceps1 = new javax.swing.JTextField();
        txt_CBRAZO1 = new javax.swing.JTextField();
        txt_Biceps1 = new javax.swing.JTextField();
        txt_Subescapular1 = new javax.swing.JTextField();
        txt_Suprailiaco1 = new javax.swing.JTextField();
        txt_Abdominal1 = new javax.swing.JTextField();
        txt_Grasa1 = new javax.swing.JTextField();
        txt_Talla2 = new javax.swing.JTextField();
        txt_IMC2 = new javax.swing.JTextField();
        txt_Cintura2 = new javax.swing.JTextField();
        txt_CBRAZO2 = new javax.swing.JTextField();
        txt_Triceps2 = new javax.swing.JTextField();
        txt_Biceps2 = new javax.swing.JTextField();
        txt_Subescapular2 = new javax.swing.JTextField();
        txt_Suprailiaco2 = new javax.swing.JTextField();
        txt_Abdominal2 = new javax.swing.JTextField();
        txt_Grasa2 = new javax.swing.JTextField();
        txt_Talla3 = new javax.swing.JTextField();
        txt_IMC3 = new javax.swing.JTextField();
        txt_Cintura3 = new javax.swing.JTextField();
        txt_CBRAZO3 = new javax.swing.JTextField();
        txt_Triceps3 = new javax.swing.JTextField();
        txt_Biceps3 = new javax.swing.JTextField();
        txt_Subescapular3 = new javax.swing.JTextField();
        txt_Talla4 = new javax.swing.JTextField();
        txt_IMC4 = new javax.swing.JTextField();
        txt_Cintura4 = new javax.swing.JTextField();
        txt_CBRAZO4 = new javax.swing.JTextField();
        txt_Triceps4 = new javax.swing.JTextField();
        txt_Biceps4 = new javax.swing.JTextField();
        txt_Subescapular4 = new javax.swing.JTextField();
        txt_Grasa3 = new javax.swing.JTextField();
        txt_Suprailiaco3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_Suprailiaco4 = new javax.swing.JTextField();
        txt_Abdominal4 = new javax.swing.JTextField();
        txt_Abdominal3 = new javax.swing.JTextField();
        txt_Grasa4 = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID CLIENTE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("REGISTRAR ANTROPOMETRIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PESO HABITUAL:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("CAMBIO DE PESO EN LOS ULTIMOS 6 MESES:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("PESO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("TALLA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("IMC");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("CINTURA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("C.BRAZO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("P.BICEPS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("P.SUBESCAPULAR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("P.SUPRAILIACO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("P.ABDOMINAL");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("% DE GRASA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("FECHA");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("FECHA");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("FECHA");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("MEDIDA");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(204, 255, 102));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, -1));

        txt_ID.setBackground(new java.awt.Color(204, 255, 102));
        txt_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 230, -1));

        txt_PesoHa.setBackground(new java.awt.Color(204, 255, 102));
        txt_PesoHa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_PesoHa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_PesoHa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 220, -1));

        txt_CambioPeso.setBackground(new java.awt.Color(204, 255, 102));
        txt_CambioPeso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_CambioPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_CambioPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, -1));

        txt_Peso1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Peso1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Peso1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Peso1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, -1));

        txt_Peso2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Peso2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Peso2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Peso2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Peso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 120, -1));

        txt_Peso3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Peso3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Peso3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Peso3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Peso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 120, -1));

        txt_Peso4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Peso4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Peso4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Peso4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Peso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 120, -1));

        txt_Talla1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Talla1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Talla1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Talla1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Talla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        txt_IMC1.setBackground(new java.awt.Color(255, 153, 153));
        txt_IMC1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_IMC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_IMC1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_IMC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        txt_Cintura1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Cintura1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Cintura1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cintura1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Cintura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, -1));

        txt_Triceps1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Triceps1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Triceps1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Triceps1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Triceps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, -1));

        txt_CBRAZO1.setBackground(new java.awt.Color(255, 153, 153));
        txt_CBRAZO1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CBRAZO1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CBRAZO1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CBRAZO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, -1));

        txt_Biceps1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Biceps1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Biceps1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Biceps1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Biceps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 120, -1));

        txt_Subescapular1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Subescapular1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Subescapular1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Subescapular1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Subescapular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 120, -1));

        txt_Suprailiaco1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Suprailiaco1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Suprailiaco1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Suprailiaco1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Suprailiaco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 120, -1));

        txt_Abdominal1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Abdominal1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Abdominal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Abdominal1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Abdominal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 120, -1));

        txt_Grasa1.setBackground(new java.awt.Color(255, 153, 153));
        txt_Grasa1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Grasa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Grasa1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Grasa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 120, -1));

        txt_Talla2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Talla2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Talla2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Talla2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Talla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 120, -1));

        txt_IMC2.setBackground(new java.awt.Color(255, 153, 153));
        txt_IMC2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_IMC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_IMC2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_IMC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 120, -1));

        txt_Cintura2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Cintura2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Cintura2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cintura2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Cintura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 120, -1));

        txt_CBRAZO2.setBackground(new java.awt.Color(255, 153, 153));
        txt_CBRAZO2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CBRAZO2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CBRAZO2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CBRAZO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 120, -1));

        txt_Triceps2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Triceps2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Triceps2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Triceps2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Triceps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 120, -1));

        txt_Biceps2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Biceps2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Biceps2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Biceps2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Biceps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 120, -1));

        txt_Subescapular2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Subescapular2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Subescapular2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Subescapular2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Subescapular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 120, -1));

        txt_Suprailiaco2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Suprailiaco2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Suprailiaco2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Suprailiaco2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Suprailiaco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 120, -1));

        txt_Abdominal2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Abdominal2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Abdominal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Abdominal2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Abdominal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 120, -1));

        txt_Grasa2.setBackground(new java.awt.Color(255, 153, 153));
        txt_Grasa2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Grasa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Grasa2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Grasa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 120, -1));

        txt_Talla3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Talla3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Talla3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Talla3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Talla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 120, -1));

        txt_IMC3.setBackground(new java.awt.Color(255, 153, 153));
        txt_IMC3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_IMC3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_IMC3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_IMC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 120, -1));

        txt_Cintura3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Cintura3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Cintura3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cintura3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Cintura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 120, -1));

        txt_CBRAZO3.setBackground(new java.awt.Color(255, 153, 153));
        txt_CBRAZO3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CBRAZO3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CBRAZO3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CBRAZO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 120, -1));

        txt_Triceps3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Triceps3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Triceps3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Triceps3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Triceps3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 120, -1));

        txt_Biceps3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Biceps3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Biceps3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Biceps3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Biceps3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 120, -1));

        txt_Subescapular3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Subescapular3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Subescapular3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Subescapular3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Subescapular3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 120, -1));

        txt_Talla4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Talla4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Talla4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Talla4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Talla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 120, -1));

        txt_IMC4.setBackground(new java.awt.Color(255, 153, 153));
        txt_IMC4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_IMC4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_IMC4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_IMC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 120, -1));

        txt_Cintura4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Cintura4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Cintura4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cintura4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Cintura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 120, 20));

        txt_CBRAZO4.setBackground(new java.awt.Color(255, 153, 153));
        txt_CBRAZO4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CBRAZO4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CBRAZO4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CBRAZO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 120, -1));

        txt_Triceps4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Triceps4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Triceps4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Triceps4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Triceps4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 120, -1));

        txt_Biceps4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Biceps4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Biceps4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Biceps4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Biceps4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 120, -1));

        txt_Subescapular4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Subescapular4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Subescapular4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Subescapular4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Subescapular4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 120, -1));

        txt_Grasa3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Grasa3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Grasa3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Grasa3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Grasa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 120, -1));

        txt_Suprailiaco3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Suprailiaco3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Suprailiaco3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Suprailiaco3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Suprailiaco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 120, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("FECHA");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("P.TRICEPS");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txt_Suprailiaco4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Suprailiaco4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Suprailiaco4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Suprailiaco4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Suprailiaco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 120, -1));

        txt_Abdominal4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Abdominal4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Abdominal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Abdominal4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Abdominal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 120, -1));

        txt_Abdominal3.setBackground(new java.awt.Color(255, 153, 153));
        txt_Abdominal3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Abdominal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Abdominal3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Abdominal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 120, -1));

        txt_Grasa4.setBackground(new java.awt.Color(255, 153, 153));
        txt_Grasa4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Grasa4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Grasa4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Grasa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 120, -1));

        jButton_Guardar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 100, 100));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        jLabel21.setBackground(new java.awt.Color(102, 255, 102));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("GUARDAR");
        jLabel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        int validacion = 0;
        String Nombre,Numc,PesoH,CamPeso,Peso1,Peso2,Peso3,Peso4,Peso5,Talla1,Talla2,Talla3,Talla4,Talla5,IMC1,IMC2,IMC3,IMC4,IMC5,Cint1,Cint2,Cint3,Cint4,Cint5,Brazo1,Brazo2,Brazo3,Brazo4,Brazo5;
        String Tric1,Tric2,Tric3,Tric4,Tric5,Bic1,Bic2,Bic3,Bic4,Bic5,Sub1,Sub2,Sub3,Sub4,Sub5,Supra1,Supra2,Supra3,Supra4,Supra5,Abdo1,Abdo2,Abdo3,Abdo4,Abdo5,Grasa1,Grasa2,Grasa3,Grasa4,Grasa5;
        Nombre = txt_Nombre.getText().trim();
        Numc = txt_ID.getText().trim();
        PesoH = txt_PesoHa.getText().trim();
        CamPeso = txt_CambioPeso.getText().trim();
        Peso1 = txt_Peso1.getText().trim();
        Peso2 = txt_Peso2.getText().trim();
        Peso3 = txt_Peso3.getText().trim();
        Peso4 = txt_Peso4.getText().trim();
        Talla1 = txt_Talla1.getText().trim();
        Talla2 = txt_Talla2.getText().trim();
        Talla3 = txt_Talla3.getText().trim();
        Talla4 = txt_Talla4.getText().trim();
        IMC1 = txt_IMC1.getText().trim();
        IMC2 = txt_IMC2.getText().trim();
        IMC3 = txt_IMC3.getText().trim();
        IMC4 = txt_IMC4.getText().trim();
        Cint1 = txt_Cintura1.getText().trim();
        Cint2 = txt_Cintura2.getText().trim();
        Cint3 = txt_Cintura3.getText().trim();
        Cint4 = txt_Cintura4.getText().trim();
        Brazo1 = txt_CBRAZO1.getText().trim();
        Brazo2 = txt_CBRAZO2.getText().trim();
        Brazo3 = txt_CBRAZO3.getText().trim();
        Brazo4 = txt_CBRAZO4.getText().trim();
        Tric1 = txt_Triceps1.getText().trim();
        Tric2 = txt_Triceps2.getText().trim();
        Tric3 = txt_Triceps3.getText().trim();
        Tric4 = txt_Triceps4.getText().trim();
        Bic1 = txt_Biceps1.getText().trim();
        Bic2 = txt_Biceps2.getText().trim();
        Bic3 = txt_Biceps3.getText().trim();
        Bic4 = txt_Biceps4.getText().trim();
        Sub1 = txt_Subescapular1.getText().trim();
        Sub2 = txt_Subescapular2.getText().trim();
        Sub3 = txt_Subescapular3.getText().trim();
        Sub4 = txt_Subescapular4.getText().trim();
        Supra1 = txt_Suprailiaco1.getText().trim();
        Supra2 = txt_Suprailiaco2.getText().trim();
        Supra3 = txt_Suprailiaco3.getText().trim();
        Supra4 = txt_Suprailiaco4.getText().trim();
        Abdo1 = txt_Abdominal1.getText().trim();
        Abdo2 = txt_Abdominal2.getText().trim();
        Abdo3 = txt_Abdominal3.getText().trim();
        Abdo4 = txt_Abdominal4.getText().trim();
        Grasa1 = txt_Grasa1.getText().trim();
        Grasa2 = txt_Grasa2.getText().trim();
        Grasa3 = txt_Grasa3.getText().trim();
        Grasa4 = txt_Grasa4.getText().trim();
         if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
          if(Numc.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
           if(PesoH.equals("")){
            txt_PesoHa.setBackground(Color.red);
            validacion++;
        }
            if(CamPeso.equals("")){
            txt_CambioPeso.setBackground(Color.red);
            validacion++;
        }
             if(Peso1.equals("")){
            txt_Peso1.setBackground(Color.red);
            validacion++;
        }
           if(Talla1.equals("")){
            txt_Talla1.setBackground(Color.red);
            validacion++;
        }
          if(IMC1.equals("")){
          txt_IMC1.setBackground(Color.red);
         validacion++;
        }
         if(Cint1.equals("")){
            txt_Cintura1.setBackground(Color.red);
            validacion++;
        }
            if(Brazo1.equals("")){
            txt_CBRAZO1.setBackground(Color.red);
            validacion++;
        }
           if(Tric1.equals("")){
            txt_Triceps1.setBackground(Color.red);
            validacion++;
        }
            if(Sub1.equals("")){
            txt_Subescapular1.setBackground(Color.red);
            validacion++;
        }
            if(Supra1.equals("")){
            txt_Suprailiaco1.setBackground(Color.red);
            validacion++;
        }
             if(Abdo1.equals("")){
            txt_Abdominal1.setBackground(Color.red);
            validacion++;
        }
        if(Grasa1.equals("")){
            txt_Grasa1.setBackground(Color.red);
            validacion++;
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into antropo values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        PHA.setString(1,Numc);
        PHA.setString(2, Nombre);
        PHA.setString(3, PesoH);
        PHA.setString(4, CamPeso);
        PHA.setString(5, Peso1);
        PHA.setString(6, Peso2);
        PHA.setString(7, Peso3);
        PHA.setString(8, Peso4);
        PHA.setString(9, Talla1);
        PHA.setString(10, Talla2);
        PHA.setString(11, Talla3);
        PHA.setString(12, Talla4);
        PHA.setString(13, IMC1);
        PHA.setString(14, IMC2);
        PHA.setString(15, IMC3);
        PHA.setString(16, IMC4);
        PHA.setString(17, Cint1);
        PHA.setString(18, Cint2);
        PHA.setString(19, Cint3);
        PHA.setString(20, Cint4);
        PHA.setString(21, Brazo1);
        PHA.setString(22, Brazo2);
        PHA.setString(23, Brazo3);
        PHA.setString(24, Brazo4);
        PHA.setString(25, Tric1);
        PHA.setString(26, Tric2);
        PHA.setString(27, Tric3);
        PHA.setString(28, Tric4);
        PHA.setString(29, Bic1);
        PHA.setString(30, Bic2);
        PHA.setString(31, Bic3);
        PHA.setString(32, Bic4);
        PHA.setString(33, Sub1);
        PHA.setString(34, Sub2);
        PHA.setString(35, Sub3);
        PHA.setString(36, Sub4);
        PHA.setString(37, Supra1);
        PHA.setString(38, Supra2);
        PHA.setString(39, Supra3);
        PHA.setString(40, Supra4);
        PHA.setString(41, Abdo1);
        PHA.setString(42, Abdo2);
        PHA.setString(43, Abdo3);
        PHA.setString(44, Abdo4);
        PHA.setString(45, Grasa1);
        PHA.setString(46, Grasa2);
        PHA.setString(47, Grasa3);
        PHA.setString(48, Grasa4);
               
        
                PHA.executeUpdate();
                HA.close();
                Limpiar();
txt_Nombre.setBackground(Color.GREEN);    
txt_ID.setBackground(Color.GREEN);    
txt_PesoHa.setBackground(Color.GREEN);    
txt_CambioPeso.setBackground(Color.GREEN);    
txt_Peso1.setBackground(Color.GREEN);    
txt_Peso2.setBackground(Color.GREEN);    
txt_Peso3.setBackground(Color.GREEN);    
txt_Peso4.setBackground(Color.GREEN);    
txt_Talla1.setBackground(Color.GREEN);    
txt_Talla2.setBackground(Color.GREEN);    
txt_Talla3.setBackground(Color.GREEN);    
txt_Talla4.setBackground(Color.GREEN);    
txt_IMC1.setBackground(Color.GREEN);    
txt_IMC2.setBackground(Color.GREEN);    
txt_IMC3.setBackground(Color.GREEN);    
txt_IMC4.setBackground(Color.GREEN);    
txt_Cintura1.setBackground(Color.GREEN);    
txt_Cintura2.setBackground(Color.GREEN);    
txt_Cintura3.setBackground(Color.GREEN);    
txt_Cintura4.setBackground(Color.GREEN);    
txt_CBRAZO1.setBackground(Color.GREEN);    
txt_CBRAZO2.setBackground(Color.GREEN);    
txt_CBRAZO3.setBackground(Color.GREEN);    
txt_CBRAZO4.setBackground(Color.GREEN);    
txt_Triceps1.setBackground(Color.GREEN);    
txt_Triceps2.setBackground(Color.GREEN);    
txt_Triceps3.setBackground(Color.GREEN);    
txt_Triceps4.setBackground(Color.GREEN);    
txt_Biceps1.setBackground(Color.GREEN);    
txt_Biceps2.setBackground(Color.GREEN);    
txt_Biceps3.setBackground(Color.GREEN);    
txt_Biceps4.setBackground(Color.GREEN);    
txt_Subescapular1.setBackground(Color.GREEN);    
txt_Subescapular2.setBackground(Color.GREEN);    
txt_Subescapular3.setBackground(Color.GREEN);    
txt_Subescapular4.setBackground(Color.GREEN);    
txt_Suprailiaco1.setBackground(Color.GREEN);    
txt_Suprailiaco2.setBackground(Color.GREEN);    
txt_Suprailiaco3.setBackground(Color.GREEN);    
txt_Suprailiaco4.setBackground(Color.GREEN);    
txt_Abdominal1.setBackground(Color.GREEN);    
txt_Abdominal2.setBackground(Color.GREEN);    
txt_Abdominal3.setBackground(Color.GREEN);    
txt_Abdominal4.setBackground(Color.GREEN);    
txt_Grasa1.setBackground(Color.GREEN);    
txt_Grasa2.setBackground(Color.GREEN);    
txt_Grasa3.setBackground(Color.GREEN);    
txt_Grasa4.setBackground(Color.GREEN);  
  JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }else
            JOptionPane.showMessageDialog(null, "Debes llenar todos los datos");
    
    }//GEN-LAST:event_jButton_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAntropometria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Abdominal1;
    private javax.swing.JTextField txt_Abdominal2;
    private javax.swing.JTextField txt_Abdominal3;
    private javax.swing.JTextField txt_Abdominal4;
    private javax.swing.JTextField txt_Biceps1;
    private javax.swing.JTextField txt_Biceps2;
    private javax.swing.JTextField txt_Biceps3;
    private javax.swing.JTextField txt_Biceps4;
    private javax.swing.JTextField txt_CBRAZO1;
    private javax.swing.JTextField txt_CBRAZO2;
    private javax.swing.JTextField txt_CBRAZO3;
    private javax.swing.JTextField txt_CBRAZO4;
    private javax.swing.JTextField txt_CambioPeso;
    private javax.swing.JTextField txt_Cintura1;
    private javax.swing.JTextField txt_Cintura2;
    private javax.swing.JTextField txt_Cintura3;
    private javax.swing.JTextField txt_Cintura4;
    private javax.swing.JTextField txt_Grasa1;
    private javax.swing.JTextField txt_Grasa2;
    private javax.swing.JTextField txt_Grasa3;
    private javax.swing.JTextField txt_Grasa4;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_IMC1;
    private javax.swing.JTextField txt_IMC2;
    private javax.swing.JTextField txt_IMC3;
    private javax.swing.JTextField txt_IMC4;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Peso1;
    private javax.swing.JTextField txt_Peso2;
    private javax.swing.JTextField txt_Peso3;
    private javax.swing.JTextField txt_Peso4;
    private javax.swing.JTextField txt_PesoHa;
    private javax.swing.JTextField txt_Subescapular1;
    private javax.swing.JTextField txt_Subescapular2;
    private javax.swing.JTextField txt_Subescapular3;
    private javax.swing.JTextField txt_Subescapular4;
    private javax.swing.JTextField txt_Suprailiaco1;
    private javax.swing.JTextField txt_Suprailiaco2;
    private javax.swing.JTextField txt_Suprailiaco3;
    private javax.swing.JTextField txt_Suprailiaco4;
    private javax.swing.JTextField txt_Talla1;
    private javax.swing.JTextField txt_Talla2;
    private javax.swing.JTextField txt_Talla3;
    private javax.swing.JTextField txt_Talla4;
    private javax.swing.JTextField txt_Triceps1;
    private javax.swing.JTextField txt_Triceps2;
    private javax.swing.JTextField txt_Triceps3;
    private javax.swing.JTextField txt_Triceps4;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
txt_Nombre.setText("");    
txt_ID.setText("");    
txt_PesoHa.setText("");    
txt_CambioPeso.setText("");    
txt_Peso1.setText("");    
txt_Peso2.setText("");    
txt_Peso3.setText("");    
txt_Peso4.setText("");    
txt_Talla1.setText("");    
txt_Talla2.setText("");    
txt_Talla3.setText("");    
txt_Talla4.setText("");    
txt_IMC1.setText("");    
txt_IMC2.setText("");    
txt_IMC3.setText("");    
txt_IMC4.setText("");    
txt_Cintura1.setText("");    
txt_Cintura2.setText("");    
txt_Cintura3.setText("");    
txt_Cintura4.setText("");    
txt_CBRAZO1.setText("");    
txt_CBRAZO2.setText("");    
txt_CBRAZO3.setText("");    
txt_CBRAZO4.setText("");    
txt_Triceps1.setText("");    
txt_Triceps2.setText("");    
txt_Triceps3.setText("");    
txt_Triceps4.setText("");    
txt_Biceps1.setText("");    
txt_Biceps2.setText("");    
txt_Biceps3.setText("");    
txt_Biceps4.setText("");    
txt_Subescapular1.setText("");    
txt_Subescapular2.setText("");    
txt_Subescapular3.setText("");    
txt_Subescapular4.setText("");     
txt_Suprailiaco1.setText("");    
txt_Suprailiaco2.setText("");    
txt_Suprailiaco3.setText("");    
txt_Suprailiaco4.setText("");    
txt_Abdominal1.setText("");    
txt_Abdominal2.setText("");    
txt_Abdominal3.setText("");    
txt_Abdominal4.setText("");    
txt_Grasa1.setText("");    
txt_Grasa2.setText("");    
txt_Grasa3.setText("");    
txt_Grasa4.setText("");    
}
        }