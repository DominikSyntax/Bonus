fun main() {

    var drink1 = "Cola"
    var drink2 = "Fanta"                                                        //Aufgabe 1
    var drink3 = "Kaffee"

    var list = listOf(drink1, drink2, drink3)

    println("Guten Tag , welches Getränk möchten Sie ? Wähle von 1-3:" )
    println(list)
    var userInput:Int= readln().toInt()-1
    println("Du hast Getränk ${list[userInput]} gewählt")

    /* Aufgabe 2
    Mutable Listen bearbeiten
Erstelle ein MutableList von Typ X. Diese soll mindestens
drei Elemente haben. Füge dieser Liste noch einmal drei Elemente hinzu.
Lösche anschließend das Element an Stelle 3 und gib das Element an Stelle 5 aus.
*/

    var cityList:MutableList<String> = mutableListOf("Berlin","Hamburg", "Düsseldorf")
    cityList.add("München")
    cityList.add("Köln")
    cityList.add("Frankfurt")
    cityList.removeAt(2)
    println(cityList[4])

    /*
    Listenfunktionen                                                Aufgabe 3
    Erstelle eine leere Liste. Füge in diese im Nachhinein deine
    5 Lieblingsessen hinein. sortier diese Liste. Misch sie durch.
    Lösch den letzten Eintrag. Sortier Sie. Lösch den ersten Eintrag.
    Lass den Rest der Liste ausgeben.
    */

    var favFoods:MutableList<String> = mutableListOf()

    favFoods.add("Reisauflauf")
    favFoods.add("Pizza")
    favFoods.add("Kuchen")
    favFoods.add("Frisches Brot")
    favFoods.add("Thunfisch Salat")
    favFoods.sorted()
    favFoods.shuffled()
    favFoods.removeLast()
    favFoods.sorted()
    favFoods.removeFirst()
    println(favFoods)

    /*
    Add, Remove, & Clear                                        Aufgabe 4
    Erstelle eine leere MutableList namens myList.
    Füge die Elemente "Apple", "Banana" und "Orange" in beliebiger Reihenfolge zur Liste hinzu.
    Füge das Element "Grape" am Anfang der Liste ein.
    Entferne das Element "Banana" aus der Liste.
    Leere die Liste mit der Methode clear().
    Gib die aktuelle Liste aus.
    */

    var myList:MutableList<String> = mutableListOf()
    myList.add("Apple")
    myList.add("Banana")
    myList.add("Orange")
    myList.add(0,"Grape")
    myList.clear()
    println(myList)

    /*
    AddAll & RemoveAt
    Erstelle eine leere MutableList namens myList.
    Erstelle eine andere Liste mit den Elementen "Cat", "Dog" und "Rabbit".
    Füge alle Elemente aus der zweiten Liste zur myList hinzu.
    Entferne das Element an Index 1 aus der myList mit der Methode removeAt(index).
    Gib die aktuelle Liste aus.
    */

    var otherList:MutableList<String> = mutableListOf("Cat","Dog","Rabbit")
    myList.addAll(otherList)
    myList.removeAt(1)
    println(myList)
    println(otherList)



}