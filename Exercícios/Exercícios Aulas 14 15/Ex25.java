import java.util.Scanner;
class Ex25{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String pergunta1 = scan.next();

        System.out.println("Telefonou para a vítima?");
        String pergunta2 = scan.next();

        System.out.println("Telefonou para a vítima?");
        String pergunta3 = scan.next();

        System.out.println("Telefonou para a vítima?");
        String pergunta4 = scan.next();

        System.out.println("Telefonou para a vítima?");
        String pergunta5 = scan.next();


        double soma = 0;
        

        if (pergunta1.equalsIgnoreCase("s") ) {
            soma += 1;
        } else {
            soma += 0;
        }
        if (pergunta2.equalsIgnoreCase("s") ) {
            soma += 1;
        } else {
            soma += 0;
        }
        if (pergunta3.equalsIgnoreCase("s") ) {
            soma += 1;
        } else {
            soma += 0;
        }
        if (pergunta4.equalsIgnoreCase("s") ) {
            soma += 1;
        } else {
            soma += 0;
        }
        if (pergunta5.equalsIgnoreCase("s") ) {
            soma += 1;
        } else {
            soma += 0;
        }
           
    

        
    }

}
