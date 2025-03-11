// Kotlin practice concepts, Basic to Advanced
/*
WhenConditional.kt

  A program that executes a "when" print statement: an alternative to if-else
  statements.
*/

fun main() {
    var season = "Fall"
    // Code logic
    when (season) {
        "Winter" -> println("During $season, Grow Kale.")
        "Spring" -> println("During $season, Grow Lettuce.")
        "Summer" -> println("During $season, Grow corn.")
        "Fall" -> println("During $season, Grow Pumpkins.")
        else -> println("$season is not a valid season.")
    }
}