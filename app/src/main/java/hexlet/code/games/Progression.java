package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.getRandomInt;

public class Progression {
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int PROGRESSION_MAX_SIZE = 10;
    private static final String REPLACEMENT = "..";
    private static final int LENGTH_OF_PROGRESSION = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
    private static final int[] NUMBERS = new int[LENGTH_OF_PROGRESSION];

    public static void progression() {
        String description = "What number is missing in the progression?";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int firstNumber = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            int difference = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            int indexOfHideElement = (int) (Math.random() * LENGTH_OF_PROGRESSION);
            generateProgression(firstNumber, difference);

            array[i][QUESTION] = createQuestion(indexOfHideElement);
            array[i][CORRECT_ANSWER] = getCorrectAnswer(indexOfHideElement);
        }
        Engine.generalGameLogic(array, description);
    }


    public static void generateProgression(int firstNumber, int difference) {

        NUMBERS[0] = firstNumber;

        for (var i = 1; i < LENGTH_OF_PROGRESSION; i++) {
            NUMBERS[i] = NUMBERS[i - 1] + difference;
        }
    }

    public static String createQuestion(int indexOfHideElement) {
        var result = new StringBuilder();

        for (int number : NUMBERS) {
            if (number != NUMBERS[indexOfHideElement]) {
                result.append(number);
                result.append(" ");
            } else {
                result.append(REPLACEMENT);
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String getCorrectAnswer(int indexOfHideElement) {
        return Integer.toString(NUMBERS[indexOfHideElement]);
    }
}
