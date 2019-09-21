import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val k = scanner.nextLong()
    var expected = (k + 1) / 2.toDouble()
    var  sum = 0.0
    for (i in n - 1 downTo 1) {
         sum = 0.0
        for(j in expected.toInt() + 1..k){
            sum += j/k.toDouble()
        }
        expected = sum + expected * expected.toInt()/k
    }
    println(expected)
}