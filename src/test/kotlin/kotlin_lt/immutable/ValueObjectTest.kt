package kotlin_lt.immutable

import org.hamcrest.core.IsEqual.equalTo
import org.hamcrest.core.IsNot.not
import org.junit.Assert.assertThat
import org.junit.Test
import kotlin.test.assertTrue


internal class ValueObjectTest {
    @Test
    fun testEqualsToStringHashCode() {
        // set up
        val valueObject = ValueObject("value object", "other value")
        val otherValueObject = ValueObject("value object", "other value")

        // exercise
        val actual = valueObject == otherValueObject // これはequalsの呼び出し

        // verify
        assertTrue(actual) // equalsがオーバーライドされてる
        // toString()がオーバーライドされてる
        assertThat(valueObject.toString(), equalTo(otherValueObject.toString()))
        // hashCode()がオーバーライドされてる
        assertThat(valueObject.hashCode(), equalTo(otherValueObject.hashCode()))
    }

    @Test
    fun testCopy() {
        // set up
        val valueObject = ValueObject("value object", "other value")
        val otherValueObject = valueObject.copy(otherValue = "copied object")

        // verify
        assertThat(valueObject.mainValue, equalTo(otherValueObject.mainValue))
        assertThat(valueObject.otherValue, not(equalTo(otherValueObject.mainValue)))
        assertThat(otherValueObject.toString(), equalTo("ValueObject(mainValue=value object, otherValue=copied object)"))
    }
}
