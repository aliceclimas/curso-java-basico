public class Ex15 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        double contImpar = 0;
        double contPar = 0;
        double qtdPar, qtdImpar;
        


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
            if (vetorA[i] % 2 != 0){
                contImpar += 1;
            } else {
                contPar += 1;

            }
            
        }
        
        qtdImpar = (contImpar / vetorA.length) * 100;
        qtdPar = (contPar / vetorA.length) * 100;

        System.out.println("A porcentagem de pares nesse vetor é: " + qtdPar + "%") ;
        System.out.println("A porcentagem de ímpares nesse vetor é: " + qtdImpar + "%" ) ;
  
    }
}