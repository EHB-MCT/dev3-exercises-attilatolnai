fun main() {
    println("Session 3 : chatroulette")

    val attila = FirstPerson("Attila")
    val kevin = Person("Kevin")
    //println(attila.name)
    //println(kevin.name)

    val choice = arrayOf(attila.name, kevin.name)
    val computerChoice = choice.random()
    println(computerChoice)
}