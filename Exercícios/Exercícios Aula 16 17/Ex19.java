import java.util.Scanner;

public class Ex19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int num2= scan.nextInt();

        int maior = num1;
        int menor =num1;
        int soma = 0;

        if ((num1 > 0 && num1 < 1000 )&& (num2 > 0 && num2 < 1000)){

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
        } else {
            System.out.println("Digite valores entre 0 e 1000");
        }
        scan.close();
}   }
