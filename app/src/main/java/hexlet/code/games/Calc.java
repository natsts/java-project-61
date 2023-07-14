package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
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

    public static void calculate() {
        String description = "What is the result of the expression?";
        String[][] array = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int x = (int) (Math.random() * (100 + 1));
            int y = (int) (Math.random() * (100 + 1));
            String operator = generateOperator();
            int result = getCalculate(x, y, operator);
            array[i][0] = x + " " + operator + " " + y;
            array[i][1] = Integer.toString(result);
        }
        Engine.generalGameLogic(array, description);
    }
}
