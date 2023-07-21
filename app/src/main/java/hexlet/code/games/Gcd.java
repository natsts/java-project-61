package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getRandomInt;

public class Gcd {
    public static void gcd() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = getRandomInt();
            int y = getRandomInt();
            int result = findDivisor(x, y);
            array[i][QUESTION] = x + " " + y;
            array[i][CORRECT_ANSWER] = Integer.toString(result);
        }
        Engine.generalGameLogic(array, description);
    }
    public static int findDivisor(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int result = 1;

        if (y == 0 || x == 0) {
            throw new RuntimeException("Can't divide by zero");
        }

        while (min > 1) {
            result = max % min;
            max = min;
            min = result;
            if (max % min == 0) {
                return min;
            }
        }
        return result;
    }
}
