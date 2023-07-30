fun main() {
    val n = readln().toInt()
    var perfect = 0
    var larger = 0
    var reject = 0

    repeat(n) {
        when (readln().toInt()) {
            0 -> {
                perfect++
            }
            1 -> {
                larger++
            }
            else -> {
                reject++
            }
        }
    }

    println("$perfect $larger $reject")
}
