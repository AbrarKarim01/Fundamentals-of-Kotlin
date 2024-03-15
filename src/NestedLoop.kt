fun main(){

    for (i in 1 .. 5){ // with .. defining the range; indicates the row
        for (j in 1 .. i){ // indicates how many '*' will be printed in the row
            print("*") // print() will display in the quotation
        }
        println() // will print a new line
    }

    // Parametrizing a triangle
    println("Parametrizing a triangle")
    val height = 10

    for (i in 1 .. height){
        for (j in 1 .. i){
            print("*")
        }
        println()
    }

    // downTO function
    // without using downTo function
    println("Without downTo")
    for (i in 1 .. 5){
        val numberofStars = 6 - i
        for (j in 1 .. numberofStars){
            print("*")
        }
        println()
    }
    // Using downTo function
    println("With downTo")
    for (i in 5 downTo 1){
        for (j in 1 .. i){
            print("*")
        }
        println()
    }

    // Parametrizing a triangle while using downTo function
    println("Parametrizing a triangle while using downTo function")
    val height1 = 10
    for (numberOfStars in height1 downTo 1) {
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    // Other pattern
    //println("*\n" +
    //       "***\n" +
    //        "*****\n" +
    //        "***\n" +
    //        "*")
    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    //    *
    //   **
    //  ***
    // ****
    //*****
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    //    *
    //   ***
    //  *****
    // *******
    //*********
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

}