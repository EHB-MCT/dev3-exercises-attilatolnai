class FirstPerson (override val name: String): Person(name){
    override fun introduce(){
        println("Hi, I am $name")
    }
}