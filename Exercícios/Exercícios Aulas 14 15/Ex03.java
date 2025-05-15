import java.util.Scanner;

class Ex03{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo [F] ou [M]");
        String sexo = scan.next();


        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Digite um valor válido");
        }           

    }
}