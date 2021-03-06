package function

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch {
        doWorld()
    }
    println("Hello")
}

//this is your first suspend function
suspend fun doWorld() {
    delay(1000)
    println("world")
}
