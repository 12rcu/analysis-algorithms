import norm.distance
import norm.pNorm
import kotlin.math.sqrt

fun main() {
    println(pNorm(2, arrayListOf(-4f, 2f, -8f)))
    println("${distance(arrayListOf(1f, 1f), arrayListOf(2f, 2f))} == ${sqrt(2f)}")
}