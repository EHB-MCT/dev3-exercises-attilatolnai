class Duolingo(var roundSize: Int, val language: String) {
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
        println("Choose a difficulty between 'easy' or 'hard'")
        val userChoice = readLine()
        if (userChoice == "easy"){
            roundSize = 4
        }else if (userChoice == "hard"){
            roundSize = 6
        }else{
            throw Exception("Input was not 'easy' or 'hard'")
        }
    }

    fun play(){
        val currentWords = words.shuffled().take(roundSize).toMutableSet()
        println(currentWords.count())
        println("Your default round size is " + currentWords.count())

        while (currentWords.isNotEmpty()){
            val selectedWord = currentWords.random()
            println("Please translate '${selectedWord.original}' to dutch")
            println("This word has a difficulty level of ${selectedWord.difficultyPoint}")
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer){
                currentWords.remove(selectedWord)
                //selectedWord.difficultyPoint--
            }else{
                selectedWord.difficultyPoint++
            }
            println(currentWords.count())
        }

    }
}