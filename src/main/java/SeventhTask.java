import java.util.HashMap;
import java.util.Map;

public class SeventhTask {
    public static void main(String[] args) {
        System.out.println(anagram("warta", "trawa"));
        System.out.println(anagram("zwiedzam patio", "tempo zadziwia"));
        System.out.println(anagram("abcdcba", "abcddcba"));
        System.out.println(anagram("anagram", "GraMana"));
        System.out.println(anagram("anagram", "naagram"));
        System.out.println(anagram("na", "an"));
    }

    private static boolean anagram(String word1, String word2) {
        Map<Character, Integer> firstWordMap = convertWordToMapOccurrence(word1.toLowerCase());
        Map<Character, Integer> secondWordMap = convertWordToMapOccurrence(word2.toLowerCase());

        if(secondWordMap.keySet().size() != firstWordMap.keySet().size()) {
            return false;
        }

        for (Character letter : secondWordMap.keySet()) {
            if (!secondWordMap.get(letter).equals(firstWordMap.get(letter))) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> convertWordToMapOccurrence(String word) {
        Map<Character, Integer> letterOccurrences = new HashMap<Character, Integer>();
        for (char letter : word.toCharArray()) {
            if (letterOccurrences.containsKey(letter)) {
                letterOccurrences.put(letter, letterOccurrences.get(letter) + 1);
            } else {
                letterOccurrences.put(letter, 1);
            }
        }
        return letterOccurrences;
    }
}
