import java.util.Scanner;

class Ex04{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = scan.next();


        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))  {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }           

    }
}