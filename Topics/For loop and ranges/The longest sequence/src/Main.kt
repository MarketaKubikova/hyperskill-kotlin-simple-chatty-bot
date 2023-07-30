fun main() {
    val n = readln().toInt()
    var length = 1
    val numArray = arrayOfNulls<Int>(n)
    var maxLength = 1

    for (i in 0 until n) {
        numArray[i] = readln().toInt()
    }

    for (i in 1 until n) {
        if (numArray[i - 1]!! <= numArray[i]!!) {
            length++
        } else {
            if (length >= maxLength) {
                maxLength = length
                length = 1
            }
        }
    }

    if (length >= maxLength) {
        maxLength = length
    }

    println(maxLength)
}
