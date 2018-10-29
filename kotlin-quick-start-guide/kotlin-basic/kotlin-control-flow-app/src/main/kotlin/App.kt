fun main(args: Array<String>) {
    //ifElseExp(20)
    //ifElseExp(8)
    //checkNumebrs(3)
    //println(checkNumbersExhaustive(10))
    //whenAny("hoang")
    //whenAny(12)
    //whenAny(1.1)
    whenWithoutArgument(10,12)
    whenWithoutArgument(1,10)
    //whenWithoutArgument(10,12)
}

fun ifElseExp(num: Int){
    val str:String = if (num < 10 ) "Lower than 10" else "Equal or greate than 10"
    println(str)
}

fun checkNumebrs(num: Int): Unit {
    when(num){
        1 -> println("Number is 1")
        2,3,4,5,6 -> println("Number is from 2 to 6")
    }
}

fun checkNumbersExhaustive(num: Int): String {
    return when(num){
        1 -> "Number is 1"
        2,3,4,5,6 -> "Number is from 2 to 6"
        else -> "Numner is higher than 6"
    }
}

fun whenAny(x: Any) {
    when(x){
        is Int -> println("Integer")
        is Double -> println("Double")
        is String -> println("String")
    }
}

fun whenWithoutArgument(a: Int, b: Int): Unit {
    when {
        a * b > 100 -> println("a * b > 100")
        a + b > 100 -> println("a + b > 100")
        a < b  -> println("a < b")
    }
}