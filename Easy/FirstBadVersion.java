package LeetCode.Easy;

public class FirstBadVersion {
    static boolean isBadVersion(int n) {
        int last = 0;
        return last == n;
    }
    public static int firstBadVersion(int n) {
        int first = 0;
        int last = n;
        while (first < last){
            int mid = first + (last - first) / 2;
            if (isBadVersion(mid)){
                last = mid;
            } else {
                first = mid + 1;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
