public class Ex31 {
    public static void main(String[] args) {

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
     
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
        vetorA[10] = 1;
        vetorA[11] = 2;
        vetorA[12] = 3;
        vetorA[13] = 4;
        vetorA[14] = 5;
        vetorA[15] = 6;
        vetorA[16] = 7;
        vetorA[17] = 8;
        vetorA[18] = 9;
        vetorA[19] = 10;

        for (int i = 0; i<10;i++){
            if (vetorA[i] % 2 == 0){
                vetorB[i] = vetorA[i];
            }
           
        } 

        for (int i = 11; i < 20; i++) {
            if (vetorA[i] % 2 != 0){
                vetorB[i] = vetorA[i];
            }
           
            
        }

        for (int i = 0; i<=vetorB.length;i++){
            System.out.println(vetorB[i]);
        }
        for (int i = 0; i<=vetorB.length;i++){
            System.out.println(vetorB[i]);
        }
    }
}