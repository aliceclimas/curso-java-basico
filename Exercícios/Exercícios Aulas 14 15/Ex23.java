import java.util.Scanner;
class Ex23{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        double numero = scan.nextDouble();

        if(numero==Math.floor(numero)) {
            System.out.println("é inteiro");
        } else {
            System.out.println("é decimal");
        }
        
    }

}
