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
}