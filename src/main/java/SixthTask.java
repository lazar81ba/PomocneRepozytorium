public class SixthTask {
    public static void main(String[] args) {
        reverseNumber(1234);
        reverseNumber(12);
        reverseNumber(2);
        reverseNumber(151523);
    }

    private static void reverseNumber(int first) {
        int resultNumber = 0;
        for (int i = first; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        System.out.println(resultNumber);
        System.out.println(resultNumber + first);
    }

}
