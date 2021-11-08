fun main() {
    println("How much do you know about Star Wars?")
    println("Let's test your knowledge with these 5 challenges")
    println("May the force be with you")
    challengeOne()
}

fun challengeOne(){
    println("In a galaxy far, far away")
    println("2 Jedi found a special kid on a desert planet")
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
            //challengeThree()
    } else{
        gameOver()
    }
}

fun rollDice(sides: Int): Int{
    return (Math.random() * sides + 1).toInt()
}

fun gameOver(){
    println("Unfortunately, failed this challenge you have.")
}