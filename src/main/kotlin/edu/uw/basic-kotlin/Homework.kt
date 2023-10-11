package edu.uw.basickotlin
class Library {
    // This is just here as a placeholder, to make sure tests run and pass
    // before you add any code
    fun someLibraryMethod(): Boolean {
        return true
    }
}

// write a "whenFn" that takes an arg of type "Any" and returns a String
fun whenFn(s: Any): String {
    when (s) {
        "Hello" ->  return "World"
        is String -> return "I don't understand"
        0 -> return "zero"
        1 -> return "one"
        in 2..10 -> return "low number"
        is Int -> return "a number"
    }

    return "I don't understand"
}
// write an "add" function that takes two Ints, returns an Int, and adds the values
fun add(a: Int, b:Int): Int {
    return a + b
}
// write a "sub" function that takes two Ints, returns an Int, and subtracts the values
fun sub(a: Int, b:Int): Int {
    return a - b
}
// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int), returns an Int, and applies the passed-in-function to the arguments

fun mathOp(a: Int, b: Int, function:(Int, Int) -> Int): Int {
    return function(a, b)
}
// write a class "Person" with first name, last name and age
class Person(fn:String, ln:String, a:Int) {
    val firstName:String = fn
    val lastName:String = ln
    val age:Int = a
    val debugString="[Person firstName:$firstName lastName:$lastName age:$age]"
}
// write a class "Money" with amount and currency, and define a convert() method and the "+" operator
class Money() {

}