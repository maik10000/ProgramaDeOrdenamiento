package utiil;

public class MetodoShellsort extends Ordenar {


    @Override
    public long getTiempo() {
        return tiempo;
    }

    @Override
    public int[] ordenar(int[] numeros) {
        System.out.println("metodo shell aqui ");
        Ti = System.nanoTime();
        for (int incremento = numeros.length / 2; incremento > 0; incremento = (incremento == 2) ? 1 : (int) Math.round(incremento / 2.2)) {
            for (int i = incremento; i < numeros.length; i++) {
                for (int j = i; j >= incremento && numeros[j - incremento] > numeros[j]; j -= incremento) {
                    int buffer = numeros[j];
                    numeros[j] = numeros[j - incremento];
                    numeros[j - incremento] = buffer;
                }
            }
        }
        Tf = System.nanoTime();
        tiempo = Tf - Ti;
        return numeros;
    }

}
