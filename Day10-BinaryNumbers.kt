import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n = scan.nextLine().trim().toInt()
    var remainder: Int
    var count = 0
    var result = 0


    while(n > 0) {
        remainder = n % 2
        n = n / 2

        if(remainder == 1) {

            count = count.plus(1)

            if(count > result || count == result) {
                result = count
            }

        } else {
            count = 0
        }   
    }

    System.out.println(result)

}