import java.util.Arrays;
public class DestroyAsteroids{
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currentMass = mass;

        for (int asteroid : asteroids) {
            if (currentMass < asteroid) {
                return false;
            }
            currentMass += asteroid;
        }

        return true;
    }

    public static void main(String[] args) {
        int mass = 10;
        int[] asteroids = {3, 9, 19, 5, 21};

        boolean result = asteroidsDestroyed(mass, asteroids);

        System.out.println(result);
    }
}    

