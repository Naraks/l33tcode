package leetcode.t746_min_cost_climbing_stairs

import kotlin.math.min

class Solution {

    fun minCostClimbingStairs(cost: IntArray): Int {
        val costArray = IntArray(cost.size)

        var left = 0
        var right = 0

        for (i in cost.indices.reversed() step 2) {
            val min = min(left, right)
            costArray[i] = min + cost[i]
            right = left
            left = costArray[i]

            if (i - 1 >= 0) {
                val min = min(left, right)
                costArray[i - 1] = min + cost[i - 1]
                right = left
                left = costArray[i - 1]
            }

        }

        return min(costArray[0], costArray[1])
    }

}
