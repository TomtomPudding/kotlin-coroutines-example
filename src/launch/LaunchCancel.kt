import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/MzmtXguDt
fun main() {
    val scope = CoroutineScope(EmptyCoroutineContext)

    println("start Job")

    val job = scope.launch {
		delay(1000)
        println("launch job 1")
    }
    job.cancel()
    Thread.sleep(1000)

    println("end Job")

    // exp
    // start Job
    // end Job
}
