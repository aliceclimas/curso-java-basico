import java.util.Scanner;
class Ex16{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para a");
        double a = scan.nextDouble();

        System.out.println("Digite um valor para b");
        double b = scan.nextDouble();

        System.out.println("Digite um valor para c");
        double c = scan.nextDouble();

        double delta;
        double x1;
        double x2;
        double raizDelta;

        if (a == 0) {
            System.out.println("O valor de a não pode ser zero");
        } else{
            delta = (b*b) - (4*a*c);
            if (delta < 0) {
                System.out.println("O valor de delta deu negativo");
                System.out.println("O valor de delta deu negativo"+delta);
            } else if (delta == 0) {

                raizDelta = Math.sqrt(delta);
                x1 = ((b * -1) + raizDelta) / (2 * a);
                System.out.println("O valor de delta deu negativo");
            } else {
                raizDelta = Math.sqrt(delta);
                x1 = ((b * -1) + raizDelta) / (2 * a);
                x2 = ((b * -1) - raizDelta) / (2 * a);
                
                System.out.println("O valor de x1 é:"+x1);
                System.out.println("O valor de x2 é:"+x2);

            }

        }
           
        
    }
}