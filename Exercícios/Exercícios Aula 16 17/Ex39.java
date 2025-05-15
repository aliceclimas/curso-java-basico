import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        int cod, altura;
        int maisAlto = Integer.MIN_VALUE;
        int menosAlto = Integer.MAX_VALUE;
      
        for (int i = 1 ; i <= 3; i++) {
            System.out.println("Digite o código, sua altura(em cm)");
            cod = scan.nextInt();
            altura = scan.nextInt();

            if (altura >= maisAlto){
                    maisAlto = altura;
            }
            if (altura <= menosAlto){
                menosAlto = altura;
            }
            

        }

        System.out.println("O mais alto tem: "+maisAlto+"cm");
        System.out.println("O mais baixo tem: "+menosAlto+"cm");
        
        scan.close();
        

    }
    
}