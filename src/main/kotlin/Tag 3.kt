fun main (){

    println("Gebe Zahl 1 ein:")
    var intNumOne: Int=readln().toInt()

    println("Gebe Zahl 2 ein: ")
    var intNumTwo:Int= readln().toInt()

    var intNumthree:Int=intNumOne/intNumTwo
    var intNumfour:Int=intNumOne%intNumTwo

    println("Ergebnis: $intNumOne geteilt durch $intNumTwo ist $intNumthree mit dem Rest $intNumfour")



}