public class Ex23 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        boolean valido = true;

        vetorA[0] = 2;
        vetorA[1] = 2;
        vetorA[2] = 2;
        vetorA[3] = 4;
        vetorA[4] = 2;
        vetorA[5] = 2;
        vetorA[6] = 2;
        vetorA[7] = 8;
        vetorA[8] = 2;
        vetorA[9] = 10;

        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i] % 2 != 0){
                valido = false;
                break;
            }

        }
        if (!valido){
            System.out.println("Nem todos os elementos são pares");
        } else {
            System.out.println("Todos os elementos são pares");

        }
    }
}