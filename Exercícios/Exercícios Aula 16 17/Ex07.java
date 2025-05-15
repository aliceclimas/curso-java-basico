import java.util.Scanner;

public class Ex07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior= Integer.MIN_VALUE; // representa o menor valor que uma variável int pode receber

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            num = scan.nextInt(); 
            if (num >= maior) {
                maior = num;
                System.out.println("O número maior mudou:"+ maior);

            }
        }

        System.out.println("Maior número digitado: " + maior);
        scan.close();
    }
}


