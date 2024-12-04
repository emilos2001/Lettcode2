package LeetCode.Easy;

public class SquaresOfSortedArray {
    public static int[] squaresOfSortedArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(newArr[j] > newArr[j + 1]){
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] res  = squaresOfSortedArray(arr);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
