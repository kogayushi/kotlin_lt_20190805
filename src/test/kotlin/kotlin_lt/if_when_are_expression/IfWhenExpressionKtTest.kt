package kotlin_lt.if_when_are_expression

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test


internal class IfWhenExpressionKtTest {

    @Test
    fun testLoveIfWithKotlin() {
        // set up
        val expected = "Kotlin ❤️"
        // exercise
        val actual = loveIf("Kotlin")

        // verify
        println(actual)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun testLoveIfWithJava() {
        // set up
        val expected = "Java 💔"
        // exercise
        val actual = loveIf("Java")

        // verify
        println(actual)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun testLoveWhenWithKotlin() {
        // set up
        val expected = "Kotlin ❤️"
        // exercise
        val actual = loveWhen("Kotlin")

        // verify
        println(actual)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun testLoveWhenWithJava() {
        // set up
        val expected = "Java 💔"
        // exercise
        val actual = loveWhen("Java")

        // verify
        println(actual)
        assertThat(actual, equalTo(expected))
    }
}
