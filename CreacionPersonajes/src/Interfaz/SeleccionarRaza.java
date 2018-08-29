/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Audios.MP3;



/**
 *
 * @author chris
 */
public class SeleccionarRaza extends javax.swing.JFrame {
 
    /**
     * Creates new form SeleccionarRaza
     */
    private MP3 mus;
    Fuentes tipoFuente;
    public SeleccionarRaza() {
        initComponents();
        this.setLocationRelativeTo(null);
        tipoFuente = new Fuentes();
        TituloClockrood.setFont(tipoFuente.fuente(tipoFuente.TRON, 0, 40));
        TituloHumano.setFont(tipoFuente.fuente(tipoFuente.TRON, 0, 40));
        TituloPidell.setFont(tipoFuente.fuente(tipoFuente.TRON, 0, 40));
        mus = new MP3("./src/Audios/EpicMusicNerves.mp3");
        mus.play();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSalir = new javax.swing.JButton();
        TituloPidell = new javax.swing.JLabel();
        TituloClockrood = new javax.swing.JLabel();
        TituloHumano = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        BotonPidell = new javax.swing.JButton();
        BotonClockrood = new javax.swing.JButton();
        BotonHumano = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(0, 51, 102));
        BotonSalir.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("SALIR");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 790, 100, 40));

        TituloPidell.setForeground(new java.awt.Color(255, 255, 255));
        TituloPidell.setText("PIDELL");
        getContentPane().add(TituloPidell, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, -1));

        TituloClockrood.setForeground(new java.awt.Color(255, 255, 255));
        TituloClockrood.setText("CLOCKROOD");
        getContentPane().add(TituloClockrood, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 290, -1, -1));

        TituloHumano.setForeground(new java.awt.Color(255, 255, 255));
        TituloHumano.setText("HUMANO");
        getContentPane().add(TituloHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        Fondo.setText("hUMANO");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1630, 859));

        BotonPidell.setText("jButton1");
        BotonPidell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPidellActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPidell, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 230, 50));

        BotonClockrood.setText("jButton1");
        BotonClockrood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClockroodActionPerformed(evt);
            }
        });
        getContentPane().add(BotonClockrood, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 390, 50));

        BotonHumano.setText("jButton1");
        BotonHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHumanoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 260, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHumanoActionPerformed
              
       
        //línea 1-instanciamos un objeto de la clase Formulario2.java
        FormHumano verformulario2=new FormHumano(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
        verformulario2.setVisible(true); 
        dispose();
        
        
        
        
        
        
      
    }//GEN-LAST:event_BotonHumanoActionPerformed

    private void BotonClockroodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClockroodActionPerformed
        FormClockrood verformulario3=new FormClockrood(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
        verformulario3.setVisible(true); 
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotonClockroodActionPerformed

    private void BotonPidellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPidellActionPerformed
        FormPidell verformulario4=new FormPidell(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
        verformulario4.setVisible(true); 
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPidellActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionarRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarRaza().setVisible(true); 
            }
            
        });
          
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonClockrood;
    private javax.swing.JButton BotonHumano;
    private javax.swing.JButton BotonPidell;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel TituloClockrood;
    private javax.swing.JLabel TituloHumano;
    private javax.swing.JLabel TituloPidell;
    // End of variables declaration//GEN-END:variables
}