import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado de um quadrado: ");
        float lado = scan.nextFloat();

        float area = lado * lado;
        float areaDobrada = area * 2;

        System.out.println("A área desse quadrado é: "+ area);
        System.out.println("O dobro da área desse quadrado é:" + areaDobrada);


    }
    
}
