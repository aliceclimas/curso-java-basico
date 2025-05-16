public class Ex25 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 5;
        vetorA[6] = 4;
        vetorA[7] = 3;
        vetorA[8] = 2;
        vetorA[9] = 8;

        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] % 2 == 0){
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
            System.out.println(vetorB[i]);
        } 
    }
}