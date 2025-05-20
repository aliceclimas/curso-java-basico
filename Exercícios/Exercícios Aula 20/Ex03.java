import java.util.Scanner;

class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [][] valoresAleatorios = new int[3][3];

        for (int i = 0; i<valoresAleatorios.length;i++){
            for (int j = 0; j<valoresAleatorios[i].length;j++){
                System.out.println("Digite um valor para " + i + j);
                valoresAleatorios[i][j] = scan.nextInt();
            }

        }
       
        for (int i = 0;i < valoresAleatorios.length;i++){
            for (int j = 0; j < valoresAleatorios[i].length;j++){
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0;i < valoresAleatorios.length;i++){
            for (int j = 0; j < valoresAleatorios[i].length;j++){
                if (valoresAleatorios[i][j] % 2 == 0){
                    contPar += 1;
                } else {
                    contImpar +=1;
                }
                
            }
            
        }
        System.out.println("Quantidade de pares na matriz = " + contPar);
        System.out.println("Quantidade de ímpares na matriz = " + contImpar);

        scan.close();

     
        
    }
}
