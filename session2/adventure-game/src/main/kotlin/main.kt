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
    }else{
        println("Unfortunately, failed this challenge you have.")
    }
}