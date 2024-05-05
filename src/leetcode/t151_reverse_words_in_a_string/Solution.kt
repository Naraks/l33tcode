package leetcode.t151_reverse_words_in_a_string

class Solution {

    fun reverseWords(s: String): String {
        return s.split(" ")
            .filter { e -> e.isNotBlank() }
            .map { e -> e.trim() }
            .reversed()
            .reduce { acc, str -> "$acc $str" }
    }

}
