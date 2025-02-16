package library

class FictionBook(title: String, author: String, ISBN: String, val subject: String) :
    Book(title, author, ISBN){
    fun fiction() = println("This is a fiction book in :$subject")
    fun displayFictionInfo() = println("${displayInfo()}, subject:  ")
}