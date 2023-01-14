package utiil;


public class MetodoInsercion extends Ordenar{
   
    
    @Override
    public long getTiempo() {
        return tiempo;
    }
    @Override
    public int[] ordenar(int [] numeros) {
                System.out.println("metodo inser aqui ");

        int pos, aux;
        Ti=System.nanoTime();
        for (int i = 0; i < numeros.length; i++) {
            pos = i;
            aux = numeros[i];
            while ((pos > 0) && (numeros[pos - 1] > aux)) {
                numeros[pos] = numeros[pos - 1];
                pos--;
            }
            numeros[pos] = aux;
        }
       Tf=System.nanoTime();
       tiempo=Tf-Ti; 
       return numeros;
    }
}
