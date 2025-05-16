public class Ex27 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        char[] vetorB = new char[10];

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

    
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if (vetorA[i] >= 7 && vetorA[1] < 10){
                vetorB[i] = 'b';
            } else if (vetorA[i] >= 10){
                vetorB[i] = 'c';
            }
            System.out.println(vetorB[i]);
        } 
    }
}