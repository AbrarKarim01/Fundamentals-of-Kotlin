fun main(){

    // Its structure is the same, except for using the while keyword instead of if. In both cases, if the predicate returns false, the body is never executed.
    while (false) {
        println("Will not be printed")
    }
    if (false) {
        println("Will not be printed")
    }

    // Starting with a code that prints its body just once.
     var toBePrinted = true
     while (toBePrinted) {
        println("Will be printed once")
        toBePrinted = false
     }

    // Here is a code that calls its body for numbers from 0 to 2.
    var printedTimes = 0
    while (printedTimes <= 2) {
        println("Line $printedTimes");
        printedTimes += 1
        // or
        // printedTimes = printedTimes + 1
    }

    // Mathematical Sequence
    // The loop should only work when the current number is smaller than 100.
    // Inside the body, you will print the current number and then add 7 to its value.
    var num = 0
    while (num < 100) {
        println(num)
        num += 7 // or num = num + 7
    }

    // start with a variable with an initial value of 1,
    // write a while loop with a condition that the number is smaller than 100, and double the current number inside the while loop's body.
    var num1 = 1
    while (num1 <= 100) {
        println(num1)
        num1 *= 2 // or num = num * 2
    }

    //  print the square of each of them. The predicate will stop the loop when the square is larger than 100.
    var i = 1
    while (i * i <= 100) {
        println(i * i)
        i++
        // or i += 1
        // or i = i + 1
    }
}