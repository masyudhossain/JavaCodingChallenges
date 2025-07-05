package array;
/*Stock Buy and Sell - Max one Transaction Allowed
Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
Output: 8
Explanation: Buy for price 1 and sell for price 9.

Input: prices[] = {7, 6, 4, 3, 1}
Output: 0
Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.

Input: prices[] = {1, 3, 6, 9, 11}
Output: 10
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1]
*/
public class MaxProfitOneTrans {
    public static int maxProfitBruteForce(int[] prices){
        int maxProfit = 0;
        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfitOptimal(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (prices[i]<minPrice)
            {
                minPrice = prices[i];
            }
            else
            {
                int profit = prices[i] - minPrice;
                if (profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        int[] prices1 = { 10, 8, 6, 3, 2};
        System.out.println("Max Profit: "+maxProfitBruteForce(prices));
        System.out.println("Max Profit: "+maxProfitOptimal(prices));
        System.out.println("Max Profit: "+maxProfitOptimal(prices1));
    }
}

