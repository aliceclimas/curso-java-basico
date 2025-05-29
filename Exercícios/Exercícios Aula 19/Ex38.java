public class Ex38 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

     
        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 5;
        vetorA[6] = 4;
        vetorA[7] = 8;
        vetorA[8] = 2;
        vetorA[9] = 8;

       
        for (int i = 0; i < vetorA.length; i++) {
            int soma = 0;
            for (int j = i; j < vetorA.length; j++) {
                soma += vetorA[j];
            }
            vetorB[i] = soma;
        }

        
        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("B[" + i + "] = " + vetorB[i]);
        }
    }
}
