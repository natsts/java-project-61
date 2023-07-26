package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getDefaultRandomInt;

public class Calculator {
    public static void getCalculate() {
        String description = "What is the result of the expression?";
        String[][] roundData = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = getDefaultRandomInt();
            int y = getDefaultRandomInt();
            String operator = generateOperator();
            int result = calculate(x, y, operator);
            roundData[i][QUESTION] = x + " " + operator + " " + y;
            roundData[i][CORRECT_ANSWER] = Integer.toString(result);
        }
        Engine.generalGameLogic(roundData, description);
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
