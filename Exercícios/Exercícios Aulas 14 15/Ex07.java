import java.util.Scanner;

class Ex07{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        double num1 = scan.nextDouble();

        System.out.println("Digite mais um número");
        double num2 = scan.nextDouble();

        System.out.println("Digite mais um número");
        double num3 = scan.nextDouble();

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("O menor número é"+ num1);
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println("O menor número é"+ num2);
        }  else {
            System.out.println("O menor número é"+ num3);
        }
        
    }
}