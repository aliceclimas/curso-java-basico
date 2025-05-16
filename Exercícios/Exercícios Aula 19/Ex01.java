
public class Ex01 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;

        vetorB[0] = 1;
        vetorB[1] = 2;
        vetorB[2] = 3;
        vetorB[3] = 4;
        vetorB[4] = 5;
        

        for (int i = 0; i<vetorA.length;i++){
            System.out.println("O valor do elemento na posição " + (i) + " é " + vetorA[i]) ;
        }

        for (int i = 0; i<vetorB.length;i++){
            System.out.println("O valor do elemento na posição " + (i) + " é " + vetorB[i]) ;
        }

        
        
    }
    
}
