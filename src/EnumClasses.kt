

enum class PizzaSize {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE
}
enum class PizzaSizes(val sizeInCm: Int){
    Small(15),
    Medium(20),
    Large(20),
    EXTRALARGE(30)
}
fun printSize(pizzaSize: PizzaSizes ){

    println("$pizzaSize is ${pizzaSize.sizeInCm}")
}
fun main(){

    printSize(PizzaSizes.Medium) // 20 Cm
    printSize(PizzaSizes.EXTRALARGE) // 30 Cm

}

