package hexlet.code;
import java.util.Random;

public class Utils {
    public static int getRandomInt(int lowerBound, int upperBound) {
        Random random = new Random();
        int randomNumber = random.nextInt(lowerBound, upperBound);
        return randomNumber;
    }

    public static int getDefaultRandomInt() {
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(lowerBound, upperBound);
        return randomNumber;
    }
}
