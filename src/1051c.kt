import java.util.*
import kotlin.collections.HashMap

fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)
    val map = HashMap<Int, Int>()
    for (i in 0 until n){
        val temp = scanner.nextInt()
        if(map[temp] == null){
            map[temp] = 1
        } else {
            map[temp] = map[temp]!!.inc()
        }
        arr[i] = temp
    }
    var solo = 0
    var sup = 0
    for(t in map.values){
        if(t > 2){
            sup++
        } else if (t == 1){
            solo++
        }
    }
    if (solo % 2 == 1 && sup == 0){
        print("NO")
    } else if(solo == 0){
        println("YES")
        for (i in 0 until n){
            if(map[arr[i]] != 1){
                print("A")
            }
        }
    } else {
        println("YES")
        var flag = true
        if (solo % 2 == 1){
            var temp_flag = true
            for (i in 0 until n){
                if(map[arr[i]] != 1){
                    if(map[arr[i]] != 2) {
                        if (temp_flag) print('B') else print('A')
                        temp_flag = false
                    } else {
                        print('A')
                    }
                } else {
                    if(flag) print('A') else print('B')
                    flag = !flag
                }
            }
        } else {
            for (i in 0 until n){
                if(map[arr[i]] != 1){
                    print("A")
                } else {
                    if(flag) print('A') else print('B')
                    flag = !flag
                }
            }
        }
    }

}