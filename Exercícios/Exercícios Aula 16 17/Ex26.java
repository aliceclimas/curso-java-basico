import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas eleitoras existem?: ");
        int n = scan.nextInt();

        double soma1 = 0;
        double soma2 = 0;
        double soma3 = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print("Digite seu voto [1] Candidato Pedro,[2] Candidato Julio, [3] Candidato Maria");
            int candidato = scan.nextInt();

            switch (candidato) {
                case 1:
                    soma1 += 1;
                    System.out.println("Você votou no candidato Pedro");
                    break;
                case 2:
                    soma2 += 1;
                    System.out.println("Você votou no candidato Julio");
                    break;
                case 3:
                    soma3 += 1;
                    System.out.println("Você votou na candidata Maria");
                    break;
                default:
                    System.out.println("Digite um valor válido");
                    break;
            }
            scan.close();

         
        }
        System.out.println("Quantidade de votos do candidato Pedro"+soma1);
        System.out.println("Quantidade de votos do candidato Julio"+soma2);
        System.out.println("Quantidade de votos da candidata Maria"+soma3);
        
      

    }
}