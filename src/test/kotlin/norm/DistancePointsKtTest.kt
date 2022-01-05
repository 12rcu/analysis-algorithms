package norm

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.sqrt

internal class DistancePointsKtTest {
    @Test
    fun testDistance() {
        assertEquals(distance(arrayListOf(1f, 1f), arrayListOf(2f, 2f)), sqrt(2f))
    }
}