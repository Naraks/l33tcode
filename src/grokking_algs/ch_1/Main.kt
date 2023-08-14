package grokking_algs.ch_1

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        var search = Search()

        val arr1 = intArrayOf(1, 2, 3, 4)

        assert(search.binarySearch(arr1, 2) == 1)
        assert(search.binarySearch(arr1, 3) == 2)

        val arr2 = intArrayOf(1, 2, 3, 4, 5)
        assert(search.binarySearch(arr2, 3) == 2)
        assert(search.binarySearch(arr2, 6) == -1)

    }

}