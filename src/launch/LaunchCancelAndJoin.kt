import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/yS8wYVvYY
fun main() {
    val scope = CoroutineScope(EmptyCoroutineContext)

    println("start Job")

    val job = scope.launch {
        repeat(100) {
            delay(500)
	        println("launch job count $it")
        }
    }
    Thread.sleep(1600)
    runBlocking() {
        job.cancelAndJoin()
    }
    // 停止確認用
    Thread.sleep(1000)

    println("end Job")

    // exp
    // start Job
    // launch job count 0
    // launch job count 1
    // launch job count 2
    // end Job
}
