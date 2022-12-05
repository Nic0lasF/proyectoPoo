package Interfaz.Recompensa;
//LISTO 
import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdmRec;

public class Modificar extends javax.swing.JFrame {
    public static INTCompMenuAdmRec interfaz = new INTCompMenuAdmRec();
    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNModificar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtPuntos = new javax.swing.JTextField();
        labID = new javax.swing.JLabel();
        labPuntos = new javax.swing.JLabel();
        labMod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNModificar.setText("Modificar");
        BTNModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNModificarMouseClicked(evt);
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

        txtID.setText("Ingrese ID");
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDMousePressed(evt);
            }
        });

        txtPuntos.setText("Ingrese Puntos (maxmimo 10000)");
        txtPuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPuntosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPuntos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(labPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar))
                    .addComponent(txtID))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(labID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNModificar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNModificarMouseClicked
        if((txtID.getText().equals("Ingrese ID")==true || txtID.getText().isEmpty()==true)){
            labID.setText("INGRESE DATOS");
        }
        if(txtPuntos.getText().equals("Ingrese Puntos (maxmimo 10000)")==true||txtPuntos.getText().isEmpty()==true){
            labPuntos.setText("INGRESE DATOS");
        }
        if((txtID.getText().equals("Ingrese ID")==false && txtID.getText().isEmpty()==false)){
            Operaciones op = new Operaciones();
            int idMod = op.ValidarInt(txtID.getText());
            int puntos = op.ValidarInt(txtPuntos.getText());
            if((idMod > -1)){
                labID.setText("ID VALIDO");
                
                if(puntos<10000 && puntos>0){
                    int validar = op.modRecompensa(idMod, puntos);
                    if(validar == 0){
                        labMod.setText("MODIFICACION EXITOSA");
                    }
                    if(validar == 1){
                        labMod.setText("MODIFICACION FALLIDA");
                        labID.setText("ID NO ENCONTRADO");
                        txtID.setText("");
                    }
                }
                else{
                    labPuntos.setText("PUNTOS INVALIDOS");
                    txtPuntos.setText("");
                }
            }
            if(idMod<=-1){
                labID.setText("ID INVALIDO");
                txtID.setText("");
            }
            if(puntos<10000 && puntos>0){
                labPuntos.setText("PUNTOS VALIDOS");
            }
            else{
                labPuntos.setText("PUNTOS INVALIDOS");
                txtPuntos.setText("");
            }
            
        }
    }//GEN-LAST:event_BTNModificarMouseClicked

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
       interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void txtIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMousePressed
        if(txtID.getText().equals("Ingrese ID")){
            txtID.setText("");
        }
        if(txtPuntos.getText().isEmpty()){
            txtPuntos.setText("Ingrese Puntos (maxmimo 10000)");
        }
    }//GEN-LAST:event_txtIDMousePressed

    private void txtPuntosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPuntosMousePressed
        if(txtPuntos.getText().equals("Ingrese Puntos (maxmimo 10000)")){
            txtPuntos.setText("");
        }
        if(txtID.getText().isEmpty()){
            txtID.setText("Ingrese ID");
        }
    }//GEN-LAST:event_txtPuntosMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNModificar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labMod;
    private javax.swing.JLabel labPuntos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables
}
