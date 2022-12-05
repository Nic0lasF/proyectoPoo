package Interfaz;

import Usuarios.Administrador;
import Usuarios.Cliente;
import static com.mycompany.poo.Poo.op;

public class InterfazInicioSesion extends javax.swing.JFrame {
    
    public static Administrador admin = new Administrador();
    public static Cliente cliente = new Cliente();

    public InterfazInicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        Labeltxt = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalida.setText("Salir");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 20));

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, -1));

        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 150, -1));

        Labeltxt.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Labeltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, 20));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 380, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalidaActionPerformed
    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
    }//GEN-LAST:event_txtContraActionPerformed
    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
    }//GEN-LAST:event_btnIniciarSesionMouseClicked
    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
    }//GEN-LAST:event_txtUserActionPerformed
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String credencialesUsuario = op.buscarUsuario(txtUser.getText()+";"+txtContra.getText(),"usuarios(inhackeable)");
        if(credencialesUsuario != null){
            String[] cadena = credencialesUsuario.split(";");
            //Inicio ADMIN
            if(cadena[2].equals("0")){
                //Cargado admin
                System.out.println("Se ha logueado como administrador");
                op.cargarAdmin(credencialesUsuario);
                
                this.setVisible(false);
                INTMenuAdmin interfaz = new INTMenuAdmin();
                interfaz.setVisible(true);
                //menu.menuAdmin();
                //System.exit(0);
            }
            //Inicio Usuario
            if(cadena[2].equals("1")){
                //Cargado Cliente
                System.out.println("Se ha logueado como cliente");
                op.cargarCliente(credencialesUsuario);

                this.setVisible(false);
                INTMenu interfaz = new INTMenu();
                interfaz.setVisible(true);
                //menu.menuCliente();
                //System.exit(0);
            }
        }
        else
            Labeltxt.setText("Datos incorrectos");
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Labeltxt;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
