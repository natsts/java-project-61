package hexlet.code.games;
import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    private static final int[] numbers = new int[10];
    private static String correct;
    public static void progression() {
        String description = "What number is missing in the progression?";
        String[][] array = new String[3][2];
        for (var i = 0; i < 3; i++) {
            generateProgression();
            array[i][0] = "Question: " + generateQuestion();
            array[i][1] = correct;
        }
        Engine.generalGameLogic(array, description);
    }

    public static void generateProgression() {

        int firstNumber = (int) (Math.random() * (10 + 1));
        int difference = (int) (Math.random() * (10 + 1));

        numbers[0] = firstNumber;

        for (var i = 1; i < 10; i++) {
            numbers[i] = numbers[i - 1] + difference;
        }
    }

    public static String generateQuestion() {
        var indexHideElement = (int) (Math.random() * (10 + 1));
        var result = new StringJoiner(" ");

        for (var i = 0; i < numbers.length; i++) {
            var value = Integer.toString(numbers[i]);
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
