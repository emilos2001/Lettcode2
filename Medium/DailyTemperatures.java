package LeetCode.Medium;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int [] temperatures){
        int[] temp = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                temp[index] = i - index;
            }
            stack.push(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temperatures);
        for (int i : result){
            System.out.println(i);
        }
    }
}
