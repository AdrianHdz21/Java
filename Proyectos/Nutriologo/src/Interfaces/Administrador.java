
package Interfaces;
import java.sql.*;
import ConexionBD.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Administrador extends javax.swing.JFrame {
String user, ID, nombre_usuario;
public static int sesion_usuario;

    public Administrador() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(1020,420);
        setResizable(false);
        setTitle("Cuenta de Administrador - Sesion de " + user);
         
     setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Wallpaper9.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();    
        jLabel_Titulo.setText("Sesion de: '" + user + "'");
        try{
            Connection HA = Conexion.conectar();
            PreparedStatement PHA = HA.prepareStatement("select Nombre from Administrador where Usuario = '" + user + "'");
            ResultSet HA1 =PHA.executeQuery();
            if(HA1.next()){
            nombre_usuario = HA1.getString("Usuario");
                
                
            }
        }catch(SQLException e){
            System.err.println("k");
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
        jButton_ConsultarClientes = new javax.swing.JButton();
        jButton_RegistarClientes = new javax.swing.JButton();
        jLabel_Titulo = new javax.swing.JLabel();
        jButton_ConsultarDieta = new javax.swing.JButton();
        jButton_ConsultarClientesRiesgos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_ConsultasEnfermedades = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton_ConsultarRecordatorio = new javax.swing.JButton();
        jButton_ConsultarAntropometria = new javax.swing.JButton();
        jButton_ConsultarLaboratoriales = new javax.swing.JButton();
        jButton_RealizarDiagnostico = new javax.swing.JButton();
        jButton_ConsultarHabitos = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CLIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ALIMENTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        jButton_ConsultarClientes.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informationuser.png"))); // NOI18N
        jButton_ConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 100, 100));

        jButton_RegistarClientes.setBackground(new java.awt.Color(204, 0, 0));
        jButton_RegistarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton_RegistarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 20));

        jButton_ConsultarDieta.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultarDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dieta.jpg"))); // NOI18N
        jButton_ConsultarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarDietaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 100, 100));

        jButton_ConsultarClientesRiesgos.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultarClientesRiesgos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Riesgos.jpg"))); // NOI18N
        jButton_ConsultarClientesRiesgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarClientesRiesgosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarClientesRiesgos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 100));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("INFORMACION ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("INFORMACION ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("GENERAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("INFORMACION ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("INFORMACION");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, -1, -1));

        jButton_ConsultasEnfermedades.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultasEnfermedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salud.jpg"))); // NOI18N
        jButton_ConsultasEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultasEnfermedadesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultasEnfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 100, 100));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ENFERMEDADES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("RIESGOS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("HABITOS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("NUTRIMENTALES");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("INFORMACION");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jButton_ConsultarRecordatorio.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultarRecordatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recordatorio.jpg"))); // NOI18N
        jButton_ConsultarRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarRecordatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 100, 100));

        jButton_ConsultarAntropometria.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultarAntropometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Antropometria.jpg"))); // NOI18N
        jButton_ConsultarAntropometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarAntropometriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarAntropometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 100, 100));

        jButton_ConsultarLaboratoriales.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ConsultarLaboratoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Laboratorio.jpg"))); // NOI18N
        jButton_ConsultarLaboratoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarLaboratorialesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarLaboratoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 100, 100));

        jButton_RealizarDiagnostico.setBackground(new java.awt.Color(204, 0, 0));
        jButton_RealizarDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diagnostico.jpg"))); // NOI18N
        jButton_RealizarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RealizarDiagnosticoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RealizarDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 100, 100));

        jButton_ConsultarHabitos.setBackground(new java.awt.Color(153, 0, 0));
        jButton_ConsultarHabitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Habitos.jpg"))); // NOI18N
        jButton_ConsultarHabitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarHabitosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConsultarHabitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 100, 100));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("INFORMACION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("INFORMACION");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("RECORDATORIO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("ANTROPOMETRIA");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("LABORATORIALES");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("DIAGNOSTICO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("INFORMACION");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("REGISTRAR ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("FRECUENCIA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("REGISTRAR");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistarClientesActionPerformed
       RegistrarClientes registarClientes = new RegistrarClientes();
         registarClientes.setVisible(true);
    }//GEN-LAST:event_jButton_RegistarClientesActionPerformed

    private void jButton_ConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarClientesActionPerformed
       GestionarClientes gestionarClientes = new GestionarClientes();
          gestionarClientes.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultarClientesActionPerformed

    private void jButton_ConsultarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarDietaActionPerformed
         GestionarDieta gestionarDieta = new GestionarDieta();
          gestionarDieta.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultarDietaActionPerformed

    private void jButton_ConsultarClientesRiesgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarClientesRiesgosActionPerformed
                 GestionarRiesgosNutrimentales gestionarRiesgos = new GestionarRiesgosNutrimentales();
          gestionarRiesgos.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultarClientesRiesgosActionPerformed

    private void jButton_ConsultasEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultasEnfermedadesActionPerformed
         GestionarEnfermedades gestionarEnfermedades = new GestionarEnfermedades();
          gestionarEnfermedades.setVisible(true);
          GestionarEnfermedades2 gestionarEnfermedades2 = new GestionarEnfermedades2();
          gestionarEnfermedades2.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultasEnfermedadesActionPerformed

    private void jButton_ConsultarHabitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarHabitosActionPerformed
        GestionarHabitos gestionarHabitos = new GestionarHabitos();
        gestionarHabitos.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultarHabitosActionPerformed

    private void jButton_ConsultarRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarRecordatorioActionPerformed
         GestionarRecordatorio gestionarRecordatorio = new GestionarRecordatorio();
          gestionarRecordatorio.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultarRecordatorioActionPerformed

    private void jButton_ConsultarAntropometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarAntropometriaActionPerformed
        GestionarAntropometria gestionarAntropometria = new GestionarAntropometria();
        gestionarAntropometria.setVisible(true);
    }//GEN-LAST:event_jButton_ConsultarAntropometriaActionPerformed

    private void jButton_ConsultarLaboratorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarLaboratorialesActionPerformed
        GestionarLaboratoriales gestionarLaboratoriales = new GestionarLaboratoriales();
        gestionarLaboratoriales.setVisible(true);        
    }//GEN-LAST:event_jButton_ConsultarLaboratorialesActionPerformed

    private void jButton_RealizarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RealizarDiagnosticoActionPerformed
        RegistrarDiagnostico registrarDiagnostico = new RegistrarDiagnostico();
        registrarDiagnostico.setVisible(true);
    }//GEN-LAST:event_jButton_RealizarDiagnosticoActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ConsultarAntropometria;
    private javax.swing.JButton jButton_ConsultarClientes;
    private javax.swing.JButton jButton_ConsultarClientesRiesgos;
    private javax.swing.JButton jButton_ConsultarDieta;
    private javax.swing.JButton jButton_ConsultarHabitos;
    private javax.swing.JButton jButton_ConsultarLaboratoriales;
    private javax.swing.JButton jButton_ConsultarRecordatorio;
    private javax.swing.JButton jButton_ConsultasEnfermedades;
    private javax.swing.JButton jButton_RealizarDiagnostico;
    private javax.swing.JButton jButton_RegistarClientes;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
