package leetcode.two_sum

class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for ((index, value) in nums.withIndex()) {
            map[value] = index
        }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement) && map[complement] != i) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }

}
