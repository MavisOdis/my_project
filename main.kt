fun main(){
//    println("Hello Mavis")
//    // this is a single line comment
//    /**this is a
//     * multiline comment*/
//    var name: String = "Mavis"
//    println(name)
//
//    var num1: Int = 10
//    var num2: Int = 40
//    var sum: Int
//    sum = num1 + num2
//
//    var num3: Int ; var num4: Int
//    num3 =34
//    println(num3)
//    println("The sum of " + num1 + " and " + num2 + " is = "   + sum)
    var result: Int = addition(5,3)
    println(result)

    var set: String = greeting("Mavis")
    println(set)

    sayHello("Mote")
}

fun addition(firstNum: Int, secondNum : Int): Int{
    return firstNum + secondNum
}
fun greeting(name: String): String{
    return "Good morning " + name
}
fun sayHello(name1: String){
    println("Hello " + name1)
}