package function


fun op(x:Int,op:(Int)->Int):Int{
    return op(x)
}


fun main(){


    op(3) { it * it }

    op(2,fun(x):Int{

        if (x>10){
            return 0
        } else{
            return x*x

        }


    })


}