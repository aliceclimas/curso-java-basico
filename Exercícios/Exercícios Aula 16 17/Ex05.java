import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;     
        do {
            System.out.println("Digite a população da cidade A");
            popA =scan.nextDouble();

            if (popA>0){
                valido = true;
            }
            else{
                System.out.print("População A precisa ser maior que zero");
            }

        } while (!valido);

        valido = false;     
        do {
            System.out.println("Digite a população da cidade B");
            popB =scan.nextDouble();

            if (popB>0){
                valido = true;
            }
            else{
                System.out.print("População B precisa ser maior que zero");
            }

        } while (!valido);

        valido = false;     
        do {
            System.out.println("Digite a taxa de crescimento da população A");
            taxaA = scan.nextDouble();

            if (taxaA>0){
                valido = true;
            }
            else{
                System.out.print("Taxa de crescimento precisa ser maior que zero");
            }

        } while (!valido);

         valido = false;     
        do {
            System.out.println("Digite a taxa de crescimento da população B");
            taxaB = scan.nextDouble();

            if (taxaB>0){
                valido = true;
            }
            else{
                System.out.print("Taxa de crescimento precisa ser maior que zero");
            }

        } while (!valido);

        
        int anos = 0;

        while (popA <= popB) {
            popA += popA * taxaA; // crescimento de 3% ao ano
            popB += popB * taxaB; // crescimento de 1.5% ao ano
            anos++;
        }

        System.out.println("A população da cidade A ultrapassará a B em " + anos + " anos.");
        System.out.println("População A: " + (int)popA);
        System.out.println("População B: " + (int)popB);
        
        scan.close();
    }
   
}
