//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {val b1=Book("1234","English","shakespere",true)
    val b2=Book("12345","Math","einstein",true)
    val b3=Book("123456","Science","newton",false)
    var book1=library()
    book1.addBook(b1)
    book1.addBook(b2)
    book1.addBook(b3)
    book1.borrowBook("123845456")
    book1.borrowBook(b1.isbn)
    book1.returnBook(b3.isbn)
    book1.listAvailableBooks()


}
data class Book(val isbn:String,
                val Title : String,
                val author:String,
                var isAvailable:Boolean=true)