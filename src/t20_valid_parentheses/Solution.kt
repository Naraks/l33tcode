package t20_valid_parentheses

class Solution {

    fun isValid(s: String): Boolean {
        var result = true

        val parentheses = arrayOf('{', '}', '[', ']', '(', ')')
        val leftParentheses = arrayOf('{', '[', '(')
        val rightParentheses = arrayOf('}', ']', ')')
        var leftSymbol: Char
        var leftTempSymbol: Char
        var rightSymbol: Char

        var leftIndex = 0
        var leftTempIndex: Int
        var rightIndex = s.length - 1

        while (leftIndex != rightIndex) {
            leftSymbol = s.elementAt(leftIndex)
            if (parentheses.contains(leftSymbol)) {
                l
            } else {
                leftIndex++
            }
        }

        return result
    }

}
