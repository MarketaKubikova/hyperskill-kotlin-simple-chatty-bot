import kotlin.math.abs

fun main() {
    val knight1 = readln()
    val knight2 = readln()

    when {
        abs(knight1[0].digitToInt() - knight2[0].digitToInt()) == 1 && abs(knight1[2].digitToInt() - knight2[2].digitToInt()) == 2 -> {
            println("YES")
        }
        abs(knight1[0].digitToInt() - knight2[0].digitToInt()) == 2 && abs(knight1[2].digitToInt() - knight2[2].digitToInt()) == 1 -> {
            println("YES")
        }
        else -> {
            println("NO")
        }
    }
}
