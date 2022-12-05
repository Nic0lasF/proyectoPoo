package Interfaz.Recompensa;

import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdmRec;

public class Ver extends javax.swing.JFrame {
    public static INTCompMenuAdmRec interfaz = new INTCompMenuAdmRec();
    public Ver() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        BTNVer = new javax.swing.JButton();
        labVer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setText("←");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        BTNVer.setText("Ver");
        BTNVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNVerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BTNVer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Cerrar))
                .addGap(30, 30, 30)
                .addComponent(labVer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNVer)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNVerMouseClicked
        Operaciones op = new Operaciones();
        int validar = op.VerRecompensa();
        if (validar == 0){
            labVer.setText("MOSTRANDO POR CONSOLA");
        }
        else{
            labVer.setText("NO HAY RECOMPENSAS");
        }
    }//GEN-LAST:event_BTNVerMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNVer;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labVer;
    // End of variables declaration//GEN-END:variables
}
