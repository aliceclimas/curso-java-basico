import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja inserir?: ");
        int n = scan.nextInt();

        double soma = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print("Digite sua idade ");
            int idade = scan.nextInt();

            soma += idade;
        }
        double media = soma / n;
        if (media > 0 && media <= 25){
            System.out.println("Turma jovem");

        } else if (media >=26 && media <=60){
            System.out.println("Turma adulta");

        } else{
            System.out.println("Turma idosa");

        }
        scan.close();
      

    }
}