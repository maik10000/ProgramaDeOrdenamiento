package utiil;

public class MetodoSeleccion extends Ordenar {

    
    @Override
    public long getTiempo() {
        return tiempo;
    }
    @Override
    public int[] ordenar(int[] numeros) {
        System.out.println("metodo selec aqui ");
        Ti = System.nanoTime();
        for (int i = 0; i < numeros.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux;
            }
        }
        Tf = System.nanoTime();
        tiempo = Tf - Ti;
        return numeros;
    }
}
