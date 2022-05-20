
package tirardados;
import java.util.Random;
public class TirarDados extends javax.swing.JFrame {

    
    public TirarDados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTirar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelDado1 = new javax.swing.JLabel();
        jLabelDado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dados!");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(540, 360));
        setName("dados"); // NOI18N
        setPreferredSize(new java.awt.Dimension(540, 360));

        jButtonTirar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonTirar.setText("tirar los dados!");
        jButtonTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTirarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonSalir.setText("salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dadoInicio.jpg"))); // NOI18N
        jLabelDado1.setToolTipText("");

        jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dadoInicio.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jButtonTirar))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelDado1)
                .addGap(74, 74, 74)
                .addComponent(jLabelDado2))
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButtonSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButtonTirar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDado1)
                    .addComponent(jLabelDado2))
                .addGap(32, 32, 32)
                .addComponent(jButtonSalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTirarActionPerformed
        Random rand1 = new Random();
        Random rand2 = new Random();
        int num1 = rand1.nextInt(6);
        int num2 = rand2.nextInt(6);
        switch (num1){

            case 0:{
                jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado1.jpg")));
                break;
            }
            case 1:{
                 jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado2.jpg")));
                break;
            }
            case 2:{
                 jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado3.jpg")));
                break;
            }
            case 3:{
                 jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado4.jpg")));
                break;
            }
            case 4:{
                 jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado5.jpg")));
                break;
            }
            case 5:{
                 jLabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado6.jpg")));
                break;
            }
      }
switch (num2){

            case 0:{
                jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado1.jpg")));
                break;
            }
            case 1:{
                 jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado2.jpg")));
                break;
            }
            case 2:{
                 jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado3.jpg")));
                break;
            }
            case 3:{
                 jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado4.jpg")));
                break;
            }
            case 4:{
                 jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado5.jpg")));
                break;
            }
            case 5:{
                 jLabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dado6.jpg")));
                break;
            }
      }
    }//GEN-LAST:event_jButtonTirarActionPerformed

    
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
            java.util.logging.Logger.getLogger(TirarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TirarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TirarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TirarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TirarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTirar;
    private javax.swing.JLabel jLabelDado1;
    private javax.swing.JLabel jLabelDado2;
    // End of variables declaration//GEN-END:variables
}
