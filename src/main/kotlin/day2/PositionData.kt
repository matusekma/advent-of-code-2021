package day2

open class PositionData(
    var depth: Int = 0,
    var horizontal: Int = 0
) {

    open fun forward(x: Int) {
        horizontal += x
    }

    open fun down(x: Int) {
        depth += x
    }

    open fun up(x: Int) {
        depth -= x
    }
}