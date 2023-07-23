package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Welcome to the Brain Games!"
                        +
                "\nMay I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName() {
        return userName;
    }
}
