package leetcode.t242_valid_anagram

class Solution {

    fun isAnagram(s: String, t: String): Boolean {
        val map = HashMap<Char, Int>()

        if (s.length != t.length) {
            return false
        }

        for (i in s.indices) {
            map[s[i]] = map.getOrDefault(s[i], 0) + 1
            map[t[i]] = map.getOrDefault(t[i], 0) - 1
        }

        return map.values.none { e -> e != 0 }
    }

}
