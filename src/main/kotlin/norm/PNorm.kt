package norm

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * get the p norm of a given p and data points
 *
 * @param p the norm, if null p = infinity is calculated
 */
fun pNorm(p: Int? = null, dataPints: ArrayList<Int>): Float? {
    return if(p != null) {
        var innerSum = 0f
        dataPints.forEach {
            //innerSum += it^p
            innerSum += abs(it).toDouble().pow(p.toDouble()).toFloat()
        }
        innerSum.pow((1f/p))
    } else {
        dataPints.maxByOrNull { abs(it) }?.toFloat()?.let { abs(it) }
    }
}