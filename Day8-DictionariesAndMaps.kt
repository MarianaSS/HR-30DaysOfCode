import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val qtd = scan.nextLine().toInt()
    var map = hashMapOf<String, Int>()
    var name: String

    for (i in 1..qtd) {
        name = scan.next()
        map.put(name, scan.next().toInt())
    }
 
    while(scan.hasNext()) {
        val key = scan.next()
        if(map.containsKey(key)) {
            println(key + "=" + map.get(key))
        } else {
            println("Not found")
        }
    }
}
