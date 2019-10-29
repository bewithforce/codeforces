import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val l = scanner.nextLong().toString(2)
    val r = scanner.nextLong().toString(2)

    val diff = r.length - l.length
    var max = StringBuilder("")
    var flag = false

    if(diff > 0){
        for(i in 1..diff)
            max.append("1")
        flag = true
    }

    for(i in l.indices){
        if(flag){
            for(j in i + 1..l.length)
                max.append("1")
            break
        }
        if(l[i] != r[i + diff]){
            if(l[i] == '1')
                continue
            max = StringBuilder("1")
            flag = true
        }
    }
    if(!flag){
        max = StringBuilder("0")
    }
    print(max.toString().toLong(2))

}