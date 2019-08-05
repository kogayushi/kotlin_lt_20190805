package kotlin_lt.value_object

import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals


internal class ExpirationDateTest {

    @Test
    fun testEquals() {
        // set up
        val mockDate = LocalDate.of(2018, 8, 5).plusDays(1)
        val expirationDate1 = ExpirationDate(mockDate)
        val expirationDate2 = ExpirationDate(mockDate)

        // exercise & verify
        assertEquals(expirationDate1, expirationDate2) // 同値
    }

    @Test
    fun testHashCode() {
        val mockDate = LocalDate.of(2018,8,5).plusDays(1)
        for (i in 0..10) {
            // set up
            val expected = 4133382
            val sut = ExpirationDate(mockDate)

            // exercise
            val actual = sut.hashCode()

            // verify
            assertEquals(expected, actual) // 何度実行しても同じHash値
        }
    }

    @Test
    fun testToString() {
        // set up
        val expected = "ExpirationDate(value=2019-08-05)"

        // exercise
        val actual = ExpirationDate(LocalDate.of(2019, 8, 5)).toString()

        // verify
        assertEquals(actual, expected)
    }
}
