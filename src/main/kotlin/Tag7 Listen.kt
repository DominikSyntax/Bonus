fun main(){

    var drink1 = "Cola"
    var drink2="Fanta"
    var drink3="Kaffee"

    var list= listOf(drink1,drink2,drink3)

    for ((index, list) in list.withIndex()) {
        println("${index + 1}. $list")
    }
    val userInput = readLine()?.toIntOrNull()
    if (userInput != null && userInput in 1..list.size) {
        val selectedOption = list[userInput - 1]
        println("Du hast \"$selectedOption\" ausgewählt.")
    } else {
        println("Ungültige Eingabe.")
    }

}