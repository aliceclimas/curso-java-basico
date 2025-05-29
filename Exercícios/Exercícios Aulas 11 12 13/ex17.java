import java.util.Scanner;

class ex17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da área em metros quadrados");
        double area = scan.nextDouble();

        double cobertura = area / 6;

        double qtdTintasLata = cobertura / 18;

        double precoTotalLata = qtdTintasLata * 80;



        // System.out.println("Quantidade de tintas a serem compradas:"+ qtdTintas);
        // System.out.println("Valor toral"+precoTotal);


    
    }
}