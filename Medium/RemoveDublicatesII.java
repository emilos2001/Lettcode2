package LeetCode.Medium;

public class RemoveDublicatesII {
    public static int removeDuplicates(int[] arr) {
        int j = 2;
        for (int i = 2; i <arr.length; i++){
            if(arr[i] != arr[j - 2]){
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
