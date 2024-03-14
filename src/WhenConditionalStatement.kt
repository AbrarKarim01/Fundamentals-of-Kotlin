fun main(){
    // When Statement
    println("Is it going to rain?")
    val probability = 70
     when {
         probability < 40 -> {
         println("Unlikely")
         }
         probability <= 80 -> {
         println("Likely")
         }
         probability < 100 -> {
         println("Yes")
         }
         else -> {
         println("What?")
         }
     }

    //Just like in an if statement, braces are needed only for bodies with more than one statement.
    // If there is only one statement in a body, you can leave out the braces
    println("Is it going to rain?")
    val probability1 = 70
     when {
         probability1 < 40 -> println("Unlikely")
         probability1 <= 80 -> println("Likely")
         probability1 < 100 -> println("Yes")
         else -> println("What?")
         }


    // Using when as an expression
    println("Is it going to rain?")
    val probability2 = 70
    val text = when {
             probability2 < 40 -> "Unlikely"
             probability2 <= 80 -> "Likely"
             probability2 < 100 -> "Yes"
             else -> "What?"
             }
    println(text)


    // When with a value
    val number = 1 // or 2, 3, 4, 5, 6
     when (number) {
         1 -> {
        println("Missed hit")
         }
         2, 3, 4, 5 -> {
        println("Hit with value $number")
         }
         6 -> {
        println("Critical hit")
         }
     }

    val number1 = 1 // or 2, 3, 4, 5, 6
    val text1 = when (number1) {
             1 -> "Missed hit"
             2, 3, 4, 5 -> "Hit with value $number1"
             6 -> "Critical hit"
             else -> "Unsupported value"
    }
    println(text1)

    // Using ranges in when statements
    val number2 = 1 // or 2, 3, 4, 5, 6
    val text2 = when (number2) {
             1 -> "Missed hit"
             in 2..5 -> "Hit with value $number2"
             6 -> "Critical hit"
             else -> "Unsupported value"
    }
    println(text2)

    // Type check
    var value = "ABC"

    println(value is String) // true
    // println(value is Int) // false
    // println(value is Boolean) // false
    println(value is Any) // true

    // value = 123

    println(value is String) // false
    // println(value is Int) // true
    // println(value is Boolean) // false
    println(value is Any) // true


    val something: Any = "ABC" // or 123, 0.1, true
     when (something) {
         is String -> println("This is String")
         is Int -> println("This is Int")
         is Double -> println("This is Double")
         is Boolean -> println("This is Boolean")
     }
    println(something)

}