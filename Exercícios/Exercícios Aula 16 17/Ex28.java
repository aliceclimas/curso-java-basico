import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas cds você possui?: ");
        int qtdCd = scan.nextInt();

        double soma = 0;


        for (int i = 1; i <= qtdCd; i++) {
            System.out.print("Digite o valor do CD");
            double valorCd = scan.nextDouble();
            soma += valorCd;

            
            
        }
        double media = soma / qtdCd;
        System.out.println("Quantidade média de alunos é de"+media);

        scan.close();
      
      

    }
}
