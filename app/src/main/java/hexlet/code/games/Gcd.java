package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getRandomInt;

public class Gcd {
    private static final int PROGRESSION_MIN_SIZE = 1;
    private static final int PROGRESSION_MAX_SIZE = 100;

    public static void gcd() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            int y = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            int result = findDivisor(x, y);
            array[i][QUESTION] = x + " " + y;
            array[i][CORRECT_ANSWER] = Integer.toString(result);
        }
        Engine.generalGameLogic(array, description);
    }

    public static int findDivisor(int first, int second) {
        if (second == 0) {
            return first;
        }
        return findDivisor(second, first % second);
    }
}
    /*
    public static int findDivisor(int x, int y) {

        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int result = 1;

        if (min == 0 || max == 0) {
            throw new RuntimeException("Arithmetic exception");
        }

        while (min > 1) {
            result = max % min;
            max = min;
            min = result;
            if (max % min == 0) {
                return min;
            } else {
                throw new RuntimeException("Arithmetic exception");
            }
        }
        return result;
    }
   */
