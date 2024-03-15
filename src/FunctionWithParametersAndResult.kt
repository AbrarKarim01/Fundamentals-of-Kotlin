// Example 1
// *
// **
// ***
// ****
// *****
fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

// Example 2
fun ascendingTriangle(height: Int) {
    for (stars in 1..height) {
        printStars(stars)
    }
}
fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars(stars)
    }
}
fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

// Example 3
// Functions with Return
fun triangleArea(width: Double, height: Double): Double {
    // Single-expression functions
    // can also be written as; fun triangleArea(width: Double, height: Double): Double = width * height / 2
    return width * height / 2 // Single-expression function
}

// Example 4
fun biggerOf(a: Int, b: Int): Int {
    // Single-expression functions
    // can also be written as; fun biggerOf(a: Int, b: Int): Int = if (a > b) a else b
    if (a > b) { // For using Single-expression function; return if (a > b) a else b
        return a
    } else {
        return b
    }
}


// Main Function for all examples
fun main() {

    // Example 1
    val height = 5
    for (i in 1..height) {
        printStars(i)
    }

    // Example 2
    println("Ascending triangle:")
    ascendingTriangle(5)
    println("Descending triangle:")
    descendingTriangle(5)
    println("Isosceles triangle:")
    isoscelesTriangle(5)

    // Example 3
    val area: Double = triangleArea(1.0, 2.0)
    println(area) // 1.0
    println(triangleArea(2.0, 2.0)) // 2.0
    println(triangleArea(5.0, 5.0)) // 12.5
    println(triangleArea(10.0, 20.0)) // 100.0

    // Example 4
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20




}