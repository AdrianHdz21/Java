package Interfaces;

import ConexionBD.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class GestionarEnfermedades2 extends javax.swing.JFrame {
    String user,ID;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
   

    public GestionarEnfermedades2() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setSize(1100, 300);
        setResizable(false);
        setTitle("Cuenta de Administrador - Sesion de " + user);
        setLocation(110, 350);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
               
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo2.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();         
        try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("SELECT ID_pac,Nombre,Mas_45H,Mas_55M,Tabaquismo,Seden_Mod,Seden_3di,Seden_3Mes,Obes_102H,Obes_88M,HAS,LDL,HDL,Colest,Gluco_Mas100,Hist_Fam,IAM,Muerte_Sub,Revas,Act_Fis,Frecu,Cant,Obser FROM enfermedades2");
     ResultSet HA1 = PHA.executeQuery();
   jTable_DatosEnf2 = new JTable(model);
    jScrollPane1.setViewportView(jTable_DatosEnf2);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Mas_45H");
    model.addColumn("Mas_55M");
    model.addColumn("Tabaquismo");
    model.addColumn("Seden_Mod"); 
    model.addColumn("Seden_3di");
    model.addColumn("Seden_3Mes");
    model.addColumn("Obes_102H");
    model.addColumn("Obes_88M");
    model.addColumn("HAS");
    model.addColumn("LDL");
    model.addColumn("HDL");
    model.addColumn("Colest");
    model.addColumn("Gluco_Mas100");
    model.addColumn("Hist_Fam");
    model.addColumn("IAM");
    model.addColumn("Muerte_Sub");
    model.addColumn("Revas");
    model.addColumn("Act_Fis");
    model.addColumn("Frecu");
    model.addColumn("Cant");
    model.addColumn("Obser");
    while(HA1.next()){
        Object[] fila = new Object[23];
        for(int i=0; i<23; i++){
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
        jTable_DatosEnf2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 153));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable_DatosEnf2.setBackground(new java.awt.Color(255, 153, 153));
        jTable_DatosEnf2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable_DatosEnf2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "+45♂", "+55♀♂", "TABAQUISMO", "SEDEN MOD", "SEDEN DIAS", "SEDEN MES", "OBES >102♂", "OBES >88♀", "HAS", "LDL", "HDL", "COLESTEROL", "GLUCOSA", "<55♂ Y <65♀", "IAM", "MUERTE SUB", "REVASCULARIZACION", "ACTIVIDAD", "FRECUENCIA", "CANTIDAD", "OBSERVACIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_DatosEnf2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_DatosEnf2.setPreferredSize(new java.awt.Dimension(5000, 64));
        jTable_DatosEnf2.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_DatosEnf2);
        if (jTable_DatosEnf2.getColumnModel().getColumnCount() > 0) {
            jTable_DatosEnf2.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable_DatosEnf2.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable_DatosEnf2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable_DatosEnf2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_DatosEnf2.getColumnModel().getColumn(10).setPreferredWidth(70);
            jTable_DatosEnf2.getColumnModel().getColumn(11).setPreferredWidth(70);
            jTable_DatosEnf2.getColumnModel().getColumn(12).setPreferredWidth(70);
        }
        jTable_DatosEnf2.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1100, 90));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("INFORMACION GENERAL DE LAS ENFERMEDADES DE LOS CLIENTES PARTE 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 300));

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
            java.util.logging.Logger.getLogger(GestionarEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarEnfermedades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarEnfermedades2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_DatosEnf2;
    // End of variables declaration//GEN-END:variables

}
