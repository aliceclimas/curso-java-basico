
public class Ex02 {
    public static void main(String[] args) {

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;

        for (int i = 0; i<vetorA.length;i++){
            System.out.println("O valor do elemento na posição A" + (i) + " é " + vetorA[i]) ;
        }

        for (int i = 0; i<vetorA.length;i++){
            vetorB[i] = vetorA[i] * 2;
            System.out.println("O valor do elemento na posição B" + (i) + " é " + vetorB[i]) ;
        }

        
        
    }
    
}