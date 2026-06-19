import java.util.*;

public class LargestAltitude {

    public static int largestAltitude(int[] gain) {
        int current = 0;
        int highest = 0;

        for (int g : gain) {
            current += g;
            highest = Math.max(highest, current);
        }

        return highest;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);
    }
}
