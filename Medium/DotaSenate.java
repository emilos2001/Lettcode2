package LeetCode.Medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class DotaSenate {
    public static String predictPartyVictory(String senate) {
        String victory ;
        Queue<Integer> radiant = new PriorityQueue<>();
        Queue<Integer> dire = new PriorityQueue<>();
        for (int i = 0; i < senate.length(); i++){
            if (senate.charAt(i) == 'R'){
                dire.add(i);
            } else if (senate.charAt(i) == 'D'){
                radiant.add(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d){
                radiant.add(r + senate.length());
            } else {
                dire.add(d + senate.length());
            }
        }
        if (radiant.size() < dire.size()){
            victory = "Radiant";
        } else {
            victory = "Dire";
        }
        return victory;
    }

    public static void main(String[] args) {
        String senate = "RRDDD";
        System.out.println(predictPartyVictory(senate));
    }
}
