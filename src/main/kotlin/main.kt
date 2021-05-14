import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {

    val tabla6 = ejercicicio2(10){ Random.nextInt(50..250)}
    tabla6.tabla6.forEach { println(it) }

}