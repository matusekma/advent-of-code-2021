package day1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class Day1Test {

    @ParameterizedTest
    @CsvSource("199,200,True", "200,199,False")
    fun testDidIncreasedTrue(depth1: Int, depth2: Int, expectedIncreased: Boolean) {

        val increased = didIncrease(depth1, depth2);

        assertEquals(expectedIncreased, increased);
    }


}