package Interfaz.Recompensa;

import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdmRec;

public class Buscar extends javax.swing.JFrame {
    public static INTCompMenuAdmRec interfaz = new INTCompMenuAdmRec();
    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        BTNBuscar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        labBuscar = new javax.swing.JLabel();
        labID = new javax.swing.JLabel();
        labResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.setText("Ingrese ID");
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDMousePressed(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNBuscarMouseClicked(evt);
            }
        });
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(BTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(labID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
    }//GEN-LAST:event_txtIDActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void txtIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMousePressed
        if(txtID.getText().equals("Ingrese ID")){
            txtID.setText("");
        }
    }//GEN-LAST:event_txtIDMousePressed

    private void BTNBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBuscarMouseClicked
        Operaciones op = new Operaciones();
        int id = op.ValidarInt(txtID.getText());
        if(id>=0){
            labID.setText("ID VALIDO");
           int validar = op.buscarRecompensa(id);
           if(validar==0){
               labID.setText("ID NO ENCONTRADO");
           }
           else{
               labBuscar.setText("ID ENCONTRADO ");
               labResultado.setText("SE ENCOTRARON "+validar);
           }
        }
        else{
            labID.setText("ID INVALIDO");
            txtID.setText("");
        }
        

    }//GEN-LAST:event_BTNBuscarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labBuscar;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labResultado;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
