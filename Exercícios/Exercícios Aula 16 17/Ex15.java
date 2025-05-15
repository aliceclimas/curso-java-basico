import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o enésimo termo");
        int n = scan.nextInt();

        int termo1 = 0;
        int termo2 = 1;

       System.out.println("Sequência de Fibonacci até o" + n+ "º termo");

       for (int i = 0;i < n; i++){
            System.out.println(termo1 + "");

            int proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;
       }
       scan.close();

    
    }
}

