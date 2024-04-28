package t58_length_of_last_world

class Solution {

    fun lengthOfLastWord(s: String): Int {
        val arr = s.toCharArray()
        var isChar = false
        var length = 0
        var index = arr.size - 1

        while (index >= 0) {
            if (arr[index] == ' ') {
                if (isChar) {
                    break
                }
            } else {
                isChar = true
                length++
            }
            index--
        }

        return length
    }

}
