package leetcode.t383_ransom_note

class Solution {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var can = true

        val noteMap = HashMap<Char, Int>()
        val magazineMap = HashMap<Char, Int>()

        val noteArr = ransomNote.toCharArray()
        noteArr.forEach { ch -> noteMap.merge(ch, 1, Math::addExact) }

        val magazineArr = magazine.toCharArray()
        magazineArr.forEach { ch -> magazineMap.merge(ch, 1, Math::addExact) }

        noteMap.keys.forEach { ch ->
            run {
                if ((magazineMap[ch] ?: 0) < noteMap[ch]!!) {
                    can = false
                }
            }
        }

        return can
    }

}
