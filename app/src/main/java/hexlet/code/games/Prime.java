package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void prime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] array = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number = (int) ((Math.random() + 1) * (100 + 1));
            array[i][0] = "Question: " + number;
            array[i][1] = getAnswer(number);
        }
        Engine.generalGameLogic(array, description);
    }

    public static boolean isPrime(int number) {
        for (var i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getAnswer(int number) {
        if (isPrime(number)) {
            return "yes";
        }
        return "no";
    }
}
