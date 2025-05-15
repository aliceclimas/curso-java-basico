import java.util.Scanner;
class Ex19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque");
        int valor = scan.nextInt();

        int nota1;
        int nota5;
        int nota10;
        int nota50;
        int nota100; 
        int restante100;
        int restante50;
        int restante10;
        int restante5;

        if (valor >=10 && valor<=600){
            if (valor >= 100){
                nota100 = valor /100; //3
                restante100=valor - (nota100* 100); //99
                System.out.println("Notas de 100"+nota100);
                if (restante100>= 50 ){ //99
                    nota50= restante100 /50;
                    restante50 = restante100 - (nota50 * 50); //49
                    System.out.println("Notas de 50"+nota50);
                    if (restante50 >= 10){
                        nota10 = restante50 / 10; //4
                        restante10 = restante50 - (nota10 * 10); //9
                        System.out.println("Notas de 10"+nota10);
                        if (restante10 >= 5){
                            nota5 = restante10 / 5; //4
                            restante5 = restante10 - (nota5 * 5);
                            System.out.println("Notas de 5"+nota5);
                            if (restante5 >= 1){
                                nota1 = restante5 / 1;
                                System.out.println("Notas de 5"+nota1);
                            }
                        }
                    }
                }   
            } 

        } else {
            System.out.println("Digite um valor válido");
        }
        
        
    }

}
