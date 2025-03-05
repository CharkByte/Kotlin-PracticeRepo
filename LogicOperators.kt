// Kotlin practice concepts, Basic to Advanced
/*
   LogicOperators.kt
   -------------------------------------------------------------------
   A program that outputs statements based on logical statements with
   AND (&&), OR (||) and NOT (!) logical operators.

   Print statements when if statement is equal to true.
*/

fun main() {
    var a = true  // 1
    var b = false // 0
    var c = true  // 1
    var d = false // 0

    if (a || b) {
        println("Statement 1 Print")
    }

    if (!b && c) {
        println("Statement 2 Print")
    }

    if (a || d) {
        println("Statement 3 Print")
    }

    if (!(!d && b)) {
        println("Statement 4 Print")
    }
}