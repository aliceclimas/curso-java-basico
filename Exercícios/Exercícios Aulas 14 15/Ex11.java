import java.util.Scanner;

class Ex11{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        double salario = scan.nextDouble();

        double reajuste;
        double salarioNovo;
        double valorAumento;
        

        if (salario >= 280) {
            reajuste = 20;
            salarioNovo = ((salario / 100) * reajuste) + salario;
            valorAumento = salarioNovo - salario;
            System.out.println("Salário antes do aumento R$"+ salario);
            System.out.println("Percentual de aumento"+ reajuste +  "%");
            System.out.println("Valor do aumento"+ valorAumento);
            System.out.println("Novo salário R$"+ salarioNovo);

        } else if (salario > 280 && salario <= 700) {
            reajuste = 15;
            salarioNovo = ((salario / 100) * reajuste) + salario;
            valorAumento = salarioNovo - salario;
            System.out.println("Salário antes do aumento R$"+ salario);
            System.out.println("Percentual de aumento"+ reajuste +  "%");
            System.out.println("Valor do aumento"+ valorAumento);
            System.out.println("Novo salário R$"+ salarioNovo);
            
        } else if (salario > 700 && salario <= 1500) {
            reajuste = 10;
            salarioNovo = ((salario / 100) * reajuste) + salario;
            valorAumento = salarioNovo - salario;
            System.out.println("Salário antes do aumento R$"+ salario);
            System.out.println("Percentual de aumento"+ reajuste +  "%");
            System.out.println("Valor do aumento"+ valorAumento);
            System.out.println("Novo salário R$"+ salarioNovo);
        } else {
            reajuste = 5;
            salarioNovo = ((salario / 100) * reajuste) + salario;
            valorAumento = salarioNovo - salario;
            System.out.println("Salário antes do aumento R$"+ salario);
            System.out.println("Percentual de aumento"+ reajuste +  "%");
            System.out.println("Valor do aumento"+ valorAumento);
            System.out.println("Novo salário R$"+ salarioNovo);
        }
    }
}