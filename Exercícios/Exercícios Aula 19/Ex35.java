
public class Ex35 {
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
       
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Analizando o número " + vetorA[i]);
            
            for (int j=1; j<vetorA[i]; j++){
                if (vetorA[i] % j == 0){
                    System.out.println(j + " é divisor");
                }
            }
            
        
        }    
        System.out.println();

      
    }
}
