package Interfaz.Mision;

import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdm;

public class Ver extends javax.swing.JFrame {
    public static INTCompMenuAdm interfaz = new INTCompMenuAdm();
    public Ver() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNVer = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        labVer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNVer.setText("Ver");
        BTNVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNVerMouseClicked(evt);
            }
        });
        BTNVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVerActionPerformed(evt);
            }
        });

        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        Regresar.setText("←");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BTNVer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Regresar))
                .addGap(20, 20, 20)
                .addComponent(labVer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNVer)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNVerMouseClicked
        Operaciones op = new Operaciones();
        int validar = op.VerMision();
        if (validar == 0){
            labVer.setText("MOSTRANDO POR CONSOLA");
        }
        else{
            labVer.setText("NO HAY MISIONES");
        }
    }//GEN-LAST:event_BTNVerMouseClicked

    private void BTNVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVerActionPerformed
    }//GEN-LAST:event_BTNVerActionPerformed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNVer;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labVer;
    // End of variables declaration//GEN-END:variables
}
