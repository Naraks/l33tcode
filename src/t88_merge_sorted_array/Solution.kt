package t88_merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var i = m - 1
        var j = n - 1
        var p = nums1.size - 1

        while (p >= 0) {
            if (i >= 0 && j >= 0) {
                if (nums1[i] >= nums2[j]) {
                    nums1[p] = nums1[i]
                    i--
                } else {
                    nums1[p] = nums2[j]
                    j--
                }
            } else {
                if (i >= 0) {
                    nums1[p] = nums1[i]
                    i--
                } else {
                    nums1[p] = nums2[j]
                    j--
                }
            }
            p--
        }

    }
}
