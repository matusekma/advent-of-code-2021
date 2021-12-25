package day2

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class Day2Test {

    @ParameterizedTest
    @CsvSource("forward,5,5,0,0,0", "down,2,0,2,0,0", "up,3,0,-3,0,0", "forward,5,6,2,1,2")
    fun testUpdatePart1Position(
        direction: String,
        distance: Int,
        expectedHorizontal: Int,
        expectedDepth: Int,
        defaultHorizontal: Int,
        defaultDepth: Int
    ) {
        val position = PositionData(defaultDepth, defaultHorizontal)

        updatePosition(direction, distance, position)

        assertEquals(expectedHorizontal, position.horizontal)
        assertEquals(expectedDepth, position.depth)
    }

    @ParameterizedTest
    @CsvSource("forward,5,5,25,5,0,0,5", "down,2,0,0,2,0,0,0", "up,3,0,0,-3,0,0,0", "forward,5,6,2,0,1,2,0")
    fun testUpdatePart2Position(
        direction: String,
        distance: Int,
        expectedHorizontal: Int,
        expectedDepth: Int,
        expectedAim: Int,
        defaultHorizontal: Int,
        defaultDepth: Int,
        defaultAim: Int
    ) {
        val position = ExtendedPositionData(defaultDepth, defaultHorizontal, defaultAim)

        updatePosition(direction, distance, position)

        assertEquals(expectedHorizontal, position.horizontal)
        assertEquals(expectedDepth, position.depth)
        assertEquals(expectedAim, position.aim)
    }

}