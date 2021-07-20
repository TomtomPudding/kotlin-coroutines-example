import kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun flowTask() = flow<String> {
    repeat(5) {
        emit("${it + 1}回目: flow task")
    }
}

// https://pl.kotl.in/28SaYHLoB
fun main() {

    println("start Job")

    val flowRes = flowTask()

    runBlocking {
        // List にすることも可能
        println(flowRes.toList().joinToString("\n"))
    }

    println("end Job")

    // exp
    // start Job
    // 1回目: flow task
    // 2回目: flow task
    // 3回目: flow task
    // 4回目: flow task
    // 5回目: flow task
    // end Job
}
