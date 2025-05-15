import java.util.Scanner;

public class Ex18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int num2= scan.nextInt();

        int maior= Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        if (num1< num2){
            for (int i = num1 ; i< num2;i++){
                if (i > maior) maior = i;
                if (i < menor) menor = i;
                soma += i;
                System.out.println(i); 

            }
        } else {
            for (int i = num1 ; i> num2;i--){
                if (i > maior) maior = i;
                if (i < menor) menor = i;
                soma += i;
                System.out.println(i);

            }
        }
      

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado:"+ menor);
        System.out.println("Soma dos números digitados:"+ soma);
        scan.close();
}   }
