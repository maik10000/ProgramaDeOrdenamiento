/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiil;

public class MetodoBurbuja extends Ordenar {

    @Override
    public long getTiempo() {
        return tiempo;
    }
 
    @Override
    public int [] ordenar(int [] numeros) {
       int aux = 0;
        Ti=System.nanoTime();
            for (int i = 0; i <numeros.length; i++) {
                for (int j = 0; j < numeros.length-1; j++) {
                    if(numeros[j]>numeros[j+1]){
                        aux = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = aux;
                    }
                }
        }
        Tf=System.nanoTime();
       tiempo=Tf-Ti;
        return numeros;
    }
}

