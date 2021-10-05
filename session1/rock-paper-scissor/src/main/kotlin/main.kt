import kotlin.random.Random
fun main(){
    println("Let's play rock-paper-scissors !")
    val randomRockPaperOfScissor = List(1){
        Random.nextInt(1,4)
    }
    println(randomRockPaperOfScissor)
}