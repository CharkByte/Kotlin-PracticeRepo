
// Kotlin practice concepts, Basic to Advanced
/*
   Kotlin string library functions.
   Asking for user input and outputting the string length of all characters typed.
   If-statement boundary test case included, if user does not type anything.
*/

fun main() {
    // variable declaration

    println("Type something and get the amount of characters (including empty space) in the sentence back: ")
    val userInput = readLine()
    if (userInput!!.length > 0) {
        println("The amount of characters in that sentence was: " + userInput!!.length)
    }
    else
        println("0 characters, nothing entered as input")
}
