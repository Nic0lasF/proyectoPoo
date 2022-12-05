package Interfaz;

import Interfaz.Recompensa.*;

public class INTCompMenuAdmRec extends javax.swing.JFrame {
    public static INTMenuAdmin interfazMenu = new INTMenuAdmin();
    
    public INTCompMenuAdmRec() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });

        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        jLabel1.setText("Bienvenido al menu de Administrador");

        jButton1.setText("Ver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cerrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cerrar)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        this.setVisible(false);
        Crear interfazCrear = new Crear();
        interfazCrear.setVisible(true);
    }//GEN-LAST:event_AgregarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        this.setVisible(false);
        Eliminar interfazEliminar = new Eliminar();
        interfazEliminar.setVisible(true);
    }//GEN-LAST:event_EliminarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        this.setVisible(false);
        Modificar interfazModificar = new Modificar();
        interfazModificar.setVisible(true);
    }//GEN-LAST:event_ModificarMouseClicked

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        this.setVisible(false);
        Buscar interfazBuscar = new Buscar();
        interfazBuscar.setVisible(true);
    }//GEN-LAST:event_BuscarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        this.setVisible(false); //REGRESAR
        interfazMenu.setVisible(true);
    }//GEN-LAST:event_SalirMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0); //CERRAR
    }//GEN-LAST:event_CerrarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        Ver interfazVer = new Ver();
        interfazVer.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
