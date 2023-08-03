package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getDefaultRandomInt;

public class Gcd {

    public static void getTheLargestDivisor() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] roundData = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = getDefaultRandomInt();
            int y = getDefaultRandomInt();
            int result = findDivisor(x, y);
            roundData[i][QUESTION] = x + " " + y;
            roundData[i][CORRECT_ANSWER] = Integer.toString(result);
        }
        Engine.runGame(roundData, description);
    }

    public static int findDivisor(int first, int second) {
        if (second == 0) {
            return first;
        }
        return findDivisor(second, first % second);
    }
}
