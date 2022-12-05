package Interfaz;
public class INTMenuAdmin extends javax.swing.JFrame {
    public INTMenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNMisiones = new javax.swing.JButton();
        BTNRecomp = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNMisiones.setText("Misiones");
        BTNMisiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNMisionesMouseClicked(evt);
            }
        });
        BTNMisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMisionesActionPerformed(evt);
            }
        });

        BTNRecomp.setText("Recompensas");
        BTNRecomp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNRecompMouseClicked(evt);
            }
        });

        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNRecomp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNMisiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exit)
                .addGap(31, 31, 31)
                .addComponent(BTNMisiones)
                .addGap(29, 29, 29)
                .addComponent(BTNRecomp)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNMisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMisionesActionPerformed
        this.setVisible(false);
        INTCompMenuAdm interfaz1 = new INTCompMenuAdm();
        interfaz1.setVisible(true);
    }//GEN-LAST:event_BTNMisionesActionPerformed

    private void BTNMisionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNMisionesMouseClicked
    }//GEN-LAST:event_BTNMisionesMouseClicked
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void BTNRecompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNRecompMouseClicked
        this.setVisible(false);
        INTCompMenuAdmRec interfaz2 = new INTCompMenuAdmRec();
        interfaz2.setVisible(true);
    }//GEN-LAST:event_BTNRecompMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNMisiones;
    private javax.swing.JButton BTNRecomp;
    private javax.swing.JButton exit;
    // End of variables declaration//GEN-END:variables
}
