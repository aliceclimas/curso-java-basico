import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] cotacao = new double[20];
        double valorDolar;

        System.out.println("Um real equivale a quantos dólares?");
        valorDolar = scan.nextDouble();
    
        for (int i = 0; i<cotacao.length;i++){
            cotacao[i] = valorDolar * i;
        }
        
        for (int i = 0; i <cotacao.length;i++){
            System.out.println(cotacao[i]);

        }
        scan.close();

  
    }
}