public class Excecao {

    public static void main(String[] args) {
        
        // int[] vetor = new int[4];

        // System.out.println("Antes da exception");

        // vetor[4] = 1;
        
        // System.out.println("Este texto não será impresso");

        // System.out.println("Depois da exception");


        try{
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Este texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception){

            System.out.println("Exceção ao acessar um índice do vetor que não existe");

        }
        System.out.println("Esse texto será impresso após a exception");

    }

}