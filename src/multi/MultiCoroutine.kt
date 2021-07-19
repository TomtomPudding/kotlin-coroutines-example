import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/t4LbXdIPY
fun main() {
    val startTime = System.currentTimeMillis()
    println("start Job")

    repeat(3) {
        println(task(it + 1))
    }
    val endTime = System.currentTimeMillis()
    println("実行時間: ${endTime - startTime} ms")
    println("end Job")

    // exp
    // start Job
    // 1回目:Task1,Task2
    // 2回目:Task1,Task2
    // 3回目:Task1,Task2
    // 実行時間: 1604 ms
    // end Job
}

fun task(num: Int): String = runBlocking {
    val asyncTask1 = async {
        delay(500)
        "Task1"
    }
    val asyncTask2 = async {
        delay(500)
        "Task2"
    }
    print("${num}回目:")
    listOf(asyncTask1.await(), asyncTask2.await()).joinToString(",")
}
