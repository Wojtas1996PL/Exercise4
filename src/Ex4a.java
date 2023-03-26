import java.util.Arrays;

public class Ex4a {
    public void method4() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[][] tabNumbers = new int[4][5];
        for (int i = 0, y = 0; i < tabNumbers[0].length && y < numbers.length; i++, y++) {
            tabNumbers[0][i] = numbers[y];
            tabNumbers[1][i] = numbers[y] + 5;
            tabNumbers[2][i] = numbers[y] + 10;
            tabNumbers[3][i] = numbers[y] + 15;
        }
        System.out.println("Exercise 4 numbers table:");
        for (int[] element : tabNumbers) {
            System.out.println(Arrays.toString(element).replace(",", "").replace("[", "").replace("]", ""));
        }

        char[] letters1 = new char[]{'A', 'B', 'C', 'D', 'E'};
        char[] letters2 = new char[]{'F', 'G', 'H', 'I', 'J'};
        char[] letters3 = new char[]{'K', 'L', 'M', 'N', 'O'};
        char[] letters4 = new char[]{'P', 'R', 'S', 'T', 'U'};
        String[][] tabLetters = new String[4][5];
        for (int i = 0, y = 0; i < tabLetters[0].length && y < letters1.length; i++, y++) {
            tabLetters[0][i] = String.valueOf(letters1[y]);
            tabLetters[1][i] = String.valueOf(letters2[y]);
            tabLetters[2][i] = String.valueOf(letters3[y]);
            tabLetters[3][i] = String.valueOf(letters4[y]);
        }
        System.out.println("Exercise 4 letters table:");
        for (String[] element2 : tabLetters) {
            System.out.println(Arrays.toString(element2).replace(",", "").replace("[", "").replace("]", ""));
        }
        String[][] connectedTab = new String[4][5];
        for (int i = 0; i < connectedTab[0].length; i++) {
            connectedTab[0][i] = tabLetters[0][i] + tabNumbers[0][i];
            connectedTab[1][i] = tabLetters[1][i] + tabNumbers[1][i];
            connectedTab[2][i] = tabLetters[2][i] + tabNumbers[2][i];
            connectedTab[3][i] = tabLetters[3][i] + tabNumbers[3][i];
        }
        System.out.println("Exercise 4a:");
        for (String[] element3 : connectedTab) {
            System.out.println(Arrays.toString(element3).replace(",", "").replace("[", "").replace("]", ""));
        }
        for (int i = 0, y = 4; i < connectedTab[0].length && y >= 0; i++, y--) {
            connectedTab[0][i] = tabLetters[3][y] + tabNumbers[0][i];
            connectedTab[1][i] = tabLetters[2][y] + tabNumbers[1][i];
            connectedTab[2][i] = tabLetters[1][y] + tabNumbers[2][i];
            connectedTab[3][i] = tabLetters[0][y] + tabNumbers[3][i];
        }
        System.out.println("Exercise 4b:");
        for (String[] element4 : connectedTab) {
            System.out.println(Arrays.toString(element4).replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}
