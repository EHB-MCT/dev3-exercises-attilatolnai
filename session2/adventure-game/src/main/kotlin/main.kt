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
        challengeTwo()
    }else{
        println("Unfortunately, failed this challenge you have.")
    }
}

fun challengeTwo(){
    println("Congratulations, you can proceed to the next question:")
    println("In order to free Anakin, Qui-Gon had to play some dice. Now its your turn to play the dice")
    println("You need to choose between a low-roll(1-3) or high-roll(4-6)")
    println("If you predict correctly, you will advance to the next challenge!")

    val roll = arrayOf("low","high")
    val computerRoll = roll.random()
    println("Enter your answer: ")
    val userRoll = readLine()
    println(computerRoll)
    if(userRoll == computerRoll){
        println("Lucky eh?")
    }else{
        println("Lost the dice game you have")
    }


}