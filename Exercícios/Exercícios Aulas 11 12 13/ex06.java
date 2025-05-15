import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float pi = 3.14f;

        System.out.println("Digite o raio do círculo: ");
        float raio = scan.nextFloat();

        float area = pi * (raio * raio);

        System.out.println("A área desse círculo é: " + area);
    }
    
}
