package t121_best_time

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPriceIndex = 0

        for (i in 0..prices.size - 1) {
            if (prices[i] < prices[minPriceIndex]) {
                minPriceIndex = i
            } else {
                if (prices[i] - prices[minPriceIndex] > maxProfit) {
                    maxProfit = prices[i] - prices[minPriceIndex]
                }
            }
        }

        return maxProfit
    }

}
