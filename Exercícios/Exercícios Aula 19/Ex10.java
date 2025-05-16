public class Ex10 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        

        vetorA[0] = 3;
        vetorA[1] = 5;
        vetorA[2] = 7;
        vetorA[3] = 9;
        vetorA[4] = 2;
        vetorA[5] = 4;
        vetorA[6] = 6;
        vetorA[7] = 8;
        vetorA[8] = 10;
        vetorA[9] = 12;

    
        for (int i = 0; i<vetorA.length;i++){
            System.out.println("O valor do elemento do vetor A na posição " + (i) + " é " + vetorA[i]) ;
        }

        for (int i = 0; i<vetorA.length;i++){
            vetorB[i] = vetorA[i] % 2;
            System.out.println("O v alor do elemento do vetor b na posição " + (i) + " é " + vetorB[i]) ;
        }
    }
}
