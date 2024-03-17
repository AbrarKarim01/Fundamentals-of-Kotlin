// Example 1
// In the example below,
// Dog is a subclass of Mammal, or Mammal is a superclass of Dog.
// It is also called a parent-child relationship,
// so Dog is a child of Mammal,
// and Mammal is a parent of Dog.
open class Mammal {
    fun feedChildren() {}
}
class Dogs: Mammal() {
    fun fetchStick() {}
}

fun feed(mammal: Mammal){
    mammal.feedChildren()
}

// Example 2
//class Dog(val name: String)
fun main(){
    // Example 1
    val dog = Dogs()
    dog.feedChildren()
    dog.fetchStick()
    feed(dog)

    // Example 2
    // Calling a superclass constructor
    //val dog = Dogs("Rex") // some string must be here
    //println(dog.name) // Rex


}
