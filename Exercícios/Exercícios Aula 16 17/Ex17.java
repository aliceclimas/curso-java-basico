import java.util.Scanner;

    public class Ex17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scan.nextInt();

        int resultado = 1;


        for (int i = 1;i<=n;i++){
            resultado *=  i;
           
        }
       System.out.println(resultado);
       scan.close();
    }

}