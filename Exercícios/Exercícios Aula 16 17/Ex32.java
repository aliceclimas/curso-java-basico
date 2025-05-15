import java.util.Scanner;

    public class Ex32{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para n");
        int n = scan.nextInt();

        int resultado = 1;

        System.out.println("Fatorial de: "+n);

        for (int i = n; i >= 1; i--){
            resultado *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" × ");
            }
        }
        System.out.println(" = " + resultado);
        scan.close();
        

        
    }

}