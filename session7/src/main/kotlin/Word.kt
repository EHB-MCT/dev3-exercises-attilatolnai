open class Word(
    open val original: String,
    open val translated: String,
    val language: String,
    var difficultyPoint: Int
) {
}