import java.util.Scanner;
class Ex22{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        double numero = scan.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("Par");
             
        } else {
            System.out.println("ímpar");
    
        }
        
    }

}
