package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomInt() {
        int lowerBound = 1;
        int upperBound = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(lowerBound, upperBound);
        return randomNumber;
    }

    //Длина прогрессии [5;10]
    public static int getLengthOfProgression() {
        int lowerBound = 5;
        int upperBound = 10;
        Random random = new Random();
        int randomNumber = random.nextInt(lowerBound, upperBound);
        return randomNumber;
    }
}
