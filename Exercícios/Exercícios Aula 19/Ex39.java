import java.util.ArrayList;

public class Ex39 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        ArrayList<Integer> vetorC = new ArrayList<>();
    
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

    
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC.add(vetorA[i]);
                    break; 
                }
            }
        }


        for (int num: vetorC){
            System.out.println(num);
        }
      
    }
}
