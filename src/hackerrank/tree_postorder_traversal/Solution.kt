package hackerrank.tree_postorder_traversal

import java.util.*

internal class Node(var data: Int) {
    var left: Node? = null
    var right: Node? = null
}

internal object Solution {

    private fun postOrder(root: Node?) {
        if (root!!.left != null) {
            postOrder(root.left)
        }

        if (root.right != null) {
            postOrder(root.right)
        }

        print("${root.data } ")
    }

    private fun insert(root: Node?, data: Int): Node {
        if (root == null) {
            return Node(data)
        } else {
            val cur: Node
            if (data <= root.data) {
                cur = insert(root.left, data)
                root.left = cur
            } else {
                cur = insert(root.right, data)
                root.right = cur
            }
            return root
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        var t = scan.nextInt()
        var root: Node? = null
        while (t-- > 0) {
            val data = scan.nextInt()
            root = insert(root, data)
        }
        scan.close()
        postOrder(root)
    }
}
