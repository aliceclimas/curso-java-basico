import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int x;
        boolean valido = true;
     
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
       
        System.out.println("Digite um valor");
        x= scan.nextInt();
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] == x){
                valido = false;
            } else {
                

            }
           
        } 
        if (!valido){
            System.out.println("Número " + x + " encontrado no vetor");
        } else {
             System.out.println("Número " + x + " não encontrado no vetor");

        }
        scan.close();

   
    }
}
