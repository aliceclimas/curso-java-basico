import java.util.Scanner;

public class Ex41{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
       double divida;
       double juros;
       int parcela;
       double valorParcela;
       

      
        System.out.println("Qual o valor da dívida?: ");
        divida = scan.nextDouble();

        System.out.println("Qual o valor dos juros?: ");
        juros = scan.nextDouble();

        System.out.println("Qual a quantidade de parcelas?: ");
        parcela= scan.nextInt();

        valorParcela = divida / parcela;
        


        System.out.println("Valor da Dívida  Valor dos Juros  Quantidade de Parcelas Valor da Parcela");
        System.out.println("   R$ " + divida + "    "+juros + "     "+parcela + "    "+ valorParcela);
        scan.close();
    }
    
}