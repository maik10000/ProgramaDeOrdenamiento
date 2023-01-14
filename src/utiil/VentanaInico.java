package utiil;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class VentanaInico extends javax.swing.JFrame {

    private static AProgreso progreso;
    private static animacionPalabra animaPalabra;

    public VentanaInico() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(getIconImage());
        this.setTitle("Iniciando...");
        iniciar();

    }
    @Override
 public Image getIconImage(){
         Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\recuros\\iconos\\linda.png");
        return nuevoIcono;
     }
    private void iniciar() {
        animaPalabra = new animacionPalabra(punto1, punto2, punto3);
        progreso = new AProgreso(barraProgreso);
        animaPalabra.start();
        progreso.start();
    }
    public void detenerAnima() {
        animaPalabra.stop();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        palabra = new javax.swing.JLabel();
        punto3 = new javax.swing.JLabel();
        punto1 = new javax.swing.JLabel();
        punto2 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        palabra.setFont(new java.awt.Font("Consolas", 3, 48)); // NOI18N
        palabra.setForeground(new java.awt.Color(255, 255, 255));
        palabra.setText("Cargando");
        jPanel1.add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 80));

        punto3.setFont(new java.awt.Font("Consolas", 3, 48)); // NOI18N
        punto3.setForeground(new java.awt.Color(255, 255, 255));
        punto3.setText(".");
        jPanel1.add(punto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 30, 40));

        punto1.setFont(new java.awt.Font("Consolas", 3, 48)); // NOI18N
        punto1.setForeground(new java.awt.Color(255, 255, 255));
        punto1.setText(".");
        jPanel1.add(punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 30, 40));

        punto2.setFont(new java.awt.Font("Consolas", 3, 48)); // NOI18N
        punto2.setForeground(new java.awt.Color(255, 255, 255));
        punto2.setText(".");
        jPanel1.add(punto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 30, 40));

        barraProgreso.setBackground(new java.awt.Color(255, 255, 255));
        barraProgreso.setForeground(new java.awt.Color(101, 166, 3));
        barraProgreso.setBorderPainted(false);
        barraProgreso.setOpaque(true);
        barraProgreso.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 380, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel palabra;
    private javax.swing.JLabel punto1;
    private javax.swing.JLabel punto2;
    private javax.swing.JLabel punto3;
    // End of variables declaration//GEN-END:variables
}

class AProgreso extends Thread {

    private final javax.swing.JProgressBar barraProgreso;
    private static VentanaInico ventana;
    private Menu ventnaMenu;

    public AProgreso(JProgressBar barraProgreso) {
        this.barraProgreso = barraProgreso;
    }

    public static void main(String[] args) {
        ventana = new VentanaInico();
        ventana.setVisible(true);
        
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                barraProgreso.setValue(i);
                Thread.sleep(40);
            }
            ventana.dispose();
            ventnaMenu = new Menu();
            ventnaMenu.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(AProgreso.class.getName()).log(Level.SEVERE, null, ex);
        }
            ventana.detenerAnima();
  
    }
}

class animacionPalabra extends Thread {

    private final javax.swing.JLabel punto1;
    private final javax.swing.JLabel punto2;
    private final javax.swing.JLabel punto3;

    public animacionPalabra(JLabel punto1, JLabel punto2, JLabel punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;;
    }

    public void transicion() {
        int velocidad = 30;
        while (true) {
            opacar(punto1, 0, velocidad);
            opacar(punto2, 0, velocidad);
            opacar(punto3, 0, velocidad);
            desOpacar(punto1, 1, velocidad);
            desOpacar(punto2, 1, velocidad);
            desOpacar(punto3, 1, velocidad);
        }
    }

    public void opacar(JLabel punto, float opMin, int velocidad) {
        float op = 1.0f;
        try {
            while (op <= opMin) {

                punto.setForeground(new Color(1, 1, 1, op));
                Thread.sleep(velocidad);
                op -= 0.1f;
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(animacionPalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void desOpacar(JLabel punto, float opMax, int velocidad) {
        float op = 0;
        try {
            while (op <= opMax) {

                punto.setForeground(new Color(1, 1, 1, op));
                Thread.sleep(velocidad);
                op += 0.10f;
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(animacionPalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        transicion();
    }

}
