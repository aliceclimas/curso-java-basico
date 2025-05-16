import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] cotacao = new double[20];
        double valorDolar;
        double valorReal;

        System.out.println("Digite o valor do dólar");
        valorDolar = scan.nextDouble();
       

       

    
        for (int i = 0; i<cotacao.length;i++){
            System.out.println("Digite o valor em real");
            valorReal = scan.nextDouble();
            cotacao[i] = valorReal/valorDolar;
        }
        
        for (int i = 0; i <cotacao.length;i++){
            System.out.println(cotacao[i]);

        }
        scan.close();

  
    }
}