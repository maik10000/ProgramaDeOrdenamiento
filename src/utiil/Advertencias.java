package utiil;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Advertencias extends javax.swing.JFrame {

    public Advertencias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setTitle("!Importante!");
        this.setIconImage(getIconImage());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
 @Override
 public Image getIconImage(){
         Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\recuros\\iconos\\enojado.png");
        return nuevoIcono;
     }
    public void ponerTitulo(String advertencia) {

        tituloAdvertencia.setText(advertencia);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloAdvertencia = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloAdvertencia.setBackground(new java.awt.Color(101, 166, 3));
        tituloAdvertencia.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        tituloAdvertencia.setForeground(new java.awt.Color(255, 255, 255));
        tituloAdvertencia.setText("   ");
        jPanel1.add(tituloAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 580, 50));

        botonAceptar.setBackground(new java.awt.Color(101, 166, 3));
        botonAceptar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptar.setText("    Aceptar");
        botonAceptar.setOpaque(true);
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAceptarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAceptarMouseReleased(evt);
            }
        });
        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonAceptarMouseClicked

    private void botonAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMousePressed
        cambiarColor off = new cambiarColor(botonAceptar, 53, 89, 27);
        off.start();
    }//GEN-LAST:event_botonAceptarMousePressed

    private void botonAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseReleased
        cambiarColor on = new cambiarColor(botonAceptar, 101, 166, 3);
        on.start();
    }//GEN-LAST:event_botonAceptarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloAdvertencia;
    // End of variables declaration//GEN-END:variables
}
