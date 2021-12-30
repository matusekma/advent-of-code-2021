package day3

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class Day3Test {

    @ParameterizedTest
    @MethodSource("getDay3GammaInput")
    fun testGetBinaryGamma(report: List<String>, expectedBinaryGamma: String) {
        val binaryGamma = getBinaryGamma(report)

        assertEquals(expectedBinaryGamma, binaryGamma)
    }

    @ParameterizedTest
    @MethodSource("getDay3EpsilonInput")
    fun testGetEpsilonGamma(gamma: String, expectedBinaryEpsilon: String) {
        val binaryEpsilon = getBinaryEpsilonFromGamma(gamma)

        assertEquals(expectedBinaryEpsilon, binaryEpsilon)
    }

    companion object {

        @JvmStatic
        fun getDay3GammaInput(): Stream<Arguments> = Stream.of(
            Arguments.of(
                listOf(
                    "00100",
                    "11110",
                    "10110",
                    "10111",
                    "10101",
                    "01111",
                    "00111",
                    "11100",
                    "10000",
                    "11001",
                    "00010",
                    "01010"
                ), "10110"
            ),
            Arguments.of(
                listOf(
                    "00100",
                    "11110",
                    "10110",
                    "10111",
                    "10101",
                    "01111",
                    "00111",
                    "11100",
                    "10000",
                    "01001",
                    "00010",
                    "01010",
                    "01010"
                ), "00110"
            )
        )

        @JvmStatic
        fun getDay3EpsilonInput(): Stream<Arguments> = Stream.of(
            Arguments.of(
                "10110", "01001"
            ), Arguments.of("11111", "00000")
        )
    }
}