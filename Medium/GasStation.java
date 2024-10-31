package LeetCode.Medium;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int startPoint = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0){
                tank = 0;
                startPoint = i + 1;
            }
        }
        if (totalGas >= totalCost){
            return startPoint;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int startPoint = canCompleteCircuit(gas, cost);
        System.out.println(startPoint);
    }
}
