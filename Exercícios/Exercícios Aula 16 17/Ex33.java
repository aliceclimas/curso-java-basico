import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de temperaturas");
        int qtdTemp = scan.nextInt();


        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= qtdTemp;i++){
            System.out.println("Entre com a temperatura");
            temp = scan.nextDouble();

            soma += temp;

            if (temp > maior){
                maior = temp;
            }
            if (temp < menor){
                menor = temp;
            }
        }

        System.out.println("Média: " + (soma/qtdTemp));
        System.out.println("Maior temperatura"+maior);
        System.out.println("Menor temperatura"+menor);
        scan.close();

       
    }
}
