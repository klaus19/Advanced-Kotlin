package function

fun foo(fooParams:String){

    val outerFunction = "value"
    fun bar(barParams:String){

        println(barParams)
        println(fooParams)
        outerFunction


    }
}

fun main(){

    foo("Some value")
    


}