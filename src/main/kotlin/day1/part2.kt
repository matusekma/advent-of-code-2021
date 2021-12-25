package day1

import java.io.File
import java.util.*

fun countWindowIncreases(): Int {
    val window = LinkedList(listOf(Int.MAX_VALUE / 3, Int.MAX_VALUE / 3, Int.MAX_VALUE / 3))
    var count = 0
    var lineProcessed = 1
    val path = {}.javaClass.classLoader.getResource("input1.txt")?.file!!
    File(path).forEachLine { line ->
        val currentDepth = line.toInt()
        window.add(currentDepth)

        val prevWindow = window.subList(0, 3).reduce { acc, depth -> acc + depth }
        val currentWindow = window.subList(1, 4).reduce { acc, depth -> acc + depth }

        if (didIncrease(prevWindow, currentWindow)) {
            count++
        }

        window.removeFirst()
        lineProcessed++
    }
    return count
}