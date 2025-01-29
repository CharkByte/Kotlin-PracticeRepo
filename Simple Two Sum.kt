import com.sun.jdi.IntegerType

// Kotlin practice concepts, Basic to Advanced
/*
   Simple Two Sum.kt
   -------------------------------------------------------------------
   Simple two sum program in Kotlin. Two integers are input as a value
   and added together for an output.

   Try/Catch error exception for non integer values that a user inputs.
*/

fun main() {

    // Integer declaration, with default initialization values given
    var int1: Int = 1
    var int2: Int = 2

    println("---------------------------------------------------------------")
    println("Two Sum Program: two integers will be added together as a sum")
    println("---------------------------------------------------------------")

    // Integer 1 user input, with try-catch error handling
        print("Integer 1: ")
    try {
        int1 = readln().toInt()
    } catch (error: NumberFormatException){
        println("Error: Input was not an integer!")
        main()                                      // Restart program when user doesn't input integer value
    }

    // Integer 2 user input, with try-catch error handling
    print("Integer 2: ")
    try {
        int2 = readln().toInt()
    } catch (error: NumberFormatException){
        println("Error: Input was not an integer!")
        main()                                      // Restart program when user doesn't input integer value
    }

    // Total sum calculation
    var intTotal = int1 + int2

    // Output to terminal using string interpolation: $
    println("The sum of integer 1: $int1 and integer 2: $int2 is: $intTotal")
}