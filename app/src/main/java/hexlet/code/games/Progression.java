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

    public static void progression() {
        String description = "What number is missing in the progression?";
        String[][] roundData = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            String[] progressionArray = new String[LENGTH_OF_PROGRESSION];
            String hiddenElement = "";

            var current = getDefaultRandomInt();
            var difference = getDefaultRandomInt();
            int hiddenElementIndex = (int) (Math.random() * LENGTH_OF_PROGRESSION);

            for (var k = 0; k < LENGTH_OF_PROGRESSION; k++) {

                progressionArray[k] = String.valueOf(current);
                current = current + difference;

                if (progressionArray[k].equals(progressionArray[hiddenElementIndex])) {
                    hiddenElement = progressionArray[hiddenElementIndex];
                    progressionArray[hiddenElementIndex] = "..";
                }
            }
            var question = String.join(" ", progressionArray);

            roundData[i][QUESTION] = question;
            roundData[i][CORRECT_ANSWER] = hiddenElement;
        }
        Engine.generalGameLogic(roundData, description);
    }
}
