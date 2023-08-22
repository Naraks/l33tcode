package algorithms_sedgewick_wayne

import StdDraw
import kotlin.math.ln


object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val N = 100
        StdDraw.setXscale(0.0, N.toDouble())
        StdDraw.setYscale(0.0, (N * N).toDouble())
        StdDraw.setPenRadius(.01)
        for (i in 1..N) {
            StdDraw.point(i.toDouble(), i.toDouble())
            StdDraw.point(i.toDouble(), (i * i).toDouble())
            StdDraw.point(i.toDouble(), i * ln(i.toDouble()))
        }
    }

}
