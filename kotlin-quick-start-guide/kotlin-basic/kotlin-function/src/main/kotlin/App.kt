fun add (x: Int, y: Int): Int {
    var sum = x + y
    return sum
}

fun addExpression(x: Int, y: Int) = x +y

fun printToConsole(input: String): Unit {
    println(input)
}

fun printToConsoleWithoutUnit(input: String) {
    println(input)
}

fun printToConsoleExp(input: String) = println(input)

fun main(args: Array<String>) {
    println("Sum 2 number: " + add(2,3))
    println("Sum 2 number using function expression: " + addExpression(2,3))
    printToConsole("Return Void with Unit");
    printToConsoleWithoutUnit("Return Void without Unit");
    printToConsoleExp("Return Void with expression");
}