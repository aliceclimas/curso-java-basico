import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura em metros: ");
        float altura = scan.nextFloat();

        float pesoIdeal = (72.7f * altura) - 58;

        System.out.println("Seu peso ideal é de:"+ pesoIdeal);
    }
    
}
