// Example 1

class MyError: Throwable("Some Text")

fun someFunction(){
    throw MyError()
    println("Will not be printed")
}

fun main(){
    try {
        someFunction()
        println("Will not be Printed")
    }catch (e: Throwable){
        println("Caught $e") // Caught MyError: Some message
    }
}