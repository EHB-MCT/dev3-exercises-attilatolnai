open class Person (
    open val name : String
    ){
    open fun introduce(){
        println("Hello, my name is $name")
    }
}