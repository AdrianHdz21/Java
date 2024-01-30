
package Interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class InformacionDieta extends javax.swing.JFrame {
    int IDcliente_update = 0;
    String user,ID;
    public InformacionDieta() {
        initComponents();
        IDcliente_update = GestionarDieta.IDcliente_update;
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(900, 600);
        setResizable(false);
               
       setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper11.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();  
         try {
            Connection HA = Conexion.conectar();
            PreparedStatement PHA = HA.prepareStatement("SELECT * FROM frecalim WHERE ID_pac='" + IDcliente_update + "'");
            ResultSet HA1 = PHA.executeQuery();
            if (HA1.next()) {
                txt_Nombre.setText(HA1.getString("Nombre"));
                txt_ID.setText(HA1.getString("ID_pac"));
                txt_TortillaVxS.setText(HA1.getString("Tortilla_vxs"));
                txt_TortillaCxD.setText(HA1.getString("Tortilla_cantxdia"));
                txt_PanCxD.setText(HA1.getString("Pan_cantxdia"));
                txt_PanVxS.setText(HA1.getString("Pan_vxs"));
                txt_GalletasCxD.setText(HA1.getString("Galle_cantxdia"));
                txt_GalletasVxS.setText(HA1.getString("Galle_vxs"));
                txt_ArrozVxS.setText(HA1.getString("Arroz_vxs"));
                txt_ArrozCxD.setText(HA1.getString("Arroz_cantxdia"));
                txt_PastasCxD.setText(HA1.getString("Pasta_cantxdia"));
                txt_PastasVxS.setText(HA1.getString("Pasta_vxs"));
                txt_CerealVxS.setText(HA1.getString("Cereal_vxs"));
                txt_CerealCxD.setText(HA1.getString("Cereal_cantxdia"));
                txt_PanSanVxS.setText(HA1.getString("PanSan_vxs"));
                txt_PanSanCxD.setText(HA1.getString("PanSan_cantxdia"));
                txt_CerealGraVxS.setText(HA1.getString("CeralcGra_vxs"));
                txt_CerealGraCxD.setText(HA1.getString("CeralcGra_cantxdia"));
                txt_LegumiVxS.setText(HA1.getString("Legumin_vxs"));
                txt_LeguCxD.setText(HA1.getString("Legumin_cantxdia"));
                txt_FrutasVxS.setText(HA1.getString("Frutas_vxs"));
                txt_FrutasCxD.setText(HA1.getString("Frutas_cantxdia"));
                txt_VerdurasVxS.setText(HA1.getString("Verduras_vxs"));
                txt_VerdurasCxD.setText(HA1.getString("Verduras_cantxdia"));
                txt_ResCxD.setText(HA1.getString("Res_cantxdia"));
                txt_ResVxS.setText(HA1.getString("Res_vxs"));
                txt_PolloVxS.setText(HA1.getString("Pollo_vxs"));
                txt_PolloCxD.setText(HA1.getString("Pollo_cantxdia"));
                txt_PescadoVxS.setText(HA1.getString("Pes_vxs"));
                txt_PescadoCxD.setText(HA1.getString("Pes_cantxdia"));
                txt_MariscoVxS.setText(HA1.getString("Mar_vxs"));
                txt_MariscoCxD.setText(HA1.getString("Mar_cantxdia"));
                txt_HuevosVxS.setText(HA1.getString("Huevo_vxs"));
                txt_HuevosCxD.setText(HA1.getString("Huevo_cantxdia"));
                txt_EmbutidosVxS.setText(HA1.getString("Embu_vxs"));
                txt_EmbutidosCxD.setText(HA1.getString("Embu_cantxdia"));
                txt_QuesoVxS.setText(HA1.getString("Queso_vxs"));
                txt_QuesoCxD.setText(HA1.getString("Queso_cantxdia"));
                txt_LecheVxS.setText(HA1.getString("Leche_vxs"));
                txt_LecheCxD.setText(HA1.getString("Leche_cantxdia"));
                txt_GrasasVxS.setText(HA1.getString("Grasas_vxs"));
                txt_GrasasCxD.setText(HA1.getString("Grasas_cantxdia"));
                txt_AzucarVxS.setText(HA1.getString("Azucar_vxs"));
                txt_AzucafCxD.setText(HA1.getString("Azucar_cantxdia"));
                txt_OtrosVxS.setText(HA1.getString("Otros_vxs"));
                txt_OtrosCxD.setText(HA1.getString("Otros_cantxdia"));
            }

        } catch (SQLException e) {
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_ResCxD = new javax.swing.JTextField();
        txt_PolloVxS = new javax.swing.JTextField();
        txt_PolloCxD = new javax.swing.JTextField();
        txt_PescadoVxS = new javax.swing.JTextField();
        txt_PescadoCxD = new javax.swing.JTextField();
        txt_MariscoVxS = new javax.swing.JTextField();
        txt_MariscoCxD = new javax.swing.JTextField();
        txt_HuevosVxS = new javax.swing.JTextField();
        txt_HuevosCxD = new javax.swing.JTextField();
        txt_EmbutidosVxS = new javax.swing.JTextField();
        txt_EmbutidosCxD = new javax.swing.JTextField();
        txt_GrasasCxD = new javax.swing.JTextField();
        txt_QuesoCxD = new javax.swing.JTextField();
        txt_QuesoVxS = new javax.swing.JTextField();
        txt_LecheVxS = new javax.swing.JTextField();
        txt_GrasasVxS = new javax.swing.JTextField();
        txt_AzucarVxS = new javax.swing.JTextField();
        txt_AzucafCxD = new javax.swing.JTextField();
        txt_FrutasVxS = new javax.swing.JTextField();
        txt_FrutasCxD = new javax.swing.JTextField();
        txt_LegumiVxS = new javax.swing.JTextField();
        txt_LeguCxD = new javax.swing.JTextField();
        txt_CerealGraVxS = new javax.swing.JTextField();
        txt_CerealGraCxD = new javax.swing.JTextField();
        txt_PanSanVxS = new javax.swing.JTextField();
        txt_PanSanCxD = new javax.swing.JTextField();
        txt_CerealVxS = new javax.swing.JTextField();
        txt_CerealCxD = new javax.swing.JTextField();
        txt_PastasVxS = new javax.swing.JTextField();
        txt_PastasCxD = new javax.swing.JTextField();
        txt_ArrozVxS = new javax.swing.JTextField();
        txt_ArrozCxD = new javax.swing.JTextField();
        txt_VerdurasVxS = new javax.swing.JTextField();
        txt_GalletasVxS = new javax.swing.JTextField();
        txt_GalletasCxD = new javax.swing.JTextField();
        txt_TortillaCxD = new javax.swing.JTextField();
        txt_PanVxS = new javax.swing.JTextField();
        txt_PanCxD = new javax.swing.JTextField();
        txt_OtrosVxS = new javax.swing.JTextField();
        txt_OtrosCxD = new javax.swing.JTextField();
        txt_LecheCxD = new javax.swing.JTextField();
        txt_TortillaVxS = new javax.swing.JTextField();
        txt_ResVxS = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_VerdurasCxD = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("ALIMENTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("VECES/SEMANA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("CANTIDAD/DIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Galletas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("AOA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tortilla:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Pan:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Arroz:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Pastas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Cereal:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 204, 204));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Pan De Sandwich:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 204, 204));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Cereales Con Grasa:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 204, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Leguminosas:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 204, 204));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Frutas:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 204, 204));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Verduras:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 204, 204));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Res:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 204, 204));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Pollo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 204, 204));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Pescado:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 204, 204));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Mariscos:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 204, 204));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Huevos:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 204, 204));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Embutidos:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 204, 204));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Queso:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 204, 204));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Leche:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 204, 204));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Grasas:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 204, 204));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Azucares:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 204, 204));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Otros:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, 20));

        jLabel27.setBackground(new java.awt.Color(255, 204, 204));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("ID CLIENTE:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel29.setBackground(new java.awt.Color(255, 204, 204));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("REGISTRO DE FRECUENCIA DE ALIMENTOS");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel31.setBackground(new java.awt.Color(204, 255, 204));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("CANTIDAD/DIA");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 120, -1));

        jLabel33.setBackground(new java.awt.Color(204, 255, 204));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 0, 0));
        jLabel33.setText("ALIMENTOS");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_ID.setBackground(new java.awt.Color(255, 153, 153));
        txt_ID.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 240, -1));

        jLabel34.setBackground(new java.awt.Color(255, 204, 204));
        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 204));
        jLabel34.setText("CEREALES:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txt_ResCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_ResCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ResCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ResCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ResCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 130, -1));

        txt_PolloVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_PolloVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PolloVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PolloVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PolloVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 130, -1));

        txt_PolloCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_PolloCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PolloCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PolloCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PolloCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 130, -1));

        txt_PescadoVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_PescadoVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PescadoVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PescadoVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PescadoVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 130, -1));

        txt_PescadoCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_PescadoCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PescadoCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PescadoCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PescadoCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 130, -1));

        txt_MariscoVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_MariscoVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_MariscoVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MariscoVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_MariscoVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 130, -1));

        txt_MariscoCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_MariscoCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_MariscoCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MariscoCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_MariscoCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 130, -1));

        txt_HuevosVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_HuevosVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_HuevosVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HuevosVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_HuevosVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 130, -1));

        txt_HuevosCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_HuevosCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_HuevosCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_HuevosCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_HuevosCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 130, -1));

        txt_EmbutidosVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_EmbutidosVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_EmbutidosVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EmbutidosVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_EmbutidosVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 130, -1));

        txt_EmbutidosCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_EmbutidosCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_EmbutidosCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EmbutidosCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_EmbutidosCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 130, -1));

        txt_GrasasCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_GrasasCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_GrasasCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_GrasasCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_GrasasCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 130, -1));

        txt_QuesoCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_QuesoCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_QuesoCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_QuesoCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_QuesoCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 130, -1));

        txt_QuesoVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_QuesoVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_QuesoVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_QuesoVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_QuesoVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 130, -1));

        txt_LecheVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_LecheVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_LecheVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LecheVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_LecheVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 130, -1));

        txt_GrasasVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_GrasasVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_GrasasVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_GrasasVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_GrasasVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 130, -1));

        txt_AzucarVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_AzucarVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_AzucarVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AzucarVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_AzucarVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 130, -1));

        txt_AzucafCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_AzucafCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_AzucafCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AzucafCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_AzucafCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 130, -1));

        txt_FrutasVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_FrutasVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_FrutasVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FrutasVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_FrutasVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 130, -1));

        txt_FrutasCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_FrutasCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_FrutasCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FrutasCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_FrutasCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, -1));

        txt_LegumiVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_LegumiVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_LegumiVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LegumiVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_LegumiVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, -1));

        txt_LeguCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_LeguCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_LeguCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LeguCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_LeguCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, -1));

        txt_CerealGraVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_CerealGraVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_CerealGraVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CerealGraVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CerealGraVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 130, -1));

        txt_CerealGraCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_CerealGraCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_CerealGraCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CerealGraCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CerealGraCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 130, -1));

        txt_PanSanVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_PanSanVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PanSanVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PanSanVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PanSanVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 130, -1));

        txt_PanSanCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_PanSanCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PanSanCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PanSanCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PanSanCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 130, -1));

        txt_CerealVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_CerealVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_CerealVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CerealVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CerealVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 130, -1));

        txt_CerealCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_CerealCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_CerealCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CerealCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CerealCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 130, -1));

        txt_PastasVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_PastasVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PastasVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PastasVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PastasVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, -1));

        txt_PastasCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_PastasCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PastasCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PastasCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PastasCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, -1));

        txt_ArrozVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_ArrozVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ArrozVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ArrozVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ArrozVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        txt_ArrozCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_ArrozCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ArrozCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ArrozCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ArrozCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 130, -1));

        txt_VerdurasVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_VerdurasVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_VerdurasVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_VerdurasVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_VerdurasVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 130, -1));

        txt_GalletasVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_GalletasVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_GalletasVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_GalletasVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_GalletasVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, -1));

        txt_GalletasCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_GalletasCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_GalletasCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_GalletasCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_GalletasCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, -1));

        txt_TortillaCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_TortillaCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_TortillaCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TortillaCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_TortillaCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, -1));

        txt_PanVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_PanVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PanVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PanVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PanVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, -1));

        txt_PanCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_PanCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_PanCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PanCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_PanCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 130, -1));

        txt_OtrosVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_OtrosVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_OtrosVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_OtrosVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_OtrosVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 130, -1));

        txt_OtrosCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_OtrosCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_OtrosCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_OtrosCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_OtrosCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 130, -1));

        txt_LecheCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_LecheCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_LecheCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LecheCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_LecheCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 130, -1));

        txt_TortillaVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_TortillaVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_TortillaVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TortillaVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_TortillaVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));

        txt_ResVxS.setBackground(new java.awt.Color(204, 204, 255));
        txt_ResVxS.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_ResVxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ResVxS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ResVxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 130, -1));

        txt_Nombre.setBackground(new java.awt.Color(255, 153, 153));
        txt_Nombre.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 240, -1));

        jLabel32.setBackground(new java.awt.Color(204, 255, 204));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 0));
        jLabel32.setText("VECES/SEMANA");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        txt_VerdurasCxD.setBackground(new java.awt.Color(204, 204, 255));
        txt_VerdurasCxD.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txt_VerdurasCxD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_VerdurasCxD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_VerdurasCxD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 130, -1));

        jButton_Agregar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Agregar.setForeground(new java.awt.Color(204, 0, 0));
        jButton_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.jpg"))); // NOI18N
        jButton_Agregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 100, 100));

        jLabel30.setBackground(new java.awt.Color(255, 204, 204));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("NOMBRE:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel28.setBackground(new java.awt.Color(51, 255, 51));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("GUARDAR");
        jLabel28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
         int validacion = 0;
         String Nombre,NumCl, TortillaVxS,TortillaCxD,PanVxS,PanCxD,GalletasVxS,GalletasCxD,ArrozVxS,ArrozCxD,PastasVxS,PastasCxD,CerealVxS,CerealCxD,SandwichVxS,SandwichCxD,CerealGVxS,CerealGCxD;
         String LeguminVxS,LeguminCxD,FrutasVxS,FrutasCxD,VerdurasVxS,VerdurasCxD,ResVxS,ResCxD,PolloVxS,PolloCxD,PescadoVxS,PescadoCxD,MariscosVxS,MariscosCxD,HuevosVxS,HuevosCxD,EmbutidoVxS,EmbutidosCxD;
         String QuesoVxS,QuesoCxD,LecheVxS,LecheCxD,GrasasVxS,GrasasCxD,AzucaresVxS,AzucaresCxD,OtrosVxS,OtrosCxD;
         Nombre = txt_Nombre.getText().trim();
         NumCl = txt_ID.getText().trim();
         TortillaVxS = txt_TortillaVxS.getText().trim();
         TortillaCxD = txt_TortillaCxD.getText().trim();
         PanVxS = txt_PanVxS.getText().trim();
         PanCxD = txt_PanCxD.getText().trim();
         GalletasVxS = txt_GalletasVxS.getText().trim();
         GalletasCxD = txt_GalletasCxD.getText().trim();
         ArrozVxS = txt_ArrozVxS.getText().trim();
         ArrozCxD = txt_ArrozCxD.getText().trim();
         PastasVxS = txt_PastasVxS.getText().trim();
         PastasCxD = txt_PastasCxD.getText().trim();
         CerealVxS = txt_CerealVxS.getText().trim();
         CerealCxD = txt_CerealCxD.getText().trim();
         SandwichVxS = txt_PanSanVxS.getText().trim();
         SandwichCxD = txt_PanSanCxD.getText().trim();
         CerealGVxS = txt_CerealGraVxS.getText().trim();
         CerealGCxD = txt_CerealGraCxD.getText().trim();
         LeguminVxS = txt_LegumiVxS.getText().trim();
         LeguminCxD = txt_LeguCxD.getText().trim();
         FrutasVxS = txt_FrutasVxS.getText().trim();
         FrutasCxD = txt_FrutasCxD.getText().trim();
         VerdurasVxS = txt_VerdurasVxS.getText().trim();
         VerdurasCxD = txt_VerdurasCxD.getText().trim();
         ResVxS = txt_ResVxS.getText().trim();
         ResCxD = txt_ResCxD.getText().trim();
         PolloVxS = txt_PolloVxS.getText().trim();
         PolloCxD = txt_PolloCxD.getText().trim();
         PescadoVxS = txt_PescadoVxS.getText().trim();
         PescadoCxD = txt_PescadoCxD.getText().trim();
         MariscosVxS = txt_MariscoVxS.getText().trim();
         MariscosCxD = txt_MariscoCxD.getText().trim();
         HuevosVxS = txt_HuevosVxS.getText().trim();
         HuevosCxD = txt_HuevosCxD.getText().trim();
         EmbutidoVxS = txt_EmbutidosVxS.getText().trim();
         EmbutidosCxD = txt_EmbutidosCxD.getText().trim();
         QuesoVxS = txt_QuesoVxS.getText().trim();
         QuesoCxD = txt_QuesoCxD.getText().trim();
         LecheVxS = txt_LecheVxS.getText().trim();
         LecheCxD = txt_LecheCxD.getText().trim();
         GrasasVxS = txt_GrasasVxS.getText().trim();
         GrasasCxD = txt_AzucafCxD.getText().trim();
         AzucaresVxS = txt_AzucarVxS.getText().trim();
         AzucaresCxD = txt_AzucafCxD.getText().trim();
         OtrosVxS = txt_OtrosVxS.getText().trim();
         OtrosCxD = txt_OtrosCxD.getText().trim();
         if(Nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
         if(NumCl.equals("")){
            txt_ID.setBackground(Color.red);
            validacion++;
        }
         if(TortillaVxS.equals("")){
            txt_TortillaVxS.setBackground(Color.red);
            validacion++;
        }
         if(TortillaCxD.equals("")){
            txt_TortillaCxD.setBackground(Color.red);
            validacion++;
        }
         if(PanVxS.equals("")){
            txt_PanVxS.setBackground(Color.red);
            validacion++;
        }
         if(PanCxD.equals("")){
            txt_PanCxD.setBackground(Color.red);
            validacion++;
        }
         if(GalletasVxS.equals("")){
            txt_GalletasVxS.setBackground(Color.red);
            validacion++;
        }
         if(GalletasCxD.equals("")){
            txt_GalletasCxD.setBackground(Color.red);
            validacion++;
        }
         if(ArrozVxS.equals("")){
            txt_ArrozVxS.setBackground(Color.red);
            validacion++;
        }
         if(ArrozCxD.equals("")){
            txt_ArrozCxD.setBackground(Color.red);
            validacion++;
        }
         if(PastasVxS.equals("")){
            txt_PastasVxS.setBackground(Color.red);
            validacion++;
        }
         if(PanCxD.equals("")){
            txt_PanCxD.setBackground(Color.red);
            validacion++;
        }
         if(CerealCxD.equals("")){
            txt_CerealCxD.setBackground(Color.red);
            validacion++;
        }
         if(CerealVxS.equals("")){
            txt_CerealVxS.setBackground(Color.red);
            validacion++;
        }
         if(SandwichVxS.equals("")){
            txt_PanSanVxS.setBackground(Color.red);
            validacion++;
        }
         if(SandwichCxD.equals("")){
            txt_PanSanCxD.setBackground(Color.red);
            validacion++;
        }
         if(CerealGVxS.equals("")){
            txt_CerealGraVxS.setBackground(Color.red);
            validacion++;
        }
         if(CerealGCxD.equals("")){
            txt_CerealGraCxD.setBackground(Color.red);
            validacion++;
        }
         if(LeguminVxS.equals("")){
            txt_LegumiVxS.setBackground(Color.red);
            validacion++;
        }
         if(LeguminCxD.equals("")){
            txt_LeguCxD.setBackground(Color.red);
            validacion++;
        }
         if(FrutasVxS.equals("")){
            txt_FrutasVxS.setBackground(Color.red);
            validacion++;
        }
         if(FrutasCxD.equals("")){
            txt_FrutasCxD.setBackground(Color.red);
            validacion++;
        }
         if(VerdurasVxS.equals("")){
            txt_VerdurasVxS.setBackground(Color.red);
            validacion++;
        }
         if(VerdurasCxD.equals("")){
            txt_VerdurasCxD.setBackground(Color.red);
            validacion++;
        }
         if(ResVxS.equals("")){
            txt_ResVxS.setBackground(Color.red);
            validacion++;
        }
         if(ResCxD.equals("")){
            txt_ResCxD.setBackground(Color.red);
            validacion++;
        }
         if(PolloVxS.equals("")){
            txt_PolloVxS.setBackground(Color.red);
            validacion++;
        }
         if(PolloCxD.equals("")){
            txt_PolloCxD.setBackground(Color.red);
            validacion++;
        }
         if(PescadoVxS.equals("")){
            txt_PescadoVxS.setBackground(Color.red);
            validacion++;
        }
         if(PescadoCxD.equals("")){
            txt_PescadoCxD.setBackground(Color.red);
            validacion++;
        }
         if(MariscosVxS.equals("")){
            txt_MariscoVxS.setBackground(Color.red);
            validacion++;
        }
         if(MariscosCxD.equals("")){
            txt_MariscoCxD.setBackground(Color.red);
            validacion++;
        }
         if(HuevosVxS.equals("")){
            txt_HuevosVxS.setBackground(Color.red);
            validacion++;
        }
         if(HuevosCxD.equals("")){
            txt_HuevosCxD.setBackground(Color.red);
            validacion++;
        }
         if(EmbutidoVxS.equals("")){
            txt_EmbutidosVxS.setBackground(Color.red);
            validacion++;
        }
         if(EmbutidosCxD.equals("")){
            txt_EmbutidosCxD.setBackground(Color.red);
            validacion++;
        }
         if(QuesoVxS.equals("")){
            txt_QuesoVxS.setBackground(Color.red);
            validacion++;
        }
         if(QuesoCxD.equals("")){
            txt_QuesoCxD.setBackground(Color.red);
            validacion++;
        }
         if(LecheVxS.equals("")){
            txt_LecheVxS.setBackground(Color.red);
            validacion++;
        }
         if(LecheCxD.equals("")){
            txt_LecheCxD.setBackground(Color.red);
            validacion++;
        }
         if(GrasasVxS.equals("")){
            txt_GrasasVxS.setBackground(Color.red);
            validacion++;
        }
         if(GrasasCxD.equals("")){
            txt_GrasasCxD.setBackground(Color.red);
            validacion++;
        }
         if(AzucaresVxS.equals("")){
            txt_AzucarVxS.setBackground(Color.red);
            validacion++;
        }
         if(AzucaresCxD.equals("")){
            txt_AzucafCxD.setBackground(Color.red);
            validacion++;
        }
         if(OtrosCxD.equals("")){
            txt_OtrosCxD.setBackground(Color.red);
            validacion++;
        }
         if(OtrosVxS.equals("")){
            txt_OtrosVxS.setBackground(Color.red);
            validacion++;
        }
         if(validacion == 0){
            try{
                Connection HA = Conexion.conectar();
                PreparedStatement PHA = HA.prepareStatement("insert into frecalim values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                PHA.setString(1,NumCl);
                PHA.setString(2, Nombre);
                PHA.setString(3, TortillaVxS);
                PHA.setString(4, TortillaCxD);
                PHA.setString(5, PanVxS);
                PHA.setString(6, PanCxD);
                PHA.setString(7, GalletasVxS);
                PHA.setString(8, GalletasCxD);
                PHA.setString(9, ArrozVxS);
                PHA.setString(10, ArrozCxD);
                PHA.setString(11, PastasVxS);
                PHA.setString(12, PastasCxD);
                PHA.setString(13, CerealVxS);
                PHA.setString(14, CerealCxD);
                PHA.setString(15, SandwichVxS);
                PHA.setString(16, SandwichCxD);
                PHA.setString(17, CerealGVxS);
                PHA.setString(18, CerealGCxD);
                PHA.setString(19, LeguminVxS);
                PHA.setString(20, LeguminCxD);
                PHA.setString(21, FrutasVxS);
                PHA.setString(22, FrutasCxD);
                PHA.setString(23, VerdurasVxS);
                PHA.setString(24, VerdurasCxD);
                PHA.setString(25, ResVxS);
                PHA.setString(26, ResCxD);
                PHA.setString(27, PolloVxS);
                PHA.setString(28, PolloCxD);
                PHA.setString(29, PescadoVxS);
                PHA.setString(30, PescadoCxD);
                PHA.setString(31, MariscosVxS);
                PHA.setString(32, MariscosCxD);
                PHA.setString(33, HuevosVxS);
                PHA.setString(34, HuevosCxD);
                PHA.setString(35, EmbutidoVxS);
                PHA.setString(36, EmbutidosCxD);
                PHA.setString(37, QuesoVxS);
                PHA.setString(38, QuesoCxD);
                PHA.setString(39, LecheVxS);
                PHA.setString(40, LecheCxD);
                PHA.setString(41, GrasasVxS);
                PHA.setString(42, GrasasCxD);
                PHA.setString(43, AzucaresVxS);
                PHA.setString(44, AzucaresCxD);
                PHA.setString(45, OtrosVxS);
                PHA.setString(46, OtrosCxD);
                PHA.executeUpdate();
                HA.close();
                Limpiar();
    txt_Nombre.setBackground(Color.GREEN);
    txt_ID.setBackground(Color.GREEN);
    txt_TortillaVxS.setBackground(Color.GREEN);
    txt_TortillaCxD.setBackground(Color.GREEN);
    txt_PanVxS.setBackground(Color.GREEN);
    txt_PanCxD.setBackground(Color.GREEN);
    txt_GalletasVxS.setBackground(Color.GREEN);
    txt_GalletasCxD.setBackground(Color.GREEN);
    txt_ArrozVxS.setBackground(Color.GREEN);
    txt_ArrozCxD.setBackground(Color.GREEN);
    txt_PastasVxS.setBackground(Color.GREEN);
    txt_PastasCxD.setBackground(Color.GREEN);
    txt_CerealVxS.setBackground(Color.GREEN);
    txt_CerealCxD.setBackground(Color.GREEN);
    txt_PanSanVxS.setBackground(Color.GREEN);
    txt_PanSanCxD.setBackground(Color.GREEN);
    txt_CerealGraVxS.setBackground(Color.GREEN);
    txt_CerealGraCxD.setBackground(Color.GREEN);
    txt_LegumiVxS.setBackground(Color.GREEN);
    txt_LeguCxD.setBackground(Color.GREEN);
    txt_FrutasVxS.setBackground(Color.GREEN);
    txt_FrutasCxD.setBackground(Color.GREEN);
    txt_VerdurasVxS.setBackground(Color.GREEN);
    txt_VerdurasCxD.setBackground(Color.GREEN);
    txt_ResVxS.setBackground(Color.GREEN);
    txt_ResCxD.setBackground(Color.GREEN);
    txt_PolloVxS.setBackground(Color.GREEN);
    txt_PolloCxD.setBackground(Color.GREEN);
    txt_PescadoVxS.setBackground(Color.GREEN);
    txt_PescadoCxD.setBackground(Color.GREEN);
    txt_MariscoVxS.setBackground(Color.GREEN);
    txt_MariscoCxD.setBackground(Color.GREEN);
    txt_HuevosVxS.setBackground(Color.GREEN);
    txt_HuevosCxD.setBackground(Color.GREEN);
    txt_EmbutidosVxS.setBackground(Color.GREEN);
    txt_EmbutidosCxD.setBackground(Color.GREEN);
    txt_QuesoVxS.setBackground(Color.GREEN);
    txt_QuesoCxD.setBackground(Color.GREEN);
    txt_LecheVxS.setBackground(Color.GREEN);
    txt_LecheCxD.setBackground(Color.GREEN);
    txt_GrasasVxS.setBackground(Color.GREEN);
    txt_AzucafCxD.setBackground(Color.GREEN);
    txt_AzucarVxS.setBackground(Color.GREEN);
    txt_AzucafCxD.setBackground(Color.GREEN);
    txt_OtrosVxS.setBackground(Color.GREEN);
    txt_OtrosCxD.setBackground(Color.GREEN);
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
            java.util.logging.Logger.getLogger(InformacionDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionDieta().setVisible(true);
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_ArrozCxD;
    private javax.swing.JTextField txt_ArrozVxS;
    private javax.swing.JTextField txt_AzucafCxD;
    private javax.swing.JTextField txt_AzucarVxS;
    private javax.swing.JTextField txt_CerealCxD;
    private javax.swing.JTextField txt_CerealGraCxD;
    private javax.swing.JTextField txt_CerealGraVxS;
    private javax.swing.JTextField txt_CerealVxS;
    private javax.swing.JTextField txt_EmbutidosCxD;
    private javax.swing.JTextField txt_EmbutidosVxS;
    private javax.swing.JTextField txt_FrutasCxD;
    private javax.swing.JTextField txt_FrutasVxS;
    private javax.swing.JTextField txt_GalletasCxD;
    private javax.swing.JTextField txt_GalletasVxS;
    private javax.swing.JTextField txt_GrasasCxD;
    private javax.swing.JTextField txt_GrasasVxS;
    private javax.swing.JTextField txt_HuevosCxD;
    private javax.swing.JTextField txt_HuevosVxS;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_LecheCxD;
    private javax.swing.JTextField txt_LecheVxS;
    private javax.swing.JTextField txt_LeguCxD;
    private javax.swing.JTextField txt_LegumiVxS;
    private javax.swing.JTextField txt_MariscoCxD;
    private javax.swing.JTextField txt_MariscoVxS;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_OtrosCxD;
    private javax.swing.JTextField txt_OtrosVxS;
    private javax.swing.JTextField txt_PanCxD;
    private javax.swing.JTextField txt_PanSanCxD;
    private javax.swing.JTextField txt_PanSanVxS;
    private javax.swing.JTextField txt_PanVxS;
    private javax.swing.JTextField txt_PastasCxD;
    private javax.swing.JTextField txt_PastasVxS;
    private javax.swing.JTextField txt_PescadoCxD;
    private javax.swing.JTextField txt_PescadoVxS;
    private javax.swing.JTextField txt_PolloCxD;
    private javax.swing.JTextField txt_PolloVxS;
    private javax.swing.JTextField txt_QuesoCxD;
    private javax.swing.JTextField txt_QuesoVxS;
    private javax.swing.JTextField txt_ResCxD;
    private javax.swing.JTextField txt_ResVxS;
    private javax.swing.JTextField txt_TortillaCxD;
    private javax.swing.JTextField txt_TortillaVxS;
    private javax.swing.JTextField txt_VerdurasCxD;
    private javax.swing.JTextField txt_VerdurasVxS;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
    txt_Nombre.setText("");
    txt_ID.setText("");
    txt_TortillaVxS.setText("");
    txt_TortillaCxD.setText("");
    txt_PanVxS.setText("");
    txt_PanCxD.setText("");;
    txt_GalletasVxS.setText("");
    txt_GalletasCxD.setText("");
    txt_ArrozVxS.setText("");
    txt_ArrozCxD.setText("");
    txt_PastasVxS.setText("");
    txt_PastasCxD.setText("");
    txt_CerealVxS.setText("");
    txt_CerealCxD.setText("");
    txt_PanSanVxS.setText("");
    txt_PanSanCxD.setText("");
    txt_CerealGraVxS.setText("");
    txt_CerealGraCxD.setText("");
    txt_LegumiVxS.setText("");
    txt_LeguCxD.setText("");
    txt_FrutasVxS.setBackground(Color.GREEN);
    txt_FrutasCxD.setText("");
    txt_VerdurasVxS.setText("");
    txt_VerdurasCxD.setText("");
    txt_ResVxS.setText("");
    txt_ResCxD.setText("");
    txt_PolloVxS.setText("");
    txt_PolloCxD.setText("");
    txt_PescadoVxS.setText("");
    txt_PescadoCxD.setText("");
    txt_MariscoVxS.setText("");
    txt_MariscoCxD.setText("");
    txt_HuevosVxS.setText("");
    txt_HuevosCxD.setText("");
    txt_EmbutidosVxS.setText("");
    txt_EmbutidosCxD.setText("");
    txt_QuesoVxS.setText("");
    txt_QuesoCxD.setText("");
    txt_LecheVxS.setText("");
    txt_LecheCxD.setText("");
    txt_GrasasVxS.setText("");
    txt_AzucafCxD.setText("");
    txt_AzucarVxS.setText("");
    txt_AzucafCxD.setText("");
    txt_OtrosVxS.setText("");
    txt_OtrosCxD.setText("");
    
}
}
