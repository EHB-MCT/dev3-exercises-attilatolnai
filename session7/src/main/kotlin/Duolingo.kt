class Duolingo() {
    val words = mutableListOf<Word>(
        Word("house", "huis", "En"),
        Word("garden", "tuin", "En"),
        Word("dog", "hond", "En"),
        Word("kitchen", "keuken", "En"),
        Word("car", "wagen", "En"),
    )

    fun play(){
        val currentWords = words.shuffled().take(5)
        //println(currentWords)

        val selectedWord = currentWords.random()
        println("Please translate '${selectedWord.original}' to dutch")
        val userAnswer = readLine()

        if (selectedWord.translated == userAnswer){
            println("Good job!")
        }else{
            println("Try again!")
        }
    }
}