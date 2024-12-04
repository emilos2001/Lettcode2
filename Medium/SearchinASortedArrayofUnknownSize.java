package LeetCode.Medium;

import java.io.CharArrayReader;

public class SearchinASortedArrayofUnknownSize {
    public static int search(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] == target){
                return mid;
            } else if (array[mid] < target) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {-1,0,3,5,9,12};
        System.out.println(search(array, 9));
    }
}
