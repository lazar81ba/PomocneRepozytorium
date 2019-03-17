import java.util.Random;

public class FirstTask {
    private static Random generator = new Random();


    public static void main(String[] args) {
        createTable(0, 10);
    }

    private static int[][] createTable(int a, int b) {
        if (b < a) {
            return null;
        }
        //int randomNumber = generator.nextInt(13) * 4 + 52;
        int counter = 0;
        int randomNumber = generator.nextInt(2) * 4 + 4;
        int[][] newTable = new int[randomNumber][randomNumber];
        int[] diagonalValues = createDiagonalValues(randomNumber);
        for (int i = 0; i < randomNumber; i++) {
            for (int j = 0; j < randomNumber; j++) {
                if (i == j) {
                    newTable[i][j] = diagonalValues[i];
                } else {
                    int generatedValue = generator.nextInt(b) + a;
                    newTable[i][j] = generatedValue;
                    if (generatedValue < i * j) {
                        counter++;
                    }
                }
            }
        }
        printTable(newTable, randomNumber);
        System.out.println("Counte");
        return newTable;
    }

    private static int[] createDiagonalValues(int size) {
        int[] finalTable = new int[size];
        int positiveCount = (int) (size * 0.75);
        int negativeCount = (int) (size * 0.25);
        for (int i = 0; i < size; i++) {
            int random = generator.nextInt(2);
            if (positiveCount == 0) {
                finalTable[i] = -1;
                continue;
            } else if (negativeCount == 0) {
                finalTable[i] = 1;
                continue;
            }
            if (random == 1 && positiveCount > 0) {
                finalTable[i] = 1;
                positiveCount--;
            } else if (negativeCount > 0) {
                finalTable[i] = -1;
                negativeCount--;
            }
        }
        return finalTable;
    }

    private static void printTable(int[][] table, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
