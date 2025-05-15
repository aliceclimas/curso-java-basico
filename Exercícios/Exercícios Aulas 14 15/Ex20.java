import java.util.Scanner;
class Ex20{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite mais uma nota");
        double nota2 = scan.nextDouble();

        System.out.println("Digite mais uma nota");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 )/3;

        if (media == 10) {
            System.out.println("Média:"+media);
            System.out.println("Aprovado com distinção");

        } else if(media >= 7 && media < 10) {
            System.out.println("Média:"+media);
            System.out.println("Aprovado");
             
        } else {
            System.out.println("Média:"+media);
            System.out.println("Reprovado");
        }
        
    }

}
