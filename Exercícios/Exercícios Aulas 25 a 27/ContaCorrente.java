class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
   
    boolean sacar(double valorSaque){
        
        if (saldo >=valorSaque){
            saldo-=valorSaque;
            return true;
        } else {
            if(especial){
                double limite = limiteEspecial + saldo;
                if(limite >=valorSaque){
                    saldo -= valorSaque;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositar(double valorDepositado){
        
        saldo += valorDepositado;

    }
    void verSaldo(){
        
        System.out.println("Seu valor atual de saldo é: "+ saldo);
    }
    boolean verificarChequeEspecial(){
        
        return saldo < 0;
    }



    

}