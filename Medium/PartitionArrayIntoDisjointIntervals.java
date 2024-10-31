package LeetCode.Medium;

public class PartitionArrayIntoDisjointIntervals {
    public static int partitionDisjoint(int[] nums) {
        int leftMax = nums[0];
        int max = nums[0];
        int partition = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < leftMax) {
                partition = i + 1;
                leftMax = max;
            } else {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }
        return partition;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int partition = partitionDisjoint(nums);
        System.out.println(partition);
    }
}
