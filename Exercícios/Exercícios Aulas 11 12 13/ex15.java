import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?: ");
        float valorHora = scan.nextFloat();

        System.out.println("Quantas horas você trabalhou no mês?: ");
        float horasTrab = scan.nextFloat();

        float salarioBruto = valorHora * horasTrab;
        float impostoRenda = (salarioBruto / 100) * 11;
        float inss = (salarioBruto / 100) * 8;
        float sindicato = (salarioBruto / 100) * 5;
        float descontos = impostoRenda + inss + sindicato;
        float salarioLiquido = salarioBruto - descontos;

        System.out.println("Seu salário bruto no final do mês foi de: " + salarioBruto);
        System.out.println("Você pagou ao INSS: " + inss);
        System.out.println("Você pagou ao sindicato: " + salarioBruto);
        System.out.println("Seu salário no final do mês foi de: " + salarioLiquido);

        
    }
    
}
