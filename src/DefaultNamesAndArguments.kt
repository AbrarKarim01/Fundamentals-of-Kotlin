// Default Arguments
// Example 1
// function to open a web browser.
// However, browsers can be opened in normal or incognito mode, so, in function definition,
// should have a parameter that specifies which mode should be used.
fun openBrowser(url: String, incognitoMode: Boolean) { // can be defined Boolean = false

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")
    // ...
}

// Named Arguments
// Example 2
fun cheer(how: String = "Hello, ", who: String = "World") {

    print("$how $who")
}


// Usage
fun main() {
    // Example 1
    openBrowser("website1.com", false) // Opening website1.com; // do not need to mention false if Boolean = false defined in the fun parameter
    openBrowser("website2.com", false) // Opening website2.com; // do not need to mention false if Boolean = false defined in the fun parameter
    openBrowser("website3.com", true) // Opening website3.com in incognito mode

    // Example 2
    cheer(how = "Hi ") // Hi World
    cheer(who = "Learner") // Hello, Learner
    cheer(how = "Hi ", who = "Learner") // Hi Learner
    cheer(who = "Learner", how = "Hi ") // Hi Learner

}