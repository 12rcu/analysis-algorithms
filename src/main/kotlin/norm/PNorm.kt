package norm

import kotlin.math.abs
import kotlin.math.pow

/**
 * get the p norm of a given p and data points
 *
 * @param p the norm, if null p = infinity is calculated
 * @param dataPints a list of points out of which the norm should be calculated
 * @return solution or null if dataPoints were empty
 */
fun pNorm(p: Int? = null, dataPints: ArrayList<Float>): Float? {
    return if(p != null) {
        var innerSum = 0f
        dataPints.forEach {
            //innerSum += it^p
            innerSum += abs(it).toDouble().pow(p.toDouble()).toFloat()
        }
        //root(innerSum, p)
        innerSum.pow((1f/p))
    } else {
        //max(|dataPoints|)
        dataPints.maxByOrNull { abs(it) }?.toFloat()?.let { abs(it) }
    }
}