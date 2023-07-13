package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Please enter the game number and press Enter."
                        +
                "\n1 - Greet" + "\n2 - Even" + "\n3 - Calc" + "\n0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        if (choice.equals("2")) {
            Cli.helloUser();
            Even game = new Even();
            game.evenGame();
        } else if (choice.equals("3")) {
            Cli.helloUser();
            Calc game = new Calc();
            game.calcGame();
        }
    }
}
