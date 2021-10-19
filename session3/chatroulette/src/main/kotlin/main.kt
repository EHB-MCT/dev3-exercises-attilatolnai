fun main() {
    println("Session 3 : chatroulette")

    val chatPartners = arrayOf(Person("Sam"),Person("Attila"))

    val chatPartner = chatPartners.random()
    chatPartner.introduce()
    
}