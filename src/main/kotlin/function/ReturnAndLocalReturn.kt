package function


fun <T>Iterable<T>.myForEach(action:(T)->Unit):Unit{
    for (element in this)action(element)
}
fun containingFunction(){

    val numbers = 1..100
    numbers.myForEach myLabel@ {
        if (it%5==0){
            return@myLabel
        }
    }

    println("Hello!")
}

fun main(){

    containingFunction()

}