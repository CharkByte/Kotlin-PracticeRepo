// Kotlin practice concepts, Basic to Advanced
/*
  A program that calculates if a celestial object is a planet.
  Three rules must be true (Checked with a conditional statment).
  1) Celestial object must orbit a star (like the sun)
  2) Celestial object must have hydrostatic equilibrium (a round shape)
  3) Celestial object must have enough mass to clear debris from its orbit
*/

fun main() {
    var orbitsStar = true             // Rule 1
    var hydrostaticEquilibrium = true // Rule 2
    var clearedOrbit = false          // Rule 3

    // Conditionally nested if statement check for object
    if (orbitsStar && hydrostaticEquilibrium){
        if (clearedOrbit == true){
            println("Celestial body is a planet")
        }
        else{
            println("Celestial body is a dwarf planet")
        }
    }
    else{
        println("Celestial body is not planet.")
    }
}