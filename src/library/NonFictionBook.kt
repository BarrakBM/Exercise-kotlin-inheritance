package library

class NonFictionBook(title: String, author: String, ISBN: String, val genre: String, ) :
    Book(title, author, ISBN){
    fun nonFiction() = println("This is a non fiction book in $genre")
    fun displayNonfictionInfo() = println("${displayInfo()}, genre:  ")
}