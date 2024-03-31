package longest_substring_without_repeating_chars_3

class Solution {

    fun lengthOfLongestSubstring(str: String): Int {
        val usedChars = HashSet<Char>();
        var result = 0;

        var leftIndex = 0;
        var rightIndex = 0;

        if (str.isEmpty()) return 0
        if (str.length == 1) return 1

        while (leftIndex < str.length) {
            val letter = str[rightIndex]
            if (usedChars.contains(letter)) {
                leftIndex++
                rightIndex = leftIndex
                if (usedChars.size > result) {
                    result = usedChars.size
                }
                usedChars.clear()
            } else {
                usedChars.add(letter);
                rightIndex += 1
                if (rightIndex >= str.length) {
                    leftIndex++
                    rightIndex = leftIndex
                }
            }
        }

        return result;
    }

}
