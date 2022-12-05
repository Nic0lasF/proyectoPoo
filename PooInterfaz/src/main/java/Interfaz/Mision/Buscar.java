package Interfaz.Mision;
//LISTO

import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdm;

public class Buscar extends javax.swing.JFrame {
    public static INTCompMenuAdm interfaz = new INTCompMenuAdm();
    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtID.setVisible(false);
        this.BTNBuscar.setVisible(false);
        this.txtTiempo.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        BTNid = new javax.swing.JButton();
        BTNtipo = new javax.swing.JButton();
        labId = new javax.swing.JLabel();
        labID2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        labTiempo = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        BTNBuscar = new javax.swing.JButton();
        labBuscar = new javax.swing.JLabel();
        labResultados = new javax.swing.JLabel();

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

        BTNid.setText("Buscar por ID");
        BTNid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNidMouseClicked(evt);
            }
        });

        BTNtipo.setText("Buscar por tipo y tiempo");
        BTNtipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNtipoMouseClicked(evt);
            }
        });

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

        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNBuscarMouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BTNBuscar)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTNid, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))
                    .addComponent(txtTiempo)
                    .addComponent(labBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNtipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labID2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNBuscar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
       this.setVisible(false);
       interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void BTNidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNidMouseClicked
        txtID.setVisible(true);
        txtTiempo.setVisible(false);
        BTNid.setVisible(false);
        BTNtipo.setVisible(true);
        BTNBuscar.setVisible(true);
        
        //txtID.setText("INGRESE ID");
        txtTiempo.setText("");
        labID2.setText("INGRESE ID");
        labTiempo.setText("");
        labId.setText("");
    }//GEN-LAST:event_BTNidMouseClicked

    private void BTNtipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNtipoMouseClicked
        txtID.setVisible(true);
        BTNid.setVisible(true);
        BTNtipo.setVisible(false);
        txtTiempo.setVisible(true);
        BTNBuscar.setVisible(true);
        
        labID2.setText("INGRESE TIPO MISION");
        labTiempo.setText("INGRESE TIEMPO MAXIMO");
        labId.setText("P:Pasos | R:Reciclado | D: Noticia Diaria");
    }//GEN-LAST:event_BTNtipoMouseClicked

    private void BTNBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBuscarMouseClicked
        Operaciones op = new Operaciones();
        if(labId.getText().equals("P:Pasos | R:Reciclado | D: Noticia Diaria")){
            
            char charTipoMision = op.ValidarChar(txtID.getText().toUpperCase());{
            
            if(charTipoMision == ('P') || charTipoMision == ('R') || charTipoMision == ('D')){
                labID2.setText("TIPO VALIDO");
                
                int tiempoMaximo = op.ValidarInt(txtTiempo.getText());
                if(tiempoMaximo>=0){
                    int validar = op.buscarMision(charTipoMision,tiempoMaximo);
                    if(validar == 0){
                        labBuscar.setText("NINGUNA MISION ENCONTRADA");
                        labResultados.setText("");
                    }
                    else{
                        labResultados.setText("SE ENCONTRARON "+ validar);
                        labBuscar.setText("BUSCADO EXITOSO");
                    }
                }
                else{
                    labTiempo.setText("TIEMPO INVALIDO");
                    txtTiempo.setText("");
                }
            }
            else{
                labID2.setText("ID INVALIDO");
                txtID.setText("");
            }
            }
        
        }
        else{
            int idMision = op.ValidarInt(txtID.getText());
            if(idMision >0){
                labID2.setText("ID VALIDO");
                int validar = op.buscarMision(idMision);
                if(validar == 0){
                    labBuscar.setText("ID NO ENCONTRADO");
                }
                else{
                    labResultados.setText("SE ENCONTRARON "+ validar);
                    labBuscar.setText("ID ENCONTRADO");
                }
            }
            else{
                labID2.setText("ID INVALIDO");
            }  
        }
    }//GEN-LAST:event_BTNBuscarMouseClicked

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMousePressed
    }//GEN-LAST:event_txtIDMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNid;
    private javax.swing.JButton BTNtipo;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labBuscar;
    private javax.swing.JLabel labID2;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labResultados;
    private javax.swing.JLabel labTiempo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
