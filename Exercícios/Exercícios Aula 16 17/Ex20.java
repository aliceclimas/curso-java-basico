import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas vezes deseja calcular o fatorial?: ");
        int q = scan.nextInt();

        for (int i = 1; i <= q; i++) {
            System.out.print("Digite um número para calcular o fatorial: ");
            int n = scan.nextInt();

            if (n >= 0 && n <= 16) {
                int resultado = 1;
                for (int j = 1; j <= n; j++) {
                    resultado *= j;
                }
                System.out.println("Fatorial de " + n + " é: " + resultado);
            } else {
                System.out.println("Valor inválido. Digite um número entre 0 e 16.");
            }
        }

        scan.close();
    }
}
