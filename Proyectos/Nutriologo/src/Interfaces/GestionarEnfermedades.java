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

public class GestionarEnfermedades extends javax.swing.JFrame {
  String user,ID;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
   
   
    public GestionarEnfermedades() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setSize(1100, 300);
        setResizable(false);
        setTitle("Cuenta de Administrador - Sesion de " + user);
        setLocation(110, 40);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
               
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo2.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); 
        
        try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("select ID_pac,Nombre,Enf_Card,Enf_Per,Enf_Cereb,EPOC,Asma,Enf_Inter,Fibr_Cis,DM,Alt_Tir,Enf_Ren,Enf_Hepa,Sind_Met,Dolor_Braz,Disnea,Mareos,Ortop_Disn,Edema_Tob,Taqui,Claud_Inter,Fat_Fac from enfermedades");
     ResultSet HA1 = PHA.executeQuery();
   jTable_DatosEnf = new JTable(model);
    jScrollPane1.setViewportView(jTable_DatosEnf);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Enf_Card");
    model.addColumn("Enf_Per");
    model.addColumn("Enf_Cereb");
    model.addColumn("EPOC"); 
    model.addColumn("Asma");
    model.addColumn("Enf_Inter");
    model.addColumn("Fibr_Cis");
    model.addColumn("DM");
    model.addColumn("Alt_Tir");
    model.addColumn("Enf_Ren");
    model.addColumn("Enf_Hepa");
    model.addColumn("Sind_Met");
    model.addColumn("Dolor_Braz");
    model.addColumn("Disnea");
    model.addColumn("Mareos");
    model.addColumn("Ortop_Disn");
    model.addColumn("Edema_Tob");
    model.addColumn("Taqui");
    model.addColumn("Claud_Inter");
    model.addColumn("Fat_Fac");
    while(HA1.next()){
        Object[] fila = new Object[22];
        for(int i=0; i<22; i++){
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
        jTable_DatosEnf = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_DatosEnf.setAutoCreateColumnsFromModel(false);
        jTable_DatosEnf.setBackground(new java.awt.Color(153, 255, 153));
        jTable_DatosEnf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_DatosEnf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable_DatosEnf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "CARDIACA", "PERIFERICA", "CEREBRALl", "EPOC", "ASMA", " INTERSTICIAL", "FIBROSIS", "DM", "TIROIDES", "RENAL", "HEPATICA", "METABOLICO", "DOLOR BRAZO", "DISNEA", "MAREOS", "ORTO TOBILLO", "EDEMA", "TAQUICARDIA", "CLAUD INTER", "FATIGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_DatosEnf.setAlignmentX(12.0F);
        jTable_DatosEnf.setAlignmentY(12.0F);
        jTable_DatosEnf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_DatosEnf.setFocusCycleRoot(true);
        jTable_DatosEnf.setGridColor(new java.awt.Color(255, 153, 153));
        jTable_DatosEnf.setMaximumSize(new java.awt.Dimension(1100, 96));
        jTable_DatosEnf.setPreferredSize(new java.awt.Dimension(1110, 200));
        jTable_DatosEnf.setRequestFocusEnabled(false);
        jTable_DatosEnf.setRowHeight(20);
        jTable_DatosEnf.setRowMargin(3);
        jTable_DatosEnf.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_DatosEnf);
        if (jTable_DatosEnf.getColumnModel().getColumnCount() > 0) {
            jTable_DatosEnf.getColumnModel().getColumn(1).setPreferredWidth(50);
        }
        jTable_DatosEnf.getAccessibleContext().setAccessibleDescription("");
        jTable_DatosEnf.getAccessibleContext().setAccessibleParent(jTable_DatosEnf);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1100, 130));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("INFORMACION GENERAL DE LAS ENFERMEDADES DE LOS CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));
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
            java.util.logging.Logger.getLogger(GestionarEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarEnfermedades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_DatosEnf;
    // End of variables declaration//GEN-END:variables
}
