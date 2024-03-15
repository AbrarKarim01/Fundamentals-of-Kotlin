// Variable scope
// Example 1
fun f1() {
    val a = "Text 1"
    println(a) // can use a here
    // here, I cannot use b
}

fun f2() {
    val b = "Text 2"
    // f2() can not a function within its own function
    println(b) // can use b here
    // here, I cannot use a
}

// Example 2
var name = "" // can use by multiple function; assign them in outer function body

fun setName() { // for setting the name
    name = "Mike"
}

fun printName() { // for printing the name
    println(name)
}

// Local Functions

// Example 3
fun b() {
    // here I cannot use function a
}
fun c() {
    // here I cannot use function a
}

// Main Function for all the examples
fun main() {

    f2() // Example 1
    // here, I cannot neither use a or b


    // Example 2
    setName() // calling the function for setting the name
    printName() // calling the function for printing the name


    // Example 3
    // here I cannot use function a
    fun a() {
        println("A")
    }
    a() // Here I can use function a
    b()
    c()
    a() // Here I can use function a
}