package plus_one_66

class Solution {

    fun plusOne(digits: IntArray): IntArray {
        if (digits.last() < 9) {
            digits[digits.size - 1]++
            return digits
        } else {
            var buffer = 0
            for (i in digits.size - 1 downTo 0) {
                var newRes = digits[i] + buffer
                if (i == digits.size - 1) newRes++
                if (newRes > 9) {
                    buffer = 1
                    digits[i] = 0
                } else {
                    buffer = 0
                    digits[i] = newRes
                    return digits
                }
            }
            return if (buffer == 1) {
                val newArr = IntArray(digits.size + 1)
                newArr[0] = 1
                for (i in 0 .. digits.size - 1) {
                    newArr[i + 1] = digits[i]
                }
                newArr
            } else digits
        }
    }

}