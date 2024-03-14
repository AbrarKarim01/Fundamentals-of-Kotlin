fun main(){

    val a = 0
    val b = 5
    for (i in a..b) {
        println(i)
    }

    // excluding b, use a range a until b inside a for-loop.
    // The following code block should print the numbers 0, 1, 2, 3 and 4.
    val a1 = 0
    val b2 = 5
    for (i in a1 until b2) {
        println(i)
    }

    // use a downTo b inside a for-loop.
    // The below code should print the numbers 5, 4, 3, 2, 1 and 0.
    val a3 = 5
    val b3 = 0
    for (i in a3 downTo b3) {
        println(i)
    }

    //  with a step c, use a..b step c inside a for-loop.
    //  The code below should print the numbers 0, 3, 6 and 9.
    val a4 = 0
    val b4 = 10
    val c = 3
    for (i in a4..b4 step c) {
        println(i)
    }

    // use a until b step c inside a for-loop.
    // The below code should print the numbers 0, 3 and 6.
    val a5 = 0
    val b5 = 9
    val c1 = 3
    for (i in a5 until b5 step c1) {
        println(i)
    }

    val a6 = 10
    val b6 = 1
    val c2 = 3
    for (i in a6 downTo b6 step c2) {
        println(i)
    }

    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")

}