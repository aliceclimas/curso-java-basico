import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        double resultado;
     
        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        
        for (int i = 0; i<vetorA.length;i++){
            for (int j = 1 ; j <= 10; j++){
                resultado = vetorA[i] * j;
                System.out.println(vetorA[i] + "x" + j + "=" + resultado);
            }
                
        } 
        scan.close();
        

   
    }
}