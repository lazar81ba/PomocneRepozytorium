import java.util.Arrays;
import java.util.Comparator;

public class FifthTask {
    public static void main(String[] args) {
        sortuj("Test test2 dwa osiem");
        sortuj("Ala ma kota i dwie agrafki");
    }

    private static void sortuj(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(words));
        int sum = 0;
        for(String word : words) {
            sum+= word.toCharArray().length;
        }
        System.out.println((double) sum/words.length);
    }
}
