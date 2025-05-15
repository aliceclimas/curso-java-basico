import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dogite um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int num2 = scan.nextInt();

        System.out.println("Digite um número real");
        float num3 = scan.nextFloat();

        float resultado1 = (2 * num1) * (num3/2);
        float resultado2 = (3 * num1) + num3;
        float resultado3 = (num3 * num3 * num3);

        System.out.println("O produto do dobro do primeiro com metado do segundo é:" + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é:" + resultado2);
        System.out.println("O terceiro elevado ao cubo é:" + resultado3);
        
    }
    
}
