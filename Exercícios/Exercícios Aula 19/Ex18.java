public class Ex18 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int indiceMaior = 0;
        int indiceMenor = 0;

       
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 38;
        vetorA[5] = 42;
        vetorA[6] = 56;
        vetorA[7] = 15;
        vetorA[8] = 15;
        vetorA[9] = 15;

    
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] > maior){
                maior = vetorA[i];
                indiceMaior = i;
            } 
            if (vetorA[i] < menor){
                menor = vetorA[i];
            } 

            
        }
        
        System.out.println("A pessoa com maior idade:" + maior + "tem índice" + indiceMaior);
        System.out.println("A pessoa com maior idade:" + menor + "tem índice" + indiceMenor);
  
    }
}