import kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

// https://pl.kotl.in/qmeA_5vOA
fun main() {
    val channel = Channel<String>()
    println("start Job")

    runBlocking {
        launch {
            repeat(5) {
                channel.send("${it + 1}回目: channel task")
            }
        }
        repeat(5) {
            val story = channel.receive()
            println(story)
        }
    }

    println("end Job")

    // exp
    // start Job
    // 1回目: channel task
    // 2回目: channel task
    // 3回目: channel task
    // 4回目: channel task
    // 5回目: channel task
    // end Job
}
