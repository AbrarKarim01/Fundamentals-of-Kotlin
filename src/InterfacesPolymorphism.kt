// A class Dog, also created a type called Dog, which is a group that accepts only objects created using the Dog class.
interface  Animal
class dog : Animal

fun main(){
    // Example 1
    val Dog: dog = dog()
    val animal: Animal = Dog
    // val Dog2: dog =  animal error!

    // Example 2
    val i: Int = 120
    val l: Long = 1234567890L
    val d: Double = 10.0
    consumeAny(i) // upcasting Int to Any
    consumeAny(l) // upcasting Long to Any
    consumeAny(d) // upcasting Double to Any
    consumeNumber(i) // upcasting Int to Number
    consumeNumber(l) // upcasting Long to Number
    consumeNumber(d) // upcasting Double to Number
}

// Upcasting
// Example 2
fun consumeAny(any: Any) {}
fun consumeNumber(number: Number) {}

