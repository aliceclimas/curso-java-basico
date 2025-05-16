public class Ex22 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        double qtd0 = 0;
        double qtd1 = 0;
        double cont0 = 0;
        double cont1 = 0;
    
        for (int i = 0; i<vetorA.length;i++){
            vetorA[i] = (int)Math.round(Math.random()*1);
            System.out.println(vetorA[i]);
            if (vetorA[i] == 1){
                cont1 += 1;
            } else {
                cont0  += 1;            
            }
        }

        qtd0 = (cont0 / vetorA.length) * 100;
        qtd1 = (cont1 / vetorA.length) * 100;

        System.out.println("A porcentagem de 0s nesse vetor é: " + qtd0 + "%") ;
        System.out.println("A porcentagem de 1s nesse vetor é: " + qtd1 + "%" ) ;

  
    }
}