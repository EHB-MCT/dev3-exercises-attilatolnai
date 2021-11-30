class Duolingo() {
    val words = mutableListOf<Word>(
        Word("house", "huis", "En"),
        Word("garden", "tuin", "En"),
        Word("dog", "hond", "En"),
        Word("kitchen", "keuken", "En"),
        Word("car", "wagen", "En"),
    )

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