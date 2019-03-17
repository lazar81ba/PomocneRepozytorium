public class FourthTask {
    public static void main(String[] args) {
        firstLast("abbbabbbba", 'a');
        firstLast("abbb", 'a');
        firstLast("abbb", 'c');
        firstLast("aa", 'a');
    }

    private static void firstLast(String s, char c) {
        int countCharOccurrence = countCharOccurrence(s, c);
        if(countCharOccurrence < 2) {
            System.out.println("Odleglosc: -1. Tekst ''");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        int occurrence = 0;
        boolean countingBegan = false;
        for(char letter : s.toCharArray()) {
            if (letter == c) {
                occurrence++;
                if(occurrence != countCharOccurrence) {
                    countingBegan = true;
                } else {
                    break;
                }
                if (occurrence == 1) {
                    continue;
                }
            }
            if( countingBegan) {
                counter++;
                stringBuilder.append(letter);
            }
        }
        System.out.println("Odleglosc: " + counter + ". Tekst '" + stringBuilder.toString() + "'");
    }

    private static int countCharOccurrence(String word, char c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
