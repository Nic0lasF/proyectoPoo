package Interfaz;
public class IntInicio extends javax.swing.JFrame {

    public IntInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTIniciarSesion = new javax.swing.JButton();
        BTRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido");

        BTIniciarSesion.setText("Iniciar Sesion");
        BTIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTIniciarSesionMouseClicked(evt);
            }
        });
        BTIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTIniciarSesionActionPerformed(evt);
            }
        });

        BTRegistrarse.setText("Registrarse");
        BTRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTRegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(BTRegistrarse)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTIniciarSesionActionPerformed

    private void BTIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTIniciarSesionMouseClicked
        InterfazInicioSesion interfaz = new InterfazInicioSesion();
        this.setVisible(false);
        interfaz.setVisible(true);       
    }//GEN-LAST:event_BTIniciarSesionMouseClicked

    private void BTRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTRegistrarseMouseClicked
        Registrarse reg = new Registrarse();
        this.setVisible(false);
        reg.setVisible(true);
    }//GEN-LAST:event_BTRegistrarseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTIniciarSesion;
    private javax.swing.JButton BTRegistrarse;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
