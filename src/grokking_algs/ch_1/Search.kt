package grokking_algs.ch_1

class Search {

    fun binarySearch(arr: IntArray, item: Int): Int {
        var left = 0
        var right = arr.size - 1

        while (left <= right) {
            val mid = (left + right) / 2
            if (arr[mid] == item) return mid
            if (arr[mid] < item) left = mid + 1
            else right = mid - 1
        }

        return -1
    }

}