// Kotlin Practice, Beginner to Advanced Topics
/*
    Date Output.kt
    ----------------------------------------------
    A simple print statement for the current day,
    displays a string output with values using the
    string interpolation symbol $
*/

fun main() {
    // Write your code below
    var todaysDay: Int = 1
    var todaysMonth: Int = 9
    var todaysYear: Int = 2025

    /* String interpolation - insert var values into string statements with $  */
    val todaysDate: String = "$todaysDay/$todaysMonth/$todaysYear"

    println(todaysDate)
}
