public class CuriosidadeInt {
    public static void main(String[] args) {
        int var1 = 2147483647;
        int var2 = 100;
        System.out.println(var1 + var2);
        // O que acontece se eu somar essas duas variáveis sendo que a primeira quase excede o valor máximo para ints ?
        // Os números em Java funcionam como uma roleta, ele volta para o menor valor (negativo)
    }
    
}
