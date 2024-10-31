package LeetCode.Medium;

public class WaterContainer {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * width;
            if (area > max){
                max = area;
            }
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = new int[]{1, 1};
        int max = maxArea(height);
        System.out.println(max);
    }
}
