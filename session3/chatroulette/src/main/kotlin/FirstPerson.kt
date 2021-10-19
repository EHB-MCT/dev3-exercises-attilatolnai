class AnotherPerson (override val name: String): Person(name){
    override fun introduce(){
        println("Hi, I am $name")
    }
}