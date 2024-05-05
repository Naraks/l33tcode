package leetcode.t228_summary_ranges

class Solution {

    fun summaryRanges(nums: IntArray): List<String> {

        val list = ArrayList<String>()

        var left = 0
        var right = 0

        if (nums.size == 0) {
            return list
        }

        if (nums.size == 1) {
            list.add(nums[left].toString())
            return list
        }

        for (i in 1 .. nums.size - 1) {
            if (nums[i] - nums[i - 1] == 1) {
                right = i
            } else {
                if (left == right) {
                    list.add(nums[left].toString())
                } else {
                    list.add("${nums[left]}->${nums[right]}")
                }
                left = i
                right = i
            }
        }

        if (left == right) {
            list.add(nums[left].toString())
        } else {
            list.add("${nums[left]}->${nums[right]}")
        }

        return list

    }

}
