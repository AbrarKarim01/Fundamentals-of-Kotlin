// Receiver
class Dog(val name: String) {

    var hunger = 62

    fun feed() { // fun feed(dog: Dog)

        println("Feeding $name")

        hunger = 0

        //     println("Feeding ${dog.name}")
        //
        //    dog.hunger = 0
    }
}

// Example 2
// the object of their class is passed to their body.
// It is called a receiver.
// It can be accessed using this keyword, also known as receiver reference.
class anotherDog(val name: String) {

    var hunger = 62

    fun feed() {

        val currentDog: anotherDog = this

        println("Feeding ${currentDog.name}")

        currentDog.hunger = 0
        this.hunger = 0
    }
}

// Example 3
class User(var name: String) {

    fun changeName(name: String) {

        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}
fun main() {
    // Example 1
    val dog = Dog("Rex")

    dog.feed() // Feeding Rex
    //  feed(dog) // Feeding Rex

    // Example 2
    val anotherDog = Dog("Rex")

    dog.feed() // Feeding Rex

    //Example 3
    val user = User("Alpha") // Changed name from Alpha to Beta

    user.changeName("Beta") // Beta

    println(user.name)

    // Methods on String
    // Example 4
    val text = "Some Text"

    println(text.uppercase()) // SOME TEXT

    println(text.lowercase()) // some text

    println(text.replace("Text", "NewText")) // Some NewText

    println("A B A C".replace("A", "G")) // // G B G C

    // Conversion methods
    // Example 5
    val i: Int = 10

    val l: Long = i.toLong()

    val f1: Float = i.toFloat()

    val f2: Float = l.toFloat()

    println(f1) // 10.0

    println(f2) // 10.0
}