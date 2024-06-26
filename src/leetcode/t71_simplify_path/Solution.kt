package leetcode.t71_simplify_path

class Solution {

    fun simplifyPath(path: String): String {
        val clearedPath = arrayListOf<String>()
        path.split("/").filter { e -> e.isNotBlank() }.forEach { word ->
            run {
                if (word == "..") {
                    if (clearedPath.isNotEmpty()) {
                        clearedPath.removeLast()
                    }
                } else if (word == ".") {
                    // do nothing
                } else {
                    clearedPath.add(word)
                }
            }
        }
        return clearedPath.joinToString("/", "/")
    }

}
