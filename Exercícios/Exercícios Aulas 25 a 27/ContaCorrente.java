class ContaCorrente {

    String numero;
    double saldo;
    boolean statusEspecial;
    double limite;
   
    double sacar(double valor){
        
        if (valor > saldo){
            System.out.println("Não é possível realizar o saque");
            return 0;


        } else {
            System.out.println("Saque realizado");
            saldo -= valor;
            return saldo;

        }
    }

    double depositar(double valor){
        
        saldo += valor;
        return saldo;
    }
    void verSaldo(){
        
        System.out.println("Seu valor atual de saldo é: "+ saldo);
    }
    boolean verSaqueEspecial(){
        
        if (statusEspecial = true){
            return true;
        } else {
            return false;
        }
    }



    

}