import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/7IquVhbHU
fun main() {
    val scope = CoroutineScope(EmptyCoroutineContext)

    println("start Job")

    val job = scope.launch {
		delay(1000)
        println("launch job 1")
    }
    Thread.sleep(500)
    val job2 = scope.launch() {
        job.join() // job1が終わってから実行
        println("launch job 2")
    }
    Thread.sleep(1000)

    println("end Job")

    // exp
    // start Job
    // launch job 1
    // launch job 2
    // end Job
}
