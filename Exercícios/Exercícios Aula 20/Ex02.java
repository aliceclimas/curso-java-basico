import java.util.Random;

class Ex02 {
    public static void main(String[] args) {

        int [][] valoresAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i<valoresAleatorios.length;i++){
            for (int j = 0; j<valoresAleatorios[i].length;j++){
                valoresAleatorios[i][j] = numeroRandom.nextInt(100);

            }

        }
       
        for (int i = 0;i < valoresAleatorios.length;i++){
            for (int j = 0; j < valoresAleatorios[i].length;j++){
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;

        for (int i = 0; i< valoresAleatorios[5].length;i++){
            if (valoresAleatorios[5][i] > maiorL5){
                maiorL5 = valoresAleatorios[5][i];
            }
            if (valoresAleatorios[5][i] < menorL5){
                menorL5 = valoresAleatorios[5][i];
            }
            
        }
        System.out.println("Maior valor da linha 5= " + maiorL5);
        System.out.println("Menor valor da linha 5= " + menorL5);

        int maiorC7 = 0;
        int menorC7 = Integer.MAX_VALUE;

        for (int i = 0;i<valoresAleatorios.length;i++){
            if (valoresAleatorios[i][7] > maiorC7){
                maiorC7 = valoresAleatorios[i][7];
            }
            if (valoresAleatorios[i][7] < menorC7){
                menorC7 = valoresAleatorios[i][7];
            }

        }
        System.out.println("Maior valor da linha 7= " + maiorC7);
        System.out.println("Menor valor da linha 7= " + menorC7);

     
        
    }
}