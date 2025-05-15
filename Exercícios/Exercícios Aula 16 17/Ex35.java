import java.util.Scanner;

public class Ex35{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int n=scan.nextInt();

        for (int j = 2;j<n;j++){
            boolean primo = true;

            for (int i = 2;i<j;i++){
                if (j % i == 0){
                    primo = false;
                    break;
                }

            }
            if (primo){
                System.out.println("É primo "+j);

            }

        }
        scan.close();

        


       
    }
}