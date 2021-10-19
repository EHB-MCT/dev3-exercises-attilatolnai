class Comedian (override val name: String): Person(name){
    override fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("Why can't you play poker on the African Savanna? There's too many cheetahs.")
    }
}