import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius");

        float celsius = scan.nextFloat();

        float f = (1.8f * celsius) + 32;

        System.out.println("Essa temperatura corresponde a :" +  f + "ºF");

        
    }
    
}
