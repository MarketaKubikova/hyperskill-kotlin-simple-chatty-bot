import java.util.Scanner

fun main() {
    val (hour, minute, second) = readln().split(" ")
    val (month, day, year) = readln().split(" ")

    println("$hour:$minute:$second $month/$day/$year")
}
