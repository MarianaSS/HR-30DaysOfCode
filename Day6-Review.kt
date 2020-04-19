import java.io.*
import java.util.*

val scan = Scanner(System.`in`)

fun main(args: Array<String>) {

    var T = scan.nextLine().trim().toInt()

    while (T > 0) {
        var str = scan.nextLine()

        for(j in 0..str.length-1) {
            if (j % 2 == 0) {
                print(str.get(j))
            }
        }

        print(" ")

        for(j in 0..str.length-1) {
            if (j % 2 != 0) {
                print(str.get(j))
            }
        }

        T--
        
        println()
    }
}
    