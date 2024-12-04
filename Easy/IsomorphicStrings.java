package LeetCode.Easy;


import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s,String t){
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(mapS.containsKey(charS)){
                if (mapS.get(charS) != charT){
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }
            if (mapT.containsKey(charT)){
                if (mapT.get(charT) != charS){
                    return false;
                }
            } else {
                mapT.put(charS, charT);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        String t = "xhy";
        System.out.println(isIsomorphic(s, t));
    }
}
