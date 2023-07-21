package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getRandomInt;

public class Prime {
    private static final int PROGRESSION_MIN_SIZE = 1;
    private static final int PROGRESSION_MAX_SIZE = 100;
    public static void prime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int number = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            array[i][QUESTION] = String.valueOf(number);
            array[i][CORRECT_ANSWER] = getCorrectAnswer(number);
        }
        Engine.generalGameLogic(array, description);
    }

    public static boolean isPrime(int number) {
        for (var i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getCorrectAnswer(int number) {
        return isPrime(number) ? "yes" : "no";
    }
}
