package day3

import java.io.File

fun getBinaryGamma(report: List<String>): String {
    val reportLength = report.size
    val dataLength = report[0].length
    val acc = MutableList(dataLength) { 0 }
    report.forEach { binary ->
        binary.forEachIndexed { index, numberChar -> acc[index] += numberChar.digitToInt() }
    }
    return acc.joinToString(separator = "") { n -> if (n > reportLength / 2) "1" else "0" }
}

fun getBinaryEpsilonFromGamma(gamma: String) =
    String(gamma.map { n -> if (n == '0') '1' else '0' }.toCharArray())

fun String.binaryStringToNumber() =
    Integer.parseInt(this, 2)

fun calculatePowerConsumption(): Int {
    val path = {}.javaClass.classLoader.getResource("input3.txt")?.file!!
    val report = File(path).readLines()
    val gammaString = getBinaryGamma(report)
    val epsilon = getBinaryEpsilonFromGamma(gammaString).binaryStringToNumber()
    return gammaString.binaryStringToNumber() * epsilon
}
