import java.util.Scanner;

class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = scan.nextDouble();


        if (valor > 0){
            System.out.println("O número" + valor + "é positivo");
        } else {
            System.out.println("O número" + valor + "é negativo");
        }

    }
}