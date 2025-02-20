// Kotlin practice concepts, Basic to Advanced
/*
   Mad Libs.kt
   -------------------------------------------------------------------
   A program that asks the user about a vacation trip - asking for several
   inputs and outputting a story.
*/

fun main () {

    val costOfGas = 2.28
    val mileage = 25
    // Declare the variable distance below

    println("What's your name?")
    val name = readLine()
    // Write your code below

    println("What is your friends name?")
    val friendName = readLine()

    println("What is your favorite activity?")
    val favActivity = readLine()

    println("Who is your favorite band?: ")
    val bandName = readLine()

    println("What is the distance of the trip?")
    val distance = readLine()

    println("What was the total $ gas amount?")
    val totalForGas = readLine()

    println("What did you work as?")
    val work = readLine()

    val totalMoneySaved = totalForGas + 200

    println("What city did you go to?")
    val city = readLine()


    print(
        """
    A long time ago, $name and their friend $friendName planned a(n) $favActivity road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $totalForGas dollars to get there.
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent()
    )
}