public class Fibonacci {

    public static int fibonacciNaoRecursivo(int num){
    
        int a = 0;
        int b = 1;
        for (int i=0; i<=num; i++){
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return a;
    }
    public static int fibonacciRecursivo(int num){
        if (num < 2){
            return 1;
        }
        return fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);
    }
    
}


     