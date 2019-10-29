import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val r = scanner.nextLong().toString(2)
    val l = scanner.nextLong().toString(2)
    var max = ""
    var flag = false
    if(r.length > l.length){
        max.padStart(r.length - l.length, '1')
        flag = true
        max += null
    }
    for(i in l.indices){
        if(flag){
            max.padEnd(l.length - 1, '1')
            break
        }
        if(l[i] != r[i]){
            max = "1"
            flag = true
        }
    }

}