import kotlin.coroutines.*
import kotlinx.coroutines.*

// https://pl.kotl.in/2oVGIZGzR
fun main() {
    val scope = CoroutineScope(EmptyCoroutineContext)

    println("start Job")
    // コルーチン
    // response Job
    val job = scope.launch {
        // 実行の期待値固定化のため
        delay(1000)
        println("launch")
    }

    println("end Job")

    // exp
    // start Job
    // end Job
}
