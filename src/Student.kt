class Student(var name: String, var age: Int, var usn: Int) {
    var isEligible: Boolean = false

    constructor(name: String, age: Int, usn: Int, isEligible: Boolean) : this(name, age, usn) {
        this.isEligible = isEligible
    }


    fun display() {
        println(name + age + isEligible)
    }
}
