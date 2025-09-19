class library {
private val books= mutableListOf<Book>()

    fun addBook(book:Book) {
        books.add(book)
        println("Added:${book.Title}")
    }
    fun borrowBook(isbn: String): Boolean {
        val book = books.find { it.isbn == isbn && it.isAvailable }
        return if (book != null) {
            book.isAvailable = false
            println("borrowed: ${book.Title}")
            true
        } else {
            println("Book not Available")
            false
        }
    }
    fun returnBook (isbn: String): Boolean {
        val book = books.find { it.isbn == isbn && !it.isAvailable }
        return if (book != null) {
            book.isAvailable = true
            println("Returned:${book.Title}")
            true
        } else {
            println("Book not found in borrowed list")
            false
        }
    }
    fun listAvailableBooks() {
        val available = books.filter { it.isAvailable }
        println("Available books")
        available.forEach { println("- ${it.Title} by ${it.author}") }
    }}

