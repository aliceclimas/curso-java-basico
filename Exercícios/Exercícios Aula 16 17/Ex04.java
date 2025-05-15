public class Ex04 {
    public static void main(String[] args) {
        
        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * 0.03; // crescimento de 3% ao ano
            populacaoB += populacaoB * 0.015; // crescimento de 1.5% ao ano
            anos++;
        }

        System.out.println("A população da cidade A ultrapassará a B em " + anos + " anos.");
        System.out.println("População A: " + (int)populacaoA);
        System.out.println("População B: " + (int)populacaoB);
    }
}

