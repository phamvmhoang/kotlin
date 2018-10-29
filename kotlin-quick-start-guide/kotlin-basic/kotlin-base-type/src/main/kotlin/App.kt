fun main(args: Array<String>) {
    // Array
    //arraySample()
    // nullable type
    nullableTypeSample()
}

fun arraySample() : Unit{
    val intArray = arrayOf(1,2,3)
    val squares = IntArray(10, {i -> (i +1) * (i +1)} )
    println("intArray")
    intArray.forEach { i -> println(i) }
    println("squares")
    squares.forEach { i -> println(i) }
}

fun nullableTypeSample(): Unit{
    // declare nullable type
    var error: String? = null
    // safe call operator
    safeCall(null)
    safeCall("Mai Lam")
    //nonNullAssertion(null)
    nonNullAssertion("Hoang Pham")
    elvisOperator(null)
    elvisOperator("Mai Anh")
}

fun safeCall(str: String?){
    val upperCase : String? = str?.toUpperCase();
    println(upperCase)
}

fun nonNullAssertion(str: String?){
    val nonNullStr = str!!
    val upperCase: String = nonNullStr.toUpperCase()
    println(upperCase)
}

fun elvisOperator(str: String?){
    val upperCase = str?.toUpperCase() ?: ""
    println("elvisOperator: ${upperCase}")
}