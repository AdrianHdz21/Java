package Interfaces;
import static Interfaces.Administrador.sesion_usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import ConexionBD.Conexion;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class GestionarDieta extends javax.swing.JFrame {
  String user;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
    public GestionarDieta() {
        initComponents();
        user = Ingreso.user;
        setTitle("Cuenta de Administrador - Sesion de " + user);
        sesion_usuario = 1;
        setSize(1220,300);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo 3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();  
        try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("SELECT ID_pac,Nombre,Tortilla_vxs,Tortilla_cantxdia,Pan_vxs,Pan_cantxdia,Galle_vxs,Galle_cantxdia,Arroz_vxs,Arroz_cantxdia,Pasta_vxs,Pasta_cantxdia,Cereal_vxs,Cereal_cantxdia,PanSan_vxs,PanSan_cantxdia,CeralcGra_vxs,CeralcGra_cantxdia,Legumin_vxs,Legumin_cantxdia,Frutas_vxs,Frutas_cantxdia,Verduras_vxs,Verduras_cantxdia,Res_vxs,Res_cantxdia,Pollo_vxs,Pollo_cantxdia,Pes_vxs,Pes_cantxdia,Mar_vxs,Mar_cantxdia,Huevo_vxs,"
                + "Huevo_cantxdia,Embu_vxs,Embu_cantxdia,Queso_vxs,Queso_cantxdia,Leche_vxs,Leche_cantxdia,Grasas_vxs,Grasas_cantxdia,Azucar_vxs,Azucar_cantxdia,Otros_vxs,Otros_cantxdia FROM frecalim");
    ResultSet HA1 = PHA.executeQuery();
    jTable_Alimentos = new JTable(model);
    jScrollPane1.setViewportView(jTable_Alimentos);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Tortilla_vxs");
    model.addColumn("Tortilla_cantxdia");
    model.addColumn("Pan_vxs");
    model.addColumn("Pan_cantxdia");
    model.addColumn("Galle_vxs");
    model.addColumn("Galle_cantxdia");
    model.addColumn("Arroz_vxs");
    model.addColumn("Arroz_cantxdia");
    model.addColumn("Pasta_vxs");
    model.addColumn("Pasta_cantxdia");
    model.addColumn("Cereal_vxs");
    model.addColumn("Cereal_cantxdia");
    model.addColumn("PanSan_vxs");
    model.addColumn("PanSan_cantxdia");
    model.addColumn("CeralcGra_vxs");
    model.addColumn("CeralcGra_cantxdia");
    model.addColumn("Legumin_vxs");
    model.addColumn("Legumin_cantxdia");
    model.addColumn("Frutas_vxs");
    model.addColumn("Frutas_cantxdia");
    model.addColumn("Verduras_vxs");
    model.addColumn("Verduras_cantxdia");
    model.addColumn("Res_vxs");
    model.addColumn("Res_cantxdia");
    model.addColumn("Pollo_vxs");
    model.addColumn("Pollo_cantxdia");
    model.addColumn("Pes_vxs");
    model.addColumn("Pes_cantxdia");
    model.addColumn("Mar_vxs");
    model.addColumn("Mar_cantxdia");
    model.addColumn("Huevo_vxs");
    model.addColumn("Huevo_cantxdia");
    model.addColumn("Embu_vxs");
    model.addColumn("Embu_cantxdia");
    model.addColumn("Queso_vxs");
    model.addColumn("Queso_cantxdia");
    model.addColumn("Leche_vxs");
    model.addColumn("Leche_cantxdia");
    model.addColumn("Grasas_vxs");
    model.addColumn("Grasas_cantxdia");
    model.addColumn("Azucar_vxs");
    model.addColumn("Azucar_cantxdia");
    model.addColumn("Otros_vxs");
    model.addColumn("Otros_cantxdia");
         while(HA1.next()){
        Object [] fila = new Object[46];
        for(int i=0; i<46; i++){
            fila[i] = HA1.getObject(i+1);
        }
        model.addRow(fila); 
    }
        }catch(SQLException e){
          System.err.println("Error en el llenado de las tablas"); 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Alimentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Alimentos.setAutoCreateRowSorter(true);
        jTable_Alimentos.setBackground(new java.awt.Color(255, 153, 153));
        jTable_Alimentos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable_Alimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "TORTI VXS", "TORTI CXD", "PAN VXS", "PAN CXD", "GALLET VXS", "GALLET CXD", "ARROZ VXS", "ARROZ CXD", "PASTA VXS", "PASTA CXD", "CEREAL VXS", "CEREAL CXD", "PAN SAN VXS", "PAN SAN CXD", "CEREALGR VXS", "CEREALGR CXD", "LEGUMIN VXS", "LEGUMIN CXD", "FRUTAS VXS", "FRUTAS CXD", "VERDUR VXS", "VERDUR CXS", "RES VXS", "RES CXD", "POLLO VXS", "POLLO CXD", "PES VXS", "PES CXD", "MAR VXS", "MAR CXD", "HUEVOS VXS", "HUEVOS CXD", "EMBU VXS", "EMBU CXD", "QUESO VXS", "QUESO CXD", "LECHE VXS", "LECHE CXD", "GRASAS VXS", "GRASAS CXD", "AZUCAR VXS", "AZUCAR CXD", "OTROS VXS", "OTROS CXD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Alimentos.setPreferredSize(new java.awt.Dimension(5000, 64));
        jScrollPane1.setViewportView(jTable_Alimentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 60, 1220, 130));

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("INFORMACION FRECUENCIA ALIMENTACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionarDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarDieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Alimentos;
    // End of variables declaration//GEN-END:variables
}
        

