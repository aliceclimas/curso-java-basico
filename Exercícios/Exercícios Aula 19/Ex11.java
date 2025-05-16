public class Ex11 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int cont = 0;


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
            if (vetorA[i] % 2 == 0){
                cont += 1;
            }   
        }

        System.out.println("Existem " + cont + " números pares nesse vetor") ;
    }
}
