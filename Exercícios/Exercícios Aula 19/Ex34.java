
public class Ex34 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
    
    
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
            for (int j = 0; j < vetorA[i];j++){
                if (j % 2 == 0){
                    System.out.print(vetorA[i]);
                    System.out.print(j + " , ");
                }
            }
        }

      
    }
}