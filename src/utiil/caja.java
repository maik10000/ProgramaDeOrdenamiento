/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiil;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.Random;


public class caja extends javax.swing.JLabel{

    private final Random numeroA;
    private final int numero;
    private final int ANCHO;
    private final int LARGO;
    private boolean colocado;
    int I = 50;
    int F = 255;
    Color nc;

    public caja(int ANCHO, int LARGO, int numero) {
        numeroA = new Random();
        this.numero = numero;
        this.setText(" " + numero);
        this.ANCHO = ANCHO;
        this.LARGO = LARGO;
        nc = new Color(numeroA.nextInt(F - I + 1) + 1, numeroA.nextInt(F - I + 1) + 1, numeroA.nextInt(F - I + 1) + 1);
        colocado = false;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(nc);
        g.fillRect(0, 0, ANCHO, LARGO);
        super.paint(g);
    }

    public void cambiarEstado(boolean n) {
        colocado = n;
    }

    public boolean obtenerEsado() {
        return colocado;
    }

    public int getNumero() {
        return numero;
    }

}
