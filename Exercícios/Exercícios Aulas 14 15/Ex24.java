import java.util.Scanner;
class Ex24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número ");
        double numero = scan.nextDouble();

        System.out.println("Digite um número");
        double numero2 = scan.nextDouble();

        System.out.println("Qual operação deseja realizar : [1]Adição, [2] Subtração, [3] Divisão, [4] Multiplicação");
        double operacao = scan.nextInt();

        double resultado = 0;
        
        

        if (operacao == 1) {
            resultado = numero + numero2;
            if (resultado > 0){
                System.out.println("Positivo:");
            } else {
                System.out.println("Negativo:");
            }
            if (resultado % 2 == 0){
                System.out.println("Par:");
            } else {
                System.out.println("ímpar:");
            }
            if(resultado==Math.floor(resultado)) {
                System.out.println("é inteiro");
            } else {
                System.out.println("é decimal");
            }
             
        } else if(operacao == 2){
            resultado = numero - numero2;
            if (resultado > 0){
                System.out.println("Positivo:");
            } else {
                System.out.println("Negativo:");
            }
            if (resultado % 2 == 0){
                System.out.println("Par:");
            } else {
                System.out.println("ímpar:");
            }
            if(resultado==Math.floor(resultado)) {
                System.out.println("é inteiro");
            } else {
                System.out.println("é decimal");
            }
    
        }else if (operacao == 3){
            resultado = numero / numero2;
            if (resultado > 0){
                System.out.println("Positivo:");
            } else {
                System.out.println("Negativo:");
            }
            if (resultado % 2 == 0){
                System.out.println("Par:");
            } else {
                System.out.println("ímpar:");
            }
            if(resultado==Math.floor(resultado)) {
                System.out.println("é inteiro");
            } else {
                System.out.println("é decimal");
            }

        }else if (operacao == 4){
            resultado = numero * numero2;
            if (resultado > 0){
                System.out.println("Positivo:");
            } else {
                System.out.println("Negativo:");
            }
            if (resultado % 2 == 0){
                System.out.println("Par:");
            } else {
                System.out.println("ímpar:");
            }
            if(resultado==Math.floor(resultado)) {
                System.out.println("é inteiro");
            } else {
                System.out.println("é decimal");
            }
        }else {
            System.out.println("Digite uma opção válida:");
        }
        
    }

}
