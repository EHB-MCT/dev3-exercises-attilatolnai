fun main() {
    println("How much do you know about Star Wars?")
    challengeOne()
}

fun challengeOne(){
    println("In a galaxy far, far away")
    println("2 Jedi found a special kid on a desert planet")
    println("What is the name of that planet?")

    val correctAnswer = setOf<String>("Hoth","Naboo","Tatooine","Jakku","Coruscant")

    val userAnswer = readLine()
    if (correctAnswer.contains(userAnswer)){
        //win println("Congratulations, next question:")
    }else{
        //game over println("Unfortunately, failed this challenge you have.")
    }
}