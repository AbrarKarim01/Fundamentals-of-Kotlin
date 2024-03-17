fun main (){
    // Using Pair(,)

    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A

    val (number, letter) = pair
    // the type of number is double
    // the type of letter is char

    println(number) // 1.0
    println(letter) // A

    // Another way is to use to instead of using Pair(,)
    val pairs = 1.0 to 'A'
    println(pairs.first) // 1.0
    println(pair.second) // A
    val (numbers, letters) = pairs
     // the type of number is Double
     // the type of letter is Char
    println(numbers) // 1.0
    println(letters) // A


    // Also can be used by triple
    //val pair = Triple(1F, "ABC", true)
    //println(pair.first) // 1.0
    //println(pair.second) // ABC
    //println(pair.third) // true
    //val (number, letters, boolean) = pair
    // the type of number is Double
    // the type of letters is Char
    // the type of boolean is Boolean
    //println(number) // 1.0
    //println(letters) // ABC
    //println(boolean) // true
}