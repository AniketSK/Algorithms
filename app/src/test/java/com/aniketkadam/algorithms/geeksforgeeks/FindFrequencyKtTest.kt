package com.aniketkadam.algorithms.geeksforgeeks

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.Test


class FindFrequencyKtTest{

    @Test
    fun `finds a regular frequency correctly`() {
        val testInput = listOf(1,2,3,5,4)
        assertThat(findFrequency(testInput, 5), equalTo(1))
    }

    @Test
    fun `finds the answer for a list containing multiples`() {
        val testInput = listOf(1,2,3,5,5,5,5,0,2,5)
        assertThat(findFrequency(testInput, 5), equalTo(5))
    }
}