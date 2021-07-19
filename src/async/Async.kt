import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/MmTMiSbNV
fun main() {
    val scope = CoroutineScope(EmptyCoroutineContext)
    println("start Job")

    val async1 = scope.async {
        "async value 1"
    }

    runBlocking {
    	val asyncValue1 = async1.await()
	    println(asyncValue1)
    }
    println("end Job")

    // exp
    // start Job
    // async value 1
    // end Job
}
