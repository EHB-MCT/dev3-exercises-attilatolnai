class Duolingo(val roundSize: Int, val language: String) {
    var words = mutableListOf<Word>(
        FrenchWord("chien", "hond"),
        FrenchWord("voiture", "wagen"),
        FrenchWord("chat", "kat"),
        FrenchWord("maison", "huis"),
        EnglishWord("garden", "tuin"),
        EnglishWord("kitchen", "keuken"),
        EnglishWord("stairs", "trappen"),
        EnglishWord("roof", "dak"),
        EnglishWord("basement", "kelder"),
        EnglishWord("garage", "garage")
    )
    init {
        words = words.filter { it.language == language }.toMutableList()
    }
    //fun difficulty(){
        //val normal = 5
        //val easy = 3
        //val hard = 10

        //println("Choose a difficulty between 'easy', 'normal' and 'hard'")
        //val userChoice = readLine()
        //if(userChoice == "easy") {
        //    val currentWords = words.shuffled().take(easy).toMutableSet()
        //    println(currentWords.count())
        //}else if(userChoice == "hard"){
        //    val currentWords = words.shuffled().take(hard).toMutableSet()
        //    println(currentWords.count())
        //}else if(userChoice == "normal"){
        //    val currentWords = words.shuffled().take(normal).toMutableSet()
        //    println(currentWords.count())
        //}
    //}

    fun play(){
        val currentWords = words.shuffled().take(roundSize).toMutableSet()
        println(currentWords.count())
        println("Your default round size is " + currentWords.count())

        while (currentWords.isNotEmpty()){
            val selectedWord = currentWords.random()
            println("Please translate '${selectedWord.original}' to dutch")
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer){
                currentWords.remove(selectedWord)
            }else{
                println("Try again!")
            }
            println(currentWords.count())
        }

    }
}