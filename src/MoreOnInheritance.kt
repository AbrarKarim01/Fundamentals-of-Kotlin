// Example 1
open class Reptile(val breed: String)

class turtle (val name: String): Reptile("Reptile Wake") // Here we call animal's constructor

fun main(){
    val lab = turtle("Chew Chew")
    println(lab.name) // Chew Chew
    println(lab.breed) // Reptile Wake; Here is the inheritance

}