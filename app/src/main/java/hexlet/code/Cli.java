package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String userName;
    public static Scanner scanner = new Scanner(System.in);

    public static void helloUser() {
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
