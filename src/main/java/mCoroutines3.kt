import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

typealias Millis = Long

val number = AtomicInteger()

fun main(args: Array<String>) {
    val time: Millis = measureTimeMillis {
//        increaseWithThreads()
        increaseWithCorountines()
    }
    println("time: $time")
    println("result: $number")
}

private fun increaseWithThreads() {
    val threads = List(10_000) {
        thread {
            increaseAndPrint()
        }
    }

    threads.forEach { it.join() }
}

private fun increaseWithCorountines() {
    val jobs = List(10_000) {
        launch {
//            delay(1000)
            increaseAndPrint()
        }
    }

    runBlocking {
        jobs.forEach { it.join() }
    }
}

private fun increaseAndPrint() {
    val currentResult = number.addAndGet(1)
    println(currentResult)
}