package t205_siomorphic_strings

class Solution {

    fun isIsomorphic(s: String, t: String): Boolean {
        val map = HashMap<Char, Char>()
        s.forEachIndexed { index, ch ->
            if (!map.containsKey(ch)) {
                if (map.values.contains(t[index])) {
                    return false
                }
                map[ch] = t[index]
            } else {
                if (map[ch] != t[index]) {
                    return false
                }
            }
        }
        return true
    }

}
