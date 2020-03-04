class Library (capacity: Int) {

    val collection: ArrayList<Book> = ArrayList()
    val capacity: Int = capacity

    fun countBooksInCollection(): Int {
        return collection.size
    }

    fun checkCapacity(): Boolean {
        return (countBooksInCollection() < capacity)
    }

    fun addBookToCollection(book: Book) {
        if (checkCapacity()) {
            collection.add(book)
        }
    }
}