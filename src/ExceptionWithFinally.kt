// When an exception is not caught, it ends the program. As a result, there is printed information about this exception.

// fun someFunction() {
// throw Throwable("Some error")
//println("Will not be printed")
//}
//
//fun main() {
// try {
//someFunction()
//println("Will not be printed")
// } finally {
//println("Finally block was called") // Finally block was called
//  }
//println("Will not be printed")
//}

fun someFunctions() {
    println("Will be printed") // Will be printed
}

fun main() {
   try {
        someFunctions()
        println("Will be printed") // Will be printed
       } finally {
        println("Finally block was called") // Finally block was called
        }
    println("Will be printed") // Will be printed
}