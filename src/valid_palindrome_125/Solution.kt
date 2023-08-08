package valid_palindrome_125

class Solution {

    fun isPalindrome(s: String): Boolean {
        val arr = s.toCharArray()
        var i = 0
        var j = arr.size - 1
        var isPalindrome = true

        while (i < j) {
            val iIsValid = arr[i].isLetterOrDigit()
            val jIsValid = arr[j].isLetterOrDigit()
            if (iIsValid && jIsValid) {
                if (arr[i].toLowerCase() != arr[j].lowercaseChar()) {
                    isPalindrome = false
                    break
                }
                i++
                j--
            } else if (!iIsValid && !jIsValid) {
                i++
                j--
            } else if (!iIsValid) {
                i++
            } else {
                j--
            }
        }

        return isPalindrome
    }

}