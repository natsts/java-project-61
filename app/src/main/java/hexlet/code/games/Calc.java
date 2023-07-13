package hexlet.code.games;
import hexlet.code.Cli;
import java.util.Scanner;

public class Calc {
    private static Scanner scanner = new Scanner(System.in);

    public void calcGame() {
        System.out.println("What is the result of the expression?");

        for (var i = 1; i <= 3;) {
            int x = (int) (Math.random() * (100 + 1));
            int y = (int) (Math.random() * (100 + 1));
            int[] operations = {x - y, x + y, x * y};
            int n = (int) Math.floor(Math.random() * operations.length);

            if (x - y == operations[n]) {
                System.out.println("Question: " + x + " - " + y);
            } else if (x + y == operations[n]) {
                System.out.println("Question: " + x + " + " + y);
            } else if (x * y == operations[n]) {
                System.out.println("Question: " + x + " * " + y);
            }

            System.out.print("Your answer: ");
            String answer = scanner.next();
            Integer newAnswer = Integer.valueOf(answer); //Получить ответ пользователь и преобразовать в целое число

            if (newAnswer == operations[n]) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + operations[n] + "'.\nLet's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
