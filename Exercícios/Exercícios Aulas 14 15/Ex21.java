import java.util.Scanner;
class Ex21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma valor");
        int valor = scan.nextInt();

        if (valor > 10 && valor <= 600){
            int nota100, nota50, nota10, nota5,nota1;
            nota100=valor/100;
            valor-=nota100*100;
            nota50=valor/50;
            valor-=nota50*50;
            nota10=valor/10;
            valor-=nota10*10;
            nota5=valor/5;
            valor-=nota5*5;
            nota1=valor;
            System.out.println(nota100+" notas de 100 reais");
            System.out.println(nota50+" notas de 50 reais");
            System.out.println(nota10+" notas de 10 reais");
            System.out.println(nota5+" notas de 5 reais");
            System.out.println(nota1+" notas de 1 reais");

        } else {
            System.out.println("Digite um valor válido");
        }
        

     
    }

}

 


