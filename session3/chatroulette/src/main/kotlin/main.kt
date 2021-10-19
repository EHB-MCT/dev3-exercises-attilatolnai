fun main() {
    println("Session 3 : chatroulette")

    val attila = AnotherPerson("Attila")
    val kevin = Person("Kevin")
    //println(attila.name)
    //println(kevin.name)

    val choice = arrayOf(attila, kevin)
    //val choice = arrayOf(attila.name, kevin.name)
    val computerChoice = choice.random()
    println(computerChoice.introduce())
}