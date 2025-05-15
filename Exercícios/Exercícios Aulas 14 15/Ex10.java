import java.util.Scanner;

class Ex10{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Em qual turno você estuda? [M] Matutino, [V] Vespertino ou [N] Noturno");
        String turno = scan.next();
        

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");

        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
            
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}