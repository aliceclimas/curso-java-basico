import java.util.Scanner;

class Ex09{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        double num1 = scan.nextDouble();

        System.out.println("Digite mais um número");
        double num2 = scan.nextDouble();

        System.out.println("Digite mais um número");
        double num3 = scan.nextDouble();


        

        if (num1 >= num2 && num1 >= num3) {
    
            if (num2 >= num3){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }

        } else if (num2 >= num1 && num2 >= num3) {

            if (num3 >= num1){
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            } else {
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            }
            
        }  else {
            if (num2 >= num1){
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }
        }
        
    }
}