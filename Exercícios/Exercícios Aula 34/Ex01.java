public class Ex01 {
    
    static void imprimirValor(){
        System.out.println(Contador.mostrarContador());
    }
    public static void main(String[] args) {

        imprimirValor();
        Contador.incrementarContador();
        imprimirValor();
        Contador.zerarContador();
        imprimirValor();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();



        
        
    }
    
}
