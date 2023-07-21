package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getRandomInt;

public class Even {
    public static void even() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int random = getRandomInt();
            array[i][QUESTION] = "Question: " + random;
            array[i][CORRECT_ANSWER] = getCorrectAnswer(random);
        }
        Engine.generalGameLogic(array, description);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static String getCorrectAnswer(int number) {
        return isEven(number) ? "yes" : "no";
    }
}
