import java.util.Scanner;
class Ex14{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite mais uma nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2 )/2;

        if (media >= 9 && media <= 10) {
            System.out.println("Média:"+media);
            System.out.println("Conceito: A");
            System.out.println("Aprovado");

        } else if (media >= 7.5 && media < 9) {
            System.out.println("Média:"+media);
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
            
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Média:"+media);
            System.out.println("Conceito: C");
            System.out.println("Aprovado");

        } else if (media >= 4 && media < 6) {
            System.out.println("Média:"+media);
            System.out.println("Conceito: D");
            System.out.println("Reprovado");
        } else {
            System.out.println("Média:"+media);
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        }
        
    }

}

