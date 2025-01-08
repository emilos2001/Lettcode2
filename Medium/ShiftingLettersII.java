package LeetCode.Medium;

public class ShiftingLettersII {
    public static String shiftingLetters(String s, int[][] shifts) {
        long[] prefixSum = new long[s.length() + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            int value;
            if (direction == 1) {
                value = 1;
            } else {
                value = -1;
            }

            prefixSum[start] += value;
            if (end + 1 < prefixSum.length){
                prefixSum[end + 1] -= value;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            prefixSum[i] += prefixSum[i-1];
        }
        char[] chars =s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            long totalShifts = prefixSum[i];
            totalShifts = ((totalShifts % 26) + 26) % 26;
            int newChars = (chars[i] - 'a' + (int) totalShifts) % 26;
            chars[i] = (char)('a' + newChars);
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = {{0,1,0}, {1,2,1},{0, 2,1}};
        System.out.println(shiftingLetters(s, shifts));
    }
}
