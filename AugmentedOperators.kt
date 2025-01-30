// Kotlin practice concepts, Basic to Advanced
/*
   AugmentedOperators.kt
   -------------------------------------------------------------------
   Program that updates a single variable data with shorthand notation.
   Goes through every operation, using shorthand notations.

                      shorthand          Longform
  Addition:             a += b          (a = a + b)
  Subtraction:          a -= b          (a = a - b)
  Multiplication:       a *= b          (a = a * b)
  Division:             a /= b          (a = a / b)
  Modulus:              a %= b          (a = a % b)
*/

fun main() {
    // Default car speed, set to initial value 55
    var carSpeed: Int = 50              // Default car speed variable initialized
    println("The default car speed is: $carSpeed mph (default # amount)")

    carSpeed += 90
    var carAdd = carSpeed               // Added car speed variable initialized
    println("The max car speed is: $carAdd mph (addition operation)")

    carAdd -= 139
    var carSubtract = carAdd            // Subtracted car speed variable initialized
    println("The slowest car speed is: $carSubtract mph (subtraction operation)")

    carSubtract *= 60
    var carMultiply = carSubtract       // Multiplied car speed variable initialized
    println("The car speed accelerating is: $carMultiply mph (multiplication operation)")

    carMultiply /= 2
    var carDivide = carMultiply         // Divided car speed variable Initialized
    println("The car speed average is: $carDivide mph (division operation)")

    carMultiply %= 2
    var carModulus = carMultiply
    println("The car speed remainder is: $carModulus mph (modulus operation)")
}