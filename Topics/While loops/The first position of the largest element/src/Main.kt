import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val list = arrayListOf<Int>()

    while (scanner.hasNext()) {
        list.add(scanner.nextInt())
    }

    val max = list.maxOrNull()
    val index = list.indexOf(max) + 1

    println("$max $index")
}
