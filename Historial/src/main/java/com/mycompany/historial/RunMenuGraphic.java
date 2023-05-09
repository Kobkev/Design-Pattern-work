/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.historial;

/**
 *
 * @author Kevvvvvy
 */
public class RunMenuGraphic extends javax.swing.JFrame {

    /**
     * Creates new form RunMenuGraphic
     */
    public RunMenuGraphic() {
        initComponents();
    }

    Menu menu = new Menu();

    Elemento ejemplo = new Elemento();

    ObtenerElementoCommand obtenerEjemplo = new ObtenerElementoCommand(ejemplo);
    RemoverElementoCommand removerEjemplo = new RemoverElementoCommand(ejemplo);
    AgregarElementoCommand agregarEjemplo = new AgregarElementoCommand(ejemplo);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAgregar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        BtnObtener = new javax.swing.JButton();
        BtnDeshacer = new javax.swing.JButton();
        BtnRehacer = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 131, 75, -1));

        BtnRemover.setText("Remover");
        BtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 184, -1, -1));

        BtnObtener.setText("Obtener");
        BtnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnObtenerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnObtener, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 236, 75, -1));

        BtnDeshacer.setText("Deshacer");
        BtnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeshacerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDeshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 452, -1, -1));

        BtnRehacer.setText("Rehacer");
        BtnRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRehacerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRehacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 452, -1, -1));

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRehacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRehacerActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        menu.setCommand(0, agregarEjemplo);
        menu.onButtonWasPushed(0);
        System.out.println(menu);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnObtenerActionPerformed

        menu.setCommand(0, obtenerEjemplo);
        menu.onButtonWasPushed(0);
    }//GEN-LAST:event_BtnObtenerActionPerformed

    private void BtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverActionPerformed
        menu.setCommand(0, removerEjemplo);
        menu.onButtonWasPushed(0);
        System.out.println(menu);
    }//GEN-LAST:event_BtnRemoverActionPerformed

    private void BtnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeshacerActionPerformed
        menu.undoButtonWasPushed();
        System.out.println(menu);
    }//GEN-LAST:event_BtnDeshacerActionPerformed

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
            java.util.logging.Logger.getLogger(RunMenuGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunMenuGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunMenuGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunMenuGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunMenuGraphic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnDeshacer;
    private javax.swing.JButton BtnObtener;
    private javax.swing.JButton BtnRehacer;
    private javax.swing.JButton BtnRemover;
    // End of variables declaration//GEN-END:variables
}
