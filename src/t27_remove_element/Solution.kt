package t27_remove_element

class Solution {

    fun removeElement(nums: IntArray, el: Int): Int {
        var i = 0
        var j = nums.size - 1
        var total = 0

        while (i <= j) {
            while (j >= 0 && nums[j] == el) {
                j--
            }
            if (j < i) {
                break
            }

            if (nums[i] == el) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i++
                total++
            } else {
                i++
                total++
            }
        }
        return total
    }

}
