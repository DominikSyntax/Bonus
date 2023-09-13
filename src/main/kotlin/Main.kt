fun main() {
    println("Hallo, wie ist dein Name")
    var name:String=readln()

    println("$name ? Das ist aber ein ungewöhlicher Name. \n Für deinen Body Mass Index" +
            "bräuchte ich zuerstmal dein Gewicht in KG ")

    var weight= readln().toInt()

    println("Oh je, $weight kg, das ist ne Menge")

    println("Eine letzte Frage $name, wie groß bist du in Metern?")

    var height=readln().toDouble()

    var bmi=weight / (height+height)

    if(bmi>=25)
        println("Dein BMI ist $bmi, das ist zuviel Junge")
    else
        println("Dein BMI int mit $bmi im normalen Bereich")



}