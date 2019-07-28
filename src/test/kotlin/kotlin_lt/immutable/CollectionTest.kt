package kotlin_lt.immutable

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

internal class CollectionTest {

    @Test
    fun testImmutableList() {
        // set up
        val immutableList = listOf("a", "b", "c")
        val expected = listOf("a", "b", "c", "d")

        // exercise
        val added = immutableList + "d"

        // verify
        assertThat(added, equalTo(expected))
    }

    @Test
    fun testMutableList() {
        // set up
        val mutableList = mutableListOf("a", "b", "c")
        val expected = listOf("a", "b", "c", "d")

        // exercise
        mutableList += "d" // 内部的にはaddが呼び出される

        // verify
        assertThat(mutableList, equalTo(expected))
    }
}
