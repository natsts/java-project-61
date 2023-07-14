package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void generalGameLogic(String[][] gameData, String description) {
        Cli.helloUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);

        for (var i = 0; i < 3;) {
            System.out.println(gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameData[i][1] + "'.\nLet's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
