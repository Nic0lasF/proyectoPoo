package Interfaz;

import Interfaz.Mision.*;
//import Interfaz.Recompensa.*;

public class INTCompMenuAdm extends javax.swing.JFrame {
    public static INTMenuAdmin interfazMenu = new INTMenuAdmin(); 
    public INTCompMenuAdm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNAgregar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        BTNVer = new javax.swing.JButton();
        BTNSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNAgregar.setText("Agregar");
        BTNAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarActionPerformed(evt);
            }
        });

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNEliminarMouseClicked(evt);
            }
        });

        BTNModificar.setText("Modificar");
        BTNModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNModificarMouseClicked(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNBuscarMouseClicked(evt);
            }
        });

        BTNVer.setText("Ver");
        BTNVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNVerMouseClicked(evt);
            }
        });

        BTNSalir.setText("Salir");
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });

        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Bienvenido al menu de Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BTNAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarActionPerformed
        this.setVisible(false);
        Crear interfazCrear = new Crear();
        interfazCrear.setVisible(true);
        
    }//GEN-LAST:event_BTNAgregarActionPerformed

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        this.setVisible(false); //REGRESAR
        interfazMenu.setVisible(true);
    }//GEN-LAST:event_BTNSalirActionPerformed
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0); //CERRAR
    }//GEN-LAST:event_jButton1MouseClicked

    private void BTNEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEliminarMouseClicked
        this.setVisible(false);
        Eliminar interfazEliminar = new Eliminar();
        interfazEliminar.setVisible(true);
    }//GEN-LAST:event_BTNEliminarMouseClicked

    private void BTNModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNModificarMouseClicked
        this.setVisible(false);
        Modificar interfazModificar = new Modificar();
        interfazModificar.setVisible(true);
    }//GEN-LAST:event_BTNModificarMouseClicked

    private void BTNBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBuscarMouseClicked
        this.setVisible(false);
        Buscar interfazBuscar = new Buscar();
        interfazBuscar.setVisible(true);
    }//GEN-LAST:event_BTNBuscarMouseClicked

    private void BTNVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNVerMouseClicked
        this.setVisible(false);
        Ver interfazVer = new Ver();
        interfazVer.setVisible(true);
    }//GEN-LAST:event_BTNVerMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregar;
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JButton BTNVer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
