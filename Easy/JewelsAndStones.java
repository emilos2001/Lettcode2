package LeetCode.Easy;

public class JewelsAndStones {
    public static int jewelsAndStones(String jewels, String stones) {
        if (jewels.length() == 0 || stones.length() == 0) {
            return 0;
        }
        int num = 0;
        for(int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    num++;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(jewelsAndStones(jewels, stones));
    }
}
