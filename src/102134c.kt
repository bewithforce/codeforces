import java.io.File
import java.math.BigInteger
import java.util.*

fun main(){
    val scanner = Scanner(File("src/text.txt"))
    val n = scanner.nextInt()
    val k = BigInteger(scanner.nextInt().toString())
    scanner.nextLine()
    val line = scanner.nextLine().replace('?', '0')
    if(line[0] == '0') line.replaceFirst('0', '1')

    var bigInteger = BigInteger(line)
    var remainder = bigInteger.remainder(k)

    val counter = line.length - 1
    while(remainder != BigInteger.ZERO || remainder != k){

    }
}