/*Problem Statement:
You are given an array prices where prices[i] is the price of a given stock on the i-th day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Write a function maxProfit that returns the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.

Example 2:
Input: prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Example 3:
Input: prices = [1, 2, 3, 4, 5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5 - 1 = 4.

Constraints:

1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
*/
public class Best_time_to_buy_and_sell_stock {

    // Function to calculate the maximum profit
    public static int maxProfit(int[] prices) {
        // Initialize variables to store the minimum price encountered so far and the maximum profit possible
        int minPrice = Integer.MAX_VALUE;  // Set to a very high value initially
        int maxProfit = 0;  // Set initial profit to 0

        // Traverse through the prices array
        for (int price : prices) {
            // If the current price is lower than the minimum price encountered, update the minimum price
            if (price < minPrice) {
                minPrice = price;
            }
            // If selling at the current price yields a higher profit than before, update the maximum profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        // Return the maximum profit calculated
        return maxProfit;
    }

    // Main method to test the maxProfit function
    public static void main(String[] args) {

        // Test case 1: 
        int testcase1[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit for testcase 1: " + maxProfit(testcase1));

        // Test case 2: 
        int testcase2[] = {7, 6, 4, 3, 1};
        System.out.println("Maximum profit for testcase 2: " + maxProfit(testcase2));

        // Test case 3: 
        int testcase3[] = {1, 2, 3, 4, 5};
        System.out.println("Maximum profit for testcase 3: " + maxProfit(testcase3));
    }
}
