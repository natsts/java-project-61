package hexlet.code.games;
import hexlet.code.Engine;
import java.util.StringJoiner;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getLengthOfProgression;
import static hexlet.code.Utils.getRandomInt;

public class Progression {
    private static final int LENGTH_OF_PROGRESSION = getLengthOfProgression(5, 10);
    private static final int[] NUMBERS = new int[LENGTH_OF_PROGRESSION];
    private static String correct;
    public static void progression() {
        String description = "What number is missing in the progression?";
        String[][] array = new String[NUMBER_OF_ROUND][2];
        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int firstNumber = getRandomInt(1, 100);
            int difference = getRandomInt(1, 100);
            generateProgression(firstNumber, difference);
            array[i][QUESTION] = generateQuestion();
            array[i][CORRECT_ANSWER] = correct;
        }
        Engine.generalGameLogic(array, description);
    }


    public static void generateProgression(int firstNumber, int difference) {

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
