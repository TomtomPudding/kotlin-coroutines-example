import kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun flowTask() = flow<String> {
    repeat(5) {
        emit("${it + 1}回目: flow task")
    }
}

fun main() {

    println("start Job")

    val flowRes = flowTask()

    runBlocking {
        val flowStr = flowRes.reduce { accumulator, value ->
            accumulator + ("\n" + value)
        }
        println(flowStr)
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
