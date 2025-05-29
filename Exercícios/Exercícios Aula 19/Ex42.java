import java.util.Arrays;

public class Ex42 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 3, 4, 5, 5, 4, 8, 2, 8};

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.println(num);
        }
    }
}
