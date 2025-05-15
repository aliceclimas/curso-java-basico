import java.util.Scanner;

class Ex08{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto");
        double num1 = scan.nextDouble();

        System.out.println("Digite o preço do segundo produto");
        double num2 = scan.nextDouble();

        System.out.println("Digite o preço do terceiro produto");
        double num3 = scan.nextDouble();

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("O menor valor de produto é: R$"+ num1);
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println("O menor valor de produto é: R$"+ num2);
        }  else {
            System.out.println("O menor valor de produto é: R$"+ num3);
        }
        
    }
}