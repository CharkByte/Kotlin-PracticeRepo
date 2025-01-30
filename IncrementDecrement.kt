// Kotlin practice concepts, Basic to Advanced
/*
   IncrementDecrement.kt
   -------------------------------------------------------------------
   Program that uses increment and decrement operations to increase or
   decrease a value. Along the way, the integer values are shown
*/

fun main() {

    var a = 5               // Default starting value
    a += 6                  // a = 11, Incremented

    var b = a * 9           // b = 99, Multiplied
    var c = b / 3           // c = 33, Divided
    c++                     // c = 34, Incremented

    var d = c + 8           // d = 42, Added
    d %= 4                  // d = 2, Modulus
    d--                     // d = 1, Decremented
    print(d)                // Final output value
}
