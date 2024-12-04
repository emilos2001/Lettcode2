package LeetCode.Medium;

import java.util.Arrays;

public class DestroyingAsteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > mass) {
                return false;
            }
            mass += asteroids[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[] asteroids = {3,9,19,5,21};
        System.out.println(asteroidsDestroyed(10, asteroids));
    }
}
