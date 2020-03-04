class Library {

    val collection: ArrayList<Book> = ArrayList()

    fun countBooksInCollection(): Int {
        return collection.size
    }

    fun addBookToCollection(book: Book) {
        collection.add(book)
    }
}