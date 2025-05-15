import java.util.Scanner;

public class Ex08{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        for (int i = 0; i < 5;i++){
            System.out.println("Digite um número:");
            double numero = scan.nextDouble();

            soma+=numero;      

        }
         media = soma / 5;

        System.out.println("Soma"+soma);
        System.out.println("Média"+media);

        scan.close();

    }
}