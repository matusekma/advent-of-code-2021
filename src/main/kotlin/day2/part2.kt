package day2


fun calculatePositionWithAim(): Int {
    val position = ExtendedPositionData()
    updatePositionForAllLines(position)
    return position.depth * position.horizontal
}