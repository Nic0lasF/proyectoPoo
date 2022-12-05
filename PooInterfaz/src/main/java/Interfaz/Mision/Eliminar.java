package Interfaz.Mision;
//LISTO
import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdm;

public class Eliminar extends javax.swing.JFrame {
    public static INTCompMenuAdm interfaz = new INTCompMenuAdm();
    public Eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        labIdEliminar = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labEstado = new javax.swing.JLabel();
        BTNEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(270, 270));

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

        txtId.setText("Ingrese el id a eliminar");
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNEliminarMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labIdEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId)
                    .addComponent(labEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Regresar))
                .addGap(4, 4, 4)
                .addComponent(labIdEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void BTNEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEliminarMouseClicked
        if(txtId.getText().equals("Ingrese el id a eliminar")==false && txtId.getText().isEmpty()==false){
            Operaciones op = new Operaciones();
            int idEliminar = op.ValidarInt(txtId.getText());
            if(op.borrarMision(idEliminar) == true){
                labEstado.setText("BORRADO EXITOSO");
            }
            else{
                labEstado.setText("BORRADO FALLIDO");
            }
        }
        else{
            labEstado.setText("INGRESE DATO VALIDO");
            txtId.setText("");
        }
        
        
    }//GEN-LAST:event_BTNEliminarMouseClicked
    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        if(txtId.getText().equals("Ingrese el id a eliminar")){
            txtId.setText("");
        }
    }//GEN-LAST:event_txtIdMousePressed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labEstado;
    private javax.swing.JLabel labIdEliminar;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
