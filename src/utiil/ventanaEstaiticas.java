/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiil;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public final class ventanaEstaiticas extends javax.swing.JFrame {

    String[] metodos;

    public ventanaEstaiticas() {
        initComponents();
        InicializarMetodos();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
         this.setTitle("Estadisticas");
        this.setIconImage(getIconImage());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    @Override
 public Image getIconImage(){
         Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("recuros\\iconos\\linda.png");
        return nuevoIcono;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baseG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baseG.setBackground(new java.awt.Color(38, 38, 38));
        baseG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grafica");
        baseG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        baseG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 830, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseG, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseG, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void InicializarMetodos() {
        metodos = new String[4];
        metodos[0] = "Burbuja";
        metodos[1] = "Inserción";
        metodos[2] = "Selección";
        metodos[3] = "Shellsort";
    }

    public void CrearGrafica(long[] tValores) {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for (int i = 0; i < metodos.length; i++) {
            datos.setValue(tValores[i], "Tiempo de Ejecución", metodos[i]);
            System.out.println(tValores[i]);
        }
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                /*nombre del gráfico*/"Tiempo de Ejecución",
                /*nombre de barras o columnas*/ "Métodos de Ordenamiento",
                /*nombre numeración*/ "Tiempo de cálculo",
                /*datos del gráfico*/ datos,
                /*Orientacion del Gráfico*/ PlotOrientation.VERTICAL,
                /*leegenda de barra individuales*/ true,
                /*herramientas*/ true,
                /*URL*/ false
        );
        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600, 300));

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
