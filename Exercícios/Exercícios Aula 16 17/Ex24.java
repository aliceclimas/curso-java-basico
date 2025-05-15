import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas notas deseja inserir?: ");
        int n = scan.nextInt();

        double soma = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print("Digite uma nota: ");
            double nota = scan.nextDouble();

            soma += nota;
        }
        double media = soma / n;
        System.out.println(soma);
        System.out.println(media);
        scan.close();

    }
  
}