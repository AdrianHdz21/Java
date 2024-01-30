package Interfaces;
import static Interfaces.Administrador.sesion_usuario;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;




public class GestionarLaboratoriales extends javax.swing.JFrame {
  String user,ID;
   public static int IDcliente_update = 0;
  DefaultTableModel Modelo = new DefaultTableModel();
    public GestionarLaboratoriales() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        sesion_usuario = 1;
        setSize(1100, 300);
        setResizable(false);
        setTitle("Cuenta de Administrador - Sesion de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo6.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();  
        try{
         
    Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("SELECT ID_pac,Nombre,Gluco1,Gluco2,Gluco3,Gluco4,Insu1,Insu2,Insu3,Insu4,Trigli1,Trigli2,Trigli3,Trigli4,Colest1,Colest2,Colest3,Colest4,Hdl1,Hdl2,Hdl3,Hdl4,Ldl1,Ldl2,Ldl3,Ldl4 FROM laboratoriales");
            ResultSet HA1 = PHA.executeQuery();
    jTable_Laboratoriales = new JTable(Modelo);
    jScrollPane1.setViewportView(jTable_Laboratoriales);
    Modelo.addColumn("ID_pac");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Gluco1");
    Modelo.addColumn("Gluco2");
    Modelo.addColumn("Gluco3");
    Modelo.addColumn("Gluco4");
    Modelo.addColumn("Insu1");
    Modelo.addColumn("Insu2");
    Modelo.addColumn("Insu3");
    Modelo.addColumn("Insu4");
    Modelo.addColumn("Trigli1");
    Modelo.addColumn("Trigli2");
    Modelo.addColumn("Trigli3");
    Modelo.addColumn("Trigli4");
    Modelo.addColumn("Colest1");
    Modelo.addColumn("Colest2");
    Modelo.addColumn("Colest3");
    Modelo.addColumn("Colest4");
    Modelo.addColumn("Hdl1");
    Modelo.addColumn("Hdl2");
    Modelo.addColumn("Hdl3");
    Modelo.addColumn("Hdl4");
    Modelo.addColumn("Ldl1");
    Modelo.addColumn("Ldl2");
    Modelo.addColumn("Ldl3");
    Modelo.addColumn("Ldl4");
    while(HA1.next()){
        Object[] fila = new Object[26];
        for(int i=0; i<26; i++){
            fila[i] = HA1.getObject(i+1);
        }
        Modelo.addRow(fila);
        
    }
         }catch(SQLException e){
            System.err.println("Error en el llenado de las tablas");
}
 jTable_Laboratoriales.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            int fila_point=jTable_Laboratoriales.rowAtPoint(e.getPoint());
            int columna_point=0;
            
            if(fila_point >-1){
               IDcliente_update =  (int)Modelo.getValueAt(fila_point, columna_point);
               RegistrarLaboratoriales informacionlabo = new RegistrarLaboratoriales();
               informacionlabo.setVisible(true);
                  }
        }
        });       
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
        jTable_Laboratoriales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Laboratoriales.setBackground(new java.awt.Color(102, 255, 102));
        jTable_Laboratoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "GLUCOSA 1", "GLUCOSA 2", "GLUCOSA 3", "GLUCOSA 4", "INSULINA 1", "INSULINA 2", "INSULINA 3", "INSULINA 4", "TRIGLI 1", "TRIGLI 2", "TRIGLI 3", "TRIGLI 4", "COLEST 1", "COLEST 2", "COLEST 3", "COLEST 4", "HDL 1", "HDL 2", "HDL 3", "HDL 4", "LDL 1", "LDL 2", "LDL 3", "LDL 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Laboratoriales);
        if (jTable_Laboratoriales.getColumnModel().getColumnCount() > 0) {
            jTable_Laboratoriales.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable_Laboratoriales.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 110));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("INFORMACION LABORATORIAL CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarLaboratoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarLaboratoriales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Laboratoriales;
    // End of variables declaration//GEN-END:variables
}
