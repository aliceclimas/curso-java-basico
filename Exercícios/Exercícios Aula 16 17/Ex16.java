

public class Ex16{
    public static void main(String[] args) {

        int termo1 = 0;
        int termo2 = 1;
        int proximo = 0;

       System.out.println("Sequência de Fibonacci até o valor supere 500");

       

       while (proximo<=500){
            System.out.println(termo1 + "");

            proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;

            System.out.println(proximo);
       }

    
    }
}
