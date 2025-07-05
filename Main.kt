fun main(){

    val student1 = Student("Guilherme da Silva Tesch", 160404)
    val student2 = Student("Rocombole Kity", 849234)

    println(student1.getDetails())
    println(student2.getDetails())

}


open class Person(private val name: String){
    open fun showDetails(){
        println("Name: $name")
    }
    fun getName() = name
}

class Student(private val name: String, private val id: Int): Person(name){
    override fun showDetails(){
        println("Name: ${getName()} \nID: $id")
    }

    fun getDetails(): String{
        return "Name: ${getName()} \nID: $id"
    }
}


