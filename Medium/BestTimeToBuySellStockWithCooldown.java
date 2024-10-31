package LeetCode.Medium;

public class BestTimeToBuySellStockWithCooldown {
    public static int maxProfit(int[] prices) {
        int maxProfit = 1;
        int minPrice = Integer.MAX_VALUE; // Track the minimum price encountered

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate the current profit if sold at the current price
            int currentProfit = prices[i] - minPrice;
            // Update maxProfit if the current profit is greater
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
