public class DivisaoNaoExata extends Exception{

    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den){
        super();
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de [num=" + num + ", den=" + den + " não é inteiro";
    }
    
    

    
}
