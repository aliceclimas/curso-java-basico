import java.util.Scanner;

class ex18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo para download em MB");
        double mb = scan.nextDouble();

        System.out.println("Digite a velocidade da internet em Mbps");
        double mbps =  scan.nextDouble();

        double tempo = mb / mbps;

        System.out.println("Tempo de download de:"+ tempo);
    


    
    }
}