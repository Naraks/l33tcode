package grokking_algs.ch_6

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val sol = BreadthFirstSearch()

        val graph: HashMap<String, List<String>> = HashMap()
        graph.put("You", listOf("Bob", "Claire", "Alice"))
        graph.put("Claire", listOf("Thom", "Jonny"))
        graph.put("Alice", listOf("Peggy"))
        graph.put("Bob", listOf("Peggy", "Anuj"))

        val alg = sol.alg("You", graph) { it == "Peggy" }
        println(alg)
    }

}
