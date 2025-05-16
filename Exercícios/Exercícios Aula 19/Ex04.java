public class Ex04 {
    public static void main(String[] args) {

        double[] vetorA = new double[15];
        double[] vetorB = new double[15];

        vetorA[0] = 1;
        vetorA[1] = 4;
        vetorA[2] = 9;
        vetorA[3] = 16;
        vetorA[4] = 25;
        vetorA[5] = 36;
        vetorA[6] = 49;
        vetorA[7] = 64;
        vetorA[8] = 81;
        vetorA[9] = 100;
        vetorA[10] = 121;
        vetorA[11] = 144;
        vetorA[12] = 169;
        vetorA[13] = 196;
        vetorA[14] = 225;

        for (int i = 0; i<vetorA.length;i++){
            System.out.println("O valor do elemento na posição A" + (i) + " é " + vetorA[i]) ;
        }

        for (int i = 0; i<vetorA.length;i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("O valor do elemento na posição B" + (i) + " é " + vetorB[i]) ;
        }

        
        
    }
    
}