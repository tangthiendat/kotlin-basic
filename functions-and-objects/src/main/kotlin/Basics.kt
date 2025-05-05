fun main(){
    println("Who is this coffee for?")
    var name = readln();

    println("How many pieces of sugar do you want?")

    var sugarCount = readln().toInt();

    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount: Int, name: String){
    if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    }else {
        println("Coffee with $sugarCount ${if (sugarCount > 1) "spoons" else "spoon"} for $name")
    }
}