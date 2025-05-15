import java.util.Scanner;

public class Ex36{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num = scan.nextInt();

        System.out.println("De onde deseja começar?");
        int inicio = scan.nextInt();

        System.out.println("De onde deseja terminar?");
        int fim = scan.nextInt();


        int resultado = 0;


        for (int i = inicio ; i<= fim;i++){
            resultado = num * i;
            System.out.println(num + "X" + i + "=" + resultado);
        }
        scan.close();
       
    }
}