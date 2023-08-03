package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.getDefaultRandomInt;
import static hexlet.code.Utils.getRandomInt;

public class Progression {
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int PROGRESSION_MAX_SIZE = 10;
    private static final int LENGTH_OF_PROGRESSION = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);

    public static void getProgression() {
        String description = "What number is missing in the progression?";
        String[][] roundData = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {

            int hiddenElementIndex = getRandomInt(0, LENGTH_OF_PROGRESSION);

            String[] progressionArray = generateProgression();
            String hiddenElement = progressionArray[hiddenElementIndex];
            progressionArray[hiddenElementIndex] = "..";

            var question = String.join(" ", progressionArray);

            roundData[i][QUESTION] = question;
            roundData[i][CORRECT_ANSWER] = hiddenElement;
        }
        Engine.runGame(roundData, description);
    }

    public static String[] generateProgression() {

        String[] progressionArray = new String[LENGTH_OF_PROGRESSION];

        int current = getDefaultRandomInt();
        int difference = getDefaultRandomInt();

        for (var i = 0; i < LENGTH_OF_PROGRESSION; i++) {

            progressionArray[i] = String.valueOf(current);
            current += difference;
        }
        return progressionArray;
    }
}
