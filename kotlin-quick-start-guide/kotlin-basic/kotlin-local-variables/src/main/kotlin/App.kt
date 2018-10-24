fun immutabble(){
    val name: String = "Kotlin"
//    name = "groovy"
    val test: Boolean
    if (true){
        test = true
    } else {
        test = false
    }
    println(test)

}

fun mutable(){
    var name : String = "Kotlin"
    name = "java"
}

fun main(args: Array<String>) {
    immutabble();
}