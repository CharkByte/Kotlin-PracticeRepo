// Kotlin practice concepts, Basic to Advanced
/*
   ElseStatement.kt
   -------------------------------------------------------------------
   A program that has an else statement, switches between two output
   statements based on boolean logic and whether the price is high or
   not.
*/

fun main (){
    var priceHigh = false
    var price: Int

    if (priceHigh){
        price = 10000
    }
    else{
        price = 1
    }
    println("The price is $price")
}
