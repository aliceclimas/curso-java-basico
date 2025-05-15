import java.util.Scanner;

class Ex12{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora?");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhou no mês?");
        double horasTrab = scan.nextDouble();

        double salarioBruto = valorHora * horasTrab;
        double salarioLiquido;
        double valorAumento;
        double ir;
        double inss;
        double fgts;
        double totalDescontos;
        

        if (salarioBruto <= 900) {
            ir = 0;
            inss = ((salarioBruto / 100) * 10) ;
            fgts = ((salarioBruto / 100) * 11) ;
            totalDescontos = inss + ir;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Salário Bruto:"+ "(" + (valorHora)+"*"+(horasTrab) + ":R$"+ salarioBruto);
            System.out.println("(-)IR (5%)"+ ":R$"+ ir);
            System.out.println("(-)INSS (10%)"+ ":R$"+ inss);
            System.out.println("FGTS (11%)"+ ":R$"+ fgts);
            System.out.println("Total de descontos R$"+ totalDescontos);
            System.out.println("Salário Líquido R$:"+ salarioLiquido);


        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            ir = ((salarioBruto / 100) * 5) ;
            inss = ((salarioBruto / 100) * 10) ;
            fgts = ((salarioBruto / 100) * 11) ;
            totalDescontos = inss + ir;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Salário Bruto:"+ "(" + (valorHora)+"*"+(horasTrab) + ":R$"+ salarioBruto);
            System.out.println("(-)IR (5%)"+ ":R$"+ ir);
            System.out.println("(-)INSS (10%)"+ ":R$"+ inss);
            System.out.println("FGTS (11%)"+ ":R$"+ fgts);
            System.out.println("Total de descontos R$"+ totalDescontos);
            System.out.println("Salário Líquido R$:"+ salarioLiquido);
            
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            ir = ((salarioBruto / 100) * 10) ;
            inss = ((salarioBruto / 100) * 10) ;
            fgts = ((salarioBruto / 100) * 11) ;
            totalDescontos = inss + ir;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Salário Bruto:"+ "(" + (valorHora)+"*"+(horasTrab) + ":R$"+ salarioBruto);
            System.out.println("(-)IR (5%)"+ ":R$"+ ir);
            System.out.println("(-)INSS (10%)"+ ":R$"+ inss);
            System.out.println("FGTS (11%)"+ ":R$"+ fgts);
            System.out.println("Total de descontos R$"+ totalDescontos);
            System.out.println("Salário Líquido R$:"+ salarioLiquido);
        } else {
            ir = ((salarioBruto / 100) * 20) ;
            inss = ((salarioBruto / 100) * 10) ;
            fgts = ((salarioBruto / 100) * 11) ;
            totalDescontos = inss + ir;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Salário Bruto:"+ "(" + (valorHora)+"*"+(horasTrab) + ":R$"+ salarioBruto);
            System.out.println("(-)IR (5%)"+ ":R$"+ ir);
            System.out.println("(-)INSS (10%)"+ ":R$"+ inss);
            System.out.println("FGTS (11%)"+ ":R$"+ fgts);
            System.out.println("Total de descontos R$"+ totalDescontos);
            System.out.println("Salário Líquido R$:"+ salarioLiquido);
        }
    }
}