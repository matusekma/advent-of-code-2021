package day2

import java.io.File

fun calculatePosition(): Int {
    val position = PositionData()
    updatePositionForAllLines(position)
    return position.depth * position.horizontal
}

fun updatePositionForAllLines(position: PositionData) {
    val path = {}.javaClass.classLoader.getResource("input2.txt")?.file!!
    File(path).forEachLine { line ->
        val (direction, distanceString) = line.split(" ")
        val distance = distanceString.toInt()
        updatePosition(direction, distance, position)
    }
}

fun updatePosition(direction: String, distance: Int, position: PositionData) {
    when (direction) {
        "forward" -> position.forward(distance)
        "down" -> position.down(distance)
        "up" -> position.up(distance)
    }
}