public class Ex37 {
    public static void main(String[] args) {

        double[] vetorA = new double[15];
        long[] vetorB = new long[15];

      
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
        }

       
        for (int i = 0; i < vetorA.length; i++) {
            long resultado = 1;
            int numero = (int) vetorA[i]; 

            for (int j = 1; j <= numero; j++) {
                resultado *= j;
            }

            vetorB[i] = resultado;
            System.out.println("O fatorial de " + numero + " é " + vetorB[i]);
        }
    }
}
