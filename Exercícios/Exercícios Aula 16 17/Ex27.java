import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas turmas existem?: ");
        int n = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido= true;

        for (int i = 1; i <= n; i++) {

            invalido = true;
            do{
                System.out.print("Digite a quantidade de alunos");
                numAlunos = scan.nextInt();

                if (numAlunos <= 40){
                    invalido = false;
                } else{
                    System.out.println("Número de alunos inválido. Digite novamente.");
                }

            } while (invalido);

            soma += numAlunos;

           
            if (numAlunos <= 40){
                soma += numAlunos;

            }
            
        }

        double media = soma / n;

        System.out.println("Quantidade média de alunos é de"+media);
        scan.close();
      
      

    }
}