fun main() {
    println("Do you like Star Wars?")
    println("Then let us play 5 Star Wars based challenges")
    println("May the force be with you")
    challengeOne()
}

fun challengeOne(){
    println("In a galaxy far, far away")
    println("2 Jedi found a the chosen one on a desert planet")
    println("What is the name of that planet?")

    val correctAnswer = setOf<String>("Tatooine","tatooine")
    print("Enter your answer: ")
    val userAnswer = readLine()
    if (correctAnswer.contains(userAnswer)){
        println("Congratulations, you can proceed to the next question:")
        challengeTwo()
    }else{
        gameOver()
    }
}


fun challengeTwo(){
    println("Qui-Gon saved Anakin from slavery by playing a game of dice")
    println("PLay a game of dice and see if you could have saved him?")
    println("Rules are simple, predict if the dice will be low(1-3) or high(4-6)")

    var userGuess: String
    do {
        println("Pick 'low' or 'high'")
        userGuess = readLine().toString()
    }while (!setOf<String>("low", "high").contains(userGuess))
    val diceResult = rollDice(6)
    println("The dice result was $diceResult")
    val allowedResults = if (userGuess == "low") setOf<Int>(1,2,3) else setOf(4,5,6)
        if (allowedResults.contains(diceResult)){
            println("Looks like you had the force on your side, continue young padawan")
            challengeThree()
    } else{
        gameOver()
    }
}

fun challengeThree(){
    println("Watto thinks you cheated and wants a rematch")
    println("What do you say to him?")
    println("(1) Ok let's do it again")
    println("(2) Tell him that Jabba will hear of this")
    println("(3) Try to use force mindtrick on him")

    var userAnswer: Int
    do {
        println("Pick an option: 1, 2 or 3?")
        userAnswer = readLine()?.toInt() ?:0
    } while (!setOf<Int>(1,2,3).contains(userAnswer))

    when(userAnswer){
        1 -> {
            println("Ok time to do this again")
            challengeTwo()
        }
        2 -> {
            println("Hehehe, c'mon I was just joking ok, let's not involve Jabba in this")
            challengeFour()
        }
        3 -> {
            println("You cheater, Jedi mindtricks don't work on me, only money does!")
            gameOver()
        }
    }
}

fun challengeFour(){
    println("The journey to Coruscant is a long one and Anakin is bored")
    println("He wants to play a game with you")
    println("Anakin has a number in his head and you have to guess it")
    println("Don't worry you can guess as much as you want")
    val answer = rollDice(100)
    var userGuess : Int
    do {
        userGuess = readLine()?.toInt() ?:0
        if (userGuess == answer){
            println("Yippey you guessed it")
            //endGame()
        }else if (userGuess > answer){
            println("Aim lower")
        }else{
            println("Aim higher")
        }
    } while (userGuess != answer)
}

fun rollDice(sides: Int): Int{
    return (Math.random() * sides + 1).toInt()
}

fun gameOver(){
    println("Unfortunately, failed this challenge you have.")
}