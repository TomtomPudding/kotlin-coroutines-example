import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/lNz6ZQfvF
fun main() {
    println("start Job")

    val runBlockingValue1 = runBlocking {
        "runBlockingValue1"
    }
    println(runBlockingValue1)

    val runBlockingValue2 = runBlocking {
        "runBlockingValue2"
    }
    println(runBlockingValue2)

    println("end Job")

    // exp
    // start Job
    // runBlockingValue1
    // runBlockingValue2
    // end Job
}
