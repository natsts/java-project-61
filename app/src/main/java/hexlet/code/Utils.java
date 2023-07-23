package hexlet.code;
import java.util.Random;

public class Utils {

    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 100;
    public static int getRandomInt(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(lowerBound, upperBound);
    }

    public static int getDefaultRandomInt() {
        Random random = new Random();
        return random.nextInt(LOWER_BOUND, UPPER_BOUND);
    }
}
