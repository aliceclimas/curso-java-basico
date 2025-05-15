import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o comprimento desejado em metros: ");
        float metros = scan.nextFloat();

        float centimetro = metros * 100;

        System.out.println("A quantidade em centímetros é de :"+ centimetro);
    }
    
}
