import java.util.Scanner;

public class Ex10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int num2= scan.nextInt();

        if (num1< num2){
            for (int i = num1 ; i< num2;i++){
                System.out.println(i); 

            }
        } else {
            for (int i = num1 ; i> num2;i--){
                System.out.println(i); 

            }
        }
        scan.close();
    }
}