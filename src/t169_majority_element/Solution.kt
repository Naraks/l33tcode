package t169_majority_element

class Solution {

    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        return nums[nums.size / 2]

        /*
        // Boyer-Moore Algorithm

        // 1 2 2 3
        // 1 count 1 candidate 1
        // 2 count 0 candidate 1
        // 2 count 1 candidate 2
        // 3 count 0 candidate 2
        var count = 0
        var candidate: Int = 0
        nums.forEach { num ->
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }
        return candidate
         */
    }

}
