
// Kotlin practice concepts, Basic to Advanced
/*
   Simple arithmetic and operator usage in Kotlin
*/

fun main() {

    // Appetizer
    val caesarSalad = 8.50

    //  Entree
    val beefStroganoff = 18

    // Dessert
    val cheesecake = 6

    // Arithmetic Calculations

    var total = caesarSalad + beefStroganoff + cheesecake
    var tip = 0.15

    var finalAmount = total * tip + total
    println(finalAmount)
}