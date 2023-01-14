package utiil;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public final class Menu extends javax.swing.JFrame {

    private reproducirSonido play;
    private agrandar transAgran;
    private desagrandar transDesa;
    private ImageIcon imagen;
    private Icon icono;
    private boolean mutear = false;
    private String direc;

    public Menu() {

        initComponents();
        direc = "src\\recuros\\iconos\\sonido.png";
        panelMenu.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(getIconImage());
        this.setTitle("Menú");
        pintarBoton();
        IniciaSonido();
    }
    @Override
     public Image getIconImage(){
         Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\recuros\\iconos\\linda.png");
        return nuevoIcono;
     }
    public void IniciaSonido() {
        play = new reproducirSonido("src\\recuros\\iconos\\AudioS.wav");
        play.start();
    }

    public void PararSonido() throws InterruptedException {
        reproducirSonido.sleep(500);
        Thread.sleep(500);
    }

    public void pintarBoton() {
        imagen = new ImageIcon(direc);
        icono = new ImageIcon(imagen.getImage().getScaledInstance(botonAjustes.getWidth(), botonAjustes.getHeight(), Image.SCALE_SMOOTH));
        botonAjustes.setIcon(icono);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonAjustes = new javax.swing.JLabel();
        botonInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBackground(new java.awt.Color(38, 38, 38));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");
        panelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        botonAjustes.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        botonAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAjustesMouseExited(evt);
            }
        });
        panelMenu.add(botonAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 50, 50));

        botonInicio.setBackground(new java.awt.Color(204, 204, 204));
        botonInicio.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        botonInicio.setForeground(new java.awt.Color(255, 255, 255));
        botonInicio.setText("    ¡Empezar!");
        botonInicio.setOpaque(true);
        botonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonInicioMousePressed(evt);
            }
        });
        panelMenu.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 170, 40));
        botonInicio.getAccessibleContext().setAccessibleParent(botonInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseEntered
        cambiarColor on = new cambiarColor(botonInicio, 101, 166, 3);
        on.start();
    }//GEN-LAST:event_botonInicioMouseEntered

    private void botonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseExited
        cambiarColor off = new cambiarColor(botonInicio, 204, 204, 204);
        off.start();
    }//GEN-LAST:event_botonInicioMouseExited

    private void botonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseClicked
        juegoOrdenamiento juego = new juegoOrdenamiento();
        juego.setVisible(true);
    }//GEN-LAST:event_botonInicioMouseClicked

    private void botonInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMousePressed
        cambiarColor off = new cambiarColor(botonInicio, 53, 89, 27);
        off.start();
    }//GEN-LAST:event_botonInicioMousePressed

    private void botonAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAjustesMouseEntered
        transAgran = new agrandar(53, 20, botonAjustes, direc);
        transAgran.start();
    }//GEN-LAST:event_botonAjustesMouseEntered

    private void botonAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAjustesMouseExited
        transDesa = new desagrandar(3, 20, botonAjustes, direc);
        transDesa.start();
    }//GEN-LAST:event_botonAjustesMouseExited

    private void botonAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAjustesMouseClicked
        if (!mutear) {
            play.PararSonido();
            direc = "src\\recuros\\iconos\\muteado.png";
            pintarBoton();
            mutear = true;
        } else {
            direc = "src\\recuros\\iconos\\sonido.png";
            pintarBoton();
            play = new reproducirSonido("src\\recuros\\iconos\\AudioS.wav");
            play.start();
            mutear = false;
        }


    }//GEN-LAST:event_botonAjustesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAjustes;
    private javax.swing.JLabel botonInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}

class cambiarColor extends Thread {

    private final javax.swing.JLabel botonInicio;
    private final int rojo;
    private final int verde;
    private final int azul;
    private final int[] R_V_A;
    int[] R_V_A2;

    public cambiarColor(JLabel botonInicio, int rojo, int verde, int azul) {
        R_V_A = new int[3];
        R_V_A2 = new int[3];
        this.botonInicio = botonInicio;
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public void extraerRGB2() {
        R_V_A2[0] = rojo;
        R_V_A2[1] = verde;
        R_V_A2[2] = azul;
    }

    public void extraerRGB() {
        R_V_A[0] = botonInicio.getBackground().getRed();
        R_V_A[1] = botonInicio.getBackground().getGreen();
        R_V_A[2] = botonInicio.getBackground().getBlue();
    }

    public void trans() {
        int rangoMax = rangoMacx()[0];
        for (int i = 0; i < rangoMacx().length - 1; i++) {
            if (rangoMacx()[i] < rangoMacx()[i + 1]) {
                rangoMax = rangoMacx()[i + 1];
            }
        }

        for (int i = 0; i <= rangoMax; i++) {
            if (R_V_A[0] != R_V_A2[0]) {
                if (R_V_A[0] < R_V_A2[0]) {
                    R_V_A[0]++;
                } else {
                    R_V_A[0]--;
                }
            }
            if (R_V_A[1] != R_V_A2[1]) {
                if (R_V_A[1] < R_V_A2[1]) {
                    R_V_A[1]++;
                } else {
                    R_V_A[1]--;
                }
            }
            if (R_V_A[2] != R_V_A2[2]) {
                if (R_V_A[2] < R_V_A2[2]) {
                    R_V_A[2]++;
                } else {
                    R_V_A[2]--;
                }
            }
            botonInicio.setBackground(new Color(R_V_A[0], R_V_A[1], R_V_A[2]));

        }

    }

    public int[] rangoMacx() {
        int[] r = new int[3];
        for (int i = 0; i < R_V_A.length; i++) {
            if ((R_V_A[i] - R_V_A2[i]) < 0) {
                r[i] = -(R_V_A[i] - R_V_A2[i]);
            } else {
                r[i] = R_V_A[i] - R_V_A2[i];
            }
        }
        return r;
    }

    @Override
    public void run() {
        extraerRGB2();
        extraerRGB();
        trans();
    }

}

class agrandar extends Thread {

    private final javax.swing.JLabel botonAjustes;
    private final ImageIcon imagen;
    private Icon icono;
    int tamañoIni;
    int velocidad;

    public agrandar(int tamañoIni, int velocidad, JLabel btn, String direc) {
        botonAjustes = btn;
        this.tamañoIni = tamañoIni;
        this.velocidad = velocidad;
        imagen = new ImageIcon(direc);
    }

    public synchronized void agrandar() {
        int tamaño = botonAjustes.getWidth();
        try {
            while (tamaño < tamañoIni) {
                botonAjustes.setBounds(botonAjustes.getX() - 1 / 2, botonAjustes.getY() - 1 / 2, botonAjustes.getWidth() + 1, botonAjustes.getWidth() + 1);
                icono = new ImageIcon(imagen.getImage().getScaledInstance(botonAjustes.getWidth(), botonAjustes.getHeight(), Image.SCALE_SMOOTH));
                botonAjustes.setIcon(icono);
                tamaño++;
                Thread.sleep(velocidad);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {

        agrandar();
    }

}

class desagrandar extends Thread {

    private final javax.swing.JLabel botonAjustes;
    private final ImageIcon imagen;
    private Icon icono;
    int tamañoIni;
    int velocidad;

    public desagrandar(int tamañoIni, int velocidad, JLabel btn, String direc) {
        botonAjustes = btn;
        this.tamañoIni = tamañoIni;
        this.velocidad = velocidad;
        imagen = new ImageIcon(direc);
    }

    public synchronized void desagrandar() {
        int tamaño = 0;

        try {
            while (tamaño < tamañoIni) {
                botonAjustes.setBounds(botonAjustes.getX() + 1 / 2, botonAjustes.getY() + 1 / 2, botonAjustes.getWidth() - 1, botonAjustes.getWidth() - 1);
                icono = icono = new ImageIcon(imagen.getImage().getScaledInstance(botonAjustes.getWidth(), botonAjustes.getHeight(), Image.SCALE_SMOOTH));
                botonAjustes.setIcon(icono);
                tamaño++;
                Thread.sleep(velocidad);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        desagrandar();
    }

}

class reproducirSonido extends Thread {

    private Clip audioClip;
    private AudioInputStream audioStream;

    @Override
    public void run() {
        audioClip.setFramePosition(0);
        audioClip.start();
    }

    public void PararSonido() {
        audioClip.stop();
    }

    public reproducirSonido(String path) {
        File audioFile = new File(path);
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }

        //acquire audio format and create a DataLine.Info object
        AudioFormat format = audioStream.getFormat();
        //obtain the Clip
        try {
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}
