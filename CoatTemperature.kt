// Kotlin practice concepts, Basic to Advanced
/*
   CoatTemperature.kt
   -------------------------------------------------------------------
   A program that suggests a t-shirt, jacket or winter coat based on
   conditional if statements or else-if statements.
*/

fun main() {
    // variable Declarations
    val temp: Int = 44

    // Conditional logic that checks for temperature outside
    if (temp > 70) {
        print("Temperature is $temp degrees. ")
        println("Wear a t-shirt.")
    }
    else if (temp > 60){
        print("Temperature is $temp degrees. ")
        println("Wear a warm jacket.")
    }
    else {
        print("Temperature is $temp degrees. ")
        println("Wear a winter coat with layers.")
    }
}
