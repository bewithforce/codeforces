import java.math.BigInteger
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var allVariants = BigInteger.valueOf(3)
    var toMinus = BigInteger.valueOf(7)
    toMinus = toMinus.pow(n)
    allVariants = allVariants.pow(3*n) - toMinus
    print(allVariants.mod(BigInteger.valueOf(1000000007)))
}