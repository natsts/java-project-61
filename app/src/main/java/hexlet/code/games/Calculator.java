package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Utils.getDefaultRandomInt;
import static hexlet.code.Utils.getRandomInt;

public class Calculator {
    public static void getCalculate() {
        String description = "What is the result of the expression?";
        String[][] roundData = new String[NUMBER_OF_ROUND][2];

        for (var i = 0; i < NUMBER_OF_ROUND; i++) {
            int x = getDefaultRandomInt();
            int y = getDefaultRandomInt();
            String operator = generateOperator();
            int result = getResult(x, y, operator);
            roundData[i][QUESTION] = x + " " + operator + " " + y;
            roundData[i][CORRECT_ANSWER] = Integer.toString(result);
        }
        Engine.runGame(roundData, description);
    }
    public static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        int n = getRandomInt(0, operators.length);
        return operators[n];
    }

    public static int getResult(int x, int y, String operator) {
        return switch (operator) {
            case ("+") -> x + y;
            case ("-") -> x - y;
            case ("*") -> x * y;
            default -> throw new RuntimeException("Operator not found");
        };
    }
}
