package library

open class Book(val title: String, val author: String, val ISBN: String){

    fun displayInfo() = println("$title by $author, ISBN: $ISBN")
}
