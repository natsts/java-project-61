package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;

public class Prime {

    public static void prime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int number = (int) ((Math.random() + 1) * (100 + 1));
            array[i][QUESTION] = "Question: " + number;
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