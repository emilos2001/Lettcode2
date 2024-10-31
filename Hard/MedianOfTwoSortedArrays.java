package LeetCode.Hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            newArray[j++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArray[j++] = nums2[i];
        }
        Arrays.sort(newArray);
        if (newArray.length % 2 == 1) {
            return newArray[newArray.length / 2];
        } else {
            double mid1 = newArray[newArray.length / 2];
            double mid2 = newArray[newArray.length / 2 - 1];
            return (mid1 + mid2) / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianOfTwoSortedArrays(nums1, nums2));
    }
}
