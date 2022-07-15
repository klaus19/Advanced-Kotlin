package function



infix fun String.shouldBeEqualsTo(value:String)=this==value

fun main(){

    "Hello".shouldBeEqualsTo("Hello")

    "Hello" shouldBeEqualsTo "Hello"

}