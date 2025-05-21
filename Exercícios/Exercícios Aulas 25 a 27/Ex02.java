public class Ex02 {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123434";
        conta.saldo = 50;
        conta.statusEspecial = true;
        conta.limite = 50;

        conta.sacar(10);
        conta.depositar(10);
        conta.verSaldo();
        conta.verSaqueEspecial();

        

        

    }
    
}