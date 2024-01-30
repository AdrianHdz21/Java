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
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class GestionarHabitos extends javax.swing.JFrame {
  String user,ID;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
   
public GestionarHabitos(){
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        sesion_usuario = 1;
        setSize(1000,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
               
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo1.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); 
         try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("SELECT ID_pac, Nombre, Peso, Dieta_med, Raz_aban,Alim_ind,Alim_gus,Alim_disgus,Alerg_int,Prep_Alim,Quien_com,Num_com,Agreg_sal,Tiemp_ham,Obser from habitosdie");
    ResultSet HA1 = PHA.executeQuery();
    jTable_Habitos = new JTable(model);
    jScrollPane1.setViewportView(jTable_Habitos);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Peso");
    model.addColumn("Dieta_med");
    model.addColumn("Raz_aban");
    model.addColumn("Alim_ind");
    model.addColumn("Alim_gus");
    model.addColumn("Alim_disgus");
    model.addColumn("Alerg_int");
    model.addColumn("Prep_Alim");
    model.addColumn("Quien_com");
    model.addColumn("Num_com");
    model.addColumn("Agreg_sal");
    model.addColumn("Tiemp_ham");
    model.addColumn("Obser");
    while(HA1.next()){
        Object [] fila = new Object[15];
        for(int i=0; i<15; i++){
            fila[i] = HA1.getObject(i+1);
        }
        model.addRow(fila);
        
    }
    
  
         }catch(SQLException e){
            System.err.println("Error en el llenado de las tablas");
}
        
         jTable_Habitos.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            int fila_point=jTable_Habitos.rowAtPoint(e.getPoint());
            int columna_point=0;
            
            if(fila_point >-1){
               IDcliente_update =  (int)model.getValueAt(fila_point, columna_point);
               RegistrarHabitos informacion = new RegistrarHabitos();
               informacion.setVisible(true);
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
        jTable_Habitos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Habitos.setBackground(new java.awt.Color(153, 255, 102));
        jTable_Habitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "PESO", "DIETAS Y MEDICAMENTO", "ABANDONO", "ALIM INDISPENSABLES", "ALIM GUST", "ALIM DISGUSTAN", "ALERGIA", "PREPARA ALIM", "CON QUIEN COME", "NUM COMIDAS", "AGREGA SAL", "TIEMPO DE MAS HAMBRE", "OBSERVACIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Habitos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 130));

        jLabel1.setBackground(new java.awt.Color(153, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION HABITOS DE LOS CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 300));

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
            java.util.logging.Logger.getLogger(GestionarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarHabitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarHabitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Habitos;
    // End of variables declaration//GEN-END:variables
}
