package hexlet.code;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Even {
    private static Scanner scanner = new Scanner(System.in);

    public void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= 3; ) {
            int random = (int) (Math.random() * (100 + 1));

            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("yes") && random % 2 == 0 || answer.equalsIgnoreCase("no") && random % 2 != 0) {
                System.out.println("Correct!");
                i++;
            } else {
                String oppositeAnswer = (answer.equalsIgnoreCase("yes")) ? "no" : "yes";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + oppositeAnswer + "'.\nLet's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}