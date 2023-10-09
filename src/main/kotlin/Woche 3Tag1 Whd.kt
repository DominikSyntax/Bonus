/*

Erstelle ein glücksspiel mit Zahlen:
Du besitzt eine Liste “zahlenListe”, die 12 Zahlen von 1 bis 12 besitzt.
Du besitzt zwei leere Listen “max” und “john”.
Zuerst: shuffle die Liste zahlenListe, und befülle Max mit den ersten 6 Zahlen und John mit den letzten 6 Zahlen.
Addiere die Zahlen aus der Liste Max zusammen,
danach addiere die Zahlen aus der Liste John zusammen.
Gib beide Ergebnisse aus! Wer hat gewonnen?

 */

var zahlenliste:List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12)

var max:MutableList<Int> = mutableListOf()

var john:MutableList<Int> = mutableListOf()

fun main() {

    var shuffledList = zahlenliste.shuffled().toMutableList()

    max = shuffledList.subList(0, 6)
    john = shuffledList.subList(7, 12)

    println("max hat ${max.sum()}")
    println("john hat ${john.sum()}")

    if (max.sum() > john.sum()) {
        println("gewonnen hat max")

        }else if (max.sum() == john.sum()) {
            println("Gleichstand")
    } else
        println("john hat gewonnen")
}

