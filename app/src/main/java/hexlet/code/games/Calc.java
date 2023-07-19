package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;

public class Calc {
    public static void calculate() {
        String description = "What is the result of the expression?";
        String[][] array = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = (int) (Math.random() * (100 + 1));
            int y = (int) (Math.random() * (100 + 1));
            String operator = generateOperator();
            int result = getCalculate(x, y, operator);
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

    public static int getCalculate(int x, int y, String operator) {
        return switch (operator) {
            case ("+") -> x + y;
            case ("-") -> x - y;
            case ("*") -> x * y;
            default -> 1;
        };
    }
}
