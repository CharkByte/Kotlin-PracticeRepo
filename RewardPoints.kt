// Kotlin practice concepts, Basic to Advanced
/*
   RewardPoints.kt
   -------------------------------------------------------------------
   A program that calculates a persons reward point "status" based
   on input from the user with conditional if-else statements.
*/

fun main() {
    // variable Declarations
    var rewardsPoints: Int
    var memberType: String

    println("How many Reward Points do you have?")
    rewardsPoints = readln().toInt()

    // Conditional Logic for rewards program
    if (rewardsPoints >= 50) {
        memberType = "Platinum"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }
    println("You are a $memberType type member.")
}