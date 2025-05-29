public class Somatorio {
   
    public static int somatorioNaoRecursivo(int num){
    
        int total = 0;
        for (int i=0; i<=num; i++){
            total += i;
        }
        return total;
    }
    public static int somatorioRecursivo(int num){
        if (num == 1){
            return 1;
        }
        return num + somatorioRecursivo(num-1);
    }
}