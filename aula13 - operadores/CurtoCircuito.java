public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
// No dia a dia utilizamos o && curto circuito pois se um é falso o resultado vai ser falso de qualquer jeito.