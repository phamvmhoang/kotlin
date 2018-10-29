fun main(args: Array<String>) {
    //simpleLoop()
    //checkExist(11)
    //checkExist(5)
    //loopOverArray()
    //whileLoop()
    doWhileLoop()
}

fun simpleLoop(){
    for (i: Int in 0..10) {
        println(i)
    }
}

fun checkExist(x: Int) {
    if (x in 0..10) println("Existed") else println("Not Existed")
}

fun loopOverArray(){
    val arr = arrayOf(1,2,4)
    for (i in arr) {
        println(i)
    }

    for (i in 1 until 5) {
        print(i)
    }

    println()
    for (i in 5 downTo  3) {
        print(i)
    }
}

fun whileLoop(){
    var i = 0;
    while (i <10){
        println(i)
        i++
    }
}

fun doWhileLoop(){
    do {
        println("This will be printed only once")
    } while (false)
}