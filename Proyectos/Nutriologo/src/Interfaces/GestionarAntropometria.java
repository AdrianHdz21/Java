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

public class GestionarAntropometria extends javax.swing.JFrame {
 String user;
   public static int IDcliente_update = 0;
   DefaultTableModel model = new DefaultTableModel();
   
    public GestionarAntropometria() {
        initComponents();
        user = Ingreso.user;
        sesion_usuario = 1;
        setSize(1200,300);
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
        PreparedStatement PHA = HA.prepareStatement("SELECT ID_pac, Nombre,Peso_ha,Cmb_P,Peso1,Peso2,Peso3,Peso4,Talla1,Talla2,Talla3,Talla4,IMC1,IMC2,IMC3,IMC4,Cintra1,Cintra2,Cintra3,Cintra4,P_bra1,P_bra2,P_bra3,P_bra4,P_tri1,P_tri2,P_tri3,P_tri4,P_bic1,P_bic2,P_bic3,P_bic4,P_sube1,P_sube2,P_sube3,P_sube4,P_supr1,P_supr2,P_supr3,P_supr4,P_abdm1,P_abdm2,P_abdm3,P_abdm4,Porc_gra1,Porc_gra2,Porc_gra3,Porc_gra4 from antropo");
    ResultSet HA1 = PHA.executeQuery();
    jTable_Antropometria = new JTable(model);
    jScrollPane1.setViewportView(jTable_Antropometria);
    model.addColumn("ID_pac");
    model.addColumn("Nombre");
    model.addColumn("Peso_ha");
    model.addColumn("Cmb_P");
    model.addColumn("Peso1");
    model.addColumn("Peso2");
    model.addColumn("Peso3");
    model.addColumn("Peso4");
    model.addColumn("Talla1");
    model.addColumn("Talla2");
    model.addColumn("Talla3");
    model.addColumn("Talla4");
    model.addColumn("IMC1");
    model.addColumn("IMC2");
    model.addColumn("IMC3");
    model.addColumn("IMC4");
    model.addColumn("Cintra1");
    model.addColumn("Cintra2");
    model.addColumn("Cintra3");
    model.addColumn("Cintra4");
    model.addColumn("P_bra1");
    model.addColumn("P_bra2");
    model.addColumn("P_bra3");
    model.addColumn("P_bra4");
    model.addColumn("P_tri1");
    model.addColumn("P_tri2");
    model.addColumn("P_tri3");
    model.addColumn("P_tri4");
    model.addColumn("P_bic1");
    model.addColumn("P_bic2");
    model.addColumn("P_bic3");
    model.addColumn("P_bic4");
    model.addColumn("P_sube1");
    model.addColumn("P_sube2");
    model.addColumn("P_sube3");
    model.addColumn("P_sube4");
    model.addColumn("P_supr1");
    model.addColumn("P_supr2");
    model.addColumn("P_supr3");
    model.addColumn("P_supr4");
    model.addColumn("P_abdm1");
    model.addColumn("P_abdm2");
    model.addColumn("P_abdm3");
    model.addColumn("P_abdm4");
    model.addColumn("Porc_gra1");
    model.addColumn("Porc_gra2");
    model.addColumn("Porc_gra3");
    model.addColumn("Porc_gra4");
    while(HA1.next()){
        Object [] fila = new Object[48];
        for(int i=0; i<48; i++){
            fila[i] = HA1.getObject(i+1);
        }
        model.addRow(fila);
        
    }
        }catch(SQLException e){
            System.err.println("Error en el llenado de las tablas");
}        jTable_Antropometria.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            int fila_point=jTable_Antropometria.rowAtPoint(e.getPoint());
            int columna_point=0;
            
            if(fila_point>-1){
               IDcliente_update = (int)model.getValueAt(fila_point, columna_point);
               RegistrarAntropometria informacionAntro = new RegistrarAntropometria();
               informacionAntro.setVisible(true);
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
        jTable_Antropometria = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jTable_Antropometria.setBackground(new java.awt.Color(51, 255, 153));
        jTable_Antropometria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_CLIENTE", "NOMBRE", "PESO HABIT", "CAMB PESO", "PESO 1", "PESO 2", "PESO 3", "PESO 4", "TALLA 1", "TALLA 2", "TALLA 3", "TALLA 4", "IMC 1", "IMC 2", "IMC 3", "IMC 4", "CINTRA 1", "CINTRA 2", "CINTRA 3", "CINTRA 4", "P_BRA 1", "P_BRA 2", "P_BRA 3", "P_BRA 4", "P_TRI 1", "P_TRI 2", "P_TRI 3", "P_TRI 4", "P_BIC 1", "P_BIC 2", "P_BIC 3", "P_BIC 4", "P_SUBE 1", "P_SUBE 2", "P_SUBE 3", "P_SUBE 4", "P_SUPR 1", "P_SUPR 2", "P_SUPR 3", "P_SUPR 4", "P_ABDO 1", "P_ABDO 2", "P_ABDO 3", "P_ABDO 4", "% GRASA 1", "% GRASA 2", "% GRASA 3", "% GRASA 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Antropometria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 110));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION ANTROPOMETRIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 300));

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
            java.util.logging.Logger.getLogger(GestionarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarAntropometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarAntropometria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Antropometria;
    // End of variables declaration//GEN-END:variables
}
