import java.util.*
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextLong()
    var b = scanner.nextLong()
    b = 2.0.pow(b.toDouble()).toLong()
    val result = StringBuilder()
    while (a != 1L || b != 1L) {
        if (a <= b / 2) {
            b /= 2
            result.append('0')
        } else {
            a = b - a
            result.append("10")
            b /= 2
        }
    }
    result.reverse()
    print(result)
}