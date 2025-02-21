// Kotlin practice concepts, Basic to Advanced
/*
   IfStatement.kt
   -------------------------------------------------------------------
   A program that prints data based on if statements.
*/

fun main() {
    var num1 = 8
    var num2 = 9
    // if-statement using a modulo operator to check if a number is even
    if (num1 % 2 == 0){
        println("$num1 is even")
    }
    else{
        println("$num1 is odd")
    }

    /*
      if-statement using modulo operator and inequality operator to check if
      a number is odd
    */
    if (num2 % 2 != 0){
        println("$num2 is odd")
    }
    else{
        println("$num2 is even")
    }
}