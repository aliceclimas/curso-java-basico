import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?: ");
        float valorHora = scan.nextFloat();

        System.out.println("Quantas horas você trabalhou no mês?: ");
        float horasTrab = scan.nextFloat();

        float salario = valorHora * horasTrab;

        System.out.println("Seu salário no final do mês foi de: " + salario);
        
    }
    
}
