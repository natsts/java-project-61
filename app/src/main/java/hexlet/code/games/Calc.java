package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getRandomInt;

public class Calc {
    private static final int PROGRESSION_MIN_SIZE = 1;
    private static final int PROGRESSION_MAX_SIZE = 100;
    public static void calculate() {
        String description = "What is the result of the expression?";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            int y = getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            String operator = generateOperator();
            int result = calculate(x, y, operator);
            array[i][QUESTION] = x + " " + operator + " " + y;
            array[i][CORRECT_ANSWER] = Integer.toString(result);
        }
        Engine.generalGameLogic(array, description);
    }
    public static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        int n = (int) Math.floor(Math.random() * operators.length);
        return operators[n];
    }

    public static int calculate(int x, int y, String operator) {
        return switch (operator) {
            case ("+") -> x + y;
            case ("-") -> x - y;
            case ("*") -> x * y;
            default -> throw new RuntimeException("Operator not found");
        };
    }
}
