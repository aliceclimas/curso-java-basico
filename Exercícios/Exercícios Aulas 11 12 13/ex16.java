import java.util.Scanner;

class ex16{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da área em metros quadrados");
        double area = scan.nextDouble();

        double cobertura = area / 3;

        double qtdTintas = cobertura / 18;

        double precoTotal = qtdTintas * 80;



        System.out.println("Quantidade de tintas a serem compradas:"+ qtdTintas);
        System.out.println("Valor toral"+precoTotal);


    
    }
}