data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main(){


//    makeCoffee(sugarCount, name)
    val coffeeForDat = CoffeeDetails(0, "Dat", "XL", 0)
    makeCoffee(coffeeForDat)
//    //Object
//    var jack = Dog("Jack", "Dwarf poodle", 1);
//    println("${jack.name} is a ${jack.breed} and is ${jack.age} years old")
}

//fun askCoffeeDetails(): CoffeeDetails{
//    println("Who is this coffee for?")
//    var name = readln();
//
//    println("How many pieces of sugar do you want?")
//
//    var sugarCount = readln().toInt();
//}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }else {
        println("Coffee with ${coffeeDetails.sugarCount} ${if (coffeeDetails.sugarCount > 1) "spoons" else "spoon"} for $${coffeeDetails.name} " +
                "and cream: ${coffeeDetails.creamAmount}")
    }
}