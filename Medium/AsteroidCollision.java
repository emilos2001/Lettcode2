package LeetCode.Medium;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids){
            boolean isDestroyed = false;
            while (!stack.isEmpty() && i < 0 && stack.peek() > 0){
                if (Math.abs(i) > stack.peek()){
                    stack.pop();
                } else if (Math.abs(i) == stack.peek()){
                    stack.pop();
                    isDestroyed = true;
                    break;
                } else {
                    isDestroyed = true;
                    break;
                }
            }
            if (!isDestroyed){
                stack.push(i);
            }
        }
        int[] newArray = new int[stack.size()];

        for (int i = newArray.length - 1; i >= 0; i--){
            newArray[i] = stack.pop();
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        int[] result = asteroidCollision(asteroids);
        for (int i : result){
            System.out.println(i);
        }
    }
}
