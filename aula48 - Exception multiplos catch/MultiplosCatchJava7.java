public class MultiplosCatchJava7 {

    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] denon = {2,0,4,8,0};

        for (int i = 0; i<numeros.length;i++){
            try{
                System.out.println(numeros[i] + "/" + denon[i] + "=" + (numeros[i]/denon[i]));

            } // exceção mais genérica colocar mais abaixo
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e1){
                System.out.println("Aconteceu um erro");
            }
           
            
        }
        
    }
    
}
