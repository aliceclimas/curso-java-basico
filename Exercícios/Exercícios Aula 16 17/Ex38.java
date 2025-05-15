import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor inicial do salário");
        double salario = scan.nextDouble();

        double percentual = 1.5;

        salario += (salario/100)*percentual;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i<= 2025;i++){
            percentual *= 2;
            salario += (salario/100) * percentual;

            System.out.println(i+" = "+ format.format(salario) + " - " + percentual + "%" );
        }
        scan.close();



    }
    
}
