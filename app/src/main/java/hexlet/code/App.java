package hexlet.code;
import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Please enter the game number and press Enter." +
                "\n1 - Greet" +
                "\n2 - Even" +
                "\n0 - Exit");

        System.out.print("Your choice: ");
        String choice = scanner.next();

        if (choice.equals("1") || choice.equals("2")) {
            Cli.helloUser();

            Even games = new Even();
            games.evenGame();
        }
    }
}
