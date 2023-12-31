package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getDefaultRandomInt;

public class Prime {
    public static void playPrimeNumber() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundData = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int number = getDefaultRandomInt();
            roundData[i][QUESTION] = String.valueOf(number);
            roundData[i][CORRECT_ANSWER] = getCorrectAnswer(number);
        }
        Engine.runGame(roundData, description);
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

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
