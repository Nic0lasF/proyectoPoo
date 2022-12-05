package Interfaz.Mision;
//LISTO
import Colecciones.Operaciones;
import Interfaz.INTCompMenuAdm;


public class Crear extends javax.swing.JFrame {
    public static INTCompMenuAdm interfaz = new INTCompMenuAdm();
    public Crear() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtCantidadTiempo.setVisible(false);
        txtTipo.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labMenu = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        labAgregar = new javax.swing.JLabel();
        BTNAgregar = new javax.swing.JButton();
        labId = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        labCant = new javax.swing.JLabel();
        txtCantPuntos = new javax.swing.JTextField();
        labTipo = new javax.swing.JLabel();
        txtTipoMision = new javax.swing.JTextField();
        labTipo2 = new javax.swing.JLabel();
        labTipoNoticia = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        labCant2 = new javax.swing.JLabel();
        txtCantidadTiempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labMenu.setText("Agregar mision");

        Regresar.setText("←");
        Regresar.setBorder(null);
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        Salir.setText("X");
        Salir.setBorder(null);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        BTNAgregar.setText("Agregar");
        BTNAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNAgregarMouseClicked(evt);
            }
        });
        BTNAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarActionPerformed(evt);
            }
        });

        labId.setText("El Id mayor a -1");

        txtID.setText("Ingrese el id de la mision");
        txtID.setBorder(null);
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtIDMouseReleased(evt);
            }
        });

        labCant.setText("La cantidad menor a 5000 puntos");

        txtCantPuntos.setText("Ingrese la cantidad de puntos");
        txtCantPuntos.setBorder(null);
        txtCantPuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantPuntosMousePressed(evt);
            }
        });

        labTipo.setText("P = Pasos | R = Reciclado | D = Noticia Diaria");

        txtTipoMision.setText("Ingrese el tipo de mision");
        txtTipoMision.setBorder(null);
        txtTipoMision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTipoMisionMousePressed(evt);
            }
        });
        txtTipoMision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoMisionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoMisionKeyTyped(evt);
            }
        });

        txtTipo.setBorder(null);

        txtCantidadTiempo.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(labMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labTipo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoMision, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTipoNoticia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidadTiempo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCant2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantPuntos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(BTNAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Salir)
                    .addComponent(labMenu))
                .addGap(19, 19, 19)
                .addComponent(labId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipoMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTipoNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labCant2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNAgregar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BTNAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarActionPerformed
    }//GEN-LAST:event_BTNAgregarActionPerformed
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    }//GEN-LAST:event_SalirActionPerformed
    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked
    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked
//BOTON
    private void BTNAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarMouseClicked
        // validar vacios
        if(txtID.getText().isEmpty()){
            labId.setText("Ingrese el id de la mision");
        }
        
        if(txtCantPuntos.getText().isEmpty()){
            labCant.setText("Ingrese la cantidad de puntos");
        }
        
        if(txtTipoMision.getText().isEmpty()){
            labTipo.setText("Ingrese el tipo de mision");
        } 
        boolean case1= false,case2 = false,case3= false,case4= false,case5 = false,case6=false;
        
        
        
        //Proceso de validar datos
        Operaciones op = new Operaciones();
        int idValidado = -1;
        if(txtID.getText().equals("Ingrese el id de la mision")== false && txtID.getText().isEmpty() == false){
            idValidado = op.ValidarInt(txtID.getText());
            if(idValidado >-1){
                labId.setText("ID valido ");
                case1=true;
            }
            else{
                case1=false;
                labId.setText("ID invalido");
                txtID.setText("");
            }
        }
        
        int CantidadValidada = -1;
        if(txtCantPuntos.getText().equals("Ingrese la cantidad de puntos")== false && txtCantPuntos.getText().isEmpty() == false){
            CantidadValidada = op.ValidarInt(txtCantPuntos.getText());
            if((CantidadValidada <= 5000) && (CantidadValidada > 0)){
                labCant.setText("Cantidad de puntos valido");
                case2=true;
            }
            else{
                case2=false;
                labCant.setText("Cantidad de puntos invalido");
                txtCantPuntos.setText("");
            }
        }
        char charTipoMision = '\0';
        char charTipoNoticia = '\0';
        int puntos = -1;
        int tiempoRestante = 0;
        if(txtTipoMision.getText().equals("Ingrese el tipo de mision")==false && txtTipoMision.getText().isEmpty()==false){
            charTipoMision = op.ValidarChar(txtTipoMision.getText().toUpperCase());
            if(charTipoMision == ('P') || charTipoMision == ('R') || charTipoMision == ('D')){
                labTipo.setText("Tipo de mision valida");
                case3=true;
            }
            else{
                case3=false;
                labTipo.setText("Tipo de mision invalida");
                txtTipoMision.setText("");
            }
            
            //SI ES NOTICIA (D)
            if(charTipoMision == 'D'){
                charTipoNoticia = op.ValidarChar(txtTipo.getText().toUpperCase());
                if(charTipoNoticia == ('C') || charTipoNoticia == ('R') || charTipoNoticia == ('M') || charTipoNoticia == ('Q')){
                    labTipo2.setText("Tipo de noticia valido");
                    case4=true;
                }
                else{
                    case4=false;
                    labTipo2.setText("Tipo de noticia invalido");
                }
                puntos = op.ValidarInt(txtCantidadTiempo.getText());
                if(puntos<=300 && puntos>0){
                    labCant2.setText("cantidad de puntos valido");
                    case5=true;
                }
                else{
                    case5=false;
                    labCant2.setText("Cantidad de puntos invalida");
                    txtCantidadTiempo.setText("");
                }
            }
            //SI NO
            else{
                tiempoRestante = op.ValidarInt(txtCantidadTiempo.getText());
                if(tiempoRestante>0){
                    labCant2.setText("Cantidad de horas validas");
                    case6=true;
                }
                else{
                    labCant2.setText("Cantidad de horas invalidas");
                    case6=false;
                }
                //SI LA MISION ES P(PASOS)
                if(charTipoMision == 'P'){
                    puntos = op.ValidarInt(txtTipo.getText());
                    if(puntos>0){
                        labTipoNoticia.setText("PASOS VALIDOS");
                    }
                    else{
                        labTipoNoticia.setText("PASOS INVALIDOS");
                    }
                }
            }
        }         
    //CREAR MISION
        
        //CON NOTICIA
        if(charTipoMision == ('D')){
            if(case1==true && case2==true && case3==true && case4==true && case5==true){
                //id / cantidad / tipo / cant / tipoNoticia
                op.agregarMision(idValidado,CantidadValidada,charTipoMision,puntos,charTipoNoticia);
                labAgregar.setText("mision agregada");
                
            }
        }
        //SIN NOTICIA
        else{
            if(case1==true && case2==true && case3==true && case6==true){
                op.agregarMision(idValidado,CantidadValidada,charTipoMision,puntos,tiempoRestante);
                labAgregar.setText("mision agregada");
            }
        }
    }//GEN-LAST:event_BTNAgregarMouseClicked
    private void txtIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMousePressed
        if(txtID.getText().equals("Ingrese el id de la mision")){
            txtID.setText("");
        }
        
        //RELLENAR OTROS TEXT
        if(txtCantPuntos.getText().isEmpty()){
            txtCantPuntos.setText("Ingrese la cantidad de puntos");
        }
        if(txtTipoMision.getText().isEmpty()){
            txtTipoMision.setText("Ingrese el tipo de mision");
        }
    }//GEN-LAST:event_txtIDMousePressed
    private void txtCantPuntosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantPuntosMousePressed
        if(txtCantPuntos.getText().equals("Ingrese la cantidad de puntos")){
            txtCantPuntos.setText("");
        }
        
        
        //RELLENAR OTROS TEXT
        if(txtID.getText().isEmpty()){
            txtID.setText("Ingrese el id de la mision");
        }
        if(txtTipoMision.getText().isEmpty()){
            txtTipoMision.setText("Ingrese el tipo de mision");
        }
    }//GEN-LAST:event_txtCantPuntosMousePressed
    private void txtTipoMisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMisionMousePressed
        if(txtTipoMision.getText().equals("Ingrese el tipo de mision")){
            txtTipoMision.setText("");
        }

        //RELLENAR OTROS TEXT
        if(txtID.getText().isEmpty()){
            txtID.setText("Ingrese el id de la mision");
        }
        if(txtCantPuntos.getText().isEmpty()){
            txtCantPuntos.setText("Ingrese la cantidad de puntos");
        }
    }//GEN-LAST:event_txtTipoMisionMousePressed
    private void txtIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseReleased
    }//GEN-LAST:event_txtIDMouseReleased
    private void txtTipoMisionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoMisionKeyTyped
    }//GEN-LAST:event_txtTipoMisionKeyTyped
    private void txtTipoMisionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoMisionKeyReleased
        //ACTIVAR textFields
        if(txtTipoMision.getText().toUpperCase().equals("D")){
            labTipo2.setText("Ingrese tipo de noticia");
            labCant2.setText("Ingrese cantidad de puntos para noticia (max 300)");
            labTipoNoticia.setText("C = clima R = Reciclaje M = Cont. Maritima Q = Quimicos Peligrosos");
            txtCantidadTiempo.setVisible(true);
            txtTipo.setVisible(true);
        }
        if(txtTipoMision.getText().toUpperCase().equals("P")){
            labTipoNoticia.setText("Ingrese cantidad de pasos");
            labCant2.setText("Ingrese el tiempo de caducidad");
            txtTipo.setVisible(true);
            txtCantidadTiempo.setVisible(true);
            labTipo2.setText("");

        }
        if(txtTipoMision.getText().toUpperCase().equals("R")){
            txtTipo.setVisible(false);
            txtCantidadTiempo.setVisible(true);
            labCant2.setText("Ingrese el tiempo de caducidad");
            labTipoNoticia.setText("");
            labTipo2.setText("");

        }
    }//GEN-LAST:event_txtTipoMisionKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregar;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel labAgregar;
    private javax.swing.JLabel labCant;
    private javax.swing.JLabel labCant2;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labMenu;
    private javax.swing.JLabel labTipo;
    private javax.swing.JLabel labTipo2;
    private javax.swing.JLabel labTipoNoticia;
    private javax.swing.JTextField txtCantPuntos;
    private javax.swing.JTextField txtCantidadTiempo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTipoMision;
    // End of variables declaration//GEN-END:variables



}
