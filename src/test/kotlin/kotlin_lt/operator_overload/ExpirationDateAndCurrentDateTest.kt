package kotlin_lt.operator_overload

import org.junit.Test
import java.time.LocalDate
import kotlin.test.*

internal class ExpirationDateAndCurrentDateTest {

    @Test
    fun testExpirationDateIsAfterCurrentDate() {
        // set up
        val currentDate = CurrentDate(LocalDate.of(2019, 8, 4))
        val expirationDate = ExpirationDate(LocalDate.of(2019, 8, 5))

        // exercise
        val actual = expirationDate < currentDate

        // verify
        assertFalse(actual)
    }

    @Test
    fun testExpirationDateIsBeforeCurrentDate() {
        // set up
        val currentDate = CurrentDate(LocalDate.of(2019, 8, 4))
        val expirationDate = ExpirationDate(LocalDate.of(2019, 8, 5))

        // exercise
        val actual = expirationDate > currentDate

        // verify
        assertTrue(actual)
    }

    @Test
    fun testExpirationDateAndCurrentDateAreSameDate() {
        // set up
        val currentDate = CurrentDate(LocalDate.of(2019, 8, 5))
        val expirationDate = ExpirationDate(LocalDate.of(2019, 8, 5))

        // exercise
        val actualRight = expirationDate <= currentDate
        val actualLeft = expirationDate >= currentDate

        // verify
        assertTrue(actualRight)
        assertTrue(actualLeft)
    }

    @Ignore
    @Test
    fun testRowLocalDate() {
        assertFalse(LocalDate.of(2019, 8, 5) < LocalDate.of(2019, 8, 4));
        assertTrue(LocalDate.of(2019, 8, 5) > LocalDate.of(2019, 8, 4));
        assertTrue(LocalDate.of(2019, 8, 5) <= LocalDate.of(2019, 8, 5));
        assertTrue(LocalDate.of(2019, 8, 5) >= LocalDate.of(2019, 8, 5));
    }
}
