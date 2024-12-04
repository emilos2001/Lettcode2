package LeetCode.Easy;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = duration;
        for (int i = 1; i < timeSeries.length; i++){
            int timeDifference = timeSeries[i] - timeSeries[i - 1];
            ans += Math.min(duration, timeDifference);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] timeOfSeries = {1, 4};
        System.out.println(findPoisonedDuration(timeOfSeries, 2));
    }
}
