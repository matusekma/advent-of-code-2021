package day1

import java.io.File

fun didIncrease(depth1: Int, depth2: Int) = depth1 < depth2

fun countIncreases(): Int {
    var prevDepth = Int.MAX_VALUE
    var count = 0
    val path = {}.javaClass.classLoader.getResource("input1.txt")?.file!!
    File(path).forEachLine { line ->
        val currentDepth = line.toInt()
        if (didIncrease(prevDepth, currentDepth)) {
            count++
        }
        prevDepth = currentDepth
    }
    return count
}