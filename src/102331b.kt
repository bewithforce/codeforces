import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val x = scanner.nextLong()
    val a = IntArray(n)
    var b = LinkedList<Int>()
    for(i in 0 until n){
        a[i] = scanner.nextInt()
    }
    for(i in 0 until n - 1){
        for(j in i + 1 until n){
            if(a[i] xor a[j] >= x){
                if(!b.contains(i))
                    b.add(i)
                if(!b.contains(j))
                    b.add(j)
            }
        }
    }

}