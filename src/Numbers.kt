fun main() {


    val a = 10 // the type of is Int
    val b = 2147483647L // the type of b is Long
    val c = 10.0 // the type of c is Double
    val d = 10F // the type of d is Float

    val smallDebt = -0.72
    println(smallDebt) // -0.72
    val million = 1_000_000
    println(million) // 1000000

    val i: Int = 10
    val l: Long = i.toLong()
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()
    println(d1) // 10.0
    println(d2) // 10.0

    println(2 + 3) // 5
    println(2 - 3) // -1
    println(2 * 3) // 6
    println(8 / 2) // 4

    println(0.5 * 4.5) // 2.25
    println(2.5 / 0.5) // 5.0

    println(10 % 3) // 1
    println(11 % 3) // 2
    println(12 % 3) // 0
    println(13 % 3) // 1

    // The sign of the result is always the same as the sign of the left side
    println(-1 % 3) // -1
    println(1 % -3) // 1
    println(5 % -3) // -1

    val m = 1 + 2L // the type of is Long
    val n = 1 + 2.0 // the type of b is Double
    val x = 1.0F + 2 // the type of c is Float
    val y = 1.0F + 2.0 // the type of c is Double

    val a1 = 5
    val b1 = 2
    println(a1 / b1) // 2
    println(a.toDouble() / b1) // 2.5

    // Precedence
    println(1 + 2 * 3) // gives a result of 7

    println((1 + 2) * 3) // gives a result of 9

    // Augmented assignments

    var a2 = 10
    println(a2) // 10
    a2 = 20
    println(a2) // 20

    var a3 = 10
    println(a3) // 10
    a3 = a3 + 10
    println(a3) // 20
    a3 = a3 + 10
    println(a3) // 30

    var a4 = 10
    println(a4) // 10
    a4 += 10
    println(a4) // 20
    a4 += 10
    println(a4) // 30

    var a5 = 10
    println(a5) // 10
    a5 *= 3
    println(a5) // 30
    a5 -= 12
    println(a5) // 18
    a5 /= 3
    println(a5) // 6
    a5 %= 4
    println(a5) // 2

    var a6 = 10
    println(a6) // 10
    a6++
    println(a6) // 11
    a6--
    println(a6) // 10
}