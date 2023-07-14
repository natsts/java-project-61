package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    public static void gcd() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] array = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int x = (int) (Math.random() * (100 + 1));
            int y = (int) (Math.random() * (100 + 1));
            int result = findDivisor(x, y);
            array[i][0] = x + " " + y;
            array[i][1] = Integer.toString(result);
        }
        Engine.generalGameLogic(array, description);
    }
    public static int findDivisor(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int result = 1;
        while (min > 1) {
            result = max % min;
            max = min;
            min = result;
            if (max % min == 0) {
                return min;
            }
        }
        return result;
    }
}
