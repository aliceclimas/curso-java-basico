public class Ex02 {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);


        System.out.println("Saldo da conta "+ conta.getNumero() + " = " + conta.getSaldo());
        
        boolean saqueEfetuado = conta.sacar(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.verSaldo();
        } else {
            System.out.println("Não é possível realizar saque. Saldo insuficiente");
        }

        saqueEfetuado = conta.sacar(500);
        System.out.println("tentativa de saque de 500 reais");
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.verSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.verSaldo();
        
        if(conta.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
        

        

    }
    
}