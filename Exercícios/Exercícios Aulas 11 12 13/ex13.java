import java.util.Scanner;

class ex13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        System.out.println("Digite seu sexo [F ou M]");
        String sexo = scan.next();

        if (sexo == "F" || sexo == "f") {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        } else {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        }
    }
}