package leetcode.t202_happy_number

class Solution {

    fun isHappy(n: Int): Boolean {
        val set = HashSet<Int>()

        var number = n
        while (true) {
            if (number == 1) return true
            if (set.contains(number)) {
                return false
            } else {
                set.add(number)
            }

            var buf = 0
            number.toString()
                .split("")
                .forEach { el ->
                    run {
                        if (el != "") {
                            buf += el.toInt() * el.toInt()
                        }
                    }
                }
            number = buf

            /* Либо как в решении без выделения доп массива:
            // Compute the sum of the squares of the digits of n
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            */
        }
    }

}
