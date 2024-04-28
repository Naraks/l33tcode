package t290_word_pattern

class Solution {

    fun wordPattern(pattern: String, s: String): Boolean {
        val map = HashMap<Char, String>()
        val words = s.split(" ")

        if (pattern.length != words.size) {
            return false
        }

        pattern.forEachIndexed { index, ch ->
            if (!map.containsKey(ch)) {
                if (map.values.contains(words[index])) {
                    return false;
                }
                map[ch] = words[index]
            } else {
                if (map[ch] != words[index]) {
                    return false
                }
            }
        }
        return true
    }

}
