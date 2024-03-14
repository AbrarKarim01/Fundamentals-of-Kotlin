fun main(){

    var myChar1: Char = 'A'
    val myString1 = "Hello"

    // Using triple quotes for multiple lines
    val myString2 = """Hello
    This is a String. 
    It is on multiple lines. 
    """

    val age = 70
    val myString3 = "My age is $age"

    // Converting a char to String
    val myChar2: Char = 'a'
    val myString = myChar2.toString()

    val myString4 = "Hello"
    //myString is still Hello after this operation.
    val myLongStrong = myString4 + " World"

    var s1 = "Hello"
    val s2 = s1 // s1 and s2 now point at the same string - "Hello"
    println(s1) // prints "Hello"
    println(s2) // prints "Hello"
    s1 += "world" // append "world" to s1
    println(s1) // prints "Hello world"
    println(s2) // still prints "Hello" because s2 still points to the String "Hello" while s1 is a new String object

    val myString5 = "Hello"
    val myStringLength = myString5.length // length of the string

    val myString6 = "Hello"
    val startsWithHel = myString6.startsWith("Hel") // if the string stars with 'hel' gives True result; otherwise False

    val myString7 = "Hello"
    val endsWithLo = myString7.endsWith("lo") // if the string ends with 'lo' gives True result; otherwise False

    val myString8 = "Hello"
    val firstChar = myString8.first() // Get the first character

    val myString9 = "Hello"
    val lastChar = myString9.last() // get the last character

    val myString10 = "Hello"
    val equalsHello = myString10.equals("Hello") // if equal to then True otherwise False

    // Manipulating Strings
    // Converting string to Uppercase
    val myString11 = "Hello"
    val myUpperString = myString11.uppercase()

    // Converting string to Lowercase
    val myString12 = "Hello"
    val myLowerString = myString12.lowercase()

    // Cutting the string from index; Counting starts at zero. myString2 will have the value ello.
    val myString13 = "Hello"
    val myString14 = myString.substring(1)

}