fun main() {

    // Task 1
    // 1.
    val weekday = "Friday"
    // 2.
    println("On $weekday, the opening hours are:")
    // 3.
    if (weekday == "Monday") {
        println("8 AM to 12 PM")
    } else if (weekday == "Tuesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Wednesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Thursday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Thursday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Friday") {
        println("8 AM to 9 PM")
    } else if (weekday == "Saturday") {
        println("9 AM to 4 PM")
    } else if (weekday == "Sunday") {
        println("9 AM to 4 PM")
    }


    // Task 2

    val hour = 20

    val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday" -> hour >= 8 && hour <= 18
        "Wednesday" -> hour >= 8 && hour <= 18
        "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 8 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }
    if (isOpen){
        println("Little Lemon is open now")
    }
    else{
        println("Little Lemon is close now")
    }
}