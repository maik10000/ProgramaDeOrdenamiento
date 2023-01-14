/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiil;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;

public final class juegoOrdenamiento extends javax.swing.JFrame {

    private caja[] cajas;
    private final int ANCHO_CAJA = 60;
    private final int LARGO_CAJA = 60;
    private int X = 30;
    private final int Y = 50;
    private Ordenar ord;
    private animarCajas caja;
    private boolean selecciono;
    private final Random numeroA;
    private boolean limpio = true;
    private final long[] datosTiempo;

    public juegoOrdenamiento() {
        initComponents();
        base.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
         this.setTitle("Programa de Ordenamiento");
         this.setIconImage(getIconImage());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        numeroA = new Random();
        datosTiempo = new long[4];
        InicializarDatos();
    }
    @Override
     public Image getIconImage(){
         Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("recuros\\iconos\\linda.png");
        return nuevoIcono;
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entradaCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        metodosOrenamiento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        abrirGraficos = new javax.swing.JLabel();
        selecAleatorio = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        entradaNumeros = new javax.swing.JTextField();
        ordenarNumeros = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelAniimacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base.setBackground(new java.awt.Color(38, 38, 38));
        base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Vamos a Ordenar!");
        base.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 450, 60));

        jLabel2.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione el metodo para ordenar:");
        base.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        entradaCantidad.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        entradaCantidad.setToolTipText("");
        base.add(entradaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 50, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese la catidad de numeros a ordenar:");
        base.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        metodosOrenamiento.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        metodosOrenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione una>", "Metodo de Burbuja", "Metodo Insercion", "Metodo de seleccion", "Metodo Shell Sort" }));
        metodosOrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodosOrenamientoActionPerformed(evt);
            }
        });
        base.add(metodosOrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 350, 20));

        jLabel4.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ver la grafica del tiempo de demora:");
        base.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, -1, 30));

        abrirGraficos.setBackground(new java.awt.Color(101, 166, 3));
        abrirGraficos.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        abrirGraficos.setForeground(new java.awt.Color(255, 255, 255));
        abrirGraficos.setText("   Grafica");
        abrirGraficos.setOpaque(true);
        abrirGraficos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirGraficosMouseClicked(evt);
            }
        });
        base.add(abrirGraficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 130, 30));

        selecAleatorio.setOpaque(false);
        selecAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecAleatorioActionPerformed(evt);
            }
        });
        base.add(selecAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 20, 40));

        jLabel5.setFont(new java.awt.Font("Consolas", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Ingrese \"-\" para separa cada numero");
        base.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        entradaNumeros.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        entradaNumeros.setToolTipText("");
        base.add(entradaNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 430, 30));

        ordenarNumeros.setBackground(new java.awt.Color(101, 166, 3));
        ordenarNumeros.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        ordenarNumeros.setForeground(new java.awt.Color(255, 255, 255));
        ordenarNumeros.setText("   Ordenar");
        ordenarNumeros.setOpaque(true);
        ordenarNumeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordenarNumerosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ordenarNumerosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ordenarNumerosMouseReleased(evt);
            }
        });
        base.add(ordenarNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        jLabel8.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese mas de 2 numeros enteros para ordenar:");
        base.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Generar numeros aleatorios:");
        base.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        javax.swing.GroupLayout panelAniimacionLayout = new javax.swing.GroupLayout(panelAniimacion);
        panelAniimacion.setLayout(panelAniimacionLayout);
        panelAniimacionLayout.setHorizontalGroup(
            panelAniimacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        panelAniimacionLayout.setVerticalGroup(
            panelAniimacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelAniimacion);

        base.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 970, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecAleatorioActionPerformed
        if (selecAleatorio.isSelected()) {
            entradaNumeros.setEditable(false);
            entradaNumeros.setText("");
        } else {
            entradaNumeros.setEditable(true);
        }
    }//GEN-LAST:event_selecAleatorioActionPerformed

    private void ordenarNumerosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarNumerosMousePressed
        cambiarColor off = new cambiarColor(ordenarNumeros, 53, 89, 27);
        off.start();
    }//GEN-LAST:event_ordenarNumerosMousePressed

    private void ordenarNumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarNumerosMouseClicked
        int[] arreglo = null;
        if (!limpio) {
            limpiar();
        }
        if (selecciono) {
            if (!selecAleatorio.isSelected()) {
                try {
                    arreglo = extrarNumeros(entradaNumeros.getText());
                } catch (NumberFormatException e) {
                    Advertencias advertencia = new Advertencias();
                    advertencia.setVisible(true);
                }
            } else {
                try {
                    int cantidad = Integer.parseInt(entradaCantidad.getText());
                    arreglo = numerosAleatorio(cantidad);
                } catch (NumberFormatException e) {
                    Advertencias advertencia = new Advertencias();
                    advertencia.setVisible(true);
                }

            }
            if (arreglo != null) {
                crearCajas(arreglo);

                caja = new animarCajas(cajas, ord.ordenar(arreglo));
                datosTiempo[metodosOrenamiento.getSelectedIndex() - 1] = ord.getTiempo();
                caja.start();
            } else {
                Advertencias advertencia = new Advertencias();
                advertencia.ponerTitulo("¡Verifique que los datos estén ingresados correctamente!");
                advertencia.setVisible(true);
            }

        } else {
            Advertencias advertencia = new Advertencias();
            advertencia.ponerTitulo("No se ha seleccionado ningún método!!!");
            advertencia.setVisible(true);
        }
    }//GEN-LAST:event_ordenarNumerosMouseClicked

    private void ordenarNumerosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarNumerosMouseReleased
        cambiarColor on = new cambiarColor(ordenarNumeros, 101, 166, 3);
        on.start();
    }//GEN-LAST:event_ordenarNumerosMouseReleased
    public void InicializarDatos() {
        for (int i = 0; i < datosTiempo.length; i++) {
            datosTiempo[i] = 0;
        }
    }
    private void abrirGraficosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirGraficosMouseClicked

        ventanaEstaiticas estadistica = new ventanaEstaiticas();
        estadistica.CrearGrafica(datosTiempo);
        estadistica.setVisible(true);

    }//GEN-LAST:event_abrirGraficosMouseClicked

    private void metodosOrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodosOrenamientoActionPerformed
        seleccionar();
    }//GEN-LAST:event_metodosOrenamientoActionPerformed
    public int[] extrarNumeros(String cadena) {
        String replace = cadena.replace(" ", "");
        String[] cad = replace.split("\\-");
        int[] numeros = new int[cad.length];
        for (int i = 0; i < cad.length; i++) {
            numeros[i] = Integer.parseInt(cad[i]);
        }
        return numeros;
    }

    public int[] numerosAleatorio(int dimencio) {
        int[] numeros = new int[dimencio];
        for (int i = 0; i < dimencio; i++) {
            numeros[i] = numeroA.nextInt(100);
        }
        return numeros;
    }

    public void seleccionar() {
        if (metodosOrenamiento.getSelectedItem().toString().equals(metodosOrenamiento.getItemAt(1))) {
            selecciono = true;
            ord = new MetodoBurbuja();
        } else if (metodosOrenamiento.getSelectedItem().toString().equals(metodosOrenamiento.getItemAt(2))) {
            selecciono = true;
            ord = new MetodoInsercion();
        } else if (metodosOrenamiento.getSelectedItem().toString().equals(metodosOrenamiento.getItemAt(3))) {
            selecciono = true;
            ord = new MetodoSeleccion();
        } else if (metodosOrenamiento.getSelectedItem().toString().equals(metodosOrenamiento.getItemAt(4))) {
            selecciono = true;
            ord = new MetodoShellsort();
        } else {
            selecciono = false;

        }
    }

    public void crearCajas(int[] numerosOriginales) {
        cajas = new caja[numerosOriginales.length];
        for (int i = 0; i < numerosOriginales.length; i++) {
            cajas[i] = new caja(ANCHO_CAJA, LARGO_CAJA, numerosOriginales[i]);
            cajas[i].setBounds(X, Y, ANCHO_CAJA, LARGO_CAJA);
            panelAniimacion.add(cajas[i]);
            panelAniimacion.repaint();
            X += ANCHO_CAJA;
        }
        limpio = false;
    }

    public void limpiar() {
        for (int i = 0; i < cajas.length; i++) {
            cajas[i].setBounds(0, 0, 0, 0);
            panelAniimacion.add(cajas[i]);
            panelAniimacion.repaint();
            X = 30;
        }
        limpio = true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abrirGraficos;
    private javax.swing.JPanel base;
    private javax.swing.JTextField entradaCantidad;
    private javax.swing.JTextField entradaNumeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> metodosOrenamiento;
    private javax.swing.JLabel ordenarNumeros;
    private javax.swing.JPanel panelAniimacion;
    private javax.swing.JCheckBox selecAleatorio;
    // End of variables declaration//GEN-END:variables
}

class animarCajas extends Thread {

    private final caja[] cajas;
    int[] numerosOrdenados;

    public animarCajas(caja[] cajas, int[] numerosOrdenados) {
        this.cajas = cajas;
        this.numerosOrdenados = numerosOrdenados;
    }

    @Override
    public void run() {
        mover();
    }

    public void mover() {
        int movx = cajas[0].getWidth();
        int movy = cajas[0].getHeight();
        int X = cajas[0].getX();
        int Y = cajas[0].getY();
        try {
            for (int x = 0; x < cajas.length; x++) {
                for (int index = 0; index < cajas.length; index++) {
                    if ((numerosOrdenados[x] == cajas[index].getNumero()) && !cajas[index].obtenerEsado()) {
                        for (int j = 0; j < movy; j++) {
                            cajas[index].setBounds(X, cajas[index].getY() + 1, cajas[index].getWidth(), cajas[index].getHeight());
                            Thread.sleep(2);
                        }
                        for (int i = 0; i < movx; i++) {
                            cajas[index].setBounds(X + i, cajas[index].getY(), cajas[index].getWidth(), cajas[index].getHeight());
                            Thread.sleep(2);
                        }
                        Thread.sleep(5);
                        movx += cajas[0].getWidth();
                        cajas[index].cambiarEstado(true);
                    }

                }

            }

        } catch (InterruptedException ex) {
            Logger.getLogger(animarCajas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
