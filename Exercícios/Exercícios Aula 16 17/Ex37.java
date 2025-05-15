import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;
        int cod, altura, peso;
        int maisAlto = Integer.MIN_VALUE;
        int menosAlto = Integer.MAX_VALUE;
        int maisGordo = Integer.MIN_VALUE;
        int menosGordo = Integer.MAX_VALUE;


        do{
            System.out.println("Digite o código, sua altura(em cm) e seu peso(em kg). Digite 0 para sair:");
            cod = scan.nextInt();
            altura = scan.nextInt();
            peso = scan.nextInt();

            if (cod == 0 ){
                naoTerminar = false;
            } else {
                if (altura >= maisAlto){
                    maisAlto = altura;
                }
                if (altura <= menosAlto){
                    menosAlto = altura;
                }
                if (peso >= maisGordo){
                    maisGordo = peso;
                }
                if (peso <= menosGordo){
                    menosGordo= peso;
                }
                    
             
            }

        } while (naoTerminar);
        System.out.println("O mais magro tem: "+menosGordo+"kg");
        System.out.println("O mais gordo tem: "+maisGordo+"kg");
        System.out.println("O mais alto tem: "+maisAlto+"cm");
        System.out.println("O mais baixo tem: "+menosAlto+"cm");
        scan.close();
    }
    
}
