package LeetCode.Easy;

public class RemoveDublicates {
    public static int removeDublicates(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]){
                arr[i] = arr[j];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        int res = removeDublicates(arr);
        System.out.println(res);
    }
}
