import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;
        int cod;
        int numero;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
     

    
        do{
            System.out.println("Digite um número inteiro . Digite 0 para sair:");
            numero= scan.nextInt();
            cod = scan.nextInt();

         

            if (cod == 0 || numero < 0){
                naoTerminar = false;
            } else {
                if (numero >= 0 && numero <= 25){
                    cont1 += 1;
                } else if (numero > 25 && numero <= 50){
                    cont2 += 1;
                } else if(numero > 50 && numero <= 75){
                    cont3 += 1;
                
                } else if(numero > 75 && numero <= 100){
                    cont4 += 1;

                }
                
                    
             
            }

        } while (naoTerminar);
        System.out.println("Números no intervalo [0-25]: "+cont1);
        System.out.println("Números no intervalo [26-50]: "+cont2);
        System.out.println("Números no intervalo [51-75]: "+cont3);
        System.out.println("Números no intervalo [76-100]: "+cont4);
        scan.close();
    }
    
}
