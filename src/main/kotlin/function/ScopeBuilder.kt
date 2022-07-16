package function

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//runBlocking blocks current thread for waiting
fun main() = runBlocking {
    do1World()
}

//it just suspends the underlaying thread...
suspend fun do1World() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}