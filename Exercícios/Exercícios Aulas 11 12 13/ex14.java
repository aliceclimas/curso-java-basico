import java.util.Scanner;

class ex14{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso dos peixes em kg");
        double peso = scan.nextDouble();

        if ( peso >= 50) {
            double multa = (peso - 50) * 4;
            System.out.println("Sua multa é de: " + multa);
        } else {
            System.out.println("Seu peso é ideal");
        }
    }
}