public class Ex07 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;

        vetorB[0] = 1;
        vetorB[1] = 2;
        vetorB[2] = 3;
        vetorB[3] = 4;
        vetorB[4] = 5;
        vetorB[5] = 6;
        vetorB[6] = 7;
        vetorB[7] = 8;
        vetorB[8] = 9;
        vetorB[9] = 10;


        

        for (int i = 0; i<vetorA.length;i++){
            System.out.println("O valor do elemento do vetor A na posição " + (i) + " é " + vetorA[i]) ;
        }

        for (int i = 0; i<vetorB.length;i++){
            System.out.println("O valor do elemento do vetor B na posição " + (i) + " é " + vetorB[i]) ;
        }

        for (int i = 0; i<vetorA.length;i++){
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.println("O valor do elemento do vetor C na posição " + (i) + " é " + vetorC[i]) ;
        }
    }
}