import kotlin.random.Random

fun main(args: Array<String>) {

    var randomInt = Random.nextInt(1, 101)

    println("Hallo, verrätst du mir deinen Namen?")
    var name= readln()

    println("Alles klar $name, versuch meine Zahl zwischen zwischen 1 und 100 zu erraten")

    var usernr= readln().toInt()

    println("Meine zahl war $randomInt")

    if(randomInt==usernr)
        println("Unglaublich , du hast es erraten")
    else
        println("Leider daneben")

    //println(randomInt==usernr)


}