package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUND = 3;
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;

    public static void runGame(String[][] gameData, String description) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!" + "\nMay I have your name? ");

        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (var i = 0; i < NUMBER_OF_ROUND;) {

            System.out.println("Question: " + gameData[i][QUESTION]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(gameData[i][CORRECT_ANSWER])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + gameData[i][CORRECT_ANSWER] + "'.\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
