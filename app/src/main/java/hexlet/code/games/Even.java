package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void even() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] array = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int random = (int) (Math.random() * (100 + 1));
            array[i][0] = "Question: " + random;
            array[i][1] = getResult(random);
        }
        Engine.run(array, description);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String getResult(int number) {
        if (isEven(number)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
