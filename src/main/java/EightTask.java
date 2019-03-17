public class EightTask {
    public static void main(String[] args) {
        akronim("Rzeczypospolita Polska");
        akronim("Wydział Informatyki i Nauki o Materiałach");
        akronim("Polski Związek Piłki Nożnej");
    }

    private static void akronim(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            char firstLetter = word.charAt(0);
            if (firstLetter > 96 && firstLetter < 123) {
                firstLetter -= 32;
            }
            result.append(firstLetter);
        }
        System.out.println(result.toString());
    }
}
