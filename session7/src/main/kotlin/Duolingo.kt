class Duolingo() {
    val words = mutableListOf<Word>(
        Word("house", "huis", "En"),
        Word("garden", "tuin", "En"),
        Word("dog", "hond", "En"),
        Word("kitchen", "keuken", "En"),
    )

    fun play(){
        println(words.random())
    }
}