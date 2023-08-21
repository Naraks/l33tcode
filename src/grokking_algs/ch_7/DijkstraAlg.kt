package grokking_algs.ch_7

class DijkstraAlg {

    fun <T> dijkstra(graph: Graph<T>, start: T): Map<T, T?> {
        val s: MutableSet<T> = mutableSetOf() // a subset of vertices, for which we know the true distance

        val delta = graph.vertices.associateWith { Int.MAX_VALUE }.toMutableMap()
        delta[start] = 0

        val previous: MutableMap<T, T?> = graph.vertices.associateWith { null }.toMutableMap()

        while (s != graph.vertices) {
            val v: T = delta.filter { !s.contains(it.key) }.minBy { it.value }.key

            graph.edges.getValue(v).minus(s).forEach { neighbor ->
                val newPath = delta.getValue(v) + graph.weights.getValue(Pair(v, neighbor))

                if (newPath < delta.getValue(neighbor)) {
                    delta[neighbor] = newPath
                    previous[neighbor] = v
                }
            }

            s.add(v)
        }

        return previous.toMap()
    }

}

data class Graph<T>(
    val vertices: Set<T>, val edges: Map<T, Set<T>>, val weights: Map<Pair<T, T>, Int>
)
