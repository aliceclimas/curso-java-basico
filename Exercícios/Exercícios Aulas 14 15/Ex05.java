import java.util.Scanner;

class Ex05{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;



        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7 && media <= 9) {
            System.out.println("Aprovado");
        }  else {
            System.out.println("Reprovado");
        }


    }
}