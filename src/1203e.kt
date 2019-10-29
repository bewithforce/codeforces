import java.util.*
import kotlin.collections.HashSet

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val map = HashMap<Int, Int>()
    val keys = HashSet<Int>()
    for (i in 0 until n) {
        val temp = scanner.nextInt()
        if (map[temp] == null) {
            map[temp] = 1
        } else {
            if (map[temp] != 3)
                map[temp] = map[temp]!! + 1
        }
        keys.add(temp)
    }
    println(map)
    var up = false
    var down = false
    for (v in keys) {
        if(v == 1){
            if(map[2] != null || map[3] == null){
                up = true
            }
            continue
        }


    }
    println(map)

    map.values.removeIf { it == 0 }
    println(map)
    print(map.size)
}
/*
10
6 7 3 10 2 2 10 9 8 9
 */