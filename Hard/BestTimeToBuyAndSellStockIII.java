package LeetCode.Hard;

public class BestTimeToBuyAndSellStockIII {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int[] rightProfit = new int[prices.length];
        int[] leftProfit = new int[prices.length];
        int minPrice = prices[0];
        int maxPrice = prices[prices.length - 1];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minPrice);
        }
        for(int i = prices.length - 2; i >= 0; i--){
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - prices[i]);
        }
        for (int i = 0; i < prices.length; i++){
            profit = Math.max(profit, leftProfit[i] + rightProfit[i]);
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }
}
