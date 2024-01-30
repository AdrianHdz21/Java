
package Interfaces;
import static Interfaces.Administrador.sesion_usuario;
import java.sql.*;
import ConexionBD.Conexion;
import static Interfaces.GestionarHabitos.IDcliente_update;
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

public class GestionarRecordatorio extends javax.swing.JFrame {

      String user,ID;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
   
    public GestionarRecordatorio() {
        initComponents();
         user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        sesion_usuario = 1;
        setSize(900,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo2.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); 
        try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("select ID_pac,Nombre,Alimentos1,Alimentos2,Alimentos3,Alimentos4,Alimentos5,Alimentos6,Alimentos7,Alimentos8,Tipo1,Tipo2,Tipo3,Tipo4,Tipo5,Tipo6,Tipo7,Tipo8,Marca1,Marca2,Marca3,Marca4,Marca5,Marca6,Marca7,Marca8,Cant_cas1,Cant_cas2,Cant_cas3,Cant_cas4,Cant_cas5,Cant_cas6,Cant_cas7,Cant_cas8,Cant_mm1,Cant_mm2,Cant_mm3,Cant_mm4,Cant_mm5,Cant_mm6,Cant_mm7,Cant_mm8 from recordatorio");
    ResultSet HA1 = PHA.executeQuery();
    jTable_Recordatorio = new JTable(model);
    jScrollPane1.setViewportView(jTable_Recordatorio);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Alimentos1");
    model.addColumn("Alimentos2");
    model.addColumn("Alimentos3");
    model.addColumn("Alimentos4");
    model.addColumn("Alimentos5");
    model.addColumn("Alimentos6");
    model.addColumn("Alimentos7");
    model.addColumn("Alimentos8");
    model.addColumn("Tipo1");
    model.addColumn("Tipo2");
    model.addColumn("Tipo3");
    model.addColumn("Tipo4");
    model.addColumn("Tipo5");
    model.addColumn("Tipo6");
    model.addColumn("Tipo7");
    model.addColumn("Tipo8");
    model.addColumn("Marca1");
    model.addColumn("Marca2");
    model.addColumn("Marca3");
    model.addColumn("Marca4");
    model.addColumn("Marca5");
    model.addColumn("Marca6");
    model.addColumn("Marca7");
    model.addColumn("Marca8");
    model.addColumn("Cant_cas1");
    model.addColumn("Cant_cas2");
    model.addColumn("Cant_cas3");
    model.addColumn("Cant_cas4");
    model.addColumn("Cant_cas5");
    model.addColumn("Cant_cas6");
    model.addColumn("Cant_cas7");
    model.addColumn("Cant_cas8");
    model.addColumn("Cant_mm1");
    model.addColumn("Cant_mm2");
    model.addColumn("Cant_mm3");
    model.addColumn("Cant_mm4");
    model.addColumn("Cant_mm5");
    model.addColumn("Cant_mm6");
    model.addColumn("Cant_mm7");
    model.addColumn("Cant_mm8");
      while(HA1.next()){
        Object [] fila = new Object[42];
        for(int i=0; i<42; i++){
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
        jTable_Recordatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Recordatorio.setBackground(new java.awt.Color(51, 255, 153));
        jTable_Recordatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "ALIMENTOS 1", "ALIMENTOS 2", "ALIMENTOS 3", "ALIMENTOS 4", "ALIMENTOS 5", "ALIMENTOS 6", "ALIMENTOS 7", "ALIMENTOS 8", "TIPO 1", "TIPO 2", "TIPO 3", "TIPO 4", "TIPO 5", "TIPO 6", "TIPO 7", "TIPO 8", "MARCA 1", "MARCA 2", "MARCA 3", "MARCA 4", "MARCA 5", "MARCA 6", "MARCA 7", "MARCA 8", "CANT CAS 1", "CANT CAS 2", "CANT CAS 3", "CANT CAS 4", "CANT CAS 5", "CANT CAS 6", "CANT CAS 7", "CANT CAS 8", "CANT MM 1", "CANT MM 2", "CANT MM 3", "CANT MM 4", "CANT MM 5", "CANT MM 6", "CANT MM 7", "CANT MM 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Recordatorio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 900, 130));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("INFORMACION RECORDATORIO 24 HORAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 300));

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
            java.util.logging.Logger.getLogger(GestionarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarRecordatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Recordatorio;
    // End of variables declaration//GEN-END:variables
}
