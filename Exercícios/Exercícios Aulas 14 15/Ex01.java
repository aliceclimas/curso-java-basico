import java.util.Scanner;

class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número ");
        double num1 = scan.nextDouble();

        System.out.println("Digite outro número ");
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("O número" + num1 + " é maior que" + num2);
        } else {
            System.out.println("O número" + num2 + " é maior que"+ num1);
        }

    }
}