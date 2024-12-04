package LeetCode.Easy;

public class MakeArrayElementsEqualToZero {
    public static int countValidSelections(int[] nums) {
        int index = 0;
        int count = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            if (nums[i] == 0) {
                index = i;
                break;
            }
        }
        for (int i = index; i < nums.length; i++) {
            right += nums[i];
        }
        for (int i = index; i < nums.length; i++) {
            left += nums[i];
            right -= nums[i];
            if (nums[i] != 0) {
                continue;
            }
            if (left == right) {
                count += 2;
            } else if (left - 1 == right || left + 1 == right) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,0,4,1,0};
        System.out.println(countValidSelections(nums));
    }
}
