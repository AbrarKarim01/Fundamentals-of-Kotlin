// Example 1
interface animal

class dogs (val name: String): animal{

    fun retrieve (item: String){
        println("Retrieving $item")
    }
}
    // Example 1
class cat : animal{
    // Example 4
    fun pet(){
        println("Mrr")
    }
}

    // Example 2
    class cats (val name: String): animal

fun play(animals: animal){
    // Example 1
    val Dog: dogs = animals as dogs // Do that ONLY when you know an object is of the type you are casting
    Dog.retrieve("Stick")

    // Example 3
    if (animals is dogs){
        animals.retrieve("Stick")
    }else{
        println("I do not know how to play with this animal")
    }

    //Example 4
    when (animals){
        is dogs -> animals.retrieve("Stick")
        is cat -> animals.pet()
    }
}

    // Example 2
    fun checkIsDog(animals: animal){
        if (animals is dogs){
            println("It is a Dog")
        }else{
            println("It is not a dog")
        }

    }
fun main (){
    // Example 1
    play(dogs("Rex")) // Retrieving Stick
    //play(cat("Garfield")) // Error!

    // Example 2
    checkIsDog(dogs("Rex")) // It is a dog
    checkIsDog(cats("Garfield")) // It is not a dog

    // Example 4
    play(dogs("Rex")) // Retrieving a stick
    play(cats("Garfield")) // Mrr
}