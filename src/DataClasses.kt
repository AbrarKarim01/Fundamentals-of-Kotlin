// Example 2
class Bird (
    val name: String
)

// Example 3 using data class to solve example 2 issue
data class Snake(val name: String)

fun main(){
    // Example 1
    println("A"=="A") // true
    println("A"=="B") // False

    // Example 2
    val pluto01 = Bird("Pluto")
    val pluto02 = Bird("Pluto")

    println(pluto01 == pluto02) // False
    println(pluto01 == pluto01) // True
    // Comparing the object withing same object returning true; comparing objects withing same value returning false
    println(pluto01) // Dog@404b9385
    println("Dog: $pluto01") // Dog: Dog@404b9385

    // Example 3
    val pluto1 = Snake("Hish")
    val pluto2 = Snake("Hish")

    println(pluto1 == pluto2)// True; solving the issue of example 2
    println(pluto1) // Snake(name=Hish)
    println("Snake: $pluto1") // Snake: Snake(name=Hish)

}
// Data Class can be destructured
// data class Dog(
// val name: String,
// val age: Int
// )
//
// fun main() {
// val dog = Dog("Pluto", 7)
// val (age, name) = dog
// println(age) // Pluto
// println(name) // 7
// }

// Preventing Destructure Using copy()
// data class Dog(
// val name: String,
// val age: Int
// )
//
// fun main() {
// println(dog.copy()) // Dog(name=Pluto, age=7)
// println(dog.copy(age = 8)) // Dog(name=Pluto, age=8)
// println(dog.copy(name = "Neptune")) // Dog(name=Neptune, age=7)
// }