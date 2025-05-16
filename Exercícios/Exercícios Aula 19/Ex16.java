public class Ex16 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        double cont = 0;
        double somaMaior15 = 0;
        double somaMenor15 = 0;
        

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 30;
        vetorA[5] = 20;
        vetorA[6] = 20;
        vetorA[7] = 15;
        vetorA[8] = 15;
        vetorA[9] = 15;

    
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            } else if (vetorA[i]== 15){
                cont += 1;
            } else {
                somaMaior15 += vetorA[i];
            }

            
        }
        
        System.out.println("A soma de elementos inferiores a 15 neste vetor é: " + somaMenor15 ) ;
        System.out.println("A qauntidade de elementos iguais a 15 nesse vetor é: " + cont) ;
        System.out.println("A soma de elementos superiores a 15 neste vetor é: " + somaMaior15 ) ;
  
    }
}