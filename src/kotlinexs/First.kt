package kotlinexs


class First {
}

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("$message $prefix")
}

fun sum(x: Int, y: Int) = x+y

fun multiply(x: Int, y: Int) = x * y

fun main() {
    var msg:String = "Hey"
    var age = 22

    println("Hello kotlin - " + msg)
    var tEmp = Employee("Ayush" , 17, 22,"blr")

    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))

}



