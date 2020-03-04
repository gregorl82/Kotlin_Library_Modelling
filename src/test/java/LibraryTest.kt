import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LibraryTest {

    val library = Library()
    val book1 = Book("Pride and Prejudice", "Jane Austen", "Classic")

    @Test
    fun libraryStartsEmpty() {
        assertEquals(0, library.countBooksInCollection())
    }

    @Test
    fun canAddBookToLibrary() {
        library.addBookToCollection(book1)
        assertEquals(1, library.countBooksInCollection())
    }
}