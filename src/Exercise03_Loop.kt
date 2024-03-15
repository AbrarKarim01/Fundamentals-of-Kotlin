fun main(){
    // Task 1
    println("Task 1")
    for (i in 1 .. 5){ // Step 1; lines of the shape
        val numberOfSpaces = i - 1 // Step 2; calculate the space for each line first

        for (j in 1 .. numberOfSpaces){ // Step 3; printing the space for each line at first
            print(" ") // Step 4; printing the space
        }
        val numberOfStars = 6 - i // Step 5; num of stars a line should have
        for (j in 1 .. numberOfStars){ // Step 6; printing stars in each line
            print("*") // Step 7
        }
        println() // Step 8; printing a new line
    }

    // Task 2
    println("Task 2")
    for (i in 1 .. 5){
        val spaceNumbers = i - 1
        for (j in 1 .. spaceNumbers){
            print(" ")
        }
        val starsNumber = 11 - 2 * i
        for (j in 1 .. starsNumber){
            print("*")
        }
        println()
    }

    // Task 3
    println("Task 3")
    for (i in 1 ..  5){
        val numOfSpace = 5 - i
        for (j in 1 .. numOfSpace) {
            print(" ")
        }
        val numOfStars = i
        for (j in 1 .. numOfStars) {
            print("*")
        }
        println()
    }
    for (i in 1 .. 4){
        val numOfSpace = i
        for (j in 1 .. numOfSpace){
            print(" ")
        }
        val numOfStars = 5 - i
        for (j in 1 .. numOfStars){
            print("*")
        }
        println()
    }
}