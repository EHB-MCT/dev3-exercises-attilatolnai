import kotlin.random.Random
fun main(){
    println("Let's play rock-paper-scissors !")
    val option = arrayOf("Rock", "Paper", "Scissor")
    val computerChoice = option.random()
    println(computerChoice)
    val playerChoice = selectOption()
}

fun selectOption(){
    
}