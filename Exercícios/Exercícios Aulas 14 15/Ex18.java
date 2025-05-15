import java.util.Scanner;
class Ex18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia [dd]");
        int dia = scan.nextInt();

        System.out.println("Digite o mês [mm]");
        int mes = scan.nextInt();

        System.out.println("Digite o ano [aa]");
        int ano = scan.nextInt();


        if (dia > 0 && dia < 31) {
            if (mes > 0 && mes <=12){
                if (ano > 1000){                         
                    System.out.println(dia+"/"+mes+"/"+ano);
                }
                else {
                    System.out.println("Digite um ano válido");
                }
            } else{
                System.out.println("Digite um mês válido");
            }

        } else {
            System.out.println("Digite uma data válida");
        }
        
        
    }

}
