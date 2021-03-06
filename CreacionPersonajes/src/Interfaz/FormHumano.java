/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Fabricas.FabricaAbstracta;
import Fabricas.FabricaHumano;
import Productos.Arma;
import Productos.Armadura;
import Productos.Cuerpo;
import Productos.CuerpoHumano;
import Productos.Transporte;

/**
 *
 * @author chris
 */
public class FormHumano extends javax.swing.JFrame {

    /**
     * Creates new form Humano
     */
    FabricaAbstracta fabrica;
    Cuerpo cuerpo;
    Arma arma;
    Armadura armadura;
    Transporte transporte;
    
    public FormHumano() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        
       
        fabrica = new FabricaHumano();
        cuerpo = fabrica.crearCuerpo(); 
        arma = fabrica.crearArma();
        armadura = fabrica.crearArmadura();
        transporte = fabrica.crearTransporte();
        cuerpo = fabrica.crearCuerpo();
        CuerpoHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource(cuerpo.operacion())));
        ArmaHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource(arma.operacion()))); 
        ArmaduraHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource(armadura.operacion())));
        NaveHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource(transporte.operacion())));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAtras = new javax.swing.JButton();
        CuerpoHumano = new javax.swing.JLabel();
        ArmaHumano = new javax.swing.JLabel();
        ArmaduraHumano = new javax.swing.JLabel();
        NaveHumano = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAtras.setBackground(new java.awt.Color(0, 51, 102));
        BotonAtras.setForeground(new java.awt.Color(255, 255, 255));
        BotonAtras.setText("ATRAS");
        BotonAtras.setPreferredSize(new java.awt.Dimension(69, 29));
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 800, 110, 40));
        getContentPane().add(CuerpoHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        getContentPane().add(ArmaHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));
        getContentPane().add(ArmaduraHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, -1, -1));
        getContentPane().add(NaveHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoTierra.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1577, 866));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        SeleccionarRaza verformulario1=new SeleccionarRaza(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
        verformulario1.setVisible(true); 
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_BotonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(FormHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHumano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArmaHumano;
    private javax.swing.JLabel ArmaduraHumano;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel CuerpoHumano;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NaveHumano;
    // End of variables declaration//GEN-END:variables
}
