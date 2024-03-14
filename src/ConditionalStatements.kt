fun main(){
    // If-else
    val finishedHomework1 = true
    if (finishedHomework1) {
        println("Can go to the cinema")
    }

    val finishedHomework2 = true
    if (finishedHomework2) {
        println("Can go to the cinema")
    } else {
        println("Cannot go to the cinema")
    }

    val i = 1 // or 5
    if (i < 3) {
        println("Smaller")
    } else {
        println("Bigger")
    }
    // Prints Smaller if i == 1, or Bigger if i == 5

    //  return a value that can be stored in a variable; here saving in tip1
    val haveSomeExtraMoney1 = true
    val tip1: Double =
        if (haveSomeExtraMoney1) {
            10.0
        } else {
            0.0
        }
    println(tip1) // 10.0

    val haveSomeExtraMoney2 = true
    val tip2: Double =
        if (haveSomeExtraMoney2) {
            println("Here you go") // Here you go
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip2) // 10.0

    // if you have only one expression in your body, you can skip braces
    val haveSomeExtraMoney = true
    val tip: Double = if (haveSomeExtraMoney) 10.0 else 0.0
    println(tip) // 10.0

    // If-else-if

    println("Is it going to rain?")
    val probability = 70
    if (probability <= 40) {
        println("Unlikely")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("What?")
    }


}