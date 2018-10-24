fun printUser(user: User) {
    fun tryPrint(str: String) {
        if (str.length > 3){
            println(str)
        }
    }

    tryPrint(user.firstName)
    tryPrint(user.lastName)
}

fun main(args: Array<String>) {
    printUser(user = User("Hoang","Pham"))
    printUser(user = User("Mai","Lam"))
}