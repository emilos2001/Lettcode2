package LeetCode.Medium;

import java.util.*;

public class InsesrtDeleteGetRandom {
    static Map<Integer, Integer> map;
    static Random rand = new Random();
    public InsesrtDeleteGetRandom() {
        map = new HashMap<>();
    }

    public boolean insert(int value){
        if (map.containsKey(value)) {
            return false;
        }
        map.put(value, map.getOrDefault(value, 0) + 1);
        return true;
    }

    public  boolean remove(int value){
        if(!map.containsKey(value)){
            return false;
        }
        map.remove(value);
        return true;
    }

    public int getRandom(){
        return rand.nextInt(map.size());
    }

    public static void main(String[] args) {
        InsesrtDeleteGetRandom insertDeleteGetRandom = new InsesrtDeleteGetRandom();
        insertDeleteGetRandom.insert(1);
        insertDeleteGetRandom.insert(2);
        insertDeleteGetRandom.insert(3);
        insertDeleteGetRandom.insert(4);
        insertDeleteGetRandom.insert(5);
        System.out.println(insertDeleteGetRandom.getRandom());
    }
}
