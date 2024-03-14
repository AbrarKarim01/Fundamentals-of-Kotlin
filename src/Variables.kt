fun main(){

    var a = 10
    var b = a
    a = 20
    //Changing a does not change b
    println("Value of B: $b") // 10

    // ERROR! val cannot be reassigned
    val value = "A"
    // value = "B"

    // OK! var can be assigned
    var variable = "A"
    variable = "B"

    var str1 = "ABC" // The type of str is String
    str1 = "XYZ"
    // str1 = 42 // ERROR! Int value cannot be assigned to a variable of type String
    // str1 = true // ERROR! Boolean value cannot be assigned to a variable of type String

    // To specify the type, you use a colon and the name of the required type after the variable name.
    var str2: String = "ABC"
    str2 = "XYZ"

    val age: String = "" + 42 + "!"
    println(age)

    //  if you define a variable x with type any, you can assign to it any value you’ve learned about so far.
    var x: Any = "ABC"
    println(x) // ABC
    x = 123
    println(x) // 123
    x = true
    println(x) // true

}