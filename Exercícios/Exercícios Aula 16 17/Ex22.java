import java.util.Scanner;

public class Ex22{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num = scan.nextInt();

        boolean primo = true;


        for (int i = 2; i <num ; i++) {
            if (num % i == 0){
                System.out.println("Não é primo-divisível por"+i);
                primo = false;
            }
            
        }
        if (primo){
            System.out.println("é primo");
        }
        scan.close();

        
    }
}