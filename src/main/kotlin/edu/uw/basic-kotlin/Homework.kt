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
        "Hello" ->  return "world"
        is String -> return "Say what?"
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
class Money(amt:Int = 0, curr:String="USD") {
    var currencies = listOf("USD", "GBP", "EUR", "CAN")
    var amount: Int = if (amt < 0) throw IllegalArgumentException("Amount can't be less than 0") else amt
    var currency: String = if (curr in currencies) curr else throw IllegalArgumentException("Currency not recognized")
    var usConversionTable = hashMapOf(
        "USD" to 1f,
        "GBP" to 1/2f,
        "EUR" to 3/2f,
        "CAN" to 5/4f
    )
    fun convert(toCurrency: String): Money {
        val value: Int
        if (currency == "USD") {
            value = (amount * usConversionTable[toCurrency]!!).toInt()
        } else {
            value = (amount / usConversionTable[currency]!! * usConversionTable[toCurrency]!!).toInt()
        }
        return Money(value,toCurrency)
    }

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.convert(this.currency).amount, currency)
    }

    }