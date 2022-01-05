package norm

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PNormKtTest {
    @Test
    fun pNormTest() {
        assertEquals(pNorm(1, arrayListOf(-4f, 2f, -8f)), 14f)
    }

    @Test
    fun infinityNormTest() {
        assertEquals(pNorm(null, arrayListOf(-4f, 2f, -8f)), 8f)
    }
}