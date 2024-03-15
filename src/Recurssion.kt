// Example 1
fun factorial(number: Int): Int {

    if (number <= 1) {
        return 1
    }
    return factorial(number - 1) * number
}

// Recursion for 3!
// factorial(3) 
// (factorial(2) * 3) ->
// ((factorial(1) * 2) * 3) ->
// ((1 * 2) * 3) ->
// (2 * 3) ->
// 6

fun main() {
    // Example 1
    println(factorial(1)) // 1
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720
}