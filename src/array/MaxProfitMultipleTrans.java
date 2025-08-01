package array;
/*
The cost of stock on each day is given in an array price[].
Each day you may decide to either buy or sell the stock i at price[i],
you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and
 multiple stocks cannot be held on any given day.

Examples:

Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210.
Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.


Input: prices[] = [4, 2, 2, 2, 4]
Output: 2
Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2. Maximum Profit = 2.
Constraints:
1 <= prices.size() <= 105
0 <= prices[i] <= 104
*/
public class MaxProfitMultipleTrans {
    public static int maxProfit(int[] prices){
        int profit =0;
        int n = prices.length;
        for (int i = 0; i < n-1; i++) {
            if (prices[i]<prices[i+1]){
                profit=profit+(prices[i+1]-prices[i]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Maximum Profit: "+maxProfit(prices));

        int[] prices1 ={ 4,3,1,9,10,2,11,14};
        System.out.println("Maximum Profit: "+maxProfit(prices1));

    }
}
