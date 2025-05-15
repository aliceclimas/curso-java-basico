import java.util.Scanner;

public class Ex14{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contImpar = 0;
        int contPar = 0;

      

        for (int i = 0; i < 10;i++){
            System.out.println("Digite um número:");
            double numero = scan.nextDouble();

            if (numero % 2 != 0){
                contImpar += 1;
            } else {
                contPar +=1;
            }

        }
        System.out.println("Quantidade de números pares"+contPar);
        System.out.println("Quantidade de números ímpares"+contImpar);
        scan.close();

    }
}