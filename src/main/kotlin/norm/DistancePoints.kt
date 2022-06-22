package norm

import javax.management.InvalidAttributeValueException

/**
 * a practical sample of the p-norm is the distance between 2 points
 *
 * @param pointA one point to get the distance to another point
 * @param pointB second point to get the distance to pointA
 * @return the distance between pointA and pointB
 */
fun distance(pointA: ArrayList<Number>, pointB: ArrayList<Number>): Float? {
    if (pointA.size != pointB.size || pointA.size == 0) {
        throw InvalidAttributeValueException("pointA and pointB have to be in the same dimension (pointA.size == pointB.size) => R^n and n should be not 0")
    }
    val pointDiff = arrayListOf<Float>()
    pointA.forEachIndexed { index, number ->
        pointDiff.add(number.toFloat() - pointB[index].toFloat())
    }
    return pNorm(2, pointDiff)
}