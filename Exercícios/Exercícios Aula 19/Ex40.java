import java.util.ArrayList;
import java.util.HashSet;

public class Ex40 {
    public static void main(String[] args) {

        int[] vetorA = {10, 20, 3, 4, 5, 5, 4, 8, 2, 8};
        int[] vetorB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> vetorC = new ArrayList<>();

        HashSet<Integer> setB = new HashSet<>();
        for (int num : vetorB) {
            setB.add(num);
        }

      
        for (int num : vetorA) {
            if (!setB.contains(num)) {
                vetorC.add(num);
            }
        }

        
        System.out.println("Elementos em vetorA mas não em vetorB:");
        for (int num : vetorC) {
            System.out.println(num);
        }
    }
}
