package max_depth_of_binary_tree_104

class Solution {

    private var maxDepth  = 0

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return maxDepth;

        calc(0, root)

        return maxDepth
    }

    private fun calc(depth: Int, node: TreeNode) {
        val currDepth = depth + 1

        if (maxDepth < currDepth) maxDepth = currDepth

        if (node.left != null) {
            calc(currDepth, node.left!!)
        }

        if (node.right != null) {
            calc(currDepth, node.right!!)
        }
    }

}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}