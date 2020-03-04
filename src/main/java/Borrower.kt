class Borrower (name: String) {

    val name: String = name
    val collection: ArrayList<Book> = ArrayList()

    fun countCollection(): Int {
        return collection.size
    }

    fun addBookToCollection(book: Book) {
        collection.add(book)
    }

    fun checkOutBook(bookTitle: String, library: Library) {
        val book: Book? = library.findBookByTitle(bookTitle)
        if (book != null) {
            library.removeBookFromCollection(book)
            addBookToCollection(book)
        }
    }
}