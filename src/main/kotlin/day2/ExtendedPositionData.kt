package day2

class ExtendedPositionData(
    depth: Int = 0,
    horizontal: Int = 0,
    var aim: Int = 0
) : PositionData(depth, horizontal) {

    override fun forward(x: Int) {
        horizontal += x
        depth += aim * x
    }

    override fun down(x: Int) {
        aim += x
    }

    override fun up(x: Int) {
        aim -= x
    }
}