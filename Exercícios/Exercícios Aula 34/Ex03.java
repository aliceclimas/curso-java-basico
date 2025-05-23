import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.print("Entre com um número positivo");
            num = scan.nextInt();

            if (num < 0){
                System.out.print("Entre com um número positivo, tente novamente");

            }
        } while (num < 0);
        System.out.println(Calculadora.fatorial(num));




    

        scan.close();
    }
    
}
