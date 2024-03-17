// Example 2
open class Rep (open val name: String)

class Turtle (override val name: String): Rep(name)

fun main(){
    val lab = Turtle("Chew Chew")
    println(lab.name) // Chew Chew
}

// Example 4 (Easier)
// open class Rep(val name: String)
//
//class Turtle(name: String) : Rep(name)
//
//fun main() {
//    val lab = Turtle("Chew Chew")
//    println(lab.name) // Coco
//}