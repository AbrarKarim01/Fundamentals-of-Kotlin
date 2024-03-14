fun main(){

    var cookiePolicyAccepted: Boolean = true

    // Numerical Boolean Operations
    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" != "A") // false
    println("A" != "B") // true
    println(10 != 10) // false
    println(20 != 10) // true

    println(10 > 10) // false
    println(20 > 10) // true
    println(10 > 20) // false

    println(10 < 10) // false
    println(20 < 10) // false
    println(10 < 20) // true

    println(10 >= 10) // true
    println(20 >= 10) // true
    println(10 >= 20) // false

    println(10 <= 10) // true
    println(20 <= 10) // false
    println(10 <= 20) // true

    // Logical Operations

    // for and (&&) operations
    val finishedHomework = false // or true
    val cleanedRoom = true // or false
    val canPlayGames = finishedHomework && cleanedRoom
    println(canPlayGames)

    print(true && true)  // true
    print(true && false)  // false
    print(false && true)  // false
    print(false && false)  // false

    val haveTime = true
    val isResponsible = false
    val canHavePuppy = isResponsible && haveTime
    print(canHavePuppy) // false

    val percent = 47
    val correct = percent >= 0 && percent <= 100
    println(correct) // true

    // for or (||) operations
    val carCleaned = false // or true
    val grassCut = true // or false
    val canGoToCinema = carCleaned || grassCut
    println(canGoToCinema)

    print(true || true)  // true
    print(true || false)  // true
    print(false || true)  // true
    print(false || false)  // false

    val behavedWell = false // or true
    val cleanRoom = false // or true
    val canEatChocolate = behavedWell || cleanRoom
    println(canEatChocolate)

    val percentage = 47
    val incorrect = percentage < 0 || percentage > 100
    println(incorrect) // true

    // for not (!) operations
    println(!true) // false
    println(!false) // true

    val isAmazing = true
    print(!isAmazing) // false

    val isBoring = false
    print(!isBoring) // true

    val positive = 1
    print(-positive) // -1

    val negative = -1
    print(-negative) // 1

    println(!true) // false
    println(!!true) // true
    println(!!!true) // false
    println(!!!!true) // true
    println(!!!!!true) // false

    val failedMathExam = true
    val roomCleaned = true
    val canPlayGame = !failedMathExam && roomCleaned
    println(canPlayGame) // false

    println(!true && false) // false
    println(!(true && false)) // true
    println(-10 + 20) // 10
    println(-(10 + 20)) // -30

}