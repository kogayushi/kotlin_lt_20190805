package kotlin_lt.extension

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ExtentionKtTest {

    @Test
    fun testNull() {
        // set up
        val sut:String? = null

        // exercise
        val actual = sut.isNullOrEmpty();

        // verify
        assertTrue(actual)
    }

    @Test
    fun testEmpty() {
        // set up
        val sut:String = ""

        // exercise
        val actual = sut.isNullOrEmpty();

        // verify
        assertTrue(actual)
    }

    @Test
    fun testHasLength() {
        // set up
        val sut:String = "abc"

        // exercise
        val actual = sut.isNullOrEmpty();

        // verify
        assertFalse(actual)
    }
}
