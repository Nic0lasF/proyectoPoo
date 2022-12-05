package Interfaz.Mision;
//LISTA
import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdm;

public class Modificar extends javax.swing.JFrame {
    public static INTCompMenuAdm interfaz = new INTCompMenuAdm();
    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labModificar = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        labId = new javax.swing.JLabel();
        txtIdBuscar = new javax.swing.JTextField();
        labTiempoCambiar = new javax.swing.JLabel();
        txtTiempoCambio = new javax.swing.JTextField();
        labMod = new javax.swing.JLabel();
        BTNModificar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setText("←");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        Salir.setText("X");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        txtIdBuscar.setText("Id de la mision a modificar");
        txtIdBuscar.setBorder(null);
        txtIdBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdBuscarMousePressed(evt);
            }
        });

        txtTiempoCambio.setText("Tiempo a cambiar");
        txtTiempoCambio.setBorder(null);
        txtTiempoCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTiempoCambioMousePressed(evt);
            }
        });
        txtTiempoCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoCambioActionPerformed(evt);
            }
        });

        BTNModificar.setText("Modificar");
        BTNModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Regresar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTiempoCambio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labTiempoCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(BTNModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Salir))
                .addGap(0, 0, 0)
                .addComponent(labId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTiempoCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTiempoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labMod, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNModificar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void BTNModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNModificarMouseClicked
        if(txtIdBuscar.getText().equals("Id de la mision a modificar")==false && txtIdBuscar.getText().isEmpty()==false){
            Operaciones op = new Operaciones();
            int idBuscar = op.ValidarInt(txtIdBuscar.getText());
            int tiempoModificar = op.ValidarInt(txtTiempoCambio.getText());
            if(idBuscar>=0){
                labId.setText("ID VALIDO");
                if(tiempoModificar>=0){
                    labTiempoCambiar.setText("TIEMPO VALIDO");
                    int validar = op.modMision(idBuscar,tiempoModificar);
                    if(validar == 0){
                        labMod.setText("MODIFICACION EXITOSA");
                    }
                    else{
                        labMod.setText("MODIFICACION FALLIDA");
                        labId.setText("ID NO ENCONTRADO");
                        txtIdBuscar.setText("");
                    }

                }
                else{
                    labTiempoCambiar.setText("TIEMPO INVALIDO");
                    txtTiempoCambio.setText("");
                }
            }
            else{
                labId.setText("ID INVALIDO");
                txtIdBuscar.setText("");
            }
        }   
    }//GEN-LAST:event_BTNModificarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void txtTiempoCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoCambioActionPerformed
    }//GEN-LAST:event_txtTiempoCambioActionPerformed

    private void txtIdBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdBuscarMousePressed
        if(txtIdBuscar.getText().equals("Id de la mision a modificar")){
            txtIdBuscar.setText("");
        }
        if(txtTiempoCambio.getText().isEmpty()){
            txtTiempoCambio.setText("Tiempo a cambiar");
        }
        
    }//GEN-LAST:event_txtIdBuscarMousePressed
    private void txtTiempoCambioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTiempoCambioMousePressed
        if(txtTiempoCambio.getText().equals("Tiempo a cambiar")){
            txtTiempoCambio.setText("");
        }
        if(txtIdBuscar.getText().isEmpty()){
            txtIdBuscar.setText("Id de la mision a modificar");
        }
    }//GEN-LAST:event_txtTiempoCambioMousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNModificar;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labMod;
    private javax.swing.JLabel labModificar;
    private javax.swing.JLabel labTiempoCambiar;
    private javax.swing.JTextField txtIdBuscar;
    private javax.swing.JTextField txtTiempoCambio;
    // End of variables declaration//GEN-END:variables
}
