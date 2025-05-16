public class Ex13 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int somaMult5 = 0;


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

    
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] % 5 == 0){
                somaMult5 += vetorA[i] ;
            }
            
        }

        System.out.println("A soma de todos elementos multíplos de 5 nesse vetor é: " + somaMult5 ) ;
    }
}
