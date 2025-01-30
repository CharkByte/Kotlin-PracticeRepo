// Kotlin practice concepts, Basic to Advanced
/*
    Order Of Operations.kt
   -------------------------------------------------------------------
   Simple program that uses order of operations in Kotlin.
   Order of operations: PMDAS,
   Paranthesis, Multiplication, Division, Modulus, Addition, Subtraction.

   Order of operations from left to right when operations are similar.
*/

fun main() {
    var answer1 = 7 - 5 + 4 * 3
    var answer2 = (9 - 3) / 2
    var answer3 = (6 + 8) + (4 - 7)

    println("7 - 5 + 4 * 3: ")
    println(answer1)

    println("(9 - 3) / 2: ")
    println(answer2)

    println("(6 + 8) + (4 - 7): ")
    println(answer3)
}