package LeetCode.Medium;

public class CountCollisionOnARoad {
    public static int countCollisions(String directions) {
        int collisions = 0;
        int j = 0;
        char[] prev = directions.toCharArray();
        for (int i = 0; i < directions.length(); i++) {
            char current = prev[i];
            switch (current) {
                case 'R':
            }
        }
        return collisions;
    }



    public static void main(String[] args) {
        String collisions = "RLRSLL";
        System.out.println(countCollisions(collisions));
    }
}
