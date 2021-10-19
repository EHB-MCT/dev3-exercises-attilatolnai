fun main() {
    println("Session 3 : chatroulette")

    val chatPartners = arrayOf(Teacher("Sam"),Student("Attila"),Comedian ("Mike"))

    val chatPartner = chatPartners.random()
    chatPartner.introduce()
    chatPartner.talk()

}