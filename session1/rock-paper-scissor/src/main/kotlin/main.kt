import kotlin.random.Random
fun main(){
    println("Let's play rock-paper-scissors !")
    val option = arrayOf("Rock", "Paper", "Scissors")
    val computerChoice = option.random()
    val playerChoice = getPlayerChoice(option)

    println("The computer chose $computerChoice")
    println("You chose $playerChoice")
    determineResult(computerChoice, playerChoice)
}

fun getPlayerChoice(option : Array<String>): String?{
    var playerChoice: String?
    do {
        println("Choose: Rock - Paper - Scissors")
        playerChoice = readLine()
    } while (!option.contains(playerChoice))
    return playerChoice
}

fun determineResult(computerChoice: String, playerChoice: String?){
    if (computerChoice == playerChoice){
        println("Draw")
        return
    }
    val winMessage = "You've won"
    val loseMessage = "You've lost"

    when(computerChoice){
        "Rock" -> if (playerChoice == "Paper") println(winMessage) else println(loseMessage)
        "Paper" -> if (playerChoice == "Scissors") println(winMessage) else println(loseMessage)
        "Scissors" -> if (playerChoice == "Rock") println(winMessage) else println(loseMessage)
    }
}