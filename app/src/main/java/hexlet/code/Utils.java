package hexlet.code;

public class Utils {

    public static int getRandomInt() {
        return (int) ((Math.random() + 1) * (100 + 1));
    }

    //Длина прогрессии [5;10]
    public static int getLengthOfProgression() {
        return (int) (Math.random() * ((10 - 5) + 1)) + 5;
    }
}
