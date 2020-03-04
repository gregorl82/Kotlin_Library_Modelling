class Library (capacity: Int) {

    val stock: ArrayList<Book> = ArrayList()
    val capacity: Int = capacity

    fun countBooksInCollection(): Int {
        return stock.size
    }

    fun checkCapacity(): Boolean {
        return (countBooksInCollection() < capacity)
    }

    fun addBookToCollection(book: Book) {
        if (checkCapacity()) {
            stock.add(book)
        }
    }

    fun findBookByTitle(title: String): Book? {
        for (book in stock) {
            if (book.title == title) {
                return book
            }
        }
        return null
    }

    fun removeBookFromCollection(book: Book) {
        stock.remove(book)
    }
}