package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Welcome to the Brain Games!"
                        +
                "\nMay I have your name? ");

        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
