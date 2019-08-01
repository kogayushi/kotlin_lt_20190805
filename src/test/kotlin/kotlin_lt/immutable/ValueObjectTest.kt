package kotlin_lt.immutable

import org.hamcrest.core.IsEqual.equalTo
import org.hamcrest.core.IsNot.not
import org.junit.Assert.assertThat
import org.junit.Test


internal class ValueObjectTest {
    @Test
    fun testCopy() {
        // set up
        val valueObject = ValueObject(mainValue = "value object", otherValue = "other value")

        // exercise
        val otherValueObject = valueObject.copy(otherValue = "copied object")

        // verify
        assertThat(valueObject.mainValue, equalTo(otherValueObject.mainValue))
        assertThat(valueObject.otherValue, not(equalTo(otherValueObject.otherValue)))
        assertThat(otherValueObject.toString(), equalTo("ValueObject(mainValue=value object, otherValue=copied object)"))
    }
}
