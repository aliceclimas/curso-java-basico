import java.util.Scanner;
class Ex15{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um lado do triângulo");
        double ld1 = scan.nextDouble();

        System.out.println("Digite um lado do triângulo");
        double ld2 = scan.nextDouble();

        System.out.println("Digite um lado do triângulo");
        double ld3 = scan.nextDouble();

       

        if (ld1 + ld2 > ld3 && ld1 + ld3 > ld2 && ld2 + ld3 > ld1) {
            if (ld1 == ld2 && ld1 == ld3){
                System.out.println("Triângulo equilátero");
            } else if((ld1 == ld2 && ld2 != ld3) ||(ld1 == ld3 && ld2 != ld1)) {
                System.out.println("Triângulo isósceles");

            } else {
                System.out.println("Triângulo escaleno");

            }

        } else {
            System.out.println("Não é um triângulo");
      
        }
        
    }
}