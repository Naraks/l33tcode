package grokking_algs.ch_6

import java.util.LinkedList
import java.util.function.Predicate

class BreadthFirstSearch {

    fun alg(start: String, graph: HashMap<String, List<String>>, predicate: Predicate<String>): String {
        val queue = LinkedList<String>()
        queue.addLast(start)

        while (queue.isNotEmpty()) {
            val current = queue.pollFirst()
            if (predicate.test(current)) {
                return current
            } else {
                val neighbors = graph[current]
                if (neighbors != null) {
                    queue.addAll(neighbors)
                }
            }
        }

        return "nothing!"
    }

}
