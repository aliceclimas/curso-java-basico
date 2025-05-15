import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        int cod, numVeiculos, numAcidentes;
        int maiorIndice = Integer.MIN_VALUE;
        int menorIndice = Integer.MAX_VALUE;
        int somaVeiculos = 0;
        int somaAcidentes = 0;
        int somaAcidentes2 = 0;
        double mediaVeiculos = 0;
        double mediaAcidentes = 0;
        int cidadeMaior = 0;
        int cidadeMenor = 0;
        int contAcidentes = 0;
      
        for (int i = 1 ; i <= 5; i++) {
            System.out.println("Digite o código da cidade, número de veículos e número de acidentes");
            cod = scan.nextInt();
            numVeiculos = scan.nextInt();
            numAcidentes = scan.nextInt();

            somaAcidentes+= numAcidentes;
            somaVeiculos += numVeiculos;

            if (numAcidentes >= maiorIndice){
                maiorIndice = numAcidentes;
                cidadeMaior = cod;
            }
            if (numAcidentes <= menorIndice){
                menorIndice = numAcidentes;
                cidadeMenor = cod;
            }
            if (numVeiculos > 2000){
                somaAcidentes2 += numVeiculos;
                contAcidentes += 1;
            }

        }
        mediaVeiculos = somaVeiculos / 5;
        mediaAcidentes = somaAcidentes2 / contAcidentes;


        System.out.println("c) A cidade com maior índice de acidentes é:" + cidadeMaior + "com índice" + maiorIndice);
        System.out.println("c) A cidade com menor índice de acidentes é:" + cidadeMenor + "com índice" + menorIndice);
        System.out.println("d) A média de veículos é:" + mediaVeiculos);
        System.out.println("e) A média de acidentes em cidades com menos de 2000 veiculos é:" + mediaAcidentes);
        scan.close();
    }
    
}