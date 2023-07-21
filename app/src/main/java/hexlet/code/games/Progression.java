package hexlet.code.games;
import hexlet.code.Engine;
import java.util.StringJoiner;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.*;

public class Progression {
    private static final int LENGTH_OF_PROGRESSION = getLengthOfProgression();
    private static final int[] NUMBERS = new int[LENGTH_OF_PROGRESSION];
    private static String correct;
    public static void progression() {
        String description = "What number is missing in the progression?";
        String[][] array = new String[NUMBER_OF_ROUND][2];
        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            generateProgression();
            array[i][QUESTION] = "Question: " + generateQuestion();
            array[i][CORRECT_ANSWER] = correct;
        }
        Engine.generalGameLogic(array, description);
    }


    public static void generateProgression() {

        int firstNumber = getRandomInt();
        int difference = getRandomIntFromOne();

        NUMBERS[0] = firstNumber;

        for (var i = 1; i < LENGTH_OF_PROGRESSION; i++) {
            NUMBERS[i] = NUMBERS[i - 1] + difference;
        }
    }

    public static String generateQuestion() {
        var indexHideElement = (int) (Math.random() * LENGTH_OF_PROGRESSION);
        var result = new StringJoiner(" ");

        for (var i = 0; i < NUMBERS.length; i++) {
            var value = Integer.toString(NUMBERS[i]);
            if (i == indexHideElement) {
                result.add("..");
                correct = value;
            } else {
                result.add(value);
            }
        }
        return result.toString();
    }
}
