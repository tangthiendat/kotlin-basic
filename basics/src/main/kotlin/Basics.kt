fun main(){
//    /** val vs var */
//    // val: immutable
//    val number = 1;
////    number = 2 => not allow, error
//
//    // var: mutable
//    var testVar = 500;
//    println(testVar)
//    testVar = 600;
//    println(testVar); //

//    //String
//    var name = "dat"
//    name = "test"
//    println(name.uppercase())

    print("Enter name: ")

    var name = readln();

    print("Enter age: ")

    var age = readln().toInt();

    if(age in 18..40){
      println("Your name is $name. You're an adult")
    } else if(age > 40){
        println("Your name is $name. You're an elderly")
    } else {
        println("Your name is $name. You're not an adult\"")
    }
}