import java.util.Scanner;

    public class Ex13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base:");
        double base = scan.nextDouble();

        System.out.println("Digite o expoente");
        double expoente = scan.nextDouble();

        double resultado = 1;


        for (int i = 0;i<expoente;i++){
            resultado *= base;
            System.out.println(resultado);
        }
       scan.close();
    }
}
