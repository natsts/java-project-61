package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;
class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        0 - Exit""");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.helloUser();
            case "2" -> Even.even();
            case "3" -> Calc.calculate();
            case "4" -> Gcd.gcd();
            case "5" -> Progression.progression();
        }
    }
}
