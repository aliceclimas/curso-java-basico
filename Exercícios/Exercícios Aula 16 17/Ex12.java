import java.util.Scanner;

    public class Ex12{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num = scan.nextInt();

        int resultado = 0;


        for (int i = 0 ; i< 11;i++){
            resultado = num * i;
            System.out.println(num + "X" + i + "=" + resultado);
        }
       scan.close();
    }
}