package Interfaz.Recompensa;

import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdmRec;
import java.util.Date;

public class Crear extends javax.swing.JFrame {
    public static INTCompMenuAdmRec interfaz = new INTCompMenuAdmRec();
    public static Operaciones op = new Operaciones();
    public Crear() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNCrear = new javax.swing.JButton();
        labCrear = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        labDia = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        labMes = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        labAnyo = new javax.swing.JLabel();
        txtAnyo = new javax.swing.JTextField();
        labPuntos = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();
        labTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        labId = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNCrear.setText("Crear");
        BTNCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCrearMouseClicked(evt);
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

        txtDia.setText("Dia");
        txtDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDiaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDiaMouseReleased(evt);
            }
        });
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtMes.setText("Mes");
        txtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMesMouseReleased(evt);
            }
        });
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        txtAnyo.setText("Año");
        txtAnyo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAnyoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAnyoMouseReleased(evt);
            }
        });

        txtPuntos.setText("Puntos");
        txtPuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPuntosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPuntosMouseReleased(evt);
            }
        });

        labTipo.setText("D = CuponDescuento | B = bono | C = canasta");

        txtTipo.setText("tipo");
        txtTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTipoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTipoMouseReleased(evt);
            }
        });
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoKeyPressed(evt);
            }
        });

        txtID.setText("Id");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labAnyo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(labId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(139, 139, 139)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Regresar)
                .addGap(27, 27, 27)
                .addComponent(labTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Regresar)
                    .addComponent(labTipo))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labDia, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(labId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(labMes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(BTNCrear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed
    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
       interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked
    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void BTNCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCrearMouseClicked
        boolean estado1=false,estado2=false,estado3=false,estado4=false,estado5=false,estado6=false;
        int mes=-1,dia=-1,anyo=-1,id=-1,puntos=-1;
        char tipo = '\0';
        if(txtID.getText().equals("Id")==false&&txtID.getText().isEmpty()==false){
            id = op.ValidarInt(txtID.getText());
            if(id>=0){
                labId.setText("ID VALIDO");
                estado1=true;
            }
            else{
                estado1=false;
                labId.setText("ID INVALIDO");
                txtID.setText("");
            }
        }
        else{
            estado1=false;
            labId.setText("INGRESE ID");
        }
        
        if(txtPuntos.getText().equals("Puntos")==false&&txtPuntos.getText().isEmpty()==false){
            puntos=op.ValidarInt(txtPuntos.getText());
            if(puntos<=10000 && puntos>0){
                labPuntos.setText("PUNTOS VALIDOS");
                estado2=true;
            }
            else{
                estado3=false;
                labPuntos.setText("PUNTOS INVALIDOS");
                txtPuntos.setText("");
            }
        }
        else{
            estado2=false;
            labPuntos.setText("INGRESE PUNTOS");
        }
        
        if(txtMes.getText().equals("Mes")==false && txtMes.getText().isEmpty()==false){
            
            mes = op.ValidarInt(txtMes.getText());
            if(mes<=12){
                estado4=true;
                labMes.setText("MES VALIDO");
                dia = op.ValidarInt(txtDia.getText());
                
                if(mes==2){
                    if(dia<=28){
                        estado5=true;
                        labDia.setText("DIA VALIDO");
                        anyo = op.ValidarInt(txtAnyo.getText());
                        if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))){
                            estado6=true;
                            labAnyo.setText("AÑO VALIDO");
                        }
                        else{
                            estado6=false;
                            labAnyo.setText("AÑO INVALIDO");
                            txtAnyo.setText("");
                        }
                           
                    }
                    else{
                        estado5=false;
                        labDia.setText("DIA INVALIDO");
                        txtDia.setText("");
                    }
                }
                if( mes==1 || mes == 3 || mes==5 || mes==7||mes==8||mes==10||mes==12){
                    if(dia<=31){
                        estado5=true;
                        labDia.setText("DIA VALIDO");
                        anyo = op.ValidarInt(txtAnyo.getText());
                        if(anyo>=2022){
                            estado6=true;
                            labAnyo.setText("AÑO VALIDO");
                        }
                        else{
                            estado6=false;
                            labAnyo.setText("AÑO INVALIDO");
                            txtAnyo.setText("");
                        }
                    }
                    else{
                        estado5=false;
                        labDia.setText("DIA INVALIDO");
                        txtDia.setText("");
                    }
                }
                if(mes==4||mes==6||mes==9||mes==11){
                    if(dia<=30){
                        estado5=true;
                        labDia.setText("DIA VALIDO");
                        anyo = op.ValidarInt(txtAnyo.getText());
                        if(anyo>=2022){
                            estado6=true;
                            labAnyo.setText("AÑO VALIDO");
                        }
                        else{
                            estado6=false;
                            labAnyo.setText("AÑO INVALIDO");
                            txtAnyo.setText("");
                        }
                    }
                    else{
                        estado5=false;
                        labDia.setText("DIA INVALIDO");
                        txtDia.setText("");
                    }
                }
            }
            else{
                estado4=false;
                labMes.setText("MES INVALIDO");
                txtMes.setText("");
            }
        }
        else{
            estado4=false;
            labMes.setText("INGRESE MES");
        }
        
        if(txtTipo.getText().equals("Tipo")==false && txtTipo.getText().isEmpty()==false){
            tipo= op.ValidarChar(txtTipo.getText().toUpperCase());
            if(tipo == 'D' || tipo=='B' || tipo == 'C'){
                estado3=true;
                labTipo.setText("TIPO VALIDO");
            }
            else{
                estado3=false;
                labTipo.setText("TIPO INVALIDO");
                txtTipo.setText("");
            }
        }
        else{
            estado3=false;
            labTipo.setText("INGRESE TIPO");
        }
        //"D = CuponDescuento | B = bono | C = canasta"
        
        if(estado1==true&&estado2==true&&estado3==true&&estado4==true&&estado5==true&&estado6==true){
            Date fecha = op.intAFecha(dia,mes,anyo);
            op.agregarRecompensa(id, tipo, fecha, puntos);
        }
    }//GEN-LAST:event_BTNCrearMouseClicked
    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
    }//GEN-LAST:event_txtDiaActionPerformed
    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
    }//GEN-LAST:event_txtMesActionPerformed
    private void txtTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyPressed
        labTipo.setText("D = CuponDescuento | B = bono | C = canasta");
    }//GEN-LAST:event_txtTipoKeyPressed
    private void txtIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMousePressed
        if(txtID.getText().equals("Id")){
           txtID.setText("");
        }
        if(txtDia.getText().isEmpty()){
            txtDia.setText("Dia");
        }
        if(txtTipo.getText().isEmpty()){
           txtTipo.setText("tipo");
        }
        if(txtMes.getText().isEmpty()){
            txtMes.setText("Mes");
        }
        if(txtAnyo.getText().isEmpty()){
            txtAnyo.setText("Año");
        }
        if(txtPuntos.getText().isEmpty()){
            txtPuntos.setText("Puntos");
        }
        
    }//GEN-LAST:event_txtIDMousePressed
    private void txtIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseReleased
    }//GEN-LAST:event_txtIDMouseReleased
    private void txtDiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaMousePressed
         if(txtDia.getText().equals("Dia")){
           txtDia.setText("");
        }
        if(txtTipo.getText().isEmpty()){
           txtTipo.setText("tipo");
        }
        if(txtMes.getText().isEmpty()){
            txtMes.setText("Mes");
        }
        if(txtAnyo.getText().isEmpty()){
            txtAnyo.setText("Año");
        }
        if(txtPuntos.getText().isEmpty()){
            txtPuntos.setText("Puntos");
        }
    }//GEN-LAST:event_txtDiaMousePressed
    private void txtDiaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaMouseReleased
    }//GEN-LAST:event_txtDiaMouseReleased
    private void txtTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMousePressed
        if(txtTipo.getText().equals("tipo")){
            txtTipo.setText("");
        }
        if(txtID.getText().isEmpty()){
           txtID.setText("Id");
        }
        if(txtDia.getText().isEmpty()){
            txtDia.setText("Dia");
        }
        if(txtMes.getText().isEmpty()){
            txtMes.setText("Mes");
        }
        if(txtAnyo.getText().isEmpty()){
            txtAnyo.setText("Año");
        }
        if(txtPuntos.getText().isEmpty()){
            txtPuntos.setText("Puntos");
        }        
    }//GEN-LAST:event_txtTipoMousePressed
    private void txtTipoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMouseReleased
    }//GEN-LAST:event_txtTipoMouseReleased
    private void txtMesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMesMousePressed
        if(txtMes.getText().equals("Mes")){
            txtMes.setText("");
        }
        if(txtDia.getText().isEmpty()){
            txtDia.setText("Dia");
        }
        if(txtTipo.getText().isEmpty()){
           txtTipo.setText("tipo");
        }
        if(txtAnyo.getText().isEmpty()){
            txtAnyo.setText("Año");
        }
        if(txtPuntos.getText().isEmpty()){
            txtPuntos.setText("Puntos");
        }        
    }//GEN-LAST:event_txtMesMousePressed
    private void txtMesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMesMouseReleased

    }//GEN-LAST:event_txtMesMouseReleased
    private void txtPuntosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPuntosMousePressed
        if(txtPuntos.getText().equals("Puntos")){
            txtPuntos.setText("");
        }
        if(txtDia.getText().isEmpty()){
            txtDia.setText("Dia");
        }
        if(txtTipo.getText().isEmpty()){
           txtTipo.setText("tipo");
        }
        if(txtMes.getText().isEmpty()){
            txtMes.setText("Mes");
        }
        if(txtAnyo.getText().isEmpty()){
            txtAnyo.setText("Año");
        }
    }//GEN-LAST:event_txtPuntosMousePressed
    private void txtPuntosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPuntosMouseReleased
    }//GEN-LAST:event_txtPuntosMouseReleased
    private void txtAnyoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnyoMousePressed
        if(txtAnyo.getText().equals("Año")){
            txtAnyo.setText("");
        }
        if(txtDia.getText().isEmpty()){
            txtDia.setText("Dia");
        }
        if(txtTipo.getText().isEmpty()){
           txtTipo.setText("tipo");
        }
        if(txtMes.getText().isEmpty()){
            txtMes.setText("Mes");
        }
        if(txtPuntos.getText().isEmpty()){
            txtPuntos.setText("Puntos");
        }
    }//GEN-LAST:event_txtAnyoMousePressed
    private void txtAnyoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnyoMouseReleased

    }//GEN-LAST:event_txtAnyoMouseReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCrear;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel labAnyo;
    private javax.swing.JLabel labCrear;
    private javax.swing.JLabel labDia;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labMes;
    private javax.swing.JLabel labPuntos;
    private javax.swing.JLabel labTipo;
    private javax.swing.JTextField txtAnyo;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPuntos;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
