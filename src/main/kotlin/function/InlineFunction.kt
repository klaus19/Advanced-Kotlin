package function



fun operation( op:()->Unit){

    println("Before calling op()")
     op()
    println("After calling op()")

}

fun main(){
    operation {

        println("This is actual op()")

    }

}