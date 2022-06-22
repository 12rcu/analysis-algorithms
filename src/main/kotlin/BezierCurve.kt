import kotlin.math.min
import kotlin.math.pow

/**
 * @param controlPoints a list of points, note points are not hit except the start & end point
 * @param t a float between 0 and 1, 0 is the start point, 1 is the end point,
 * everything in between gives back a position calculated by the algorithm
 */
fun bezierCurve(controlPoints: List<Float>, t: Float): Float {
    var runningCalc = 0.0 //use double for calculation
    val n = controlPoints.size - 1
    controlPoints.forEachIndexed { i, controlPoint ->
        //https://en.wikipedia.org/wiki/B%C3%A9zier_curve , General definition -> Explicit definition
        runningCalc += binomial(n, i) * (1 - t).pow(n - i) * t.pow(i) * controlPoint
    }
    return runningCalc.toFloat() //return float as there are probably some rounding mistakes on the lower digits
}

//https://rosettacode.org/wiki/Evaluate_binomial_coefficients#Kotlin
fun binomial(n: Int, k: Int) = when {
    n < 0 || k < 0 -> throw IllegalArgumentException("negative numbers not allowed")
    n == k -> 1L
    else -> {
        val kReduced = min(k, n - k)    // minimize number of steps
        var result = 1L
        var numerator = n
        var denominator = 1
        while (denominator <= kReduced)
            result = result * numerator-- / denominator++
        result
    }
}