import kotlin.concurrent.thread

/*

Manchmal weiß man bei Langeweile nicht, was man als nächstes tun soll. Dagegen soll das folgende Programm helfen: Erstelle eine Funktion,
welche den/die Nutzer*in nach seinen/ihren 3 Lieblingsaktivitäten und -orten fragt und dann zwei dieser Infos zufällig kombiniert und auf der Konsole ausgibt.

 */

var userActivity:MutableList<String> = mutableListOf()
var userPlaces:MutableList<String> = mutableListOf()

fun boringEx(){
    println("Hallo,lieber Nnutzer, verrat mir doch erstmal deinen Namen")
    var userName = readln()

    println("Ok $userName, damit ich dir ein spannendes Wochenende garantieren kann, solltest du mir 3 Hobbys von dir nennen")
    userActivity.add(readln())
    println("Eins geschafft, fehlen noch 2")
    userActivity.add(readln())
    println("Zwei geschafft, fehlt noch 1")
    userActivity.add(readln())
    println("Klasse $userName")

    println()

    println("Nun noch Orte an denen du gerne bist")
    userPlaces.add(readln())
    println("Eins geschafft, fehlen noch 2")
    userPlaces.add(readln())
    println("Zwei geschafft, fehlt noch 1")
    userPlaces.add(readln())
    println("Klasse $userName, wie wär es denn mal mit ${userActivity.random()} in ${userPlaces.random()}, oder" +
            "${userActivity.random()} am ${userPlaces.random()}")

}