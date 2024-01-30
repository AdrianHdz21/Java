
package Interfaces;
import java.sql.*;
import ConexionBD.Conexion;
import static Interfaces.Administrador.sesion_usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Clientes extends javax.swing.JFrame {

String user, nombre_usuario;
String ID;
   int sesion_usuario;
   
    public Clientes() {
        initComponents();
        user = Ingreso.user;
        ID = Ingreso.ID;
        setTitle("Numero De Cliente->" + ID + "-Nombre Usuario->" + user);
        setSize(1100,410);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        txt_Buscar.setText("Sesion de: '" + user + "'");
        ImageIcon wallpaper = new ImageIcon("src/imagenes/Fondo 4.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();    
 }
    
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.png"));
        return retValue;        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jButton_InformacionG = new javax.swing.JButton();
        jButton_InformacionD = new javax.swing.JButton();
        jButton_InformacionE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton_InformacionHabitos = new javax.swing.JButton();
        jButton_InformacionRiesgos = new javax.swing.JButton();
        jButton_InformacionRecordatorio = new javax.swing.JButton();
        jButton_InformacionAntropometria = new javax.swing.JButton();
        jButton_InformacionLaboratoriales = new javax.swing.JButton();
        jButton_InformacionDiagnostico = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 370, 30));

        jButton_InformacionG.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton_InformacionG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionGActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 100, 100));

        jButton_InformacionD.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dieta.jpg"))); // NOI18N
        jButton_InformacionD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionDActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 100, 100));

        jButton_InformacionE.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salud.jpg"))); // NOI18N
        jButton_InformacionE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionEActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, 100));

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 204, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("GENERAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("REGISTRAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("ENFERMEDADES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("REGISTRAR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("FRECUENCIA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("ALIMENTOS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("REGISTRAR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("HABITOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText(" DIAGNOSTICO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 110, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("RIESGOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("REGISTRAR");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("RECORDATORIO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("REGISTRAR");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("ANTROPOMETRIA");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("REGISTRAR");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("LABORATORIALES");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("CONSULTAR");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        jButton_InformacionHabitos.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionHabitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Habitos.jpg"))); // NOI18N
        jButton_InformacionHabitos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionHabitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionHabitosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionHabitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 100, 100));

        jButton_InformacionRiesgos.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionRiesgos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Riesgos.jpg"))); // NOI18N
        jButton_InformacionRiesgos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionRiesgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionRiesgosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionRiesgos, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 100, 100));

        jButton_InformacionRecordatorio.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionRecordatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recordatorio.jpg"))); // NOI18N
        jButton_InformacionRecordatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionRecordatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, 100));

        jButton_InformacionAntropometria.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionAntropometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Antropometria.jpg"))); // NOI18N
        jButton_InformacionAntropometria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionAntropometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionAntropometriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionAntropometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 100, 100));

        jButton_InformacionLaboratoriales.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionLaboratoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Laboratorio.jpg"))); // NOI18N
        jButton_InformacionLaboratoriales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionLaboratoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionLaboratorialesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionLaboratoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 100, 100));

        jButton_InformacionDiagnostico.setBackground(new java.awt.Color(0, 153, 51));
        jButton_InformacionDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diagnostico.jpg"))); // NOI18N
        jButton_InformacionDiagnostico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_InformacionDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InformacionDiagnosticoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_InformacionDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 100, 100));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("REGISTRAR");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, -1, 20));

        jLabel3.setBackground(new java.awt.Color(0, 204, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("INFORMACION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));
        getContentPane().add(txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 390, 90, 20));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_InformacionGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionGActionPerformed
        InformacionGeneral Informaciongeneral = new InformacionGeneral();
        Informaciongeneral.setVisible(true);
                
    }//GEN-LAST:event_jButton_InformacionGActionPerformed

    private void jButton_InformacionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionEActionPerformed
        InformacionEnfermedades Informacionenfermedades = new InformacionEnfermedades();
        Informacionenfermedades.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionEActionPerformed

    private void jButton_InformacionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionDActionPerformed
        InformacionDieta Informaciondieta = new InformacionDieta();
        Informaciondieta.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionDActionPerformed

    private void jButton_InformacionHabitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionHabitosActionPerformed
       RegistrarHabitos Informacionhabitos = new RegistrarHabitos();
        Informacionhabitos.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionHabitosActionPerformed

    private void jButton_InformacionRiesgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionRiesgosActionPerformed
        InformacionRiesgosNutrimentales Informacionriesgos = new InformacionRiesgosNutrimentales();
        Informacionriesgos.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionRiesgosActionPerformed

    private void jButton_InformacionRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionRecordatorioActionPerformed
        RegistrarRecordatorio Informacionrecordatorio = new RegistrarRecordatorio();
        Informacionrecordatorio.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionRecordatorioActionPerformed

    private void jButton_InformacionAntropometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionAntropometriaActionPerformed
        RegistrarAntropometria Informacionantro = new RegistrarAntropometria();
        Informacionantro.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionAntropometriaActionPerformed

    private void jButton_InformacionLaboratorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionLaboratorialesActionPerformed
      RegistrarLaboratoriales Informacionlabo = new RegistrarLaboratoriales();
        Informacionlabo.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionLaboratorialesActionPerformed

    private void jButton_InformacionDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InformacionDiagnosticoActionPerformed
      GestionarDiagnostico Informaciondiagno = new GestionarDiagnostico();
        Informaciondiagno.setVisible(true);
    }//GEN-LAST:event_jButton_InformacionDiagnosticoActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_InformacionAntropometria;
    private javax.swing.JButton jButton_InformacionD;
    private javax.swing.JButton jButton_InformacionDiagnostico;
    private javax.swing.JButton jButton_InformacionE;
    private javax.swing.JButton jButton_InformacionG;
    private javax.swing.JButton jButton_InformacionHabitos;
    private javax.swing.JButton jButton_InformacionLaboratoriales;
    private javax.swing.JButton jButton_InformacionRecordatorio;
    private javax.swing.JButton jButton_InformacionRiesgos;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel txt_Buscar;
    // End of variables declaration//GEN-END:variables

        }