import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Farenheit");
        float f = scan.nextFloat();

        float celsius = ( 5 * (f-32)/9);

        System.out.println("Essa temperatura corresponde a :" +  celsius + "º");
        
    }
    
}
