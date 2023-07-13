package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static void run(String[][] ansAndQue, String description) {
        Cli.helloUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);

        for (var i = 0; i < 3;) {
            System.out.println(ansAndQue[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(ansAndQue[i][1])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + ansAndQue[i][1] + "'.\nLet's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
