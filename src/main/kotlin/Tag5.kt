import kotlin.math.max
fun main(){

    var numberone:Int
    var numbertwo:Int
    var numberthree:Int

    println("Bitte gib eine Zahl ein:")
    numberone = readln().toInt()

    println("Bitte gib eine Zahl ein:")
    numbertwo = readln().toInt()

    println("Bitte gib eine Zahl ein:")
    numberthree = readln().toInt()

    var list= listOf(numberone,numbertwo,numberthree)

    var maxNumber= maxOf(numberone,numbertwo,numberthree)

    println("Die höchste Nummer ist $maxNumber")

}


