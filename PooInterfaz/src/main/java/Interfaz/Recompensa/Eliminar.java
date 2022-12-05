package Interfaz.Recompensa;
//LISTO
import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdmRec;

public class Eliminar extends javax.swing.JFrame {
    public static INTCompMenuAdmRec interfaz = new INTCompMenuAdmRec();
    public Eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        labID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        BTNEliminar = new javax.swing.JButton();
        labEliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txtID.setText("ID");
        txtID.setBorder(null);
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtIDMouseReleased(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        BTNEliminar.setText("Eliminar");
        BTNEliminar.setBorder(null);
        BTNEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNEliminarMouseClicked(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(labEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Regresar))
                .addGap(0, 0, 0)
                .addComponent(labID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(labEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BTNEliminar)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEliminarMouseClicked
        if(txtID.getText().equals("ID")==false && txtID.getText().isEmpty()==false){
            Operaciones op = new Operaciones();
            int idRecompensa = op.ValidarInt(txtID.getText());
            if(idRecompensa>0){
                labID.setText("ID VALIDO"+idRecompensa);
                if(op.borrarRecompensa(idRecompensa)==true){
                    labEliminar.setText("ELIMINACION EXITOSA");
                }
                else{
                    labEliminar.setText("ELIMINACION FALLIDA");
                }
            }
            else{
                labID.setText("ID INVALIDO");
                txtID.setText("");
            }
        }
        else{
            labID.setText("INGRESE ID");
        }
    }//GEN-LAST:event_BTNEliminarMouseClicked

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
       interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void txtIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMousePressed
        if(txtID.getText().equals("ID")){
            txtID.setText("");
        }
    }//GEN-LAST:event_txtIDMousePressed

    private void txtIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseReleased
    }//GEN-LAST:event_txtIDMouseReleased

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labEliminar;
    private javax.swing.JLabel labID;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
