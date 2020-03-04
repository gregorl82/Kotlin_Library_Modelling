import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LibraryTest {

    val library = Library(5)
    val book1 = Book("Pride and Prejudice", "Jane Austen", "Classic")
    val book2 = Book("A Game Of Thrones", "George RR Martin", "Fantasy")
    val book3 = Book("Noughts and Crosses", "Iain Banks", "Crime")
    val book4 = Book("Wuthering Heights", "Emily Bronte", "Classic")
    val book5 = Book("2001: A Space Odyssey", "Arthur C Clarke", "Sci-Fi")
    val book6 = Book("Wolf Hall", "Hilary Mantel", "Historical Fiction")

    @Test
    fun libraryStartsEmpty() {
        assertEquals(0, library.countBooksInCollection())
    }

    @Test
    fun canAddBookToLibrary() {
        library.addBookToCollection(book1)
        assertEquals(1, library.countBooksInCollection())
    }

    @Test
    fun cannotAddBookIfLibraryFull() {
        library.addBookToCollection(book1)
        library.addBookToCollection(book2)
        library.addBookToCollection(book3)
        library.addBookToCollection(book4)
        library.addBookToCollection(book5)
        library.addBookToCollection(book6)
        assertEquals(5, library.countBooksInCollection())
    }

    @Test
    fun findBookByTitle_BookFound() {
        library.addBookToCollection(book1)
        library.addBookToCollection(book2)
        library.addBookToCollection(book3)
        library.addBookToCollection(book4)
        val foundBook: Book? = library.findBookByTitle("A Game Of Thrones")
        assertEquals(book2, foundBook)
    }

    @Test
    fun findBookByTitle_BookNotFound() {
        library.addBookToCollection(book1)
        library.addBookToCollection(book2)
        library.addBookToCollection(book3)
        library.addBookToCollection(book4)
        val foundBook: Book? = library.findBookByTitle("I, Robot")
        assertNull(foundBook)
    }

    @Test
    fun canRemoveBookFromCollection() {
        library.addBookToCollection(book1)
        library.addBookToCollection(book2)
        library.addBookToCollection(book3)
        library.removeBookFromCollection(book2)
        assertEquals(2, library.countBooksInCollection())
        assertFalse(library.stock.contains(book2))
    }
}