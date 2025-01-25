
// Kotlin practice concepts, Basic to Advanced
/*
   More string practice, with string templates included
   Comparison with string concatenation symbol and normal string
   concatenation sentences
*/

fun main(){

    // String Declarations
    val concatString1 = "This is a string with a basic"
    val concatString2 = "concatenation method used (str1 + str2)"
    val concatString3 = concatString1 + " " + concatString2;
    val methodType = "Template"

    // Print Statements
    println(concatString3)
    println("This is a string example with a $methodType" +
            " concatenation method used ($ symbol) ")


}