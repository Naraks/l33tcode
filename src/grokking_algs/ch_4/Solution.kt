package grokking_algs.ch_4

class Solution {

    fun sum(arr: IntArray): Int {
        return if (arr.isEmpty()) 0
        else arr.first() + sum(arr.copyOfRange(1, arr.size))
    }

    fun count(arr: IntArray): Int {
        return if (arr.isEmpty()) 0
        else 1 + count(arr.copyOfRange(1, arr.size))
    }

    fun findMax(list: List<Int>): Int {
        var max = 0
        for (i in list.indices) {
            if (list[i] > max) max = list[i]
        }
        return max
    }

    fun quickSort(arr: ArrayList<Int>): ArrayList<Int> {
        return if (arr.size < 2) arr
        else {
            val pivot = arr[0]
            val less = arr.filter { e -> e <= pivot }.toCollection(ArrayList())
            val greater = arr.filter { e -> e > pivot }.toCollection(ArrayList())

            val quickSort = quickSort(less)
            quickSort.add(pivot)
            quickSort.addAll(quickSort(greater))

            quickSort
        }
    }

}
