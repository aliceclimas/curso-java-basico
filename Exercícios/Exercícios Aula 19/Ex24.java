public class Ex24 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        boolean valido = true;

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 5;
        vetorA[6] = 4;
        vetorA[7] = 3;
        vetorA[8] = 2;
        vetorA[9] = 8;

        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[0] != vetorA[9]){
                valido = false;
                break;
            } else if (vetorA[1] != vetorA[8]){
                valido = false;
                break;
            } else if (vetorA[2] != vetorA[7]){
                valido = false;
                break;
            } else if (vetorA[3] != vetorA[6]){
                valido = false;
                break;
            } else if (vetorA[4] != vetorA[5]){
                valido = false;
                break;
            }

        }
        if (!valido){
            System.out.println("Não é palíndromo");
        } else {
            System.out.println("É palíndromo");

        }
    }
}