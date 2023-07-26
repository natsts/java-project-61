package hexlet.code;
import hexlet.code.games.*;
import hexlet.code.games.Calculator;

import java.util.Scanner;
class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit""");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.helloUser();
            case "2" -> Even.getEvenNumber();
            case "3" -> Calculator.getCalculate();
            case "4" -> Gcd.getTheLargestDivisor();
            case "5" -> Progression.progression();
            case "6" -> Prime.isPrimeNumber();
            case "0" -> scanner.close();
            default -> {
                System.out.println("Goodbye! Have a nice day:)");
                scanner.close();
            }
        }
    }
}
