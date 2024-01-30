
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


public class GestionarClientes extends javax.swing.JFrame {

  String user;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
   
    public GestionarClientes() {
        initComponents();
        user = Ingreso.user;
        sesion_usuario = 1;
        setSize(900,300);
        setResizable(false);
        setTitle("Cuenta de Administrador - Sesion de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo1.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();   
         try{
        Connection HA = Conexion.conectar();
        PreparedStatement PHA = HA.prepareStatement("select ID , Nombre, Fecha, Edad, Sexo, Ocupacion, EstadoCivil, NumeroHijos, Telefono, Religion, Correo from clientes ");
    ResultSet HA1 = PHA.executeQuery();
    jTable_Usuarios = new JTable(model);
    jScrollPane1.setViewportView(jTable_Usuarios);
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Fecha");
    model.addColumn("Edad");
    model.addColumn("Sexo");
    model.addColumn("Ocupacion");
    model.addColumn("EstadoCivil");
    model.addColumn("NumeroHijos");
    model.addColumn("Telefono");
    model.addColumn("Religion");
    model.addColumn("Correo");
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
        
        jTable_Usuarios.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            int fila_point=jTable_Usuarios.rowAtPoint(e.getPoint());
            int columna_point=0;
            
            if(fila_point >-1){
               IDcliente_update =  (int)model.getValueAt(fila_point, columna_point);
                InformacionGeneral informaciondelCliente = new InformacionGeneral();
               informaciondelCliente.setVisible(true);
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
        jTable_Usuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Usuarios.setBackground(new java.awt.Color(153, 153, 255));
        jTable_Usuarios.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Fecha", "Edad", "Sexo", "Ocupacion", "Estado ", "Hijos", "Telefono", "Religion", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 900, 110));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION GENERAL DE LOS USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 240));

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
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Usuarios;
    // End of variables declaration//GEN-END:variables
}
