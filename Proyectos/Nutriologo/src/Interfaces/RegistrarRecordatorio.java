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


public class RegistrarRecordatorio extends javax.swing.JFrame {
int IDcliente_update = 0;
    String user,ID;
    public RegistrarRecordatorio() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        IDcliente_update = GestionarRecordatorio.IDcliente_update; 
        setSize(1000, 500);
        setResizable(false);
        IDcliente_update = GestionarHabitos.IDcliente_update;             
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Alim1 = new javax.swing.JTextField();
        txt_Alim2 = new javax.swing.JTextField();
        txt_Alim3 = new javax.swing.JTextField();
        txt_Alim4 = new javax.swing.JTextField();
        txt_Alim5 = new javax.swing.JTextField();
        txt_Alim6 = new javax.swing.JTextField();
        txt_Alim7 = new javax.swing.JTextField();
        txt_Alim8 = new javax.swing.JTextField();
        txt_Tipo1 = new javax.swing.JTextField();
        txt_Tipo2 = new javax.swing.JTextField();
        txt_Tipo3 = new javax.swing.JTextField();
        txt_Tipo4 = new javax.swing.JTextField();
        txt_Tipo5 = new javax.swing.JTextField();
        txt_Tipo6 = new javax.swing.JTextField();
        txt_Tipo7 = new javax.swing.JTextField();
        txt_Tipo8 = new javax.swing.JTextField();
        txt_Marca1 = new javax.swing.JTextField();
        txt_Marca2 = new javax.swing.JTextField();
        txt_Marca3 = new javax.swing.JTextField();
        txt_Marca4 = new javax.swing.JTextField();
        txt_Marca5 = new javax.swing.JTextField();
        txt_Marca6 = new javax.swing.JTextField();
        txt_Marca7 = new javax.swing.JTextField();
        txt_Marca8 = new javax.swing.JTextField();
        txt_CantidadCa1 = new javax.swing.JTextField();
        txt_CantidadCa2 = new javax.swing.JTextField();
        txt_CantidadCa3 = new javax.swing.JTextField();
        txt_CantidadCa4 = new javax.swing.JTextField();
        txt_CantidadCa5 = new javax.swing.JTextField();
        txt_CantidadCa6 = new javax.swing.JTextField();
        txt_CantidadCa7 = new javax.swing.JTextField();
        txt_CantidadCa8 = new javax.swing.JTextField();
        txt_CantidaMM1 = new javax.swing.JTextField();
        txt_CantidaMM2 = new javax.swing.JTextField();
        txt_CantidaMM3 = new javax.swing.JTextField();
        txt_CantidaMM4 = new javax.swing.JTextField();
        txt_CantidaMM5 = new javax.swing.JTextField();
        txt_CantidaMM6 = new javax.swing.JTextField();
        txt_CantidaMM7 = new javax.swing.JTextField();
        txt_CantidaMM8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAR RECORDATORIO 24 HORAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALIMENTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(MED.CASERA)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MARCA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("ID CLIENTE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MM O G/DIA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CANTIDAD");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        txt_Alim1.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 150, -1));

        txt_Alim2.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 150, -1));

        txt_Alim3.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 150, -1));

        txt_Alim4.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 150, -1));

        txt_Alim5.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim5.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 150, -1));

        txt_Alim6.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim6.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 150, -1));

        txt_Alim7.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim7.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, -1));

        txt_Alim8.setBackground(new java.awt.Color(153, 204, 255));
        txt_Alim8.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Alim8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Alim8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Alim8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 150, -1));

        txt_Tipo1.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 150, -1));

        txt_Tipo2.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 150, -1));

        txt_Tipo3.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, -1));

        txt_Tipo4.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, -1));

        txt_Tipo5.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo5.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 150, -1));

        txt_Tipo6.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo6.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 150, -1));

        txt_Tipo7.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo7.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 150, -1));

        txt_Tipo8.setBackground(new java.awt.Color(153, 204, 255));
        txt_Tipo8.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Tipo8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Tipo8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Tipo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 150, -1));

        txt_Marca1.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 150, -1));

        txt_Marca2.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 150, -1));

        txt_Marca3.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 150, -1));

        txt_Marca4.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 150, -1));

        txt_Marca5.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca5.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 150, -1));

        txt_Marca6.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca6.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 150, -1));

        txt_Marca7.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca7.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 150, -1));

        txt_Marca8.setBackground(new java.awt.Color(153, 204, 255));
        txt_Marca8.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_Marca8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Marca8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Marca8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 150, -1));

        txt_CantidadCa1.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 150, -1));

        txt_CantidadCa2.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 150, -1));

        txt_CantidadCa3.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 150, -1));

        txt_CantidadCa4.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 150, -1));

        txt_CantidadCa5.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa5.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 150, -1));

        txt_CantidadCa6.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa6.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 150, -1));

        txt_CantidadCa7.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa7.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 150, -1));

        txt_CantidadCa8.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidadCa8.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidadCa8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadCa8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidadCa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 150, -1));

        txt_CantidaMM1.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM1.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 150, -1));

        txt_CantidaMM2.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM2.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 150, -1));

        txt_CantidaMM3.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM3.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 150, -1));

        txt_CantidaMM4.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 150, -1));

        txt_CantidaMM5.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM5.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 150, -1));

        txt_CantidaMM6.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM6.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 150, -1));

        txt_CantidaMM7.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM7.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 150, -1));

        txt_CantidaMM8.setBackground(new java.awt.Color(153, 204, 255));
        txt_CantidaMM8.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        txt_CantidaMM8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidaMM8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_CantidaMM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 150, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TIPO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("NOMBRE:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(255, 102, 102));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 260, -1));

        txt_ID.setBackground(new java.awt.Color(255, 102, 102));
        txt_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 260, -1));

        jButton_Guardar.setBackground(new java.awt.Color(153, 0, 0));
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 100));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 990, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        int validacion = 0;
        String Nombre,NumC,Alim1,Alim2,Alim3,Alim4,Alim5,Alim6,Alim7,Alim8,Tipo1,Tipo2,Tipo3,Tipo4,Tipo5,Tipo6,Tipo7,Tipo8,Marca1,Marca2,Marca3,Marca4,Marca5,Marca6,Marca7,Marca8;
        String CantCa1,CantCa2,CantCa3,CantCa4,CantCa5,CantCa6,CantCa7,CantCa8,CantMM1,CantMM2,CantMM3,CantMM4,CantMM5,CantMM6,CantMM7,CantMM8;
        Nombre = txt_Nombre.getText().trim();
        NumC = txt_ID.getText().trim();
        Alim1 = txt_Alim1.getText().trim();
        Alim2 = txt_Alim2.getText().trim();
        Alim3 = txt_Alim3.getText().trim();
        Alim4 = txt_Alim4.getText().trim();
        Alim5 = txt_Alim5.getText().trim();
        Alim6 = txt_Alim6.getText().trim();
        Alim7 = txt_Alim7.getText().trim();
        Alim8 = txt_Alim8.getText().trim();
        Tipo1 = txt_Tipo1.getText().trim();
        Tipo2 = txt_Tipo2.getText().trim();
        Tipo3 = txt_Tipo3.getText().trim();
        Tipo4 = txt_Tipo4.getText().trim();
        Tipo5 = txt_Tipo5.getText().trim();
        Tipo6 = txt_Tipo6.getText().trim();
        Tipo7 = txt_Tipo7.getText().trim();
        Tipo8 = txt_Tipo8.getText().trim();
        Marca1 = txt_Marca1.getText().trim();
        Marca2 = txt_Marca2.getText().trim();
        Marca3 = txt_Marca3.getText().trim();
        Marca4 = txt_Marca4.getText().trim();
        Marca5 = txt_Marca5.getText().trim();
        Marca6 = txt_Marca6.getText().trim();
        Marca7 = txt_Marca7.getText().trim();
        Marca8 = txt_Marca8.getText().trim();
        CantCa1 = txt_CantidadCa1.getText().trim();
        CantCa2 = txt_CantidadCa2.getText().trim();
        CantCa3 = txt_CantidadCa3.getText().trim();
        CantCa4 = txt_CantidadCa4.getText().trim();
        CantCa5 = txt_CantidadCa5.getText().trim();
        CantCa6 = txt_CantidadCa6.getText().trim();
        CantCa7 = txt_CantidadCa7.getText().trim();
        CantCa8 = txt_CantidadCa8.getText().trim();
        CantMM1 = txt_CantidaMM1.getText().trim();
        CantMM2 = txt_CantidaMM2.getText().trim();
        CantMM3 = txt_CantidaMM3.getText().trim();
        CantMM4 = txt_CantidaMM4.getText().trim();
        CantMM5 = txt_CantidaMM5.getText().trim();
        CantMM6 = txt_CantidaMM6.getText().trim();
        CantMM7 = txt_CantidaMM7.getText().trim();
        CantMM8 = txt_CantidaMM8.getText().trim();
        if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
        if(NumC.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
        if(Alim1.equals("")){
            txt_Alim1.setBackground(Color.red);
            validacion++;
        }
        if(Alim2.equals("")){
            txt_Alim2.setBackground(Color.red);
            validacion++;
        }
        if(Tipo1.equals("")){
            txt_Tipo1.setBackground(Color.red);
            validacion++;
        }
        if(Tipo2.equals("")){
            txt_Tipo2.setBackground(Color.red);
            validacion++;
        }
        if(Marca1.equals("")){
            txt_Marca1.setBackground(Color.red);
            validacion++;
        }
        if(Marca2.equals("")){
            txt_Marca2.setBackground(Color.red);
            validacion++;
        }
        if(Marca3.equals("")){
            txt_Marca3.setBackground(Color.red);
            validacion++;
        }
        if(CantCa1.equals("")){
            txt_CantidadCa1.setBackground(Color.red);
            validacion++;
        }
        if(CantCa2.equals("")){
            txt_CantidadCa2.setBackground(Color.red);
            validacion++;
        }
        if(CantCa3.equals("")){
            txt_CantidadCa3.setBackground(Color.red);
            validacion++;
        }
        if(CantMM1.equals("")){
            txt_CantidaMM1.setBackground(Color.red);
            validacion++;
        }
        if(CantMM2.equals("")){
            txt_CantidaMM2.setBackground(Color.red);
            validacion++;
        }
        if(CantMM3.equals("")){
            txt_CantidaMM3.setBackground(Color.red);
            validacion++;
        }
        if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("INSERT INTO recordatorio VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1, NumC);
                PHA.setString(2, Nombre);
                PHA.setString(3, Alim1);
                PHA.setString(4, Alim2);
                PHA.setString(5, Alim3);
                PHA.setString(6, Alim4);
                PHA.setString(7, Alim5);
                PHA.setString(8, Alim6);
                PHA.setString(9, Alim7);
                PHA.setString(10, Alim8);
                PHA.setString(11, Tipo1);
                PHA.setString(12, Tipo2);
                PHA.setString(13, Tipo3);
                PHA.setString(14, Tipo4);
                PHA.setString(15, Tipo5);
                PHA.setString(16, Tipo6);
                PHA.setString(17, Tipo7);
                PHA.setString(18, Tipo8);
                PHA.setString(19, Marca1);
                PHA.setString(20, Marca2);
                PHA.setString(21, Marca3);
                PHA.setString(22, Marca4);
                PHA.setString(23, Marca5);
                PHA.setString(24, Marca6);
                PHA.setString(25, Marca7);
                PHA.setString(26, Marca8);
                PHA.setString(27, CantCa1);
                PHA.setString(28, CantCa2);
                PHA.setString(29, CantCa3);
                PHA.setString(30, CantCa4);
                PHA.setString(31, CantCa5);
                PHA.setString(32, CantCa6);
                PHA.setString(33, CantCa7);
                PHA.setString(34, CantCa8);
                PHA.setString(35, CantMM1);
                PHA.setString(36, CantMM2);
                PHA.setString(37, CantMM3);
                PHA.setString(38, CantMM4);
                PHA.setString(39, CantMM5);
                PHA.setString(40, CantMM6);
                PHA.setString(41, CantMM7);
                PHA.setString(42, CantMM8);                
                PHA.executeUpdate();
                HA.close();
                Limpiar();
txt_Nombre.setBackground(Color.GREEN); 
txt_ID.setBackground(Color.GREEN); 
txt_Alim1.setBackground(Color.GREEN); 
txt_Alim2.setBackground(Color.GREEN); 
txt_Alim3.setBackground(Color.GREEN); 
txt_Alim4.setBackground(Color.GREEN); 
txt_Alim5.setBackground(Color.GREEN); 
txt_Alim6.setBackground(Color.GREEN); 
txt_Alim7.setBackground(Color.GREEN); 
txt_Alim8.setBackground(Color.GREEN); 
txt_Tipo1.setBackground(Color.GREEN); 
txt_Tipo2.setBackground(Color.GREEN); 
txt_Tipo3.setBackground(Color.GREEN); 
txt_Tipo4.setBackground(Color.GREEN); 
txt_Tipo5.setBackground(Color.GREEN); 
txt_Tipo6.setBackground(Color.GREEN); 
txt_Tipo7.setBackground(Color.GREEN); 
txt_Tipo8.setBackground(Color.GREEN); 
txt_Marca1.setBackground(Color.GREEN); 
txt_Marca2.setBackground(Color.GREEN); 
txt_Marca3.setBackground(Color.GREEN); 
txt_Marca4.setBackground(Color.GREEN); 
txt_Marca5.setBackground(Color.GREEN); 
txt_Marca6.setBackground(Color.GREEN); 
txt_Marca7.setBackground(Color.GREEN); 
txt_Marca8.setBackground(Color.GREEN); 
txt_CantidadCa1.setBackground(Color.GREEN); 
txt_CantidadCa2.setBackground(Color.GREEN); 
txt_CantidadCa3.setBackground(Color.GREEN); 
txt_CantidadCa4.setBackground(Color.GREEN); 
txt_CantidadCa5.setBackground(Color.GREEN); 
txt_CantidadCa6.setBackground(Color.GREEN); 
txt_CantidadCa7.setBackground(Color.GREEN); 
txt_CantidadCa8.setBackground(Color.GREEN); 
txt_CantidaMM1.setBackground(Color.GREEN); 
txt_CantidaMM2.setBackground(Color.GREEN); 
txt_CantidaMM3.setBackground(Color.GREEN); 
txt_CantidaMM4.setBackground(Color.GREEN); 
txt_CantidaMM5.setBackground(Color.GREEN); 
txt_CantidaMM6.setBackground(Color.GREEN); 
txt_CantidaMM7.setBackground(Color.GREEN); 
txt_CantidaMM8.setBackground(Color.GREEN); 
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
            java.util.logging.Logger.getLogger(RegistrarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRecordatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Alim1;
    private javax.swing.JTextField txt_Alim2;
    private javax.swing.JTextField txt_Alim3;
    private javax.swing.JTextField txt_Alim4;
    private javax.swing.JTextField txt_Alim5;
    private javax.swing.JTextField txt_Alim6;
    private javax.swing.JTextField txt_Alim7;
    private javax.swing.JTextField txt_Alim8;
    private javax.swing.JTextField txt_CantidaMM1;
    private javax.swing.JTextField txt_CantidaMM2;
    private javax.swing.JTextField txt_CantidaMM3;
    private javax.swing.JTextField txt_CantidaMM4;
    private javax.swing.JTextField txt_CantidaMM5;
    private javax.swing.JTextField txt_CantidaMM6;
    private javax.swing.JTextField txt_CantidaMM7;
    private javax.swing.JTextField txt_CantidaMM8;
    private javax.swing.JTextField txt_CantidadCa1;
    private javax.swing.JTextField txt_CantidadCa2;
    private javax.swing.JTextField txt_CantidadCa3;
    private javax.swing.JTextField txt_CantidadCa4;
    private javax.swing.JTextField txt_CantidadCa5;
    private javax.swing.JTextField txt_CantidadCa6;
    private javax.swing.JTextField txt_CantidadCa7;
    private javax.swing.JTextField txt_CantidadCa8;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Marca1;
    private javax.swing.JTextField txt_Marca2;
    private javax.swing.JTextField txt_Marca3;
    private javax.swing.JTextField txt_Marca4;
    private javax.swing.JTextField txt_Marca5;
    private javax.swing.JTextField txt_Marca6;
    private javax.swing.JTextField txt_Marca7;
    private javax.swing.JTextField txt_Marca8;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Tipo1;
    private javax.swing.JTextField txt_Tipo2;
    private javax.swing.JTextField txt_Tipo3;
    private javax.swing.JTextField txt_Tipo4;
    private javax.swing.JTextField txt_Tipo5;
    private javax.swing.JTextField txt_Tipo6;
    private javax.swing.JTextField txt_Tipo7;
    private javax.swing.JTextField txt_Tipo8;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
txt_Nombre.setText(""); 
txt_ID.setText(""); 
txt_Alim1.setText(""); 
txt_Alim2.setText(""); 
txt_Alim3.setText(""); 
txt_Alim4.setText(""); 
txt_Alim5.setText(""); 
txt_Alim6.setText(""); 
txt_Alim7.setText(""); 
txt_Alim8.setText(""); 
txt_Tipo1.setText(""); 
txt_Tipo2.setText(""); 
txt_Tipo3.setText(""); 
txt_Tipo4.setText(""); 
txt_Tipo5.setText(""); 
txt_Tipo6.setText(""); 
txt_Tipo7.setText(""); 
txt_Tipo8.setText(""); 
txt_Marca1.setText(""); 
txt_Marca2.setText(""); 
txt_Marca3.setText(""); 
txt_Marca4.setText(""); 
txt_Marca5.setText(""); 
txt_Marca6.setText(""); 
txt_Marca7.setText(""); 
txt_Marca8.setText(""); 
txt_CantidadCa1.setText(""); 
txt_CantidadCa2.setText(""); 
txt_CantidadCa3.setText(""); 
txt_CantidadCa4.setText(""); 
txt_CantidadCa5.setText(""); 
txt_CantidadCa6.setText(""); 
txt_CantidadCa7.setText(""); 
txt_CantidadCa8.setText(""); 
txt_CantidaMM1.setText(""); 
txt_CantidaMM2.setText(""); 
txt_CantidaMM3.setText(""); 
txt_CantidaMM4.setText(""); 
txt_CantidaMM5.setText(""); 
txt_CantidaMM6.setText(""); 
txt_CantidaMM7.setText(""); 
txt_CantidaMM8.setText(""); 
}
}
