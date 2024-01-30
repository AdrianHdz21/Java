package Interfaces;
import static Interfaces.Administrador.sesion_usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class GestionarRiesgosNutrimentales extends javax.swing.JFrame {

 String user;
 public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();

    public GestionarRiesgosNutrimentales() {
        initComponents();
        user = Ingreso.user;
        sesion_usuario = 1;
        setSize(900,300);
        setResizable(false);
        setTitle("Cuenta de Administrador - Sesion de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo5.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();  
         try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("select ID_pac,Nombre,Medicamentos,Tabaquismo,Uso_Drog,Alcohol,Cafe,Num_Cig,Num_VecxSem,Frecu,Te from riesgosnutri");
    ResultSet HA1 = PHA.executeQuery();
    jTable_Riesgos = new JTable(model);
    jScrollPane1.setViewportView(jTable_Riesgos);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Medicamentos");
    model.addColumn("Tabaquismo");
    model.addColumn("Uso_Drog");
    model.addColumn("Alcohol");
    model.addColumn("Cafe");
    model.addColumn("Num_Cig");
    model.addColumn("Num_VecxSem");
    model.addColumn("Frecu");
    model.addColumn("Te");
    while(HA1.next()){
        Object [] fila = new Object[11];
        for(int i=0; i<11; i++){
            fila[i] = HA1.getObject(i+1);
        }
        model.addRow(fila);   
    }
         }catch(SQLException e){
            System.err.println("Error en el llenado de las tablas");
}
        jTable_Riesgos.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            int fila_point=jTable_Riesgos.rowAtPoint(e.getPoint());
            int columna_point=0;
            
            if(fila_point >-1){
               IDcliente_update = (int)model.getValueAt(fila_point, columna_point);
               InformacionRiesgosNutrimentales Riesgos = new InformacionRiesgosNutrimentales();
               Riesgos.setVisible(true);
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
        jTable_Riesgos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Riesgos.setBackground(new java.awt.Color(51, 255, 51));
        jTable_Riesgos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_Riesgos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable_Riesgos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "MEDICAMENTOS", "TABAQUISMO", "DROGAS", "ALCOHOL", "CAFE", "NUM CIGARROS/DIA", "NUM VECES/SEMANA", "FRECUENCIA", "TE"
            }
        ));
        jScrollPane1.setViewportView(jTable_Riesgos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 900, 130));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABLA INFORMACION RIESGOS NUTRIMENTALES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 890, 300));

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
            java.util.logging.Logger.getLogger(GestionarRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarRiesgosNutrimentales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarRiesgosNutrimentales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Riesgos;
    // End of variables declaration//GEN-END:variables
}
