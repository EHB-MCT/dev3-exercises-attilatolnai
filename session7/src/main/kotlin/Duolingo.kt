class Duolingo() {
    val words = mutableListOf<Word>(
        Word("house", "huis", "En"),
        Word("garden", "tuin", "En"),
        Word("dog", "hond", "En"),
        Word("kitchen", "keuken", "En"),
        Word("car", "wagen", "En"),
        Word("stairs", "trappen", "En"),
        Word("roof", "dak", "En"),
        Word("cat", "kat", "En"),
        Word("basement", "kelder", "En"),
        Word("garage", "garage", "En")
    )

    fun difficulty(){
        val normal = 5
        val easy = 3
        val hard = 10

        println("Choose a difficulty between 'easy', 'normal' and 'hard'")
        val userChoice = readLine()
        if(userChoice == "easy") {
            val currentWords = words.shuffled().take(easy).toMutableSet()
            println(currentWords.count())
        }else if(userChoice == "hard"){
            val currentWords = words.shuffled().take(hard).toMutableSet()
            println(currentWords.count())
        }else if(userChoice == "normal"){
            val currentWords = words.shuffled().take(normal).toMutableSet()
            println(currentWords.count())
        }
    }

    fun play(){
        val currentWords = words.shuffled().take(5).toMutableSet()
        println(currentWords.count())
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